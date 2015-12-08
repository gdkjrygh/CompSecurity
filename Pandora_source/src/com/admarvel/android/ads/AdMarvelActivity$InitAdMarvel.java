// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.location.Location;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelInternalWebView, Utils, AdMarvelLocationManager

private static class adMarvelActivityReference
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    private final String callback;

    public void run()
    {
        if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
        Object obj = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
_L11:
        if (adMarvelActivityReference == null) goto _L4; else goto _L3
_L3:
        AdMarvelActivity admarvelactivity = (AdMarvelActivity)adMarvelActivityReference.get();
          goto _L5
_L10:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        String s2;
        int i;
        s2 = Utils.getDeviceConnectivitiy(admarvelactivity.getBaseContext());
        i = Utils.getScreenOrientation(admarvelactivity.getBaseContext());
        String s;
        Object obj1;
        String s1;
        Object obj2;
        ViewGroup viewgroup;
        String s3;
        boolean flag;
        if (i == 1)
        {
            i = 0;
        } else
        if (i == 2)
        {
            i = 90;
        } else
        {
            i = -1;
        }
        if (!s2.equals("wifi") && !s2.equals("mobile"))
        {
            s = "NO";
        } else
        {
            s = "YES";
        }
        if (!Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "location")) goto _L7; else goto _L6
_L6:
        obj1 = AdMarvelLocationManager.getInstance().getLocation(((AdMarvelInternalWebView) (obj)));
_L8:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_803;
        }
        obj1 = (new StringBuilder("{lat:")).append(((Location) (obj1)).getLatitude()).append(", lon:").append(((Location) (obj1)).getLongitude()).append(", acc:").append(((Location) (obj1)).getAccuracy()).append("}").toString();
_L12:
        if (AdMarvelActivity.access$9(admarvelactivity))
        {
            s1 = "Expanded";
        } else
        {
            s1 = "Interstitial";
        }
        obj2 = (new StringBuilder("{screen: true, orientation: true, heading: ")).append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "compass")).append(", location : ");
        if (!Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.ACCESS_FINE_LOCATION"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj2 = ((StringBuilder) (obj2)).append(flag).append(",shake: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "accelerometer")).append(",tilt: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "accelerometer")).append(", network: true, sms:").append(Utils.isTelephonySupported(admarvelactivity.getBaseContext())).append(", phone:").append(Utils.isTelephonySupported(admarvelactivity.getBaseContext())).append(", email:true,calendar:");
        if (Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(admarvelactivity.getBaseContext(), "android.permission.WRITE_CALENDAR"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = ((StringBuilder) (obj2)).append(flag).append(", camera: ").append(Utils.isFeatureSupported(admarvelactivity.getBaseContext(), "camera")).append(",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}").toString();
        viewgroup = (ViewGroup)admarvelactivity.getWindow().findViewById(0x1020002);
        viewgroup.getWidth();
        s3 = Utils.getSupportedInterfaceOrientations(admarvelactivity);
        try
        {
            ((AdMarvelInternalWebView) (obj)).loadUrl((new StringBuilder("javascript:")).append(callback).append("({x:").append(((AdMarvelInternalWebView) (obj)).getLeft()).append(",y:").append(((AdMarvelInternalWebView) (obj)).getTop()).append(",width:").append(((AdMarvelInternalWebView) (obj)).getWidth()).append(",height:").append(((AdMarvelInternalWebView) (obj)).getHeight()).append(",appX:").append(viewgroup.getLeft()).append(",appY:").append(viewgroup.getTop()).append(",appWidth:").append(viewgroup.getWidth()).append(",appHeight:").append(viewgroup.getHeight()).append(",orientation:").append(i).append(",networkType:").append("'").append(s2).append("'").append(",network:").append("'").append(s).append("'").append(",screenWidth:").append(Utils.getDeviceWidth(admarvelactivity.getBaseContext())).append(",screenHeight:").append(Utils.getDeviceHeight(admarvelactivity.getBaseContext())).append(",adType:").append("'").append(s1).append("'").append(",supportedFeatures:").append(((String) (obj2))).append(",sdkVersion:").append("'").append("2.4.2.1").append("'").append(",location:").append(((String) (obj1))).append(",applicationSupportedOrientations:").append("'").append(s3).append("'").append("})").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log((new StringBuilder(String.valueOf(((Exception) (obj)).getMessage()))).append(" Exception in InitAdMarvel ").toString());
        }
        return;
_L7:
        obj1 = null;
          goto _L8
_L5:
        if (admarvelactivity != null) goto _L10; else goto _L9
_L9:
        return;
_L2:
        obj = null;
          goto _L11
_L4:
        admarvelactivity = null;
          goto _L5
        obj1 = "null";
          goto _L12
    }

    public (String s, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity)
    {
        callback = s;
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        adMarvelActivityReference = new WeakReference(admarvelactivity);
    }
}
