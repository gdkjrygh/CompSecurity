// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.Type;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            e, a

static abstract class <init> extends Enum
{

    static final a a;
    private static a b;
    private static a c;
    private static final a d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/ah/e$c, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    final ae a(Type atype[])
    {
        com.google.android.m4b.maps.aa.  = ae.g();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            .c(b(atype[i]));
        }

        return .a();
    }

    abstract Type a(Type type);

    abstract Type b(Type type);

    static 
    {
        b = new e.c("JAVA6") {

            final Type a(Type type)
            {
                return new e.b(type);
            }

            final Type b(Type type)
            {
                j.a(type);
                Object obj = type;
                if (type instanceof Class)
                {
                    Class class1 = (Class)type;
                    obj = type;
                    if (class1.isArray())
                    {
                        obj = new e.b(class1.getComponentType());
                    }
                }
                return ((Type) (obj));
            }

        };
        c = new e.c("JAVA7") {

            final Type a(Type type)
            {
                if (type instanceof Class)
                {
                    return e.a((Class)type);
                } else
                {
                    return new e.b(type);
                }
            }

            final Type b(Type type)
            {
                return (Type)j.a(type);
            }

        };
        d = (new d[] {
            b, c
        });
        .a a1;
        if ((new a() {

    }).a() instanceof Class)
        {
            a1 = c;
        } else
        {
            a1 = b;
        }
        a = a1;
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
