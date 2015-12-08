// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            dv

public final class ch extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final Activity nS;
    private final ImageButton oB;

    public ch(Activity activity, int j)
    {
        super(activity);
        nS = activity;
        setOnClickListener(this);
        oB = new ImageButton(activity);
        oB.setImageResource(0x1080017);
        oB.setBackgroundColor(0);
        oB.setOnClickListener(this);
        oB.setPadding(0, 0, 0, 0);
        j = dv.a(activity, j);
        addView(oB, new android.widget.FrameLayout.LayoutParams(j, j, 17));
    }

    public void i(boolean flag)
    {
        ImageButton imagebutton = oB;
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
        nS.finish();
    }
}
