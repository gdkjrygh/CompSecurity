// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView, Utils, Version, 
//            AdMarvelLocationManager, AdMarvelView

private static class adMarvelWebViewReference
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
    private final String callback;

    public void run()
    {
        AdMarvelInternalWebView admarvelinternalwebview;
        AdMarvelWebView admarvelwebview;
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        admarvelwebview = (AdMarvelWebView)adMarvelWebViewReference.get();
        if (admarvelwebview == null)
        {
            return;
        }
        if (admarvelinternalwebview == null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
        String s = Utils.getDeviceConnectivitiy(admarvelwebview.getContext());
        if (Version.getAndroidSDKVersion() >= 9) goto _L4; else goto _L3
_L3:
        int i = admarvelwebview.getResources().getConfiguration().orientation;
        if (i != 1) goto _L6; else goto _L5
_L5:
        i = 0;
_L19:
        Object obj;
        Object obj2;
        String s1;
        Object obj3;
        Object obj4;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        boolean flag;
        if (s.equals("wifi") || s.equals("mobile"))
        {
            obj = "YES";
        } else
        {
            obj = "NO";
        }
        if (Utils.isFeatureSupported(admarvelwebview.getContext(), "location"))
        {
            obj1 = AdMarvelLocationManager.getInstance().getLocation(admarvelinternalwebview);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1166;
        }
        obj1 = (new StringBuilder("{lat:")).append(((Location) (obj1)).getLatitude()).append(", lon:").append(((Location) (obj1)).getLongitude()).append(", acc:").append(((Location) (obj1)).getAccuracy()).append("}").toString();
_L26:
        obj2 = (new StringBuilder("{screen: true, orientation: true, heading: ")).append(Utils.isFeatureSupported(admarvelwebview.getContext(), "compass")).append(", location : ");
        if (!Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_COARSE_LOCATION") && !Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.ACCESS_FINE_LOCATION"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj2 = ((StringBuilder) (obj2)).append(flag).append(",shake: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(",tilt: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "accelerometer")).append(", network: true, sms:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", phone:").append(Utils.isTelephonySupported(admarvelwebview.getContext())).append(", email:true,calendar:");
        if (Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.READ_CALENDAR") && Utils.isPermissionGranted(admarvelwebview.getContext(), "android.permission.WRITE_CALENDAR"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = ((StringBuilder) (obj2)).append(flag).append(", camera: ").append(Utils.isFeatureSupported(admarvelwebview.getContext(), "camera")).append(",map:true, audio:true, video:true, 'level-1':true,'level-2': true, 'level-3':false}").toString();
        obj2 = (AdMarvelView)admarvelinternalwebview.adMarvelViewReference.get();
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        obj3 = new int[2];
        try
        {
            admarvelinternalwebview.getLocationOnScreen(((int []) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            obj3[0] = 0;
            obj3[1] = 0;
        }
        if (!(admarvelwebview.getContext() instanceof Activity)) goto _L10; else goto _L9
_L9:
        obj4 = (Activity)admarvelwebview.getContext();
        if (obj4 == null) goto _L10; else goto _L11
_L11:
        if (AdMarvelWebView.access$11(admarvelwebview) == 0x80000000 || AdMarvelWebView.access$11(admarvelwebview) < 0) goto _L13; else goto _L12
_L12:
        j = AdMarvelWebView.access$11(admarvelwebview);
_L21:
        i1 = obj3[0];
        l = obj3[1] - j;
        k = ((AdMarvelView) (obj2)).getWidth();
        j = ((AdMarvelView) (obj2)).getHeight();
        admarvelinternalwebview.mInitLayoutX = i1;
        admarvelinternalwebview.mInitLayoutY = l;
_L24:
        i2 = admarvelwebview.getRootView().getLeft();
        l1 = admarvelwebview.getRootView().getTop();
        k1 = admarvelwebview.getRootView().getWidth();
        j1 = admarvelwebview.getRootView().getHeight();
        if (!(admarvelwebview.getContext() instanceof Activity)) goto _L15; else goto _L14
_L14:
        obj3 = (Activity)admarvelwebview.getContext();
        if (obj3 == null) goto _L15; else goto _L16
_L16:
        obj2 = Utils.getSupportedInterfaceOrientations(((Activity) (obj3)));
        obj3 = (ViewGroup)((Activity) (obj3)).getWindow().findViewById(0x1020002);
        i2 = ((ViewGroup) (obj3)).getLeft();
        l1 = ((ViewGroup) (obj3)).getTop();
        k1 = ((ViewGroup) (obj3)).getWidth();
        j1 = ((ViewGroup) (obj3)).getHeight();
        break MISSING_BLOCK_LABEL_610;
_L6:
        if (i != 2) goto _L18; else goto _L17
_L17:
        i = 90;
          goto _L19
_L4:
        i = AdMarvelWebView.access$10(admarvelwebview);
        if (i == 0)
        {
            i = 0;
        } else
        if (i == 1)
        {
            i = 90;
        } else
        {
            if (i != 2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = 180;
        }
          goto _L19
_L23:
        try
        {
            obj = (new StringBuilder("javascript:")).append(callback).append("({x:").append(i1).append(",y:").append(l).append(",width:").append(k).append(",height:").append(j).append(",appX:").append(i2).append(",appY:").append(l1).append(",appWidth:").append(k1).append(",appHeight:").append(j1).append(",orientation:").append(i).append(",networkType:").append("'").append(s).append("'").append(",network:").append("'").append(((String) (obj))).append("'").append(",screenWidth:").append(Utils.getDeviceWidth(admarvelwebview.getContext())).append(",screenHeight:").append(Utils.getDeviceHeight(admarvelwebview.getContext())).append(",adType:").append("'").append("Banner").append("'").append(",supportedFeatures:").append(s1).append(",sdkVersion:").append("'").append("2.4.2.1").append("'").append(",location:").append(((String) (obj1))).append(",applicationSupportedOrientations:").append("'").append(((String) (obj2))).append("'").append("})").toString();
            Logging.log(((String) (obj)));
            admarvelinternalwebview.loadUrl(((String) (obj)));
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
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
        }
        return;
_L13:
        ViewGroup viewgroup = (ViewGroup)((Activity) (obj4)).getWindow().findViewById(0x1020002);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity) (obj4)).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        k = displaymetrics.heightPixels - viewgroup.getMeasuredHeight();
        j = k;
        if (k < 0) goto _L21; else goto _L20
_L20:
        j = k;
        if (AdMarvelWebView.access$11(admarvelwebview) != 0x80000000) goto _L21; else goto _L22
_L22:
        AdMarvelWebView.access$12(admarvelwebview, k);
        j = k;
          goto _L21
_L15:
        obj2 = "0,90";
          goto _L23
_L10:
        j = 0;
          goto _L21
_L8:
        j = 0;
        k = 0;
        l = 0;
        i1 = 0;
          goto _L24
_L18:
        i = -1;
          goto _L19
_L2:
        return;
        if (i != 3) goto _L18; else goto _L25
_L25:
        i = -90;
          goto _L19
        obj1 = "null";
          goto _L26
    }

    public (String s, AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview)
    {
        callback = s;
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
    }
}
