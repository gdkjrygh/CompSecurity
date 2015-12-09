// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.RDC.CameraActivity;
import com.EnterpriseMobileBanking.RDC.MiSnapPreviewActivity;
import com.EnterpriseMobileBanking.Utils.Log;
import com.miteksystems.misnap.MiSnap;
import java.util.Iterator;
import java.util.List;
import org.apache.cordova.api.LegacyContext;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CameraPlugin extends Plugin
{

    private static final int COF_REQUEST_CODE = 1999;
    private static final String FORCE_MANUAL_CAPTURE_AFTER_PREVEW = "ForceManualCaptureAfterPreview";
    private static final int MEGAPIXEL_MIN = 2;
    private static final String MISNAP_AUTO_CAPTURE_MODE = "2";
    private static final int MISNAP_AUTO_CAPTURE_MODE_INT = 2;
    private static final String MISNAP_MANUAL_CAPTURE_MODE = "1";
    private static final int PREVIEW_REQUEST_CODE = 0x54bc4a;
    private static final int REQUEST_CODE = 999;
    private static final String TAG = "CameraPlugin";
    private static JSONArray lastArgs = null;
    private String callbackId;

    public CameraPlugin()
    {
    }

    private void checkForceManualCaptureOnImageRetake(JSONObject jsonobject, JSONObject jsonobject1)
        throws JSONException
    {
        if (jsonobject.optBoolean("ForceManualCaptureAfterPreview", false))
        {
            jsonobject1.put("CaptureMode", "1");
        }
    }

    private void customizeUI(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("AnimationRectangleColor", "BA1223");
        jsonobject.put("AnimationRectangleCornerRadius", "7");
        jsonobject.put("TutorialBackgroundColor", "000000");
        jsonobject.put("TutorialBackgroundColorFailoverToStillCamera", "000000");
        jsonobject.put("TutorialBackgroundColorFirstTimeUser", "000000");
        jsonobject.put("TutorialBackgroundColorStillCamera", "000000");
        jsonobject.put("TutorialBackgroundColorStillCameraFirstTimeUser", "000000");
        jsonobject.put("ButtonFirstTimeTutorialContinue", "Continue");
    }

    private void defaultParamsFromMiSnap(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("CameraMaxTimeouts", "0");
        jsonobject.put("RequiredCompressionLevel", "50");
        jsonobject.put("CaptureMode", "2");
        jsonobject.put("CameraInitialTimeoutInSeconds", "20");
        jsonobject.put("TutorialBrandNewUserDuration", "3000");
        jsonobject.put("CameraTimeoutInSeconds", "30");
    }

    private void encodeAndSendSuccess(Intent intent)
    {
        intent = Base64.encodeToString(intent.getByteArrayExtra("com.miteksystems.misnap.PICTURE"), 2);
        Log.d("CameraPlugin", intent);
        success(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, intent), callbackId);
    }

    private boolean useMiSnapCamera(String s, JSONArray jsonarray)
    {
        if (s == null)
        {
            return false;
        }
        if (!TextUtils.equals("misnap", s.toLowerCase())) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        String s1;
        int i;
        boolean flag;
        int j;
        try
        {
            jsonobject1 = jsonarray.optJSONObject(0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (jsonobject1 == null) goto _L4; else goto _L3
_L3:
        jsonarray = jsonobject1.optString("label");
        s = jsonarray;
        if (TextUtils.isEmpty(jsonarray))
        {
            s = jsonobject1.optString("orient");
        }
        jsonarray = null;
        s1 = jsonobject1.optString("options");
        if (!TextUtils.isEmpty(s1))
        {
            jsonarray = new JSONObject(s1);
        }
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        s = s.toLowerCase();
        if (!s.contains("front")) goto _L8; else goto _L7
_L7:
        jsonobject.put("Name", "CheckFront");
        jsonobject.put("TextCheckFrontPrompt", "");
        if (jsonarray != null) goto _L6; else goto _L9
_L9:
        jsonobject.put("CameraSharpness", "600");
_L6:
        if (jsonarray == null) goto _L11; else goto _L10
_L10:
        for (s = jsonarray.keys(); s.hasNext();)
        {
            s1 = (String)s.next();
            if (!s1.contains("exceptions"))
            {
                jsonobject.put(s1, jsonarray.optString(s1));
            }
        }

          goto _L12
_L8:
        if (!s.contains("back")) goto _L6; else goto _L13
_L13:
        jsonobject.put("Name", "CheckBack");
        jsonobject.put("TextCheckBackPrompt", "");
        if (jsonarray != null) goto _L6; else goto _L14
_L14:
        jsonobject.put("CameraSharpness", "100");
          goto _L6
_L12:
        s = jsonarray.optJSONArray("exceptions");
        flag = true;
        i = 0;
_L21:
        if (s == null) goto _L16; else goto _L15
_L15:
        j = s.length();
_L17:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        jsonarray = s.getString(i);
        j = ((flag) ? 1 : 0);
        if (!Build.MODEL.contains(jsonarray))
        {
            break MISSING_BLOCK_LABEL_305;
        }
        jsonobject.put("CaptureMode", "1");
        j = 0;
_L18:
        i++;
        flag = j;
        continue; /* Loop/switch isn't completed */
_L16:
        j = 0;
          goto _L17
        jsonarray;
        Log.v("CameraPlugin", (new StringBuilder()).append("Can't get JSONObeject from exception item: ").append(i).toString());
        j = ((flag) ? 1 : 0);
          goto _L18
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        jsonobject.put("CaptureMode", "2");
_L19:
        customizeUI(jsonobject);
        checkForceManualCaptureOnImageRetake(jsonobject1, jsonobject);
_L4:
        Log.d("CameraPlugin", "Starting MiSnap Activity.");
        s = new Intent(ctx.getApplicationContext(), com/miteksystems/misnap/MiSnap);
        s.putExtra("com.miteksystems.misnap.JobSettings", jsonobject.toString());
        ctx.startActivityForResult(this, s, 3);
        return true;
_L11:
        defaultParamsFromMiSnap(jsonobject);
        if (Build.MODEL.contains("Nexus 4") || Build.MODEL.contains("XT1032"))
        {
            jsonobject.put("CaptureMode", "1");
        }
          goto _L19
_L2:
        return false;
        if (true) goto _L21; else goto _L20
_L20:
    }

    public PluginResult checkCamera(String s)
    {
        PluginResult pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        Camera camera = Camera.open();
        if (camera != null)
        {
            List list = camera.getParameters().getSupportedPictureSizes();
            boolean flag = false;
            int i = 0;
            int k = list.size();
            do
            {
label0:
                {
                    int j = ((flag) ? 1 : 0);
                    if (i < k)
                    {
                        android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.get(i);
                        j = (size.height * size.width) / 0xfa000;
                        Log.d("CameraPlugin", (new StringBuilder()).append("Megapixel=").append(j).toString());
                        if (j < 2)
                        {
                            break label0;
                        }
                        j = 1;
                    }
                    camera.release();
                    if (j != 0)
                    {
                        success(pluginresult, s);
                        return pluginresult;
                    } else
                    {
                        PluginResult pluginresult1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "megapixel too low");
                        error(pluginresult1, s);
                        return pluginresult1;
                    }
                }
                i++;
            } while (true);
        } else
        {
            PluginResult pluginresult2 = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR);
            error(pluginresult2, s);
            return pluginresult2;
        }
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        Log.d("CameraPlugin", (new StringBuilder()).append("Action: ").append(s).toString());
        callbackId = s1;
        lastArgs = jsonarray;
        if (s.equals("checkCamera"))
        {
            return checkCamera(s1);
        }
        if (useMiSnapCamera(s, jsonarray)) goto _L2; else goto _L1
_L1:
        s = new Intent(ctx.getApplicationContext(), com/EnterpriseMobileBanking/RDC/CameraActivity);
        boolean flag;
        boolean flag1;
        try
        {
            s.putExtra("label", jsonarray.getJSONObject(0).getString("label"));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("CameraPlugin", (new StringBuilder()).append("Error getting label: ").append(s1.getMessage()).toString());
            s.putExtra("label", "");
        }
        flag = false;
        flag1 = jsonarray.getJSONObject(0).get("lob").equals("bank");
        if (flag1)
        {
            flag = true;
        }
_L4:
        char c;
        if (flag)
        {
            c = '\u07CF';
        } else
        {
            c = '\u03E7';
        }
        ctx.startActivityForResult(this, s, c);
_L2:
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        s.setKeepCallback(true);
        return s;
        jsonarray;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Log.d("CameraPlugin", (new StringBuilder()).append("onActivityResult(requestCode=").append(i).append(", resultCode=").append(j).append(")").toString());
        if (i != 0x54bc4a) goto _L2; else goto _L1
_L1:
        if (j != 0x631198) goto _L4; else goto _L3
_L3:
        encodeAndSendSuccess(intent);
_L6:
        return;
_L4:
        intent = lastArgs.optJSONObject(0);
        Object obj;
        JSONException jsonexception;
        boolean flag;
        if (intent != null)
        {
            try
            {
                intent.put("ForceManualCaptureAfterPreview", true);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        useMiSnapCamera("misnap", lastArgs);
        return;
_L2:
        if (i != 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        obj = intent.getStringExtra("com.miteksystems.misnap.ResultCode");
        if (!"SuccessVideo".equals(obj) && !"SuccessStillCamera".equals(obj)) goto _L6; else goto _L5
_L5:
        Log.d("CameraPlugin", "MiSnap acquired an image successfully.");
        obj = intent.getStringExtra("com.miteksystems.misnap.MIBI_DATA");
        Log.d("CameraPlugin", (new StringBuilder()).append("MIBI Data:  ").append(((String) (obj))).toString());
        flag = false;
        i = (new JSONObject(((String) (obj)))).optInt("CaptureMode");
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L7:
        Log.d("CameraPlugin", (new StringBuilder()).append("Autocapture:  ").append(flag).toString());
        if (!flag)
        {
            obj = new Intent(ctx.getApplicationContext(), com/EnterpriseMobileBanking/RDC/MiSnapPreviewActivity);
            ((Intent) (obj)).putExtras(intent);
            ctx.startActivityForResult(this, ((Intent) (obj)), 0x54bc4a);
            return;
        } else
        {
            encodeAndSendSuccess(intent);
            return;
        }
        jsonexception;
        Log.e("CameraPlugin", "Unable to parse JSON object from MIBI data.");
          goto _L7
        Log.d("CameraPlugin", "MiSnap activity canceled by user.");
        return;
        if (j != 0) goto _L6; else goto _L8
_L8:
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.getStringExtra("com.miteksystems.misnap.ResultCode");
        }
        Log.w("CameraPlugin", (new StringBuilder()).append("In RESULT_CANCELED block with result = ").append(intent).toString());
        if ("CameraNotSufficient".equals(intent))
        {
            Log.e("CameraPlugin", "Camera not sufficient for use with MiSnap.");
            error(new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, AppHelper.getAppString(0x7f090152)), callbackId);
            return;
        }
        if ("VideoCaptureFailed".equals(intent))
        {
            Log.e("CameraPlugin", "MiSnap failed to capture video.");
            error(new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, AppHelper.getAppString(0x7f090153)), callbackId);
            return;
        }
        if ("Cancelled".equals(intent))
        {
            Log.d("CameraPlugin", "MiSnap canceled.  This can happen if the user hits the back button.");
            return;
        } else
        {
            Log.w("CameraPlugin", "MiSnap has crashed and/or stopped working.");
            return;
        }
        if (i != 999 && i != 1999) goto _L6; else goto _L9
_L9:
        if (i == 1999)
        {
            AppHelper.getApplicationLink().setSplashSuppress(true);
        }
        if (intent != null)
        {
            j = intent.getIntExtra("errorCode", 0);
            if (j != 0)
            {
                if (i == 1999)
                {
                    intent = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, (new StringBuilder()).append("RDC Error: ").append(j).toString());
                } else
                {
                    intent = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "no camera available");
                }
                error(intent, callbackId);
                return;
            }
            intent = intent.getByteArrayExtra("RDCImage");
            if (intent == null)
            {
                error(new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, AppHelper.getAppString(0x7f09014d)), callbackId);
                return;
            } else
            {
                intent = Base64.encodeToString(intent, 2);
                Log.d("CameraPlugin", intent);
                success(new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, intent), callbackId);
                return;
            }
        } else
        {
            sendJavascript("INGDirectApp.hideBusyIndicator();");
            return;
        }
    }

}
