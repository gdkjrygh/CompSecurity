// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a.a;

import java.nio.charset.Charset;

public final class b
{

    public static final Charset a = Charset.forName("utf-8");
    public static final Charset b = Charset.forName("utf-16le");

    public static byte[] a(String s)
    {
        return s.getBytes(a);
    }

}
