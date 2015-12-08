// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import com.microsoft.advertising.android.a.e;

public class i extends Exception
{
    public static final class a extends i
    {

        public final String getMessage()
        {
            return "No Ad From Server";
        }

        public a()
        {
            super(e.b);
        }
    }


    private e a;

    public i(e e)
    {
        a = e;
    }

    public i(e e, String s)
    {
        super(s);
        a = e;
    }

    public final e a()
    {
        return a;
    }
}
