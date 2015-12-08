// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

final class b
{

    private Activity activity;
    private View overlay;

    public b(Activity activity1)
    {
        activity = activity1;
    }

    public final boolean isOverlayVisible()
    {
        return overlay != null && overlay.getVisibility() == 0;
    }

    public final void setOverlayVisible(boolean flag)
    {
        if (overlay == null)
        {
            overlay = new View(activity);
            overlay.setBackgroundColor(activity.getResources().getColor(0x7f0f004f));
            overlay.setClickable(true);
            ((ViewGroup)activity.getWindow().getDecorView()).addView(overlay);
        }
        View view = overlay;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (flag)
        {
            overlay.bringToFront();
        }
    }
}
