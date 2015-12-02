// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import java.util.Locale;

public class m
{

    public m()
    {
    }

    public static final String a(String s)
    {
        return s.toLowerCase(Locale.US);
    }

    public static final transient String a(String s, Object aobj[])
    {
        return String.format((Locale)null, s, aobj);
    }

    public static final transient String b(String s, Object aobj[])
    {
        return String.format(Locale.getDefault(), s, aobj);
    }
}
