// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import okio.ByteString;
import okio.b;

public final class l
{

    public static String a(String s, String s1)
    {
        try
        {
            s = b.a(ByteString.a((new StringBuilder()).append(s).append(":").append(s1).toString().getBytes("ISO-8859-1")).c);
            s = (new StringBuilder("Basic ")).append(s).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError();
        }
        return s;
    }
}
