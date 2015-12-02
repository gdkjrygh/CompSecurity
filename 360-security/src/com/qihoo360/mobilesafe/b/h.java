// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Intent;

public class h
{

    public static int a(Intent intent, String s, int i)
    {
        if (intent == null)
        {
            return i;
        }
        int j;
        try
        {
            j = intent.getIntExtra(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
            return i;
        }
        return j;
    }

    public static String a(Intent intent, String s, String s1)
    {
        if (intent == null)
        {
            return s1;
        }
        try
        {
            intent = intent.getStringExtra(s);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent.printStackTrace();
            return s1;
        }
        return intent;
    }
}
