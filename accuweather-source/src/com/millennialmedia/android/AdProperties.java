// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMSDK, Utils, BridgeMMDevice, MMLog

class AdProperties
{

    private static final String TAG = com/millennialmedia/android/AdProperties.getName();
    WeakReference contextRef;

    AdProperties(Context context)
    {
        contextRef = new WeakReference(context);
    }

    private JSONObject getPermissions()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        boolean flag;
        if (getContext().checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsonobject.put("android.permission.ACCESS_FINE_LOCATION", flag);
        return jsonobject;
    }

    private JSONObject getScreen()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("height", getScreenDpiIndependentHeight());
        jsonobject.put("width", getScreenDpiIndependentWidth());
        return jsonobject;
    }

    private JSONObject getSupports()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Context context = getContext();
        jsonobject.put("sms", Boolean.parseBoolean(MMSDK.getSupportsSms(context)));
        jsonobject.put("tel", Boolean.parseBoolean(MMSDK.getSupportsTel(context)));
        jsonobject.put("calendar", MMSDK.getSupportsCalendar());
        jsonobject.put("storePicture", false);
        jsonobject.put("inlineVideo", true);
        return jsonobject;
    }

    int getAdDpiIndependentHeight()
    {
        return getScreenDpiIndependentHeight();
    }

    int getAdDpiIndependentWidth()
    {
        return getScreenDpiIndependentWidth();
    }

    public JSONObject getAdProperties(View view)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("screen", getScreen());
            jsonobject.put("ad", Utils.getViewDimensions(view));
            jsonobject.put("do", MMSDK.getOrientation(getContext()));
            jsonobject.put("supports", getSupports());
            jsonobject.put("device", BridgeMMDevice.getDeviceInfo(getContext()));
            jsonobject.put("permissions", getPermissions());
            jsonobject.put("maxSize", getScreen());
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            MMLog.e(TAG, "Error when building ad properties", view);
            return jsonobject;
        }
        return jsonobject;
    }

    Context getContext()
    {
        return (Context)contextRef.get();
    }

    int getScreenDpiIndependentHeight()
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        return (int)((float)displaymetrics.heightPixels / displaymetrics.density);
    }

    int getScreenDpiIndependentWidth()
    {
        DisplayMetrics displaymetrics = getContext().getResources().getDisplayMetrics();
        return (int)((float)displaymetrics.widthPixels / displaymetrics.density);
    }

}
