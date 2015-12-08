// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class BooleanUtils
{

    public static boolean isNotTrue(Boolean boolean1)
    {
        return !isTrue(boolean1);
    }

    public static boolean isTrue(Boolean boolean1)
    {
        return Boolean.TRUE.equals(boolean1);
    }
}
