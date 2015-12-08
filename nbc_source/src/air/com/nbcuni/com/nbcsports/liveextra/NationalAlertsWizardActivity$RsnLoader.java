// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.google.gson.Gson;
import com.nbcsports.liveextra.ApplicationComponent;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.content.AlertOption;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.urbanairship.push.PushManager;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            NationalAlertsWizardActivity

public static class configuration extends AsyncTaskLoader
{

    private final Configuration configuration;
    private OkHttpClient mClient;
    private ner mData;
    private Gson mGson;

    private void fetchAlertOptions()
    {
        Object obj = configuration.getAlertsUrl();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((String) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
        obj = new URL(((String) (obj)));
        obj = (new com.squareup.okhttp..getAlertsUrl()).getAlertsUrl(((URL) (obj))).getAlertsUrl().getAlertsUrl();
        obj = mClient.newCall(((com.squareup.okhttp.Request) (obj))).execute().body().string();
        mData.alertOptions = (List)mGson.fromJson(((String) (obj)), com/phunware/nbc/sochi/content/AlertOption$Collection);
        obj = PushManager.shared().getTags();
        Iterator iterator = mData.alertOptions.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (AlertOption)iterator.next();
            ((AlertOption) (obj1)).setSelected(((Set) (obj)).contains(((AlertOption) (obj1)).getTag()));
            if (((AlertOption) (obj1)).getSubsections() != null)
            {
                obj1 = ((AlertOption) (obj1)).getSubsections().iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    AlertOption alertoption = (AlertOption)((Iterator) (obj1)).next();
                    alertoption.setSelected(((Set) (obj)).contains(alertoption.getTag()));
                }
            }
        } while (true);
        break MISSING_BLOCK_LABEL_198;
        obj;
        ((IOException) (obj)).printStackTrace();
        return;
_L2:
        obj = "http://stream.nbcsports.com/data/mobile/alerts.json";
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void findRSNs()
    {
        Object obj;
        try
        {
            obj = configuration.getRsnDmaUrl();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((String) (obj)).isEmpty()) goto _L2; else goto _L3
_L3:
        obj = new URL(((String) (obj)));
        obj = (new com.squareup.okhttp..getRsnDmaUrl()).getRsnDmaUrl(((URL) (obj))).getRsnDmaUrl().getRsnDmaUrl();
        obj = mClient.newCall(((com.squareup.okhttp.Request) (obj))).execute().body().string();
        mData.rsnDmaModel.allRsns = (List)mGson.fromJson(((String) (obj)), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity$RsnDmaModel$RsnDmaList);
        obj = mData.rsnDmaModel.allRsns.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            l.RsnDma rsndma = (l.RsnDma)((Iterator) (obj)).next();
            if (mData.rsnDmaModel.dma != null && mData.rsnDmaModel.dma.equals(rsndma.dma))
            {
                mData.rsnDmaModel.matchingRsns.add(rsndma);
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        obj = "http://stream.nbcsports.com/data/mobile/rsndma.json";
        if (true) goto _L3; else goto _L4
_L4:
        Log.d("Alerts", (new StringBuilder()).append("Matching rsns: ").append(mData.rsnDmaModel.matchingRsns).toString());
        return;
    }

    public ner loadInBackground()
    {
        if (getContext() != null && (!(getContext() instanceof Activity) || !((Activity)getContext()).isFinishing()))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        cancelLoad();
        return null;
        if (mData != null) goto _L2; else goto _L1
_L1:
        mData = new ner();
        if (!NBCSystem.IS_GEO_LOCATION_ENABLED) goto _L4; else goto _L3
_L3:
        mData.rsnDmaModel.dma = NBCSystem.LAST_KNOWN_GEO_LOCATION.NielsonDMA;
        findRSNs();
_L5:
        fetchAlertOptions();
_L2:
        deliverResult(mData);
_L6:
        return mData;
_L4:
        mData.rsnDmaModel.dma = null;
        findRSNs();
          goto _L5
        Exception exception;
        exception;
        mData = new ner();
        NBCSystem.debugLog("NationalAlertsWizardActivity", exception.toString());
          goto _L6
    }

    public volatile Object loadInBackground()
    {
        return loadInBackground();
    }

    public ner(Context context)
    {
        super(context);
        mData = null;
        context = NBCSportsApplication.component();
        mGson = context.gson();
        mClient = context.okHttpClient();
        configuration = context.configuration();
    }
}
