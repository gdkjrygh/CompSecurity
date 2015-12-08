// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.a;


public final class a
{

    private static final ThreadLocal a = new ThreadLocal();
    private final int b = 37;
    private int c;

    public a()
    {
        c = 0;
        c = 17;
    }

    public final a a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            c = c * b;
        } else
        {
            int j = abyte0.length;
            int i = 0;
            while (i < j) 
            {
                c = abyte0[i] + c * b;
                i++;
            }
        }
        return this;
    }

    public final int hashCode()
    {
        return c;
    }

}
