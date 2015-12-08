// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.jsapi;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.PartnerFactory;
import com.netflix.mediaclient.partner.Response;
import com.netflix.mediaclient.partner.ResponseListener;

// Referenced classes of package com.netflix.mediaclient.jsapi:
//            PartnerJSObject

class val.idx
    implements Runnable
{

    final PartnerJSObject this$0;
    final int val$idx;
    final String val$service;

    public void run()
    {
        Object obj;
        Log.d("nf_partner", "Find partner");
        obj = PartnerJSObject.access$100(PartnerJSObject.this).getPartner(context, val$service, PartnerJSObject.access$000(PartnerJSObject.this));
        if (obj == null)
        {
            try
            {
                Log.e("nf_partner", "Service not found!");
                PartnerJSObject.access$300(PartnerJSObject.this, "nrdpPartner.Sso._handleExternalUserToken", PartnerJSObject.access$200(null, val$idx, val$service, "101", "Service not found!"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("nf_partner", "Failed to work with JSON", ((Throwable) (obj)));
            }
            break MISSING_BLOCK_LABEL_128;
        }
        if (((Partner) (obj)).getSSO() == null)
        {
            Log.e("nf_partner", "Service does not support SSO!");
            PartnerJSObject.access$300(PartnerJSObject.this, "nrdpPartner.Sso._handleExternalUserToken", PartnerJSObject.access$200(null, val$idx, val$service, "102", "Service does not support SSO!"));
            return;
        }
        break MISSING_BLOCK_LABEL_129;
        return;
        ((Partner) (obj)).getSSO().ernalUserToken(val$service, val$idx, new ResponseListener() {

            final PartnerJSObject._cls1 this$1;

            public void onResponseReceived(Response response)
            {
                try
                {
                    PartnerJSObject.access$300(this$0, "nrdpPartner.Sso._handleExternalUserToken", response.toJson());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Log.e("nf_partner", "Failed to get JSON from response", response);
                }
            }

            
            {
                this$1 = PartnerJSObject._cls1.this;
                super();
            }
        });
        return;
    }

    _cls1.this._cls1()
    {
        this$0 = final_partnerjsobject;
        val$service = s;
        val$idx = I.this;
        super();
    }
}
