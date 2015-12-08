// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            bu

public static abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static b c;
    private static final b d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/aa/bu$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract int a(int i);

    static 
    {
        c = new bu.a("NEXT_LOWER") {

            final int a(int i)
            {
                return i - 1;
            }

        };
        a = new bu.a("NEXT_HIGHER") {

            public final int a(int i)
            {
                return i;
            }

        };
        b = new bu.a("INVERTED_INSERTION_INDEX") {

            public final int a(int i)
            {
                return ~i;
            }

        };
        d = (new d[] {
            c, a, b
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
