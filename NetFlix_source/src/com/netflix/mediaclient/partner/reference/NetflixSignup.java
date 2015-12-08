// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner.reference;

import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.BaseResponse;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.PartnerCommunicationHandler;
import com.netflix.mediaclient.partner.PartnerRequest;
import com.netflix.mediaclient.partner.PartnerRequestType;
import com.netflix.mediaclient.partner.ResponseListener;

// Referenced classes of package com.netflix.mediaclient.partner.reference:
//            ResponseFactory

public class NetflixSignup
    implements com.netflix.mediaclient.partner.Partner.Signup
{

    private static final String TAG = "nf_partner";
    private final Partner owner;
    private final String service;

    NetflixSignup(Partner partner, String s)
    {
        owner = partner;
        service = s;
    }

    public void getExternalUserData(String s, String s1, int i, ResponseListener responselistener)
    {
        Log.d("nf_partner", "getExternalUserData:: start");
        PartnerRequestType partnerrequesttype = PartnerRequestType.getExternalUserData;
        PartnerRequest partnerrequest = new PartnerRequest(partnerrequesttype, s, s1, i, responselistener);
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
            Log.d("nf_partner", "Partner communiction handler found, send getExternalUserData request");
            s = new Intent(partnerrequesttype.getIntentName());
            s.setComponent(owner.getComponentName());
            s.putExtra("user_id", BaseResponse.noNull(s1));
            partnercommunicationhandler.launchWithIntent(partnerrequest, s);
            Log.d("nf_partner", "Partner communication handler found, send getExternalUserData request done.");
            return;
        }
    }

    public String getService()
    {
        return service;
    }

    public void requestExternalUserConfirmation(String s, String s1, int i, ResponseListener responselistener)
    {
        Log.d("nf_partner", "requestExternalUserConfirmation:: start");
        PartnerRequestType partnerrequesttype = PartnerRequestType.requestExternalUserConfirmation;
        PartnerRequest partnerrequest = new PartnerRequest(partnerrequesttype, s, s1, i, responselistener);
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
            Log.d("nf_partner", "Partner communiction handler found, send requestExternalUserConfirmation request");
            s = new Intent(partnerrequesttype.getIntentName());
            s.setComponent(owner.getComponentName());
            s.putExtra("user_id", BaseResponse.noNull(s1));
            partnercommunicationhandler.launchWithIntent(partnerrequest, s);
            Log.d("nf_partner", "Partner communication handler found, send requestExternalUserConfirmation request done.");
            return;
        }
    }
}
