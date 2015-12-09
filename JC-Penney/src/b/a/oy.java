// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class oy
{

    final byte a[];
    final int b;
    public final int c;

    public oy(byte abyte0[])
    {
        this(abyte0, abyte0.length);
    }

    private oy(byte abyte0[], int i)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("bytes == null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("end < start");
        }
        if (i > abyte0.length)
        {
            throw new IllegalArgumentException("end > bytes.length");
        } else
        {
            a = abyte0;
            b = 0;
            c = i + 0;
            return;
        }
    }
}
