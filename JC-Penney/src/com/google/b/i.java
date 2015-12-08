// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public abstract class i
{

    private final int a;
    private final int b;

    protected i(int j, int k)
    {
        a = j;
        b = k;
    }

    public abstract byte[] a();

    public abstract byte[] a(int j, byte abyte0[]);

    public final int b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }

    public boolean d()
    {
        return false;
    }

    public i e()
    {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString()
    {
        byte abyte0[] = new byte[a];
        StringBuilder stringbuilder = new StringBuilder(b * (a + 1));
        for (int j = 0; j < b; j++)
        {
            abyte0 = a(j, abyte0);
            int k = 0;
            while (k < a) 
            {
                int l = abyte0[k] & 0xff;
                char c1;
                if (l < 64)
                {
                    c1 = '#';
                } else
                if (l < 128)
                {
                    c1 = '+';
                } else
                if (l < 192)
                {
                    c1 = '.';
                } else
                {
                    c1 = ' ';
                }
                stringbuilder.append(c1);
                k++;
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }
}
