// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.debugdialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberPicker extends FrameLayout
{

    private float a;
    private float b;
    private SeekBar c;
    private TextView d;

    public NumberPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        new Object() {

        };
        b();
    }

    public NumberPicker(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        new _cls1();
        b();
    }

    static float a(NumberPicker numberpicker)
    {
        return numberpicker.d();
    }

    static TextView b(NumberPicker numberpicker)
    {
        return numberpicker.d;
    }

    private void b()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0300cc, this, true);
        c = (SeekBar)findViewById(0x7f110401);
        d = (TextView)findViewById(0x7f1102aa);
        findViewById(0x7f11026e);
        a = 1.0F;
        b = 0.01F;
        int i = (int)(a / b);
        c.setMax(i);
        a();
        c.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

            private NumberPicker a;

            public final void onProgressChanged(SeekBar seekbar, int j, boolean flag)
            {
                a.a();
                if (flag)
                {
                    NumberPicker.a(a);
                }
            }

            public final void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public final void onStopTrackingTouch(SeekBar seekbar)
            {
            }

            
            {
                a = NumberPicker.this;
                super();
            }
        });
        d.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            private NumberPicker a;

            public final boolean onPreDraw()
            {
                NumberPicker.b(a).getViewTreeObserver().removeOnPreDrawListener(this);
                a.a();
                return true;
            }

            
            {
                a = NumberPicker.this;
                super();
            }
        });
    }

    private float c()
    {
        return (float)c.getProgress() / (float)c.getMax();
    }

    private float d()
    {
        return a * c() + 0.0F;
    }

    final void a()
    {
        d.setText(String.format("%.2f", new Object[] {
            Float.valueOf(d())
        }));
        int i = c.getLeft();
        int j = c.getThumbOffset();
        int k = c.getMeasuredWidth();
        int l = c.getThumbOffset();
        int i1 = d.getWidth() / 2;
        i = (int)(((float)(i + j) + (float)(k - (l << 1)) * c()) - (float)i1);
        d.setX(i);
    }
}
