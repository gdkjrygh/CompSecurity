// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Utils.Log;
import com.capitalone.mobile.banking.security.ExpressSignInConfirmationActivity;
import com.capitalone.mobile.banking.security.ExpressSignInIntroActivity;
import com.capitalone.mobile.banking.security.ExpressSignInNeedHelpActivity;
import com.capitalone.mobile.banking.security.LockPatternActivity;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.LegacyContext;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            BusyIndicatorCallback, COFBusy

public class ESIPlugin extends Plugin
    implements BusyIndicatorCallback
{

    private static String TAG = "ESIPlugin";
    private static COFBusy sureSwipeBusy;
    EnterpriseMobileBanking activity;
    private String callbackId;
    protected JSONArray jsonArr;
    private String maskedUserName;
    private String storedPatternValue;

    public ESIPlugin()
    {
        jsonArr = new JSONArray();
    }

    public void callbackCall()
    {
        Log.d(TAG, "in callbackCall for AlertDialog");
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        org.apache.cordova.api.PluginResult.Status status;
        if (AppHelper.isCanadianApp())
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        }
        activity = (EnterpriseMobileBanking)ctx.getActivity();
        storedPatternValue = activity.getPatternValue();
        maskedUserName = activity.getMaskedUserName();
        if (jsonArr.length() == 0)
        {
            jsonArr.put("Authenticating");
            jsonArr.put(true);
            jsonArr.put(30);
        }
        Log.i(TAG, (new StringBuilder()).append("jsonArr = ").append(jsonArr).toString());
        if (sureSwipeBusy == null)
        {
            sureSwipeBusy = new COFBusy(activity, activity.getAppView(), jsonArr, this, false);
        }
        status = org.apache.cordova.api.PluginResult.Status.NO_RESULT;
        callbackId = s1;
        s1 = "";
        s7 = "";
        s8 = "";
        s6 = "";
        s4 = "";
        s5 = "";
        if (!TextUtils.equals(s, "launchEnrollmentFlow")) goto _L2; else goto _L1
_L1:
        s = "true";
        String s2 = "";
        try
        {
            s1 = jsonarray.getString(0);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e(TAG, "Cannot parse args for launchEnrollmentFlow");
            jsonarray = s2;
            s1 = s;
            continue; /* Loop/switch isn't completed */
        }
        s = s1;
        jsonarray = jsonarray.getString(1);
        s = jsonarray;
        jsonarray = s;
_L12:
        Log.i(TAG, "launchEnrollmentFlow is being called");
        launchEnrollmentFlow(s1, jsonarray);
_L10:
        s = new PluginResult(status);
        s.setKeepCallback(true);
        return s;
_L2:
        if (!TextUtils.equals(s, "launchSignInFlow")) goto _L4; else goto _L3
_L3:
        Log.i(TAG, "about to call launchSignInFlow");
        activity.setPatternValue("");
        s1 = s6;
        s = s4;
        String s3 = jsonarray.getString(0);
        s1 = s3;
        s = s4;
        s4 = jsonarray.getString(1);
        s1 = s3;
        s = s4;
        jsonarray = jsonarray.getString(2);
        s = s4;
        s1 = s3;
_L5:
        activity.runOnUiThread(new Runnable() {

            final ESIPlugin this$0;

            public void run()
            {
                Log.i(ESIPlugin.TAG, "launchSignInFlow - in the runOnUiThread");
                activity.findViewById(0x7f080024).setVisibility(4);
                activity.findViewById(0x7f0800a5).setVisibility(0);
            }

            
            {
                this$0 = ESIPlugin.this;
                super();
            }
        });
        launchSignInFlow(s1, s, jsonarray);
        continue; /* Loop/switch isn't completed */
        jsonarray;
        Log.e(TAG, "Cannot parse args for launchSignInFlow");
        jsonarray = s5;
        if (true) goto _L5; else goto _L4
_L4:
        if (!TextUtils.equals(s, "showLoginErrorMessage")) goto _L7; else goto _L6
_L6:
        s = s1;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        s5 = jsonarray.getString(0).toString();
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        s7 = jsonarray.getString(1).toString();
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        Log.i(TAG, (new StringBuilder()).append("errorMessage = ").append(s7).toString());
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        s8 = storedPatternValue;
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        s6 = maskedUserName;
        String s9;
        String s10;
        String s11;
        if (s7 == null)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        s11 = s5;
        jsonarray = s7;
        s9 = s6;
        s10 = s8;
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        if (!TextUtils.equals(s7, "null"))
        {
            break MISSING_BLOCK_LABEL_595;
        }
        s = s5;
        s1 = s7;
        s3 = s6;
        s4 = s8;
        Log.d(TAG, "Generic error message being sent because none received back from STL.");
        jsonarray = "Generic error.  Unknown cause.";
        s10 = s8;
        s9 = s6;
        s11 = s5;
_L8:
        sureSwipeBusy.hide();
        showLoginErrorMessage(s11, jsonarray, s10, s9);
        continue; /* Loop/switch isn't completed */
        jsonarray;
        Log.e(TAG, "Cannot parse args for showLoginErrorMessage");
        s11 = s;
        jsonarray = s1;
        s9 = s3;
        s10 = s4;
        if (true) goto _L8; else goto _L7
_L7:
        if (TextUtils.equals(s, "showSureSwipeBypassSlideUp"))
        {
            Log.i(TAG, "should call showSureSwipeBypassSlideUp");
            showSureSwipeBypassSlideUp();
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.equals(s, "showEnrollmentStatusMessage"))
        {
            Log.i(TAG, "should call showEnrollmentStatusMessage");
            sureSwipeBusy.hide();
            activity.runOnUiThread(new Runnable() {

                final ESIPlugin this$0;

                public void run()
                {
                    Log.i(ESIPlugin.TAG, "showEnrollmentStatusMessage - in the runOnUiThread");
                    activity.findViewById(0x7f080024).setVisibility(0);
                    activity.findViewById(0x7f0800a4).setVisibility(8);
                }

            
            {
                this$0 = ESIPlugin.this;
                super();
            }
            });
            showEnrollmentStatusMessage("", "");
            continue; /* Loop/switch isn't completed */
        }
        if (!TextUtils.equals(s, "dismissLoginPage"))
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(TAG, "about to call dismissLoginPage");
        Log.i(TAG, "Dismissing sureSwipeBusy Dialog");
        sureSwipeBusy.hide();
        activity.runOnUiThread(new Runnable() {

            final ESIPlugin this$0;

            public void run()
            {
                Log.i(ESIPlugin.TAG, "in the dismissLoginPage runOnUiThread");
                activity.findViewById(0x7f080024).setVisibility(0);
                activity.findViewById(0x7f0800a4).setVisibility(8);
            }

            
            {
                this$0 = ESIPlugin.this;
                super();
            }
        });
        if (true) goto _L10; else goto _L9
_L9:
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.INVALID_ACTION);
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void launchEnrollmentFlow(String s, String s1)
    {
        if (s.contentEquals("true"))
        {
            Intent intent = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/ExpressSignInIntroActivity);
            intent.putExtra("AppHeaderNavOption", "CLOSE");
            if (s1.equalsIgnoreCase("ASK_LATER"))
            {
                intent.putExtra("expressSignInPreference", "ASK_LATER");
                s1 = intent;
            } else
            {
                intent.putExtra("expressSignInPreference", "NOT_ENROLLED");
                s1 = intent;
            }
        } else
        {
            s1 = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/LockPatternActivity);
            s1.putExtra("AppHeaderNavOption", "CLOSE");
        }
        s1.putExtra("lockpattern_mode", group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode.CreatePattern.toString());
        s1.putExtra("isSlideUpOffer", s);
        ctx.startActivityForResult(this, s1, 1234);
        ((Activity)cordova.getContext()).overridePendingTransition(0x7f040007, 0x7f040000);
    }

    public void launchSignInFlow(String s, String s1, String s2)
    {
        Intent intent = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/LockPatternActivity);
        intent.addFlags(0x10000);
        intent.putExtra("AppHeaderNavOption", "MENU");
        intent.putExtra("signInMessageType", s1);
        intent.putExtra("signInMessage", s2);
        intent.putExtra("lockpattern_mode", group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode.ComparePattern.toString());
        intent.putExtra("userName", s);
        ctx.startActivityForResult(this, intent, 1234);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        String s;
        super.onActivityResult(i, j, intent);
        Log.d(TAG, (new StringBuilder()).append("onActivityResult(requestCode=").append(i).append(", resultCode=").append(j).append(")").toString());
        activity.findViewById(0x7f0800a5).setVisibility(8);
        if (sureSwipeBusy != null)
        {
            Log.i(TAG, "about to sureSwipeBusy.hide()");
            sureSwipeBusy.hide();
        }
        JSONException jsonexception;
        if (j == 5555)
        {
            Log.i(TAG, "resultCode  = 5555 and setting the transition page and dialog");
            activity.findViewById(0x7f080024).setVisibility(4);
            activity.findViewById(0x7f0800a4).setVisibility(0);
            if (TextUtils.equals(intent.getStringExtra("LockPatternAction"), "create"))
            {
                try
                {
                    jsonArr.put(0, "Enrolling");
                    sureSwipeBusy.show(jsonArr, this);
                }
                // Misplaced declaration of an exception variable
                catch (JSONException jsonexception)
                {
                    Log.e(TAG, "failure in adding 'Enrolling' to jsonArr");
                }
            } else
            {
                try
                {
                    jsonArr.put(0, "Authenticating");
                    sureSwipeBusy.show(jsonArr, this);
                }
                // Misplaced declaration of an exception variable
                catch (JSONException jsonexception)
                {
                    Log.e(TAG, "failure in adding 'Authenticating' to jsonArr");
                }
            }
        }
        if (j == 2000 || j == 0)
        {
            Log.i(TAG, (new StringBuilder()).append("onActivityForResult where resultCode = ").append(j).toString());
            sureSwipeBusy.hide();
            activity.findViewById(0x7f080024).setVisibility(0);
            activity.findViewById(0x7f0800a4).setVisibility(8);
            activity.findViewById(0x7f0800a5).setVisibility(8);
        }
        if (j == 0)
        {
            jsonexception = null;
        } else
        {
            jsonexception = intent.getExtras();
        }
        if (jsonexception == null) goto _L2; else goto _L1
_L1:
        Log.i(TAG, "extras != null");
        if (jsonexception.getBoolean("SuppressSplash"))
        {
            Log.d(TAG, "Setting SuppressSplash to true");
            activity.setSplashSuppress(true);
        }
        s = intent.getStringExtra("LockPatternAction");
        if (s == null) goto _L4; else goto _L3
_L3:
        if (!TextUtils.equals(s, "compare")) goto _L6; else goto _L5
_L5:
        sendJavascript((new StringBuilder()).append("javascript:SureSwipePlugin.authenticatePattern('").append(intent.getStringExtra("mypattern")).append("');").toString());
_L4:
        if (TextUtils.equals(jsonexception.getString("sureSwipeSettings"), "sureSwipeSettingsPage"))
        {
            Log.i(TAG, "sending to www/settings/expressSignIn");
            sendJavascript("window.location.hash='www/settings/expressSignIn';");
        }
_L2:
        intent = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        intent.setKeepCallback(false);
        success(intent, callbackId);
        return;
_L6:
        if (TextUtils.equals(s, "create"))
        {
            sendJavascript((new StringBuilder()).append("javascript:SureSwipePlugin.enrollPattern('").append(intent.getStringExtra("mypattern")).append("');").toString());
        } else
        if (TextUtils.equals(s, "ReturnToHome"))
        {
            Log.d(TAG, "EMB about to call returnToHome(appView)");
            activity.returnToHome(activity.findViewById(0x7f0800a0));
        } else
        if (TextUtils.equals(s, "DECLINE"))
        {
            Log.d(TAG, (new StringBuilder()).append("javascript:SureSwipePlugin.enrollPattern and DeclineSureSwipe is: ").append(intent.getStringExtra("DeclineSureSwipe")).toString());
            sendJavascript((new StringBuilder()).append("javascript:SureSwipePlugin.updatePreference('").append(intent.getStringExtra("DeclineSureSwipe")).append("');").toString());
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void showEnrollmentStatusMessage(String s, String s1)
    {
        Log.d(TAG, (new StringBuilder()).append("showEnrollmentStatusMessage errorMessage = ").append(s1).toString());
        Log.d(TAG, (new StringBuilder()).append("showEnrollmentStatusMessage errorCode = ").append(s).toString());
        if (s == null || s.equals("0") || s.equals(""))
        {
            s = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/ExpressSignInConfirmationActivity);
            s.addFlags(0x10000);
            Log.d(TAG, "showEnrollmentStatusMessage - Enrollment Success");
            ctx.startActivity(s);
            return;
        } else
        {
            Intent intent = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/LockPatternActivity);
            intent.addFlags(0x10000);
            intent.putExtra("AppHeaderNavOption", "MENU");
            intent.putExtra("lockpattern_mode", group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode.CreatePattern.toString());
            intent.putExtra("errorcode", s);
            intent.putExtra("errorMessage", s1);
            ctx.startActivityForResult(this, intent, 1234);
            return;
        }
    }

    public void showLoginErrorMessage(String s, String s1, String s2, String s3)
    {
        Intent intent = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/LockPatternActivity);
        intent.addFlags(0x10000);
        intent.putExtra("AppHeaderNavOption", "MENU");
        intent.putExtra("lockpattern_mode", group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode.ComparePattern.toString());
        Log.d(TAG, (new StringBuilder()).append("showLoginErrorMessage errorMessage = ").append(s1).toString());
        Log.d(TAG, (new StringBuilder()).append("showLoginErrorMessage errorCode = ").append(s).toString());
        intent.putExtra("errorcode", s);
        intent.putExtra("errorMessage", s1);
        intent.putExtra("pattern", s2);
        intent.putExtra("userName", s3);
        ctx.startActivityForResult(this, intent, 1234);
    }

    public void showSureSwipeBypassSlideUp()
    {
        Log.d(TAG, "in showSureSwipeBypassSlideUp");
        Intent intent = new Intent(cordova.getContext(), com/capitalone/mobile/banking/security/ExpressSignInNeedHelpActivity);
        intent.putExtra("AppHeaderNavOption", "CLOSE");
        ctx.startActivityForResult(this, intent, 1234);
        Log.d(TAG, "showSureSwipeBypassSlideUp should be sliding up now");
        ((Activity)cordova.getContext()).overridePendingTransition(0x7f040007, 0x7f040000);
    }


}
