// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            k, l

static abstract class <init> extends Enum
    implements k
{

    public static final d a;
    private static d b;
    private static d c;
    private static d d;
    private static final d e[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/y/l$d, s);
    }

    public static <init>[] values()
    {
        return (<init>[])e.clone();
    }

    static 
    {
        b = new l.d("ALWAYS_TRUE") {

            public final boolean a(Object obj)
            {
                return true;
            }

            public final String toString()
            {
                return "Predicates.alwaysTrue()";
            }

        };
        c = new l.d("ALWAYS_FALSE") {

            public final boolean a(Object obj)
            {
                return false;
            }

            public final String toString()
            {
                return "Predicates.alwaysFalse()";
            }

        };
        a = new l.d("IS_NULL") {

            public final boolean a(Object obj)
            {
                return obj == null;
            }

            public final String toString()
            {
                return "Predicates.isNull()";
            }

        };
        d = new l.d("NOT_NULL") {

            public final boolean a(Object obj)
            {
                return obj != null;
            }

            public final String toString()
            {
                return "Predicates.notNull()";
            }

        };
        e = (new e[] {
            b, c, a, d
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
