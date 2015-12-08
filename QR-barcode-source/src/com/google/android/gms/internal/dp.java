// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            gr

public final class dp extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final Activity nr;
    private final ImageButton sg;

    public dp(Activity activity, int i)
    {
        super(activity);
        nr = activity;
        setOnClickListener(this);
        sg = new ImageButton(activity);
        sg.setImageResource(0x1080017);
        sg.setBackgroundColor(0);
        sg.setOnClickListener(this);
        sg.setPadding(0, 0, 0, 0);
        sg.setContentDescription("Interstitial close button");
        i = gr.a(activity, i);
        addView(sg, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void o(boolean flag)
    {
        ImageButton imagebutton = sg;
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
        nr.finish();
    }
}
