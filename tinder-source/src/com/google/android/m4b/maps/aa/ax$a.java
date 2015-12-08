// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax

static abstract class <init> extends Enum
    implements f
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/aa/ax$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    static 
    {
        a = new ax.a("KEY") {

            public final Object a(Object obj)
            {
                return ((java.util.Map.Entry)obj).getKey();
            }

        };
        b = new ax.a("VALUE") {

            public final Object a(Object obj)
            {
                return ((java.util.Map.Entry)obj).getValue();
            }

        };
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
