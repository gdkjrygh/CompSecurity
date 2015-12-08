// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

public class PressedStateHandler
{

    private static final String TAG = "PressedStateHandler";
    private boolean enabled;
    private boolean pressed;
    private final View view;

    public PressedStateHandler(View view1)
    {
        enabled = true;
        view = view1;
    }

    public void handleSetPressed(boolean flag)
    {
        if (!enabled)
        {
            return;
        }
        if (Log.isLoggable("PressedStateHandler", 2))
        {
            Log.v("PressedStateHandler", (new StringBuilder()).append("Prev pressed state: ").append(pressed).append(", new pressed state: ").append(flag).toString());
        }
        if (pressed && !flag)
        {
            AnimationUtils.startAlphaFadeInAnimation(view);
        } else
        {
            View view1 = view;
            float f;
            if (flag)
            {
                f = 0.65F;
            } else
            {
                f = 1.0F;
            }
            view1.setAlpha(f);
        }
        pressed = flag;
    }

    public void setEnabled(boolean flag)
    {
        enabled = flag;
    }
}
