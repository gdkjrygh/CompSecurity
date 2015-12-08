// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.os.Debug;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

public static abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Trace, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    public abstract void a();

    public abstract void a(String s);

    public abstract void b();

    static 
    {
        a = new LayoutCostMeter.Trace("NONE") {

            public final void a()
            {
            }

            public final void a(String s)
            {
            }

            public final void b()
            {
            }

        };
        b = new LayoutCostMeter.Trace("INSTRUMENT") {

            public final void a()
            {
                Debug.stopMethodTracing();
            }

            public final void a(String s)
            {
                Debug.startMethodTracing(s);
            }

            public final void b()
            {
                Debug.stopMethodTracing();
            }

        };
        c = new LayoutCostMeter.Trace("SAMPLE") {

            public final void a()
            {
                Debug.stopMethodTracing();
            }

            public final void a(String s)
            {
                Debug.startMethodTracingSampling(s, 0x1000000, 100);
            }

            public final void b()
            {
                Debug.stopMethodTracing();
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
