// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.SMILEvent;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.view.ViewManager;
import com.auditude.ads.view.model.AdViewSource;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class GroupManager
    implements com.auditude.ads.model.smil.Group.PrefetchCompleteListener, com.auditude.ads.model.smil.Par.ParResoultionCompleteListener
{

    private AdSettings adSettings;
    private APIBridge api;
    private Group group;
    private boolean isHandlingGroup;
    private Par par;
    private ViewManager viewManager;

    public GroupManager(APIBridge apibridge, ViewManager viewmanager, AdSettings adsettings)
    {
        isHandlingGroup = false;
        api = apibridge;
        viewManager = viewmanager;
        adSettings = adsettings;
    }

    private ArrayList consolidateCompanionAssets(OnPageAsset aonpageasset[], String s)
    {
        ArrayList arraylist;
        int i;
        int j;
        boolean flag;
        flag = false;
        if (getAdSettings().hasProperty("showStaticImageBanners"))
        {
            flag = ((Boolean)getAdSettings().getProperty("showStaticImageBanners")).booleanValue();
        }
        arraylist = new ArrayList();
        j = aonpageasset.length;
        i = 0;
_L2:
        if (i >= j)
        {
            return arraylist;
        }
        s = aonpageasset[i];
        if (s != null)
        {
            if (flag)
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(s);
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (s.getStaticAsset() == null) goto _L4; else goto _L3
_L3:
        s = s.getStaticAsset();
        if (!(s instanceof OnPageAsset))
        {
            s = null;
        }
        arraylist.add((OnPageAsset)s);
          goto _L4
    }

    private void handleBaseAsset(Asset asset, OnPageAsset aonpageasset[])
    {
        showAdSource(new AdViewSource(asset, aonpageasset, asset.getAdParameters()));
    }

    private void handleCompanionAssets(ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        arraylist = arraylist.iterator();
_L5:
        if (arraylist.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        OnPageAsset onpageasset = (OnPageAsset)arraylist.next();
        viewManager.showAdSource(new AdViewSource(onpageasset, null, onpageasset.getAdParameters()));
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void showSegment(Ref ref)
    {
        if (ref == null || ref.isWatched())
        {
            showNextSegment();
            return;
        }
        OnPageAsset aonpageasset[] = ref.getCompanions();
        if (ref.getPrimaryAsset() != null)
        {
            handleBaseAsset(ref.getPrimaryAsset(), aonpageasset);
            return;
        }
        if (aonpageasset != null && aonpageasset.length > 0)
        {
            handleCompanionAssets(consolidateCompanionAssets(aonpageasset, "skin"));
            handleCompanionAssets(consolidateCompanionAssets(aonpageasset, "onpage"));
            showNextSegment();
            return;
        } else
        {
            showNextSegment();
            return;
        }
    }

    public void begin(Group group1)
    {
        if (isHandlingGroup)
        {
            return;
        }
        isHandlingGroup = true;
        par = null;
        group = group1;
        if (group1 == null)
        {
            groupEnd();
            return;
        }
        group1.begin();
        Boolean boolean1 = Boolean.valueOf(false);
        if (AuditudeEnv.getInstance().getAdSettings().hasProperty("prefetchNetworkAds"))
        {
            boolean1 = (Boolean)AuditudeEnv.getInstance().getAdSettings().getProperty("prefetchNetworkAds");
        }
        if (boolean1.booleanValue())
        {
            group1.load(this, null);
            return;
        } else
        {
            groupBegin();
            showNextSegment();
            return;
        }
    }

    public void dispose()
    {
        api = null;
        viewManager = null;
        isHandlingGroup = false;
    }

    public void end()
    {
        end(false);
    }

    public void end(boolean flag)
    {
        isHandlingGroup = false;
        par = null;
        if (group != null)
        {
            group.end(flag);
            group = null;
        }
    }

    public final APIBridge getAPI()
    {
        return api;
    }

    public final AdSettings getAdSettings()
    {
        return adSettings;
    }

    public final Group getGroup()
    {
        return group;
    }

    protected final AdViewSource getNextAdSource()
    {
        if (group != null)
        {
            Object obj = par;
            while (obj != null) 
            {
                obj = ((Par) (obj)).getNext();
                if (obj != null && ((Ref) (obj)).getPrimaryAsset() != null)
                {
                    return new AdViewSource(((Ref) (obj)).getPrimaryAsset(), ((Ref) (obj)).getCompanions(), null);
                }
                obj = group.getNext();
            }
        }
        return null;
    }

    protected final Par getPar()
    {
        return par;
    }

    public final ViewManager getViewManager()
    {
        return viewManager;
    }

    protected void groupBegin()
    {
    }

    protected void groupEnd()
    {
        end(true);
    }

    protected final boolean isHandlingGroup()
    {
        return isHandlingGroup;
    }

    public void onParResolutionComplete()
    {
        if (par != null)
        {
            par.setParResolutionCompleteListener(null);
        }
        showNextSegment();
    }

    public void onPrefetchComplete(ArrayList arraylist)
    {
        groupBegin();
        showNextSegment();
    }

    protected void resolvePar(Par par1)
    {
        if (par1 != null && !par1.isResolved())
        {
            par1.setParResolutionCompleteListener(this);
            par1.resolve(null);
        }
    }

    protected abstract void showAdSource(AdViewSource adviewsource);

    protected void showNextSegment()
    {
        if (!isHandlingGroup)
        {
            return;
        }
        if (par != null && par.moveNext())
        {
            Ref ref = par.getCurrent();
            if (ref != null)
            {
                showSegment(ref);
                return;
            }
        }
        if (group == null || !group.moveNext())
        {
            groupEnd();
            return;
        }
        par = group.getCurrent();
        api.dispatchEvent("smilEvent", new SMILEvent(api, com.auditude.ads.event.SMILEvent.SMILEventType.PAR_BEGIN, null, par, false));
        if (par != null && !par.isResolved())
        {
            resolvePar(par);
            return;
        } else
        {
            showNextSegment();
            return;
        }
    }
}
