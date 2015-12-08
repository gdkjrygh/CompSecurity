// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.loader;

import com.auditude.ads.network.vast.model.VASTAd;
import com.auditude.ads.network.vast.model.VASTClick;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.network.vast.model.VASTInlineAd;
import com.auditude.ads.network.vast.model.VASTLinearCreative;
import com.auditude.ads.network.vast.model.VASTTrackingEvent;
import com.auditude.ads.network.vast.model.VASTTrackingUrl;
import com.auditude.ads.network.vast.model.VASTWrapperAd;
import com.auditude.ads.network.vast.repackaging.VastAssetRepackagerInfo;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.EventDispatcher;
import com.auditude.ads.util.event.IEventListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.auditude.ads.network.vast.loader:
//            VASTXMLLoader, VASTXMLParser

public class VASTDocumentProcessor extends EventDispatcher
    implements com.auditude.ads.network.vast.repackaging.VastAssetRepackager.VastAssetRepackagingCompletionListener, IEventListener
{

    public static final String PROCESS_COMPLETE = "processComplete";
    public static final String PROCESS_FAILED = "processFailed";
    private VASTDocument document;
    private Throwable error;
    private Boolean fallbackOnInvalidCreative;
    private int maxNumWrapperRedirects;
    private ArrayList mimeTypes;
    private int numLoadsToComplete;
    private int repackagingCount;
    VastAssetRepackagerInfo vastAssetRepackagerInfo;
    private VASTDocument wrapperDocument;

    public VASTDocumentProcessor(int i, ArrayList arraylist, VastAssetRepackagerInfo vastassetrepackagerinfo, Boolean boolean1)
    {
        numLoadsToComplete = 0;
        maxNumWrapperRedirects = 6;
        mimeTypes = null;
        vastAssetRepackagerInfo = null;
        repackagingCount = 0;
        fallbackOnInvalidCreative = Boolean.valueOf(false);
        maxNumWrapperRedirects = i;
        mimeTypes = arraylist;
        vastAssetRepackagerInfo = vastassetrepackagerinfo;
        fallbackOnInvalidCreative = boolean1;
    }

    private void checkCompletion(VASTDocument vastdocument)
    {
        numLoadsToComplete = numLoadsToComplete - 1;
        if (numLoadsToComplete <= 0)
        {
            repackageIncompatibleCreatives();
        }
    }

    private Boolean checkForFallbackAds()
    {
        Boolean boolean1;
        Object obj;
        if (vastAssetRepackagerInfo.repackaginEnabled.booleanValue())
        {
            mimeTypes = new ArrayList();
            mimeTypes.add(vastAssetRepackagerInfo.requiredFormat);
        }
        boolean1 = Boolean.valueOf(true);
        obj = boolean1;
        if (wrapperDocument == null) goto _L2; else goto _L1
_L1:
        obj = boolean1;
        if (wrapperDocument.getAds() == null) goto _L2; else goto _L3
_L3:
        obj = boolean1;
        if (wrapperDocument.getAds().size() <= 0) goto _L2; else goto _L4
_L4:
        obj = wrapperDocument.getAds().iterator();
_L8:
        if (((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        obj = boolean1;
_L2:
        return ((Boolean) (obj));
_L6:
        VASTAd vastad;
        VASTAd vastad1 = (VASTAd)((Iterator) (obj)).next();
        Boolean boolean2;
        boolean flag;
        if (mimeTypes != null && !vastad1.hasAssetsWithMimeType(mimeTypes).booleanValue())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        boolean2 = Boolean.valueOf(flag);
        if (vastad1.getFallbackOnNoAd().booleanValue() && (!boolean2.booleanValue() || vastad1.getInlineAds() == null || vastad1.getInlineAds().size() <= 0))
        {
label0:
            {
                vastad = vastad1.getDocument().getNextUnusedAd();
                if (vastad == null || !vastad.hasAssetsWithMimeType(mimeTypes).booleanValue() && vastad.getWrapperAd() == null && !vastad1.getFallbackOnInvalidCreative().booleanValue())
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (vastad1.getInlineAds() != null && vastad1.getInlineAds().size() > 0 && !boolean2.booleanValue())
                {
                    for (Iterator iterator = vastad1.getInlineAds().iterator(); iterator.hasNext(); logVastError((VASTInlineAd)iterator.next(), 403))
                    {
                        break label0;
                    }

                }
                wrapperDocument.replaceAd(vastad1, vastad);
                if (shouldLoadVASTWrapper(vastad).booleanValue())
                {
                    boolean1 = Boolean.valueOf(false);
                    loadVASTWrapper(vastad);
                    numLoadsToComplete = getNumVASTWrappers(vastad.getDocument());
                }
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (vastad == null) goto _L8; else goto _L9
_L9:
        return checkForFallbackAds();
    }

    private int getNumVASTWrappers(VASTDocument vastdocument)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        vastdocument = vastdocument.getAds();
        i = ((flag1) ? 1 : 0);
        if (vastdocument == null) goto _L2; else goto _L1
_L1:
        i = ((flag1) ? 1 : 0);
        if (vastdocument.size() <= 0) goto _L2; else goto _L3
_L3:
        vastdocument = vastdocument.iterator();
        i = ((flag) ? 1 : 0);
_L6:
        if (vastdocument.hasNext()) goto _L4; else goto _L2
_L2:
        return i;
_L4:
        if (shouldLoadVASTWrapper((VASTAd)vastdocument.next()).booleanValue())
        {
            i++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void loadVASTWrapper(VASTAd vastad)
    {
        VASTXMLLoader vastxmlloader = new VASTXMLLoader(Math.max(-1, maxNumWrapperRedirects - 1), mimeTypes, vastAssetRepackagerInfo, fallbackOnInvalidCreative);
        vastxmlloader.State = vastad;
        vastxmlloader.addEventListener("complete", this);
        vastxmlloader.addEventListener("failed", this);
        vastxmlloader.init(vastad.getWrapperAd().source);
    }

    private void loadVASTWrappers(VASTDocument vastdocument)
    {
        numLoadsToComplete = getNumVASTWrappers(vastdocument);
        vastdocument = vastdocument.getAds();
        if (vastdocument == null || vastdocument.size() <= 0) goto _L2; else goto _L1
_L1:
        vastdocument = vastdocument.iterator();
_L5:
        if (vastdocument.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        VASTAd vastad = (VASTAd)vastdocument.next();
        if (vastad != null && vastad.getWrapperAd() != null)
        {
            loadVASTWrapper(vastad);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void logVastError(VASTInlineAd vastinlinead, int i)
    {
        if (vastinlinead != null && vastinlinead.errorUrl != null && vastinlinead.errorUrl.length() > 0)
        {
            PingUtil.pingUrl(AuditudeUtil.substituteTags(vastinlinead.errorUrl.replaceAll("\\[ERRORCODE\\]", String.valueOf(i)).replaceAll("%5BERRORCODE%5D", String.valueOf(i))));
        }
    }

    private void mergeAd(VASTInlineAd vastinlinead, VASTWrapperAd vastwrapperad)
    {
        if (vastwrapperad != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (vastwrapperad.getImpressionUrls() == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = vastwrapperad.getImpressionUrls().iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        if (vastwrapperad.linearAd == null || vastwrapperad.linearAd.getTrackingEvents() == null || vastinlinead.linearAd == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator = vastwrapperad.linearAd.getTrackingEvents().iterator();
_L8:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (vastwrapperad.linearAd == null || vastwrapperad.linearAd.click == null || vastinlinead.linearAd == null) goto _L1; else goto _L6
_L6:
        vastwrapperad = vastwrapperad.linearAd.click;
        vastinlinead = vastinlinead.linearAd.click;
        vastwrapperad = vastwrapperad.getTrackingUrls();
        if (vastwrapperad != null && vastinlinead != null)
        {
            vastwrapperad = vastwrapperad.iterator();
            while (vastwrapperad.hasNext()) 
            {
                vastinlinead.addClickTrackingUrl((String)vastwrapperad.next());
            }
        }
          goto _L1
_L5:
        vastinlinead.addImpressionUrl((VASTTrackingUrl)iterator.next());
          goto _L7
        VASTTrackingEvent vasttrackingevent = (VASTTrackingEvent)iterator.next();
        vastinlinead.linearAd.addTrackingEvent(vasttrackingevent);
          goto _L8
    }

    private void mergeAds(VASTAd vastad, VASTDocument vastdocument)
    {
        if (vastdocument == null)
        {
            return;
        }
        if (vastad != null && vastad.getDocument() != null)
        {
            vastad.getDocument().reachedMaxWrapper = vastdocument.reachedMaxWrapper;
        }
        if (vastdocument.getAds() == null || vastdocument.getAds().size() <= 0) goto _L2; else goto _L1
_L1:
        vastdocument = vastdocument.getAds().iterator();
_L5:
        if (vastdocument.hasNext()) goto _L3; else goto _L2
_L2:
        vastad.setWrapperAd(null);
        return;
_L3:
        Object obj = (VASTAd)vastdocument.next();
        if (obj != null && ((VASTAd) (obj)).getInlineAds() != null)
        {
            obj = ((VASTAd) (obj)).getInlineAds().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                VASTInlineAd vastinlinead = (VASTInlineAd)((Iterator) (obj)).next();
                mergeAd(vastinlinead, vastad.getWrapperAd());
                vastad.addInlineAds(vastinlinead);
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void onWrapperLoadComplete(Object obj)
    {
        Object obj1 = null;
        VASTXMLLoader vastxmlloader;
        VASTAd vastad;
        if (!(obj instanceof VASTXMLLoader))
        {
            obj = null;
        }
        vastxmlloader = (VASTXMLLoader)obj;
        vastxmlloader.removeEventListener("complete", this);
        vastxmlloader.removeEventListener("failed", this);
        vastad = (VASTAd)vastxmlloader.State;
        obj = null;
        if (vastad != null)
        {
            obj = vastad.getWrapperAd();
        }
        if (vastxmlloader.State instanceof VASTAd)
        {
            obj1 = vastxmlloader.State;
        }
        mergeAds((VASTAd)obj1, vastxmlloader.getDocument());
        if (vastxmlloader.State != null && (vastxmlloader.State instanceof VASTAd) && (vastad.getInlineAds() == null || vastad.getInlineAds().size() == 0))
        {
            logVastError(((VASTInlineAd) (obj)), 303);
        }
        checkCompletion(vastad.getDocument());
    }

    private void onWrapperLoadFailed(Object obj)
    {
        if (!(obj instanceof VASTXMLLoader))
        {
            obj = null;
        }
        obj = (VASTXMLLoader)obj;
        ((VASTXMLLoader) (obj)).removeEventListener("complete", this);
        ((VASTXMLLoader) (obj)).removeEventListener("failed", this);
        if (((VASTXMLLoader) (obj)).State != null && (((VASTXMLLoader) (obj)).State instanceof VASTAd))
        {
            logVastError(((VASTAd)((VASTXMLLoader) (obj)).State).getWrapperAd(), 301);
        }
        checkCompletion(null);
    }

    private void repackageIncompatibleCreatives()
    {
        repackagingCount = 0;
        if (!vastAssetRepackagerInfo.repackaginEnabled.booleanValue() || wrapperDocument == null || wrapperDocument.getAds() == null || wrapperDocument.getAds().size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = wrapperDocument.getAds().iterator();
_L7:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        ((VASTAd)iterator.next()).repackageIncompatibleCreatives(this, vastAssetRepackagerInfo);
        continue; /* Loop/switch isn't completed */
_L2:
        if (!checkForFallbackAds().booleanValue()) goto _L3; else goto _L5
_L5:
        document = wrapperDocument;
        dispatchEvent("processComplete", new Event(this));
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private Boolean shouldLoadVASTWrapper(VASTAd vastad)
    {
        if (vastad != null && vastad.getWrapperAd() != null && (maxNumWrapperRedirects == -1 || maxNumWrapperRedirects > 0))
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public final VASTDocument getDocument()
    {
        return document;
    }

    public final Throwable getError()
    {
        return error;
    }

    public void onEvent(String s, Object obj)
    {
        if (s.equalsIgnoreCase("complete"))
        {
            onWrapperLoadComplete(((Event)obj).getOwner());
        } else
        if (s.equalsIgnoreCase("failed"))
        {
            onWrapperLoadFailed(((Event)obj).getOwner());
            return;
        }
    }

    public void onRepackagingComplete(VASTLinearCreative vastlinearcreative, boolean flag)
    {
        repackagingCount = repackagingCount + 1;
        if (repackagingCount >= wrapperDocument.getAds().size() && checkForFallbackAds().booleanValue())
        {
            document = wrapperDocument;
            dispatchEvent("processComplete", new Event(this));
        }
    }

    public final void process(VASTDocument vastdocument)
    {
        if (vastdocument != null)
        {
            if (getNumVASTWrappers(vastdocument) > 0)
            {
                wrapperDocument = vastdocument;
                loadVASTWrappers(wrapperDocument);
                return;
            }
            if (vastdocument.parentAd != null && vastdocument.parentAd.getIsFromVmapDoc().booleanValue() && fallbackOnInvalidCreative.booleanValue())
            {
                Iterator iterator = vastdocument.getAds().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        wrapperDocument = vastdocument;
                        repackageIncompatibleCreatives();
                        return;
                    }
                    ((VASTAd)iterator.next()).setFallbackOnNoAd(Boolean.valueOf(true));
                } while (true);
            } else
            {
                document = vastdocument;
                dispatchEvent("processComplete", new Event(this));
                return;
            }
        } else
        {
            dispatchEvent("processFailed", new Event(this));
            return;
        }
    }

    public final void process(String s, VASTAd vastad)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        Object obj = null;
        VASTXMLParser vastxmlparser = new VASTXMLParser();
        vastxmlparser.parentAd = vastad;
        try
        {
            s = vastxmlparser.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            error = s;
            s = obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            error = s;
            s = obj;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (getNumVASTWrappers(s) <= 0) goto _L4; else goto _L3
_L3:
        wrapperDocument = s;
        loadVASTWrappers(wrapperDocument);
        flag = flag1;
_L10:
        if (flag)
        {
            dispatchEvent("processFailed", new Event(this));
        }
        return;
_L4:
        if (vastad == null || !vastad.getIsFromVmapDoc().booleanValue() || !fallbackOnInvalidCreative.booleanValue())
        {
            break MISSING_BLOCK_LABEL_272;
        }
        vastad = s.getAds().iterator();
_L7:
        if (vastad.hasNext()) goto _L6; else goto _L5
_L5:
        wrapperDocument = s;
        repackageIncompatibleCreatives();
_L8:
        flag = flag1;
        if (document == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (document.getAds() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (document.getAds().size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = document.getAds().iterator();
        do
        {
            do
            {
                flag = flag1;
                if (!s.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                vastad = (VASTAd)s.next();
            } while (vastad.getWrapperAd() == null);
            document.reachedMaxWrapper = true;
            logVastError(vastad.getWrapperAd(), 302);
        } while (true);
_L6:
        ((VASTAd)vastad.next()).setFallbackOnNoAd(Boolean.valueOf(true));
          goto _L7
        document = s;
        dispatchEvent("processComplete", new Event(this));
          goto _L8
_L2:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
