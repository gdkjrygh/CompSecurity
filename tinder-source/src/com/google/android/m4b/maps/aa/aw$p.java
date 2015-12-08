// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.e;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

static abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    private static c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/aa/aw$p, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract  a(one one, one one1, Object obj);

    abstract e a();

    static 
    {
        a = new aw.p("STRONG") {

            final aw.aa a(aw.m m, aw.s s, Object obj)
            {
                return new aw.y(obj);
            }

            final e a()
            {
                return com.google.android.m4b.maps.y.e.a.a;
            }

        };
        b = new aw.p("SOFT") {

            final aw.aa a(aw.m m, aw.s s, Object obj)
            {
                return new aw.t(m.f, obj, s);
            }

            final e a()
            {
                return com.google.android.m4b.maps.y.e.b.a;
            }

        };
        c = new aw.p("WEAK") {

            final aw.aa a(aw.m m, aw.s s, Object obj)
            {
                return new aw.f(m.f, obj, s);
            }

            final e a()
            {
                return com.google.android.m4b.maps.y.e.b.a;
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
