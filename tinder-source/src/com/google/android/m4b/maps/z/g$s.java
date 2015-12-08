// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.e;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

public static abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static b c;
    private static final b d[];

    public static <init> valueOf(String s1)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/z/g$s, s1);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract e a();

    abstract  a( ,  1, Object obj);

    static 
    {
        a = new g.s("STRONG") {

            final e a()
            {
                return com.google.android.m4b.maps.y.e.a.a;
            }

            final g.ai a(g.q q, g.aa aa, Object obj)
            {
                return new g.af(obj);
            }

        };
        c = new g.s("SOFT") {

            final e a()
            {
                return com.google.android.m4b.maps.y.e.b.a;
            }

            final g.ai a(g.q q, g.aa aa, Object obj)
            {
                return new g.ab(q.f, obj, aa);
            }

        };
        b = new g.s("WEAK") {

            final e a()
            {
                return com.google.android.m4b.maps.y.e.b.a;
            }

            final g.ai a(g.q q, g.aa aa, Object obj)
            {
                return new g.g(q.f, obj, aa);
            }

        };
        d = (new d[] {
            a, c, b
        });
    }

    private _cls3(String s1, int i)
    {
        super(s1, i);
    }

    _cls3(String s1, int i, byte byte0)
    {
        this(s1, i);
    }
}
