// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.Locale;

public final class b
{

    private int a;
    private int b;

    static int a(b b1)
    {
        return b1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    public b a(int i)
    {
        if (i == 0 || i == 2 || i == 1 || i == 3)
        {
            a = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public a a()
    {
        return new a(this, null);
    }

    public a b(int i)
    {
        if (i == 0 || i == 1)
        {
            b = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public ()
    {
        a = 3;
        b = 0;
    }
}
