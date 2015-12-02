// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import java.io.PrintWriter;
import java.io.StringWriter;

public class c
{

    public c()
    {
    }

    public static String a(Throwable throwable)
    {
        if (throwable == null)
        {
            return "";
        } else
        {
            StringWriter stringwriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringwriter));
            return stringwriter.toString();
        }
    }
}
