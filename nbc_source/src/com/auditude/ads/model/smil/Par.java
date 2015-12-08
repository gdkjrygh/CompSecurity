// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.smil;

import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.network.INetworkAdLoader;
import com.auditude.ads.network.NetworkAdLoaderFactory;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.EventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model.smil:
//            ISMILIterator, Ref, Sequence, SmilElementType

public class Par extends EventDispatcher
    implements ISMILIterator, IEventListener
{
    public static interface ParResoultionCompleteListener
    {

        public abstract void onParResolutionComplete();
    }


    private int enumeratorIndex;
    private boolean isResolved;
    private INetworkAdLoader networkAdLoader;
    private ParResoultionCompleteListener parListener;
    private int priority;
    private ArrayList refList;
    private Sequence sequence;
    private HashMap state;

    public Par()
    {
        this(null);
    }

    public Par(Sequence sequence1)
    {
        refList = new ArrayList();
        priority = 0;
        isResolved = false;
        enumeratorIndex = -1;
        sequence = sequence1;
    }

    private void notifyResolutionComplete()
    {
        isResolved = true;
        if (parListener != null)
        {
            parListener.onParResolutionComplete();
        }
    }

    public final void addRef(Ref ref)
    {
        if (ref != null)
        {
            ref.setPar(this);
            refList.add(ref);
        }
    }

    public final void addState(String s, String s1)
    {
        if (StringUtil.isNotNullOrEmpty(s) && StringUtil.isNotNullOrEmpty(s1))
        {
            if (state == null)
            {
                state = new HashMap();
            }
            state.put(s, s1);
        }
    }

    public final void dispose()
    {
        Iterator iterator = refList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                refList = null;
                return;
            }
            ((Ref)iterator.next()).dispose();
        } while (true);
    }

    public final Ref getCurrent()
    {
        if (enumeratorIndex < 0 || enumeratorIndex >= refList.size())
        {
            return null;
        } else
        {
            return (Ref)refList.get(enumeratorIndex);
        }
    }

    public volatile Object getCurrent()
    {
        return getCurrent();
    }

    public final Ref getNext()
    {
        int i = enumeratorIndex + 1;
        if (i < 0 || i >= refList.size() || !sequence.hasAvailableSlot())
        {
            return null;
        } else
        {
            return (Ref)refList.get(i);
        }
    }

    public final Ad getPrimaryAd()
    {
        if (refList.size() > 0)
        {
            return ((Ref)refList.get(0)).getAd();
        } else
        {
            return null;
        }
    }

    public final int getPriority()
    {
        return priority;
    }

    public final ArrayList getRefList()
    {
        return refList;
    }

    public final Sequence getSequence()
    {
        return sequence;
    }

    public final HashMap getState()
    {
        return state;
    }

    public final SmilElementType getType()
    {
        if (sequence != null)
        {
            return sequence.getType();
        } else
        {
            return SmilElementType.UNKNOWN;
        }
    }

    public final boolean isResolved()
    {
        return isResolved;
    }

    public final boolean moveNext()
    {
        enumeratorIndex = enumeratorIndex + 1;
        if (enumeratorIndex < refList.size())
        {
            return sequence.hasAvailableSlot();
        } else
        {
            return false;
        }
    }

    public void onEvent(String s, Object obj)
    {
        if (!s.equalsIgnoreCase("error")) goto _L2; else goto _L1
_L1:
        if (obj instanceof AdPluginEvent)
        {
            dispatchEvent(s, obj);
        }
_L4:
        return;
_L2:
        if (!s.equalsIgnoreCase("complete")) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj2 = null;
        Object obj3 = null;
        s = obj2;
        obj1 = obj3;
        if (obj instanceof Event)
        {
            s = obj2;
            obj1 = obj3;
            if (((Event)obj).getOwner() instanceof INetworkAdLoader)
            {
                obj1 = (INetworkAdLoader)((Event)obj).getOwner();
                s = ((INetworkAdLoader) (obj1)).getAd();
            }
        }
        if (s == null) goto _L6; else goto _L5
_L5:
        refList = new ArrayList();
        obj = ((INetworkAdLoader) (obj1)).getResult();
        if (obj == null || !(obj instanceof ArrayList))
        {
            break MISSING_BLOCK_LABEL_292;
        }
        obj = ((ArrayList)obj).iterator();
_L10:
        if (((Iterator) (obj)).hasNext()) goto _L7; else goto _L6
_L6:
        notifyResolutionComplete();
        return;
_L7:
        ArrayList arraylist;
        Object obj4;
        obj4 = (ArrayList)((Iterator) (obj)).next();
        obj1 = new Ref(this);
        ((Ref) (obj1)).setAd(s);
        arraylist = new ArrayList();
        if (((ArrayList) (obj4)).size() <= 0) goto _L9; else goto _L8
_L8:
        obj4 = ((ArrayList) (obj4)).iterator();
_L11:
        if (((Iterator) (obj4)).hasNext())
        {
            break MISSING_BLOCK_LABEL_226;
        }
_L9:
        ((Ref) (obj1)).setAssets((Asset[])arraylist.toArray(new Asset[0]));
        addRef(((Ref) (obj1)));
          goto _L10
        Asset asset = (Asset)((Iterator) (obj4)).next();
        Asset asset1 = s.getTrackingAssetByType(asset.getType());
        if (asset1 != null)
        {
            asset1.Reset();
            asset1.CopyTo(asset);
        }
        arraylist.add(asset);
        if (asset instanceof OnPageAsset)
        {
            Ad.consolidateOnPageAsset(arraylist, asset);
        }
          goto _L11
        obj = new Ref(this);
        ((Ref) (obj)).setAd(s);
        ((Ref) (obj)).setAssets(null);
        addRef(((Ref) (obj)));
          goto _L6
    }

    public final void reset()
    {
        enumeratorIndex = -1;
        isResolved = false;
    }

    public final void resetAds()
    {
        Iterator iterator = refList.iterator();
        do
        {
            Asset aasset[];
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                Ref ref = (Ref)iterator.next();
                ref.setWatched(false);
                aasset = ref.getAssets();
            } while (aasset == null || aasset.length <= 0);
            int j = aasset.length;
            int i = 0;
            while (i < j) 
            {
                Asset asset = aasset[i];
                if (asset != null)
                {
                    asset.Reset();
                }
                i++;
            }
        } while (true);
    }

    public final void resolve(HashMap hashmap)
    {
        if (isResolved)
        {
            notifyResolutionComplete();
            return;
        }
        if (refList.size() > 0)
        {
            Ad ad = ((Ref)refList.get(0)).getAd();
            if (ad != null && ad.getIsNetworkAd())
            {
                networkAdLoader = NetworkAdLoaderFactory.getLoaderForType(ad.getNetworkAdType());
                if (networkAdLoader != null)
                {
                    networkAdLoader.addEventListener("error", this);
                    networkAdLoader.addEventListener("complete", this);
                    networkAdLoader.setCustomParams(hashmap);
                    networkAdLoader.setSource(ad.getNetworkAdSource());
                    networkAdLoader.setAd(ad);
                    networkAdLoader.load();
                    return;
                } else
                {
                    notifyResolutionComplete();
                    return;
                }
            } else
            {
                notifyResolutionComplete();
                return;
            }
        } else
        {
            notifyResolutionComplete();
            return;
        }
    }

    public void setParResolutionCompleteListener(ParResoultionCompleteListener parresoultioncompletelistener)
    {
        parListener = parresoultioncompletelistener;
    }

    public final void setPriority(int i)
    {
        priority = i;
    }

    public void setSequence(Sequence sequence1)
    {
        sequence = sequence1;
    }
}
