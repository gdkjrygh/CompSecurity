// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import java.util.Random;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

public static abstract class <init> extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Strategy, s);
    }

    public static <init>[] values()
    {
        return (<init>[])e.clone();
    }

    abstract float a(int i, int j);

    static 
    {
        a = new LayoutCostMeter.Strategy("LINEAR") {

            final float a(int i, int j)
            {
                return (1.0F * (float)i) / (float)j;
            }

        };
        b = new LayoutCostMeter.Strategy("REVERSE") {

            final float a(int i, int j)
            {
                return (1.0F * (float)(j - i - 1)) / (float)j;
            }

        };
        c = new LayoutCostMeter.Strategy("BUTTERFLY") {

            final float a(int i, int j)
            {
                LayoutCostMeter.Strategy strategy;
                if (i % 2 == 0)
                {
                    strategy = b;
                } else
                {
                    strategy = a;
                }
                return strategy.a(i, j * 2);
            }

        };
        d = new LayoutCostMeter.Strategy("RANDOM") {

            final Random e = new Random(0L);

            final float a(int i, int j)
            {
                return e.nextFloat();
            }

        };
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
