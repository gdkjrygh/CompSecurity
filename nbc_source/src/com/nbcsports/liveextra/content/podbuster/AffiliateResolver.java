// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.podbuster;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.AffiliateContainer;
import com.nbcsports.liveextra.content.models.Midroll;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.system.NBCSystem;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

public class AffiliateResolver
{

    private final String NBC_AFFILIATE_URL = "http://stream.nbcsports.com/data/affiliates_{{pid}}.json";
    private com.nbcsports.liveextra.content.models.AffiliateContainer.Affiliate localAffiliate;

    public AffiliateResolver(String s)
    {
        localAffiliate = null;
        final String dma;
        if (NBCSystem.LAST_KNOWN_GEO_LOCATION != null)
        {
            dma = NBCSystem.LAST_KNOWN_GEO_LOCATION.NielsonDMA;
        } else
        {
            dma = "";
        }
        Timber.d((new StringBuilder()).append("AFFILIATE LOOKUP: ").append(dma).toString(), new Object[0]);
        s = (new com.squareup.okhttp.Request.Builder()).get().url(getAffiliateUrl(s)).build();
        (new OkHttpClient()).newCall(s).enqueue(new Callback() {

            final AffiliateResolver this$0;
            final String val$dma;

            public void onFailure(Request request, IOException ioexception)
            {
                Timber.e(ioexception, "Exception occured on request for affiliate", new Object[0]);
            }

            public void onResponse(Response response)
                throws IOException
            {
                if (response.isSuccessful()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Gson gson = new Gson();
                com.nbcsports.liveextra.content.models.AffiliateContainer.Affiliate affiliate = null;
                try
                {
                    response = ((AffiliateContainer)gson.fromJson(response.body().string(), com/nbcsports/liveextra/content/models/AffiliateContainer)).getAffiliates();
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    response = affiliate;
                }
                if (response == null || response.size() <= 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
                response = response.iterator();
                do
                {
                    if (!response.hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    affiliate = (com.nbcsports.liveextra.content.models.AffiliateContainer.Affiliate)response.next();
                } while (!TextUtils.equals(dma, Integer.toString(affiliate.getDmaCode())));
                break; /* Loop/switch isn't completed */
                if (true) goto _L1; else goto _L3
_L3:
                localAffiliate = affiliate;
                return;
            }

            
            {
                this$0 = AffiliateResolver.this;
                dma = s;
                super();
            }
        });
    }

    public String getAffiliateParams(String s)
    {
label0:
        {
            String s1;
            try
            {
                if (localAffiliate == null)
                {
                    break label0;
                }
                s1 = String.format("%s_%s", new Object[] {
                    s, localAffiliate.getStation().toLowerCase()
                });
            }
            catch (Exception exception)
            {
                Timber.e(exception, "Could not obtain local affiliate", new Object[0]);
                return s;
            }
            return s1;
        }
        return s;
    }

    public String getAffiliateUrl(String s)
    {
        return "http://stream.nbcsports.com/data/affiliates_{{pid}}.json".replace("{{pid}}", s);
    }

    public boolean isAffiliateMidroll(Midroll midroll)
    {
        midroll = midroll.getCueType();
        return midroll != null && midroll.equalsIgnoreCase("affiliate") && localAffiliate != null;
    }


/*
    static com.nbcsports.liveextra.content.models.AffiliateContainer.Affiliate access$002(AffiliateResolver affiliateresolver, com.nbcsports.liveextra.content.models.AffiliateContainer.Affiliate affiliate)
    {
        affiliateresolver.localAffiliate = affiliate;
        return affiliate;
    }

*/
}
