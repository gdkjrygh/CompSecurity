// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.netflix.mediaclient.Log;

public abstract class Section
{

    protected static final float DISABLED_ALPHA = 0.3F;
    protected Activity activity;
    protected int transpColor;

    public Section(Activity activity1)
    {
        transpColor = activity1.getResources().getColor(0x106000d);
        activity = activity1;
    }

    protected void animateView(View view, float f, float f1)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f, f1);
        alphaanimation.setFillAfter(true);
        view.startAnimation(alphaanimation);
    }

    public abstract void changeActionState(boolean flag);

    public abstract void destroy();

    protected void enableButton(View view, boolean flag)
    {
label0:
        {
            if (view != null)
            {
                view.setEnabled(flag);
                if (!flag)
                {
                    break label0;
                }
                view.clearAnimation();
            }
            return;
        }
        setDisableOverlayForImageButton(view);
    }

    public abstract void hide();

    protected void setDisableOverlayForImageButton(View view)
    {
        animateView(view, 0.3F, 0.3F);
    }

    public abstract void show();

    protected void updateText(String s, TextView textview, String s1, String s2)
    {
        if (textview != null)
        {
            if (Log.isLoggable(s, 3))
            {
                Log.d(s, (new StringBuilder()).append("updateText: view id: ").append(s1).append("txt ").append(s2).toString());
            }
            textview.setText(s2);
            return;
        } else
        {
            Log.w(s, "View is null!");
            return;
        }
    }
}
