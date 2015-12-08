// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

// Referenced classes of package com.jirbo.adcolony:
//            ADCVideo, a, ae

public class AdColonyOverlay extends ADCVideo
{

    Rect U;
    int V;

    public AdColonyOverlay()
    {
        U = new Rect();
        V = 0;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = getWindowManager().getDefaultDisplay();
        t = configuration.getWidth();
        u = configuration.getHeight();
        a.B = true;
        configuration = new View(this);
        configuration.setBackgroundColor(0xff000000);
        if (d && F.Q)
        {
            O.setLayoutParams(new android.widget.FrameLayout.LayoutParams(t, u - F.m, 17));
            N.addView(configuration, new android.widget.FrameLayout.LayoutParams(t, u, 17));
            (new Handler()).postDelayed(new _cls1(configuration), 1500L);
        }
        F.a();
    }

    private class _cls1
        implements Runnable
    {

        final View a;
        final AdColonyOverlay b;

        public void run()
        {
            b.N.removeView(a);
        }

        _cls1(View view)
        {
            b = AdColonyOverlay.this;
            a = view;
            super();
        }
    }

}
