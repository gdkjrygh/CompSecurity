// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.jsapi;

import android.content.Context;
import android.webkit.WebView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.PartnerCommunicationHandler;
import com.netflix.mediaclient.partner.PartnerFactory;
import com.netflix.mediaclient.partner.Response;
import com.netflix.mediaclient.partner.ResponseListener;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.jsapi:
//            JSObject

public class PartnerJSObject extends JSObject
{

    public static final String INTERFACE_NAME = "n_partner_api";
    private static final String JSAPI_handleExternalUserAuth = "nrdpPartner.Sso._handleExternalUserAuth";
    private static final String JSAPI_handleExternalUserConfirmation = "nrdpPartner.Signup._handleExternalUserConfirmation";
    private static final String JSAPI_handleExternalUserData = "nrdpPartner.Signup._handleExternalUserData";
    private static final String JSAPI_handleExternalUserToken = "nrdpPartner.Sso._handleExternalUserToken";
    private static final String TAG = "nf_partner";
    private PartnerCommunicationHandler comHandler;
    private PartnerFactory partnerFactory;

    public PartnerJSObject(Context context, WebView webview, PartnerCommunicationHandler partnercommunicationhandler)
    {
        super(context, webview);
        comHandler = partnercommunicationhandler;
        partnerFactory = new PartnerFactory();
    }

    private static JSONObject getErrorForPartner(String s, int i, String s1, String s2, String s3)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("idx", i);
        jsonobject.put("service", s1);
        jsonobject.put("status", 1);
        if (s != null)
        {
            jsonobject.put("userid", s);
        }
        jsonobject.put("errcode", s2);
        jsonobject.put("msg", s3);
        return jsonobject;
    }

    private void returnResultToJS(String s, JSONObject jsonobject)
    {
        s = toJavaScript(s, jsonobject);
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("Injecting event ").append(s).toString());
        }
        injectJavaScript(s);
    }

    private String toJavaScript(String s, JSONObject jsonobject)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("javascript:(function() { ");
        stringbuilder.append(" console.log('Sending event...');");
        stringbuilder.append(" ").append(s).append("(");
        stringbuilder.append(jsonobject.toString());
        stringbuilder.append(");");
        stringbuilder.append(" console.log('Event sent.');");
        stringbuilder.append("})()");
        return stringbuilder.toString();
    }

    public String getExternalSignUpServices()
    {
        return StringUtils.joinArray(partnerFactory.getExternalSignUpServices(context));
    }

    public String getExternalSsoServices()
    {
        return StringUtils.joinArray(partnerFactory.getExternalSsoServices(context));
    }

    public void getExternalUserData(final String service, final String userId, final int idx)
    {
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("nrdpPartner.Signup.getExternalUserData: service ").append(service).append(", idx ").append(idx).append(", userid ").append(userId).toString());
        }
        (new BackgroundTask()).execute(new Runnable() {

            final PartnerJSObject this$0;
            final int val$idx;
            final String val$service;
            final String val$userId;

            public void run()
            {
                Object obj;
                Log.d("nf_partner", "Find partner");
                obj = partnerFactory.getPartner(context, service, comHandler);
                if (obj == null)
                {
                    try
                    {
                        Log.e("nf_partner", "Service not found!");
                        returnResultToJS("nrdpPartner.Signup._handleExternalUserData", PartnerJSObject.getErrorForPartner(null, idx, service, "101", "Service not found!"));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.e("nf_partner", "Failed to work with JSON", ((Throwable) (obj)));
                    }
                    break MISSING_BLOCK_LABEL_131;
                }
                if (((Partner) (obj)).getSignup() == null)
                {
                    Log.e("nf_partner", "Service does not support SSO!");
                    returnResultToJS("nrdpPartner.Signup._handleExternalUserData", PartnerJSObject.getErrorForPartner(userId, idx, service, "102", "Service does not support Signup!"));
                    return;
                }
                break MISSING_BLOCK_LABEL_132;
                return;
                ((Partner) (obj)).getSignup().getExternalUserData(service, userId, idx, new ResponseListener() {

                    final _cls3 this$1;

                    public void onResponseReceived(Response response)
                    {
                        try
                        {
                            returnResultToJS("nrdpPartner.Signup._handleExternalUserData", response.toJson());
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Response response)
                        {
                            Log.e("nf_partner", "Failed to get JSON from response", response);
                        }
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                return;
            }

            
            {
                this$0 = PartnerJSObject.this;
                service = s;
                idx = i;
                userId = s1;
                super();
            }
        });
    }

    public void getExternalUserToken(final String service, final int idx)
    {
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("nrdpPartner.Sso.getExternalUserToken:: service ").append(service).append(", idx ").append(idx).toString());
        }
        (new BackgroundTask()).execute(new Runnable() {

            final PartnerJSObject this$0;
            final int val$idx;
            final String val$service;

            public void run()
            {
                Object obj;
                Log.d("nf_partner", "Find partner");
                obj = partnerFactory.getPartner(context, service, comHandler);
                if (obj == null)
                {
                    try
                    {
                        Log.e("nf_partner", "Service not found!");
                        returnResultToJS("nrdpPartner.Sso._handleExternalUserToken", PartnerJSObject.getErrorForPartner(null, idx, service, "101", "Service not found!"));
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
                    returnResultToJS("nrdpPartner.Sso._handleExternalUserToken", PartnerJSObject.getErrorForPartner(null, idx, service, "102", "Service does not support SSO!"));
                    return;
                }
                break MISSING_BLOCK_LABEL_129;
                return;
                ((Partner) (obj)).getSSO().getExternalUserToken(service, idx, new ResponseListener() {

                    final _cls1 this$1;

                    public void onResponseReceived(Response response)
                    {
                        try
                        {
                            returnResultToJS("nrdpPartner.Sso._handleExternalUserToken", response.toJson());
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Response response)
                        {
                            Log.e("nf_partner", "Failed to get JSON from response", response);
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                return;
            }

            
            {
                this$0 = PartnerJSObject.this;
                service = s;
                idx = i;
                super();
            }
        });
    }

    public String getInterfaceName()
    {
        return "n_partner_api";
    }

    public void release()
    {
        super.release();
        partnerFactory.releasePartners();
        partnerFactory = null;
        comHandler = null;
    }

    public void requestExternalUserAuth(final String service, final int idx)
    {
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("nrdpPartner.Sso.requestExternalUserAuth:: service ").append(service).append(", idx ").append(idx).toString());
        }
        (new BackgroundTask()).execute(new Runnable() {

            final PartnerJSObject this$0;
            final int val$idx;
            final String val$service;

            public void run()
            {
                Object obj;
                Log.d("nf_partner", "Find partner");
                obj = partnerFactory.getPartner(context, service, comHandler);
                if (obj == null)
                {
                    try
                    {
                        Log.e("nf_partner", "Service not found!");
                        returnResultToJS("nrdpPartner.Sso._handleExternalUserAuth", PartnerJSObject.getErrorForPartner(null, idx, service, "101", "Service not found!"));
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
                    returnResultToJS("nrdpPartner.Sso._handleExternalUserAuth", PartnerJSObject.getErrorForPartner(null, idx, service, "102", "Service does not support SSO!"));
                    return;
                }
                break MISSING_BLOCK_LABEL_129;
                return;
                ((Partner) (obj)).getSSO().requestExternalUserAuth(service, idx, new ResponseListener() {

                    final _cls2 this$1;

                    public void onResponseReceived(Response response)
                    {
                        try
                        {
                            returnResultToJS("nrdpPartner.Sso._handleExternalUserAuth", response.toJson());
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Response response)
                        {
                            Log.e("nf_partner", "Failed to get JSON from response", response);
                        }
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
                return;
            }

            
            {
                this$0 = PartnerJSObject.this;
                service = s;
                idx = i;
                super();
            }
        });
    }

    public void requestExternalUserConfirmation(final String service, final String userId, final int idx)
    {
        if (Log.isLoggable("nf_partner", 3))
        {
            Log.d("nf_partner", (new StringBuilder()).append("nrdpPartner.Signup.requestExternalUserConfirmation: service ").append(service).append(", idx ").append(idx).append(", userid ").append(userId).toString());
        }
        (new BackgroundTask()).execute(new Runnable() {

            final PartnerJSObject this$0;
            final int val$idx;
            final String val$service;
            final String val$userId;

            public void run()
            {
                Object obj;
                Log.d("nf_partner", "Find partner");
                obj = partnerFactory.getPartner(context, service, comHandler);
                if (obj == null)
                {
                    try
                    {
                        Log.e("nf_partner", "Service not found!");
                        returnResultToJS("nrdpPartner.Signup._handleExternalUserConfirmation", PartnerJSObject.getErrorForPartner(null, idx, service, "101", "Service not found!"));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.e("nf_partner", "Failed to work with JSON", ((Throwable) (obj)));
                    }
                    break MISSING_BLOCK_LABEL_131;
                }
                if (((Partner) (obj)).getSignup() == null)
                {
                    Log.e("nf_partner", "Service does not support Signup!");
                    returnResultToJS("nrdpPartner.Signup._handleExternalUserConfirmation", PartnerJSObject.getErrorForPartner(userId, idx, service, "102", "Service does not support Signup!"));
                    return;
                }
                break MISSING_BLOCK_LABEL_132;
                return;
                ((Partner) (obj)).getSignup().requestExternalUserConfirmation(service, userId, idx, new ResponseListener() {

                    final _cls4 this$1;

                    public void onResponseReceived(Response response)
                    {
                        try
                        {
                            returnResultToJS("nrdpPartner.Signup._handleExternalUserConfirmation", response.toJson());
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Response response)
                        {
                            Log.e("nf_partner", "Failed to get JSON from response", response);
                        }
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                return;
            }

            
            {
                this$0 = PartnerJSObject.this;
                service = s;
                idx = i;
                userId = s1;
                super();
            }
        });
    }




}
