// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            et

public final class ck extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton oR;
    private final Activity og;

    public ck(Activity activity, int i)
    {
        super(activity);
        og = activity;
        setOnClickListener(this);
        oR = new ImageButton(activity);
        oR.setImageResource(0x1080017);
        oR.setBackgroundColor(0);
        oR.setOnClickListener(this);
        oR.setPadding(0, 0, 0, 0);
        i = et.a(activity, i);
        addView(oR, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void j(boolean flag)
    {
        ImageButton imagebutton = oR;
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
        og.finish();
    }
}
