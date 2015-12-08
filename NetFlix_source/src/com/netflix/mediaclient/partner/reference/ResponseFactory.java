// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner.reference;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.partner.BaseResponse;
import com.netflix.mediaclient.partner.ExternalUserConfirmationSuccess;
import com.netflix.mediaclient.partner.ExternalUserDataSuccess;
import com.netflix.mediaclient.partner.PartnerRequest;
import com.netflix.mediaclient.partner.PartnerRequestType;
import com.netflix.mediaclient.partner.Response;
import com.netflix.mediaclient.partner.SignupFailure;
import com.netflix.mediaclient.partner.SsoFailure;
import com.netflix.mediaclient.partner.SsoNoUser;
import com.netflix.mediaclient.partner.SsoSuccess;
import com.netflix.mediaclient.partner.SsoUserCancel;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public final class ResponseFactory
{

    public static final String ERROR_CODE_COMPONENT_NULL = "100";
    public static final String ERROR_CODE_RECEPIENT_UKNOWN = "102";
    public static final String ERROR_CODE_SERVICE_MISMATCH = "101";
    public static final String ERROR_CODE_UKNOWN_RESULT_CODE = "103";
    public static final String JSPI_billing_zip = "billingzip";
    public static final String JSPI_email = "email";
    public static final String JSPI_first_name = "firstname";
    public static final String JSPI_last_name = "lastname";
    public static final String JSPI_payments = "payments";
    public static final String RESPONSE_billing_zip = "billing_zip";
    public static final String RESPONSE_client = "client";
    public static final String RESPONSE_confirmed = "confirmed";
    public static final String RESPONSE_email = "email";
    public static final String RESPONSE_error_code = "error_code";
    public static final String RESPONSE_error_msg = "error_msg";
    public static final String RESPONSE_external_user_token = "external_user_token";
    public static final String RESPONSE_first_name = "first_name";
    public static final String RESPONSE_internal_token = "internal_token";
    public static final String RESPONSE_last_name = "last_name";
    public static final String RESPONSE_payments = "payments";
    public static final String RESPONSE_token = "token";
    public static final String RESPONSE_user_id = "user_id";
    public static final int RESULT_ERROR = 102;
    public static final int RESULT_NONE = 101;
    private static final String TAG = "nf_partner";

    private ResponseFactory()
    {
    }

    private static Response createErrorResponse(PartnerRequest partnerrequest, String s, String s1, ComponentName componentname)
    {
        if (PartnerRequestType.iSso(partnerrequest.getRequestType()))
        {
            return new SsoFailure(partnerrequest.getService(), String.valueOf(partnerrequest.getIdx()), s, s1, componentname);
        }
        if (PartnerRequestType.iSignup(partnerrequest.getRequestType()))
        {
            return new SignupFailure(partnerrequest.getService(), String.valueOf(partnerrequest.getIdx()), partnerrequest.getUserId(), s, s1, componentname);
        } else
        {
            Log.e("nf_partner", (new StringBuilder()).append("Uknown request type ").append(partnerrequest.getRequestType()).toString());
            return new SsoFailure(partnerrequest.getService(), String.valueOf(partnerrequest.getIdx()), s, s1, componentname);
        }
    }

    public static Response createErrorResponseForPartnerCommunicationHandleIsNull(PartnerRequest partnerrequest)
    {
        return createErrorResponse(partnerrequest, "100", "", null);
    }

    public static Response createErrorResponseForRecepientUknown(PartnerRequest partnerrequest, String s)
    {
        return createErrorResponse(partnerrequest, "102", "", null);
    }

    public static Response createErrorResponseForServiceMismatch(PartnerRequest partnerrequest, String s)
    {
        return createErrorResponse(partnerrequest, "101", "", null);
    }

    private static Response createGetExternalSignUpServiceResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createGetExternalSignUpServiceResponse start");
        if (i == -1)
        {
            return new SsoSuccess(partnerrequest.getService(), partnerrequest.getId(), partnerrequest.getUserId(), null, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 101)
        {
            return new SsoNoUser(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s, s1, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    private static Response createGetExternalSsoServiceResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createGetExternalSsoServiceResponse start");
        if (i == -1)
        {
            return new SsoSuccess(partnerrequest.getService(), partnerrequest.getId(), partnerrequest.getUserId(), null, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 101)
        {
            return new SsoNoUser(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s, s1, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    private static Response createGetExternalUserDataResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createGetExternalUserDataResponse start");
        if (i == -1)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("user_id"));
            String s3 = BaseResponse.noNull(intent.getStringExtra("first_name"));
            String s4 = BaseResponse.noNull(intent.getStringExtra("last_name"));
            String s5 = BaseResponse.noNull(intent.getStringExtra("email"));
            String s6 = BaseResponse.noNull(intent.getStringExtra("billing_zip"));
            String s7 = BaseResponse.noNull(intent.getStringExtra("payments"));
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("firstname", s3);
                jsonobject.put("lastname", s4);
                jsonobject.put("email", s5);
                jsonobject.put("billingzip", s6);
                jsonobject.put("payments", s7);
            }
            catch (Exception exception)
            {
                Log.e("nf_partner", "JSON failed", exception);
            }
            return new ExternalUserDataSuccess(partnerrequest.getService(), partnerrequest.getId(), s, jsonobject, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 101)
        {
            return new SsoNoUser(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s2 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s1, s2, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    private static Response createGetExternalUserTokenResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createGetExternalUserTokenResponse start");
        if (i == -1)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("user_id"));
            JSONObject jsonobject = BaseResponse.toJSon(intent.getStringExtra("external_user_token"));
            return new SsoSuccess(partnerrequest.getService(), partnerrequest.getId(), s, jsonobject, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 101)
        {
            return new SsoNoUser(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s2 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s1, s2, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    private static Response createRequestExternalUserAuthResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createRequestExternalUserAuthResponse start");
        if (i == -1)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("user_id"));
            JSONObject jsonobject = BaseResponse.toJSon(intent.getStringExtra("external_user_token"));
            return new SsoSuccess(partnerrequest.getService(), partnerrequest.getId(), s, jsonobject, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s2 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s1, s2, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    private static Response createRequestExternalUserConfirmationResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        Log.d("nf_partner", "createRequestExternalUserConfirmationResponse start");
        if (i == -1)
        {
            String s = BaseResponse.noNull(intent.getStringExtra("user_id"));
            JSONObject jsonobject = BaseResponse.toJSon(intent.getStringExtra("token"));
            boolean flag = intent.getBooleanExtra("confirmed", false);
            return new ExternalUserConfirmationSuccess(partnerrequest.getService(), partnerrequest.getId(), s, flag, jsonobject, intent.getComponent());
        }
        if (i == 0)
        {
            return new SsoUserCancel(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 101)
        {
            return new SsoNoUser(partnerrequest.getService(), partnerrequest.getId(), intent.getComponent());
        }
        if (i == 102)
        {
            String s1 = BaseResponse.noNull(intent.getStringExtra("error_code"));
            String s2 = BaseResponse.noNull(intent.getStringExtra("error_msg"));
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), s1, s2, intent.getComponent());
        } else
        {
            Log.e("nf_partner", "Uknown result code, report error");
            return new SsoFailure(partnerrequest.getService(), partnerrequest.getId(), "103", "", intent.getComponent());
        }
    }

    public static Response createResponse(PartnerRequest partnerrequest, Intent intent, int i)
    {
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("createResponse:: request ").append(partnerrequest).append(", response ").append(intent).append(", resultCode ").append(i).toString());
            if (intent != null)
            {
                Bundle bundle = intent.getExtras();
                if (bundle != null)
                {
                    for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
                    {
                        String s = (String)iterator.next();
                        if ("confirmed".equals(s))
                        {
                            Log.d("nf_partner", (new StringBuilder()).append("extras for key ").append(s).append(" is ").append(bundle.getBoolean(s)).toString());
                        } else
                        {
                            Log.d("nf_partner", (new StringBuilder()).append("extras for key ").append(s).append(" is ").append(bundle.getString(s)).toString());
                        }
                    }

                }
            }
        }
        if (PartnerRequestType.getExternalSignUpService.equals(partnerrequest.getRequestType()))
        {
            return createGetExternalSignUpServiceResponse(partnerrequest, intent, i);
        }
        if (PartnerRequestType.getExternalSsoService.equals(partnerrequest.getRequestType()))
        {
            return createGetExternalSsoServiceResponse(partnerrequest, intent, i);
        }
        if (PartnerRequestType.getExternalUserData.equals(partnerrequest.getRequestType()))
        {
            return createGetExternalUserDataResponse(partnerrequest, intent, i);
        }
        if (PartnerRequestType.getExternalUserToken.equals(partnerrequest.getRequestType()))
        {
            return createGetExternalUserTokenResponse(partnerrequest, intent, i);
        }
        if (PartnerRequestType.requestExternalUserAuth.equals(partnerrequest.getRequestType()))
        {
            return createRequestExternalUserAuthResponse(partnerrequest, intent, i);
        }
        if (PartnerRequestType.requestExternalUserConfirmation.equals(partnerrequest.getRequestType()))
        {
            return createRequestExternalUserConfirmationResponse(partnerrequest, intent, i);
        } else
        {
            Log.e("nf_partner", (new StringBuilder()).append("Uknown request type ").append(partnerrequest.getRequestType()).toString());
            return null;
        }
    }
}
