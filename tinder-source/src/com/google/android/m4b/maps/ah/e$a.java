// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import java.lang.reflect.ParameterizedType;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            e

static abstract class <init> extends Enum
{
    class a
    {

        a()
        {
        }
    }


    static final a a;
    private static a b;
    private static a c;
    private static final a d[];

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/google/android/m4b/maps/ah/e$a, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    abstract Class a(Class class1);

    static 
    {
        int i = 0;
        b = new e.a("OWNED_BY_ENCLOSING_CLASS") {

            final Class a(Class class1)
            {
                return class1.getEnclosingClass();
            }

        };
        c = new e.a("LOCAL_CLASS_HAS_NO_OWNER") {

            final Class a(Class class1)
            {
                if (class1.isLocalClass())
                {
                    return null;
                } else
                {
                    return class1.getEnclosingClass();
                }
            }

        };
        d = (new d[] {
            b, c
        });
        ParameterizedType parameterizedtype = (ParameterizedType)(new a() {

        }).getClass().getGenericSuperclass();
         a1[] = values();
        for (int j = a1.length; i < j; i++)
        {
              = a1[i];
            if (.a(com/google/android/m4b/maps/ah/e$a$a) == parameterizedtype.getOwnerType())
            {
                a = ;
                return;
            }
        }

        throw new AssertionError();
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
