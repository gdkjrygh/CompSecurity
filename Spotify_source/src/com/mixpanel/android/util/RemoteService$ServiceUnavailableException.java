// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;


public class mRetryAfter extends Exception
{

    public final int mRetryAfter;

    public I(String s, String s1)
    {
        super(s);
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            i = 0;
        }
        mRetryAfter = i;
    }
}
