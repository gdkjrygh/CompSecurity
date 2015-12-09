// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ds;


public abstract class a
{

    private int a;

    protected a(int i)
    {
        a = 0;
        a = i;
    }

    protected a(byte abyte0[])
    {
        a = 0;
        a = a(abyte0);
    }

    private int a(byte abyte0[])
    {
        int i = 0;
        int k = a();
        if (abyte0 == null)
        {
            throw new RuntimeException((new StringBuilder()).append("cannot create ").append(getClass().getName()).append(", the byte array is null").toString());
        }
        if (abyte0.length != k)
        {
            throw new RuntimeException((new StringBuilder()).append("cannot create ").append(getClass().getName()).append(", invalid byte array length.  Expected: ").append(k).append(", got: ").append(abyte0.length).toString());
        }
        int j = 0;
        for (; i < k; i++)
        {
            j += (abyte0[i] & 0xff) << (k - 1 - i) * 8;
        }

        return j;
    }

    abstract int a();

    public byte[] b()
    {
        byte abyte0[] = new byte[a()];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0.length;
            abyte0[i] = (byte)(a >>> (j - 1 - i) * 8 & 0xff);
        }

        return abyte0;
    }

    public int c()
    {
        return a;
    }
}
