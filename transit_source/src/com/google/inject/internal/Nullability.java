// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Nullable;
import java.lang.annotation.Annotation;

public class Nullability
{

    private Nullability()
    {
    }

    public static boolean allowsNull(Annotation aannotation[])
    {
        int j = aannotation.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aannotation[i].annotationType();
            if ("Nullable".equals(class1.getSimpleName()) || class1 == com/google/inject/internal/util/$Nullable)
            {
                return true;
            }
        }

        return false;
    }
}
