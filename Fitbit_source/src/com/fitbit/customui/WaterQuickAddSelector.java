// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.util.format.f;
import com.fitbit.water.Water;

public class WaterQuickAddSelector extends LinearLayout
{
    public static interface a
    {

        public abstract void a(Water water);
    }


    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private final float e[] = {
        8F, 16.9F, 24.7F, 34.3F
    };
    private final TextView f = (TextView)findViewById(0x7f11047e);
    private final TextView g = (TextView)findViewById(0x7f11047f);
    private final TextView h = (TextView)findViewById(0x7f110482);
    private final TextView i = (TextView)findViewById(0x7f110483);
    private final TextView j = (TextView)findViewById(0x7f110486);
    private final TextView k = (TextView)findViewById(0x7f110487);
    private final TextView l = (TextView)findViewById(0x7f11048a);
    private final TextView m = (TextView)findViewById(0x7f11048b);
    private a n;

    public WaterQuickAddSelector(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(0x7f0401be, this);
        context = findViewById(0x7f11047c);
        attributeset = findViewById(0x7f110480);
        View view = findViewById(0x7f110484);
        View view1 = findViewById(0x7f110488);
        _cls1 _lcls1 = new _cls1(context, attributeset, view);
        context.setOnClickListener(_lcls1);
        attributeset.setOnClickListener(_lcls1);
        view.setOnClickListener(_lcls1);
        view1.setOnClickListener(_lcls1);
    }

    static float[] a(WaterQuickAddSelector waterquickaddselector)
    {
        return waterquickaddselector.e;
    }

    static a b(WaterQuickAddSelector waterquickaddselector)
    {
        return waterquickaddselector.n;
    }

    public a a()
    {
        return n;
    }

    public void a(a a1)
    {
        n = a1;
    }

    public void a(com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        Water water = new Water(e[0], com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ);
        f.setText(com.fitbit.util.format.f.a(getContext(), water.a(waterunits)));
        g.setText(com.fitbit.util.format.f.b(getContext(), water.a(waterunits)));
        water.a(e[1]);
        h.setText(com.fitbit.util.format.f.a(getContext(), water.a(waterunits)));
        i.setText(com.fitbit.util.format.f.b(getContext(), water.a(waterunits)));
        water.a(e[2]);
        j.setText(com.fitbit.util.format.f.a(getContext(), water.a(waterunits)));
        k.setText(com.fitbit.util.format.f.b(getContext(), water.a(waterunits)));
        water.a(e[3]);
        l.setText(com.fitbit.util.format.f.a(getContext(), water.a(waterunits)));
        m.setText(com.fitbit.util.format.f.b(getContext(), water.a(waterunits)));
    }

    /* member class not found */
    class _cls1 {}

}
