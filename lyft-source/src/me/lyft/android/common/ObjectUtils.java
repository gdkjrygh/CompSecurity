// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


public final class ObjectUtils
{

    public ObjectUtils()
    {
    }

    public static boolean hasAnnotation(Object obj, Class class1)
    {
        return obj.getClass().getAnnotation(class1) != null;
    }
}
