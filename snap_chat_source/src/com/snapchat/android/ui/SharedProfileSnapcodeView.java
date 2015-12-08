// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cn;
import com.caverock.androidsvg.SVGImageView;

public class SharedProfileSnapcodeView extends FrameLayout
{

    private ViewGroup a;
    private SVGImageView b;
    private ImageView c;
    private TextView d;

    public SharedProfileSnapcodeView(Context context)
    {
        super(context);
    }

    public SharedProfileSnapcodeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        a = (ViewGroup)findViewById(0x7f0d0474);
        c = (ImageView)findViewById(0x7f0d0475);
        d = (TextView)findViewById(0x7f0d0476);
    }

    public void setProfileImage(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            c.setImageDrawable(null);
            return;
        } else
        {
            c.setImageBitmap(bitmap);
            return;
        }
    }

    public void setSnapcodeSvg(cn cn)
    {
        if (b == null)
        {
            b = new SVGImageView(getContext());
            int i = getResources().getDimensionPixelSize(0x7f0a010d);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i, i);
            layoutparams.addRule(13, -1);
            a.addView(b, layoutparams);
            b.setVisibility(0);
        }
        b.setSVG(cn);
    }

    public void setUsername(String s)
    {
        d.setText(s);
    }
}
