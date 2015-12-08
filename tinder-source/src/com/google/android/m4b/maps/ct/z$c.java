// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            z, e

static abstract class <init> extends Enum
{

    public static final c a;
    public static final c b;
    private static c c;
    private static final c d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/ct/z$c, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract Object a(e e);

    static 
    {
        a = new z.c("LOOSE") {

            final Object a(e e1)
            {
                return e1.b();
            }

        };
        b = new z.c("STRICT") {

            final Object a(e e1)
            {
                return e1.c();
            }

        };
        c = new z.c("LAZY") {

            final Object a(e e1)
            {
                return e1.d();
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
