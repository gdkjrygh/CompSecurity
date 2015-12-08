// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.podbuster;

import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.metadata.Metadata;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.Midroll;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.content.podbuster:
//            NbcContentResolver, AffiliateResolver

class this._cls0
    implements Callback
{

    final NbcContentResolver this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        NbcContentResolver.access$100(NbcContentResolver.this).getCustomParameters().setValue("SITE_SECTION_ID", NbcContentResolver.access$000(NbcContentResolver.this));
        NbcContentResolver.access$200(NbcContentResolver.this, "");
    }

    public void onResponse(Response response)
        throws IOException
    {
        Gson gson;
        Response response1;
        String s2;
        String s3;
        s3 = "";
        s2 = NbcContentResolver.access$000(NbcContentResolver.this);
        if (!response.isSuccessful())
        {
            NbcContentResolver.access$100(NbcContentResolver.this).getCustomParameters().setValue("SITE_SECTION_ID", s2);
            NbcContentResolver.access$200(NbcContentResolver.this, "");
            return;
        }
        gson = new Gson();
        response1 = null;
        response = (List)gson.fromJson(response.body().string(), com/nbcsports/liveextra/content/models/Midroll$Collection);
        response1 = response;
_L2:
        response = s3;
        String s = s2;
        if (response1 != null)
        {
            response = s3;
            s = s2;
            if (response1.size() > 0)
            {
                Midroll midroll = (Midroll)response1.get(0);
                response = s3;
                s = s2;
                if (midroll != null)
                {
                    String s1 = midroll.getFreewheelParam();
                    response = s1;
                    s = s2;
                    if (NbcContentResolver.access$300(NbcContentResolver.this) != null)
                    {
                        response = s1;
                        s = s2;
                        if (NbcContentResolver.access$300(NbcContentResolver.this).isAffiliateMidroll(midroll))
                        {
                            s = NbcContentResolver.access$300(NbcContentResolver.this).getAffiliateParams(NbcContentResolver.access$000(NbcContentResolver.this));
                            response = s1;
                        }
                    }
                }
            }
        }
        NbcContentResolver.access$100(NbcContentResolver.this).getCustomParameters().setValue("SITE_SECTION_ID", s);
        NbcContentResolver.access$200(NbcContentResolver.this, response);
        return;
        response;
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = NbcContentResolver.this;
        super();
    }
}
