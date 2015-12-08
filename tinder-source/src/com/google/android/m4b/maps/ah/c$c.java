// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.y.k;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            c

static abstract class <init> extends Enum
    implements k
{

    public static final b a;
    private static b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/ah/c$c, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    static 
    {
        a = new c.c("IGNORE_TYPE_VARIABLE_OR_WILDCARD") {

            public final boolean a(Object obj)
            {
                obj = (c)obj;
                return !(com.google.android.m4b.maps.ah.c.b(((c) (obj))) instanceof TypeVariable) && !(com.google.android.m4b.maps.ah.c.b(((c) (obj))) instanceof WildcardType);
            }

        };
        b = new c.c("INTERFACE_ONLY") {

            public final boolean a(Object obj)
            {
                return com.google.android.m4b.maps.ah.c.c(((c)obj).a).isInterface();
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
