// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.messaging;

import com.google.android.libraries.wordlens.util.f;

public class a
{

    public int a;
    public byte b[];

    public a(int i)
    {
        a = i;
        b = null;
    }

    protected a(int i, byte abyte0[])
    {
        this(i);
        b = abyte0;
    }

    public String toString()
    {
        if (b != null)
        {
            int i = a;
            String s = f.a(b);
            return (new StringBuilder(String.valueOf(s).length() + 13)).append(i).append(": ").append(s).toString();
        } else
        {
            return Integer.toHexString(a);
        }
    }
}
