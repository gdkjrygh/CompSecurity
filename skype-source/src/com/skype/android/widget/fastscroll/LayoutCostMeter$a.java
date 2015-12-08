// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Process;
import android.os.SystemClock;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    public abstract long a();

    static 
    {
        a = new LayoutCostMeter.a("THREAD") {

            public final long a()
            {
                return SystemClock.currentThreadTimeMillis();
            }

        };
        b = new LayoutCostMeter.a("PROCESS") {

            public final long a()
            {
                return Process.getElapsedCpuTime();
            }

        };
        c = new LayoutCostMeter.a("UPTIME") {

            public final long a()
            {
                return SystemClock.uptimeMillis();
            }

        };
        d = (new d[] {
            a, b, c
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
