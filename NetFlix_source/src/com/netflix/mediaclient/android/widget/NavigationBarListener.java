// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NavigationBarListenerForJB, TappableSurfaceView

class NavigationBarListener
{

    protected static final String TAG = "nf_navbar";
    protected TappableSurfaceView owner;

    NavigationBarListener(TappableSurfaceView tappablesurfaceview)
    {
        if (tappablesurfaceview == null)
        {
            throw new IllegalArgumentException("View is null!");
        } else
        {
            owner = tappablesurfaceview;
            return;
        }
    }

    static NavigationBarListener getInstance(Context context, TappableSurfaceView tappablesurfaceview)
    {
        boolean flag1 = DeviceUtils.isTabletByContext(context);
        if (Log.isLoggable("nf_navbar", 3))
        {
            Log.d("nf_navbar", (new StringBuilder()).append("Device is tablet: ").append(flag1).toString());
        }
        boolean flag;
        if (AndroidUtils.getAndroidVersion() >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Log.d("nf_navbar", "Real listener for JB+");
            return new NavigationBarListenerForJB(tappablesurfaceview);
        } else
        {
            Log.d("nf_navbar", "Dummy listener");
            return new NavigationBarListener(tappablesurfaceview);
        }
    }

    public void onSystemUiVisibilityChange(int i)
    {
    }

    public void startListening()
    {
        Log.d("nf_navbar", "startListening: noop");
    }

    public void stopListening()
    {
        Log.d("nf_navbar", "stopListening: noop");
    }
}
