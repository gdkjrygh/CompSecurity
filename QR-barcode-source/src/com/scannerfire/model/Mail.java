// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;


public class Mail
{

    private static String email;

    public Mail()
    {
    }

    public static Mail getMailFromString(String s)
    {
        Mail mail = new Mail();
        if (s.startsWith("mailto:"))
        {
            email = s.substring(7);
        }
        return mail;
    }

    public static String getString()
    {
        return email;
    }
}
