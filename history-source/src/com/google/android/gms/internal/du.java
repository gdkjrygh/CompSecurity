// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            gq

public final class du extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final Activity nB;
    private final ImageButton sx;

    public du(Activity activity, int i)
    {
        super(activity);
        nB = activity;
        setOnClickListener(this);
        sx = new ImageButton(activity);
        sx.setImageResource(0x1080017);
        sx.setBackgroundColor(0);
        sx.setOnClickListener(this);
        sx.setPadding(0, 0, 0, 0);
        sx.setContentDescription("Interstitial close button");
        i = gq.a(activity, i);
        addView(sx, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void onClick(View view)
    {
        nB.finish();
    }

    public void q(boolean flag)
    {
        ImageButton imagebutton = sx;
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
}
