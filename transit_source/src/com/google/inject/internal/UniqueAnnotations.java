// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicInteger;

public class UniqueAnnotations
{
    static interface Internal
        extends Annotation
    {

        public abstract int value();
    }


    private static final AtomicInteger nextUniqueValue = new AtomicInteger(1);

    private UniqueAnnotations()
    {
    }

    public static Annotation create()
    {
        return create(nextUniqueValue.getAndIncrement());
    }

    static Annotation create(int i)
    {
        return new Internal(i) {

            final int val$value;

            public Class annotationType()
            {
                return com/google/inject/internal/UniqueAnnotations$Internal;
            }

            public boolean equals(Object obj)
            {
                return (obj instanceof Internal) && ((Internal)obj).value() == value();
            }

            public int hashCode()
            {
                return "value".hashCode() * 127 ^ value;
            }

            public String toString()
            {
                return (new StringBuilder()).append("@").append(com/google/inject/internal/UniqueAnnotations$Internal.getName()).append("(value=").append(value).append(")").toString();
            }

            public int value()
            {
                return value;
            }

            
            {
                value = i;
                super();
            }
        };
    }

}
