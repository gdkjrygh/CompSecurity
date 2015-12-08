// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.view.AmobeeView;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController, OrmmaAssetController, OrmmaDisplayController, OrmmaLocationController, 
//            OrmmaNetworkController, OrmmaSensorController, OrmmaCalendarController

public class OrmmaUtilityController extends OrmmaController
{

    private static final String LOG_TAG = "AmobeeViewUtilityController";
    private OrmmaAssetController mAssetController;
    public OrmmaDisplayController mDisplayController;
    private OrmmaLocationController mLocationController;
    private OrmmaNetworkController mNetworkController;
    private OrmmaSensorController mSensorController;
    public boolean mraidScriptLoaded;
    private OrmmaCalendarController ormmaCalendarController;
    private boolean ormmaCalendarControllerFlag;

    public OrmmaUtilityController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        mraidScriptLoaded = false;
        ormmaCalendarController = null;
        ormmaCalendarControllerFlag = false;
        mAssetController = new OrmmaAssetController(amobeeview, context);
        mDisplayController = new OrmmaDisplayController(amobeeview, context);
        mLocationController = new OrmmaLocationController(amobeeview, context);
        mNetworkController = new OrmmaNetworkController(amobeeview, context);
        mSensorController = new OrmmaSensorController(amobeeview, context);
        amobeeview.addJavascriptInterface(mAssetController, "ORMMAAssetsControllerBridge");
        amobeeview.addJavascriptInterface(mDisplayController, "ORMMADisplayControllerBridge");
        amobeeview.addJavascriptInterface(mLocationController, "ORMMALocationControllerBridge");
        amobeeview.addJavascriptInterface(mNetworkController, "ORMMANetworkControllerBridge");
        amobeeview.addJavascriptInterface(mSensorController, "ORMMASensorControllerBridge");
    }

    private String createTelUrl(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder("tel:");
            stringbuilder.append(s);
            return stringbuilder.toString();
        }
    }

    private String getSupports()
    {
        String s1 = "supports: [ 'level-1', 'level-2', 'screen', 'orientation', 'network'";
        String s;
        boolean flag;
        if (mLocationController.allowLocationServices() && (mContext.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || mContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s1 = (new StringBuilder(String.valueOf("supports: [ 'level-1', 'level-2', 'screen', 'orientation', 'network'"))).append(", 'location'").toString();
        }
        if (mContext.checkCallingOrSelfPermission("android.permission.SEND_SMS") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = s1;
        if (flag)
        {
            s = (new StringBuilder(String.valueOf(s1))).append(", 'sms'").toString();
        }
        if (mContext.checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = s;
        if (flag)
        {
            s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s))).append(", 'phone'").toString()))).append(", 'tel'").toString();
        }
        if (mContext.checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0 && mContext.checkCallingOrSelfPermission("android.permission.READ_CALENDAR") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = s1;
        if (flag)
        {
            s = s1;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                s = (new StringBuilder(String.valueOf(s1))).append(", 'calendar'").toString();
            }
        }
        if (mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = s;
        if (flag)
        {
            s1 = (new StringBuilder(String.valueOf(s))).append(", 'storePicture'").toString();
        }
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(s1))).append(", 'video'").toString()))).append(", 'inlineVideo'").toString()))).append(", 'audio'").toString()))).append(", 'map'").toString()))).append(", 'email' ]").toString();
    }

    public void activate(String s)
    {
        if (s.equalsIgnoreCase("networkChange"))
        {
            mNetworkController.startNetworkListener();
        } else
        {
            if (mLocationController.allowLocationServices() && s.equalsIgnoreCase("locationChange"))
            {
                mLocationController.startLocationListener();
                return;
            }
            if (s.equalsIgnoreCase("shake"))
            {
                mSensorController.startShakeListener();
                return;
            }
            if (s.equalsIgnoreCase("tiltChange"))
            {
                mSensorController.startTiltListener();
                return;
            }
            if (s.equalsIgnoreCase("headingChange"))
            {
                mSensorController.startHeadingListener();
                return;
            }
            if (s.equalsIgnoreCase("orientationChange"))
            {
                mDisplayController.startConfigurationListener();
                return;
            }
        }
    }

    public String copyTextFromJarIntoAssetDir(String s, String s1)
    {
        return mAssetController.copyTextFromJarIntoAssetDir(s, s1);
    }

    public void createCalendarEvent(String s, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            ormmaCalendarControllerFlag = true;
            ormmaCalendarController = new OrmmaCalendarController("AmobeeViewUtilityController", mContext, mDisplayController.mOrmmaView);
            Object obj = null;
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                try
                {
                    s1 = (OrmmaController.RecurrenceProperties)OrmmaDisplayController.getFromJSON(new JSONObject(s1), com/amobee/richmedia/controller/OrmmaController$RecurrenceProperties);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = obj;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = obj;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = obj;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = obj;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = obj;
                }
            }
            ormmaCalendarController.createCalendarEvent(s, s1);
        }
    }

    public void deactivate(String s)
    {
        if (s.equalsIgnoreCase("networkChange"))
        {
            mNetworkController.stopNetworkListener();
        } else
        {
            if (s.equalsIgnoreCase("locationChange"))
            {
                mLocationController.stopAllListeners();
                return;
            }
            if (s.equalsIgnoreCase("shake"))
            {
                mSensorController.stopShakeListener();
                return;
            }
            if (s.equalsIgnoreCase("tiltChange"))
            {
                mSensorController.stopTiltListener();
                return;
            }
            if (s.equalsIgnoreCase("headingChange"))
            {
                mSensorController.stopHeadingListener();
                return;
            }
            if (s.equalsIgnoreCase("orientationChange"))
            {
                mDisplayController.stopConfigurationListener();
                return;
            }
        }
    }

    public void deleteOldAds()
    {
        mAssetController.deleteOldAds();
    }

    public void handleCalendarEvent()
    {
        while (android.os.Build.VERSION.SDK_INT < 14 || !ormmaCalendarControllerFlag || !ormmaCalendarController.isEventSaved()) 
        {
            return;
        }
        ormmaCalendarControllerFlag = false;
    }

    public void init(float f)
    {
        int ai[] = mOrmmaView.getDefaultPosition();
        int i = (int)((float)mOrmmaView.getWidth() / f);
        i = (int)((float)mOrmmaView.getHeight() / f);
        String s1 = "default";
        String s = mDisplayController.getSize();
        String s2;
        int j;
        if (mOrmmaView.parentView != null)
        {
            s1 = "expanded";
            j = (int)((float)mOrmmaView.parentView.getWidth() / f);
            i = (int)((float)mOrmmaView.parentView.getHeight() / f);
        } else
        if (mOrmmaView.mViewState == com.amobee.richmedia.view.AmobeeView.ViewState.INTERSTITIAL)
        {
            s = mDisplayController.getScreenSize();
            j = (int)((float)mOrmmaView.metrics.widthPixels / mOrmmaView.metrics.density);
            i = (int)((float)mOrmmaView.metrics.heightPixels / mOrmmaView.metrics.density);
        } else
        {
            j = (int)((float)mOrmmaView.getWidth() / f);
            i = (int)((float)mOrmmaView.getHeight() / f);
        }
        s2 = "";
        if (mOrmmaView.mViewState == com.amobee.richmedia.view.AmobeeView.ViewState.INTERSTITIAL)
        {
            s2 = (new StringBuilder(String.valueOf(""))).append("mraid.setPlacementType('interstitial');").toString();
        }
        s = (new StringBuilder(String.valueOf(s2))).append("window.ormmaview.fireChangeEvent({ network: '").append(mNetworkController.getNetwork()).append("',").append(" size: ").append(s).append(",").append(" maxSize: ").append(mDisplayController.getMaxSize()).append(",").append(" screenSize: ").append(mDisplayController.getScreenSize()).append(",").append(" defaultPosition: { x:").append((int)((float)ai[0] / f)).append(", y: ").append((int)((float)ai[1] / f)).append(", width: ").append(j).append(", height: ").append(i).append(" },").append(" orientation:").append(mDisplayController.getOrientation()).append(",").append(getSupports()).append(",").append(" state: '").append(s1).append("'});").toString();
        s = (new StringBuilder("setTimeout(\"try{")).append(s).append("}catch(e){}\",100)").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void makeCall(String s)
    {
        s = createTelUrl(s);
        if (s == null)
        {
            mOrmmaView.raiseError("Bad Phone Number", "makeCall");
            return;
        } else
        {
            s = new Intent("android.intent.action.CALL", Uri.parse(s.toString()));
            s.addFlags(0x10000000);
            mContext.startActivity(s);
            return;
        }
    }

    public void ready()
    {
    }

    public void scriptReady()
    {
        mraidScriptLoaded = true;
        AmobeeView amobeeview = mOrmmaView;
        if (mOrmmaView.parentView != null)
        {
            amobeeview = mOrmmaView.parentView;
        }
        amobeeview.post(new Runnable() {

            final OrmmaUtilityController this$0;

            public void run()
            {
                mOrmmaView.calculateCurrentPosition(true);
                init(mOrmmaView.mDensity);
            }

            
            {
                this$0 = OrmmaUtilityController.this;
                super();
            }
        });
    }

    public void sendMail(String s, String s1, String s2)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            s
        });
        intent.putExtra("android.intent.extra.SUBJECT", s1);
        intent.putExtra("android.intent.extra.TEXT", s2);
        intent.addFlags(0x10000000);
        mContext.startActivity(intent);
    }

    public void sendSMS(String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("address", s);
        intent.putExtra("sms_body", s1);
        intent.setType("vnd.android-dir/mms-sms");
        intent.addFlags(0x10000000);
        mContext.startActivity(intent);
    }

    public void setMaxSize(int i, int j)
    {
        mDisplayController.setMaxSize(i, j);
    }

    public void showAlert(String s)
    {
        Log.d("AmobeeViewUtilityController", s);
    }

    public void stopAllListeners()
    {
        try
        {
            mAssetController.stopAllListeners();
            mDisplayController.stopAllListeners();
            mLocationController.stopAllListeners();
            mNetworkController.stopAllListeners();
            mSensorController.stopAllListeners();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public String writeToDiskWrap(InputStream inputstream, String s, boolean flag, String s1, String s2, String s3)
        throws IllegalStateException, IOException
    {
        return mAssetController.writeToDiskWrap(inputstream, s, flag, s1, s2, s3);
    }
}
