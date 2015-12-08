// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.r;
import com.fitbit.util.al;
import com.fitbit.util.format.e;
import com.fitbit.water.Water;

public class TodayWaterItemView extends LinearLayout
{

    protected ImageView a;
    protected TextView b;
    protected TextView c;
    protected TextView d;
    protected View e;
    private int f;
    private int g;
    private double h;
    private double i;
    private com.fitbit.data.domain.WaterLogEntry.WaterUnits j;

    public TodayWaterItemView(Context context, Water water, double d1)
    {
        super(context);
        inflate(context, 0x7f0401b3, this);
        a = (ImageView)findViewById(0x7f11046b);
        b = (TextView)findViewById(0x7f110365);
        c = (TextView)findViewById(0x7f11046a);
        d = (TextView)findViewById(0x7f110367);
        e = findViewById(0x7f11046c);
        i = d1;
        j = r.e();
        h = water.a(j).b();
        f = (int)Math.round(h);
        g = (int)Math.round(d1);
        String s = com.fitbit.util.format.e.b(h);
        water = com.fitbit.util.format.e.b(g);
        String s1 = j.getQuantityDisplayName(s);
        int k;
        if (h == 0.0D)
        {
            water = context.getString(0x7f080587);
            c.setText("");
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(water);
            stringbuilder.append(" ");
            stringbuilder.append(s1);
            water = context.getString(0x7f080586, new Object[] {
                s1, String.format(al.a(), stringbuilder.toString(), new Object[0])
            });
            c.setText(s);
        }
        b.setText(context.getText(0x7f080540));
        d.setText(water);
        context = e;
        if (f >= g)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        context.setVisibility(k);
        a();
    }

    public void a()
    {
        double d1 = i / 4D;
        double d2 = i / 2D;
        a.setImageLevel(0);
        if ((double)f > 0.0D && (double)f < d1)
        {
            a.setImageLevel(25);
        } else
        {
            if ((double)f > d1 && (double)f < d2)
            {
                a.setImageLevel(50);
                return;
            }
            if ((double)f > d2 && (double)f < i)
            {
                a.setImageLevel(75);
                return;
            }
            if ((double)f >= i)
            {
                a.setImageLevel(100);
                return;
            }
        }
    }
}
