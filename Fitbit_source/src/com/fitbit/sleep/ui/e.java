// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.style.TextAppearanceSpan;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.savedstate.r;
import java.util.Date;

class e
{

    private TextView a;
    private TextView b;
    private Button c;
    private ImageView d;
    private ImageView e;
    private TextView f;

    public e()
    {
    }

    public void a(Activity activity)
    {
        b = (TextView)activity.findViewById(0x7f1101b9);
        a = (TextView)activity.findViewById(0x7f1101b8);
        f = (TextView)activity.findViewById(0x7f1101bb);
        c = (Button)activity.findViewById(0x7f1101ba);
        d = (ImageView)activity.findViewById(0x7f1101b6);
        e = (ImageView)activity.findViewById(0x7f1101b7);
        b.setText(activity.getString(0x7f08035f).toUpperCase());
    }

    public void a(Context context)
    {
        Date date = r.l();
        Object obj1 = r.m();
        Object obj = obj1;
        if (((Date) (obj1)).getTime() == 0L)
        {
            obj = new Date();
        }
        int i = Math.round((((Date) (obj)).getTime() - date.getTime()) / 60000L);
        obj = new TextAppearanceSpan(context, 0x7f0c0181);
        obj1 = new TextAppearanceSpan(context, 0x7f0c0181);
        a.setText(com.fitbit.util.format.e.a(context, i, new Object[] {
            obj
        }, new Object[] {
            obj1
        }));
    }

    public void a(Context context, boolean flag)
    {
        if (flag)
        {
            android.view.animation.Animation animation = AnimationUtils.loadAnimation(context, 0x10a0001);
            android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(context, 0x10a0000);
            d.setAnimation(animation);
            e.setAnimation(animation1);
        }
        d.setVisibility(8);
        e.setVisibility(0);
        c.setText(0x7f080373);
        c.setTextColor(context.getResources().getColor(0x7f0f014a));
        f.setTextColor(context.getResources().getColor(0x7f0f0149));
        a(context);
    }
}
