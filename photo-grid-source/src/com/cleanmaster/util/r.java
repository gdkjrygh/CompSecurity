// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import java.lang.reflect.Method;

public class r
{

    public static String a(String s)
    {
        try
        {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
                java/lang/String
            }).invoke(null, new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }
}
