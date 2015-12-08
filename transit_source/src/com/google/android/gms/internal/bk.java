// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            cm

public final class bk extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final Activity fD;
    private final ImageButton gk;

    public bk(Activity activity, int i)
    {
        super(activity);
        fD = activity;
        setOnClickListener(this);
        gk = new ImageButton(activity);
        gk.setImageResource(0x1080017);
        gk.setBackgroundColor(0);
        gk.setOnClickListener(this);
        gk.setPadding(0, 0, 0, 0);
        i = cm.a(activity, i);
        addView(gk, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void d(boolean flag)
    {
        ImageButton imagebutton = gk;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        imagebutton.setVisibility(byte0);
    }

    public void onClick(View view)
    {
        fD.finish();
    }
}
