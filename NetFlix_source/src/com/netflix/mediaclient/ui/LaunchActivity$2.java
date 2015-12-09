// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui:
//            LaunchActivity

class val.progress
    implements android.view.OnGlobalLayoutListener
{

    final LaunchActivity this$0;
    final ImageView val$bg;
    final ImageView val$logo;
    final ProgressBar val$progress;

    public void onGlobalLayout()
    {
        if (val$bg.getWidth() <= 0)
        {
            return;
        }
        Log.v("LaunchActivity", (new StringBuilder()).append("Manipulating splash bg, scale factor: ").append(2).toString());
        android.widget.youtParams youtparams = (android.widget.youtParams)val$bg.getLayoutParams();
        youtparams.width = val$bg.getWidth() * 2;
        youtparams.height = val$bg.getHeight() * 2;
        val$bg.setScaleType(android.widget.pe.FIT_CENTER);
        youtparams = (android.widget.youtParams)val$logo.getLayoutParams();
        youtparams.topMargin = youtparams.topMargin * 2;
        if (DeviceUtils.isLandscape(LaunchActivity.this))
        {
            android.widget.youtParams youtparams1 = (android.widget.youtParams)val$progress.getLayoutParams();
            youtparams1.topMargin = youtparams1.topMargin * 2;
        }
        ViewUtils.removeGlobalLayoutListener(val$bg, this);
    }

    Listener()
    {
        this$0 = final_launchactivity;
        val$bg = imageview;
        val$logo = imageview1;
        val$progress = ProgressBar.this;
        super();
    }
}
