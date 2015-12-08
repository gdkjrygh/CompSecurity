// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public final class Objects
{
    public static final class ToStringHelper
    {

        private final com.google.api.client.repackaged.com.google.common.base.ToStringHelper wrapped;

        public ToStringHelper add(String s, Object obj)
        {
            wrapped.add(s, obj);
            return this;
        }

        public ToStringHelper omitNullValues()
        {
            wrapped.omitNullValues();
            return this;
        }

        public String toString()
        {
            return wrapped.toString();
        }

        ToStringHelper(com.google.api.client.repackaged.com.google.common.base.ToStringHelper tostringhelper)
        {
            wrapped = tostringhelper;
        }
    }


    private Objects()
    {
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return com.google.api.client.repackaged.com.google.common.base.Objects.equal(obj, obj1);
    }

    public static ToStringHelper toStringHelper(Object obj)
    {
        return new ToStringHelper(com.google.api.client.repackaged.com.google.common.base.Objects.toStringHelper(obj));
    }
}
