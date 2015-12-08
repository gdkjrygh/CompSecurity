// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.podbuster;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.AffiliateContainer;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.content.podbuster:
//            AffiliateResolver

class val.dma
    implements Callback
{

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
        com.nbcsports.liveextra.content.models.ffiliate ffiliate = null;
        try
        {
            response = ((AffiliateContainer)gson.fromJson(response.body().string(), com/nbcsports/liveextra/content/models/AffiliateContainer)).getAffiliates();
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            response = ffiliate;
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
            ffiliate = (com.nbcsports.liveextra.content.models.ffiliate)response.next();
        } while (!TextUtils.equals(val$dma, Integer.toString(ffiliate.getDmaCode())));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        AffiliateResolver.access$002(AffiliateResolver.this, ffiliate);
        return;
    }

    liate()
    {
        this$0 = final_affiliateresolver;
        val$dma = String.this;
        super();
    }
}
