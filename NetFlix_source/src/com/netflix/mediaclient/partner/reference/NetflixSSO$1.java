// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner.reference;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.Response;
import com.netflix.mediaclient.partner.ResponseListener;

// Referenced classes of package com.netflix.mediaclient.partner.reference:
//            NetflixSSO

class this._cls0
    implements ResponseListener
{

    final NetflixSSO this$0;

    public void onResponseReceived(Response response)
    {
        response = response.getResponder();
        if (response == null)
        {
            Log.e("nf_partner", "getExternalSsoService did not set component name!");
            return;
        }
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("getExternalSsoService sets component name ").append(response).toString());
        }
        NetflixSSO.access$000(NetflixSSO.this).setComponentName(response);
    }

    ()
    {
        this$0 = NetflixSSO.this;
        super();
    }
}
