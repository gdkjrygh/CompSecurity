// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            w

public class v extends FrameLayout
{

    protected final Context a;
    protected final Resources b;
    protected final w c;
    private View d;

    public v(Context context, Resources resources, w w)
    {
        super(context);
        a = context;
        b = resources;
        c = w;
    }

    protected final int a(float f)
    {
        return (int)Math.ceil(TypedValue.applyDimension(1, f, b.getDisplayMetrics()));
    }

    protected final View a()
    {
        ImageButton imagebutton = new ImageButton(a, null, 0x103016c);
        imagebutton.setImageDrawable(b.getDrawable(com.google.android.m4b.maps.h.e.maps_btn_close));
        int i = a(11F);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        imagebutton.setPadding(i, i, i, i);
        imagebutton.setLayoutParams(layoutparams);
        imagebutton.setContentDescription(b.getString(com.google.android.m4b.maps.h.h.maps_CLOSE_SOFTKEY));
        imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

            private v a;

            public final void onClick(View view)
            {
                a.c.b();
            }

            
            {
                a = v.this;
                super();
            }
        });
        d = imagebutton;
        d.setTag("GoogleMapMapsEngineInfocardLayoutCloseButton");
        return imagebutton;
    }

    protected final void a(View view, boolean flag)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        int i = a(36F);
        int j = a(11F);
        layoutparams.setMargins(j, j, j, i);
        setLayoutParams(layoutparams);
        setBackgroundDrawable(b.getDrawable(com.google.android.m4b.maps.h.e.maps_card_bg));
        setClickable(true);
        if (flag)
        {
            LinearLayout linearlayout = new LinearLayout(a);
            linearlayout.setOrientation(0);
            linearlayout.addView(view);
            linearlayout.addView(a());
            addView(linearlayout);
            return;
        } else
        {
            addView(view);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = true;
        int l = android.view.View.MeasureSpec.getSize(i);
        int k = android.view.View.MeasureSpec.getSize(j);
        android.view.View.MeasureSpec.getMode(i);
        android.view.View.MeasureSpec.getMode(j);
        int i1;
        if (l - a(11F) * 2 >= a(500F))
        {
            j = (int)Math.min(l, Math.max(0.40000000000000002D * (double)l, a(400F)));
        } else
        {
            j = l;
        }
        i1 = k - a(11F) - a(36F);
        if (i1 > a(480F))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            if (l - a(11F) * 2 - j < a(100F))
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            i = (int)(0.75D * (double)i1);
        } else
        {
            i = k;
        }
        j = Math.min(j, l);
        i = Math.min(i, k);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000));
        setMeasuredDimension(j, Math.min(super.getMeasuredHeight(), i));
    }
}
