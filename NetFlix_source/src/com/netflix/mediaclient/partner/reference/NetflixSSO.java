// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner.reference;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.PartnerCommunicationHandler;
import com.netflix.mediaclient.partner.PartnerRequest;
import com.netflix.mediaclient.partner.PartnerRequestType;
import com.netflix.mediaclient.partner.Response;
import com.netflix.mediaclient.partner.ResponseListener;

// Referenced classes of package com.netflix.mediaclient.partner.reference:
//            ResponseFactory

public class NetflixSSO
    implements com.netflix.mediaclient.partner.Partner.SSO
{

    private static final String TAG = "nf_partner";
    private final Partner owner;
    private final String service;

    NetflixSSO(Partner partner, String s)
    {
        owner = partner;
        service = s;
        Log.d("nf_partner", "Initialize...");
        getExternalSsoService();
    }

    private void getExternalSsoService()
    {
        Log.d("nf_partner", "getExternalSsoService:: start");
        Object obj = new ResponseListener() {

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
                owner.setComponentName(response);
            }

            
            {
                this$0 = NetflixSSO.this;
                super();
            }
        };
        PartnerRequestType partnerrequesttype = PartnerRequestType.getExternalSsoService;
        obj = new PartnerRequest(partnerrequesttype, service, null, 1, ((ResponseListener) (obj)));
        PartnerCommunicationHandler partnercommunicationhandler = owner.getPartnerCommunicationHandler();
        if (partnercommunicationhandler == null)
        {
            Log.e("nf_partner", "Partner communication handler is missing. This should NOT happen!");
            return;
        } else
        {
            Log.d("nf_partner", "Partner communiction handler found, send getExternalSsoService request");
            partnercommunicationhandler.launchWithIntent(((PartnerRequest) (obj)), new Intent(partnerrequesttype.getIntentName()));
            Log.d("nf_partner", "Partner communication handler found, send getExternalSsoService request done.");
            return;
        }
    }

    public void getExternalUserToken(String s, int i, ResponseListener responselistener)
    {
        Log.d("nf_partner", "getExternalUserToken:: start");
        PartnerRequestType partnerrequesttype = PartnerRequestType.getExternalUserToken;
        PartnerRequest partnerrequest = new PartnerRequest(partnerrequesttype, s, null, i, responselistener);
        PartnerCommunicationHandler partnercommunicationhandler = owner.getPartnerCommunicationHandler();
        if (partnercommunicationhandler == null)
        {
            Log.e("nf_partner", "Partner communication handler is missing. This should NOT happen!");
            if (responselistener != null)
            {
                responselistener.onResponseReceived(ResponseFactory.createErrorResponseForPartnerCommunicationHandleIsNull(partnerrequest));
            }
        } else
        if (!service.equals(s))
        {
            Log.e("nf_partner", (new StringBuilder()).append("Partner communiction handler found, but requested service ").append(s).append(" is not implemented by this class ").append(service).toString());
            if (responselistener != null)
            {
                responselistener.onResponseReceived(ResponseFactory.createErrorResponseForServiceMismatch(partnerrequest, service));
                return;
            }
        } else
        {
            Log.d("nf_partner", "Partner communiction handler found, send getExternalUserToken request");
            s = new Intent(partnerrequesttype.getIntentName());
            s.setComponent(owner.getComponentName());
            partnercommunicationhandler.launchWithIntent(partnerrequest, s);
            Log.d("nf_partner", "Partner communication handler found, send getExternalUserToken request done.");
            return;
        }
    }

    public String getService()
    {
        return service;
    }

    public void requestExternalUserAuth(String s, int i, ResponseListener responselistener)
    {
        Log.d("nf_partner", "requestExternalUserAuth:: start");
        PartnerRequestType partnerrequesttype = PartnerRequestType.requestExternalUserAuth;
        PartnerRequest partnerrequest = new PartnerRequest(partnerrequesttype, s, null, i, responselistener);
        PartnerCommunicationHandler partnercommunicationhandler = owner.getPartnerCommunicationHandler();
        if (partnercommunicationhandler == null)
        {
            Log.e("nf_partner", "Partner communication handler is missing. This should NOT happen!");
            if (responselistener != null)
            {
                responselistener.onResponseReceived(ResponseFactory.createErrorResponseForPartnerCommunicationHandleIsNull(partnerrequest));
            }
        } else
        if (!service.equals(s))
        {
            Log.e("nf_partner", (new StringBuilder()).append("Partner communiction handler found, but requested service ").append(s).append(" is not implemented by this class ").append(service).toString());
            if (responselistener != null)
            {
                responselistener.onResponseReceived(ResponseFactory.createErrorResponseForServiceMismatch(partnerrequest, service));
                return;
            }
        } else
        {
            Log.d("nf_partner", "Partner communication handler found, send requestExternalUserAuth request");
            s = new Intent(partnerrequesttype.getIntentName());
            s.setComponent(owner.getComponentName());
            partnercommunicationhandler.launchWithIntent(partnerrequest, s);
            Log.d("nf_partner", "Partner communiction handler found, send requestExternalUserAuth request done.");
            return;
        }
    }

}
