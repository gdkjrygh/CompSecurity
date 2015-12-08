// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.PlayerErrorEvent;
import com.auditude.ads.exception.AssetException;
import com.auditude.ads.exception.PlayerException;
import com.auditude.ads.loader.AdRequest;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.tracking.Submissions;
import com.auditude.ads.util.event.EventDispatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads.response:
//            IResponseParser, VMAPParser, AudienceManager, AuditudeResponseParser

public class AdResponse extends EventDispatcher
    implements AudienceManager.AudienceManagerListener, IResponseParser.ResponseParserListener
{
    public static interface AdResponseListener
    {

        public abstract void onRequestComplete(ArrayList arraylist);

        public abstract void onRequestFailed(Throwable throwable);
    }


    public static final int VMAP = 0;
    private AdRequest adRequest;
    private AdSettings adSettings;
    private HashMap ads;
    private AudienceManager audienceManager;
    private ArrayList breaks;
    private ArrayList chapters;
    private ArrayList errorQueue;
    private AdResponseListener listener;
    private ArrayList parserExceptions;
    private int responseIndex;
    private ArrayList responseList;
    private IResponseParser responseParser;
    private Submissions submissions;
    private int timeout;

    public AdResponse(AdSettings adsettings)
    {
        submissions = new Submissions();
        breaks = new ArrayList();
        chapters = new ArrayList();
        ads = new HashMap();
        responseIndex = 0;
        responseList = new ArrayList();
        errorQueue = new ArrayList();
        parserExceptions = new ArrayList();
        adSettings = adsettings;
        responseList.add(Integer.valueOf(0));
    }

    private void clearResponseParser()
    {
        if (responseParser != null)
        {
            responseParser.setResponseParserListener(null);
            responseParser = null;
        }
    }

    private void loadNextResponse()
    {
        if (responseIndex >= responseList.size()) goto _L2; else goto _L1
_L1:
        responseIndex = responseIndex + 1;
        ((Integer)responseList.get(responseIndex - 1)).intValue();
        JVM INSTR tableswitch 0 0: default 60
    //                   0 61;
           goto _L3 _L4
_L3:
        return;
_L4:
        if (VMAPParser.isValidParserForResponse(this).booleanValue())
        {
            responseParser = new VMAPParser();
            responseParser.setResponseParserListener(this);
            responseParser.loadAdRequest(this, adRequest, timeout);
            return;
        } else
        {
            loadNextResponse();
            return;
        }
_L2:
        listener.onRequestComplete(parserExceptions);
        int i = 0;
        while (i < errorQueue.size()) 
        {
            AuditudeEnv.getInstance().getAPI().dispatchEvent("playerError", new PlayerErrorEvent(this, (PlayerException)errorQueue.get(i)));
            i++;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public ArrayList GetBreakData()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= breaks.size())
            {
                return arraylist;
            }
            arraylist.add(((Group)breaks.get(i)).getDescription());
            i++;
        } while (true);
    }

    public void cancel()
    {
        if (responseParser != null)
        {
            responseParser.cancel();
        }
    }

    public final void dispose()
    {
        Iterator iterator = breaks.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        breaks = null;
        iterator = chapters.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        chapters = null;
        iterator = ads.entrySet().iterator();
_L7:
        if (!iterator.hasNext())
        {
            ads = null;
            if (audienceManager != null)
            {
                audienceManager.setAudienceManagerListener(null);
                audienceManager = null;
            }
            if (responseParser != null)
            {
                responseParser.setResponseParserListener(null);
                clearResponseParser();
                responseParser = null;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_148;
_L2:
        ((Group)iterator.next()).dispose();
          goto _L5
_L4:
        ((Group)iterator.next()).dispose();
          goto _L6
        ((Ad)((java.util.Map.Entry)iterator.next()).getValue()).dispose();
          goto _L7
    }

    final AdSettings getAdSettings()
    {
        return adSettings;
    }

    public HashMap getAds()
    {
        return ads;
    }

    public ArrayList getBreaks()
    {
        return breaks;
    }

    public ArrayList getChapters()
    {
        return chapters;
    }

    public Submissions getSubmissions()
    {
        return submissions;
    }

    public void loadAdRequest(AdRequest adrequest, int i)
    {
        adRequest = adrequest;
        timeout = i;
        audienceManager = new AudienceManager(timeout);
        adrequest = null;
        if (AuditudeEnv.getInstance().getAdSettings().hasProperty("audienceManagerURL"))
        {
            adrequest = (String)AuditudeEnv.getInstance().getAdSettings().getProperty("audienceManagerURL");
        }
        if (adrequest != null && adrequest.length() > 0)
        {
            audienceManager.setAudienceManagerListener(this);
            audienceManager.loadSegmentData((String)AuditudeEnv.getInstance().getAdSettings().getProperty("audienceManagerURL"));
            return;
        } else
        {
            onAudienceManagerComplete();
            return;
        }
    }

    public void onAudienceManagerComplete()
    {
        String as[] = audienceManager.getSegmentsValues();
        if (as != null && as.length > 0)
        {
            adRequest.setAamSegments(audienceManager.getSegmentsValues());
            AuditudeEnv.getInstance().getAdSettings().setAamSegments(audienceManager.getSegmentsValues());
        } else
        {
            adRequest.setAamSegments(null);
            AuditudeEnv.getInstance().getAdSettings().setAamSegments(null);
        }
        if (audienceManager.getUuid() != null)
        {
            adRequest.setAamUuid(audienceManager.getUuid());
            AuditudeEnv.getInstance().getAdSettings().setAamUuid(audienceManager.getUuid());
        } else
        {
            adRequest.setAamUuid(null);
            AuditudeEnv.getInstance().getAdSettings().setAamUuid(null);
        }
        responseParser = new AuditudeResponseParser();
        responseParser.setResponseParserListener(this);
        responseParser.loadAdRequest(this, adRequest, timeout);
    }

    public void onAudienceManagerFailed(Throwable throwable)
    {
        throwable = new AssetException(1111, "Audience Manager Failed");
        errorQueue.add(throwable);
        onAudienceManagerComplete();
    }

    public void onRequestComplete(AssetException assetexception)
    {
        if (assetexception != null)
        {
            parserExceptions.add(assetexception);
        }
        clearResponseParser();
        loadNextResponse();
    }

    public void onRequestFailed(Throwable throwable)
    {
        clearResponseParser();
        listener.onRequestFailed(throwable);
    }

    public void setAdResponseListener(AdResponseListener adresponselistener)
    {
        listener = adresponselistener;
    }

    public void setAds(HashMap hashmap)
    {
        ads = hashmap;
    }

    public void setBreaks(ArrayList arraylist)
    {
        breaks = arraylist;
    }

    public void setChapters(ArrayList arraylist)
    {
        chapters = arraylist;
    }

    public void setSubmissions(Submissions submissions1)
    {
        submissions = submissions1;
    }
}
