// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            eu

public final class cl extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton oP;
    private final Activity oe;

    public cl(Activity activity, int i)
    {
        super(activity);
        oe = activity;
        setOnClickListener(this);
        oP = new ImageButton(activity);
        oP.setImageResource(0x1080017);
        oP.setBackgroundColor(0);
        oP.setOnClickListener(this);
        oP.setPadding(0, 0, 0, 0);
        i = eu.a(activity, i);
        addView(oP, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void j(boolean flag)
    {
        ImageButton imagebutton = oP;
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
        oe.finish();
    }
}
