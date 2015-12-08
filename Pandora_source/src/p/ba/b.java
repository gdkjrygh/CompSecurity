// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;


public class b
{

    private byte a;
    private int b;
    private int c;
    private int d;
    private byte e[];
    private byte f[];

    public b()
    {
    }

    public static b a(byte abyte0[])
    {
        b b1 = new b();
        b1.a((byte)(abyte0[0] >>> 4));
        b1.a(p.bn.b.a(abyte0, 0) & 0xfffffff);
        b1.b(p.bn.b.a(abyte0, 4));
        int i = p.bn.b.a(abyte0, 8);
        b1.c(i);
        if (i > 0)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 12, abyte1, 0, i);
            b1.b(abyte1);
        }
        if (abyte0.length - i - 12 > 0)
        {
            byte abyte2[] = new byte[abyte0.length - i - 12];
            System.arraycopy(abyte0, i + 12, abyte2, 0, abyte2.length);
            b1.c(abyte2);
        }
        return b1;
    }

    public void a(byte byte0)
    {
        a = byte0;
    }

    public void a(int i)
    {
        b = i;
    }

    protected byte[] a()
    {
        int i = b;
        byte byte0 = a;
        byte abyte0[] = new byte[12];
        System.arraycopy(p.bn.b.a(i & 0xfffffff | byte0 << 28), 0, abyte0, 0, 4);
        System.arraycopy(p.bn.b.a(c), 0, abyte0, 4, 4);
        System.arraycopy(p.bn.b.a(d), 0, abyte0, 8, 4);
        return abyte0;
    }

    public byte b()
    {
        return a;
    }

    public void b(int i)
    {
        c = i;
    }

    public void b(byte abyte0[])
    {
        e = new byte[d];
        System.arraycopy(abyte0, 0, e, 0, d);
    }

    public int c()
    {
        return b;
    }

    public void c(int i)
    {
        d = i;
    }

    public void c(byte abyte0[])
    {
        f = abyte0;
    }

    public int d()
    {
        return c;
    }

    public int e()
    {
        return d;
    }

    public byte[] f()
    {
        return e;
    }

    public byte[] g()
    {
        return f;
    }
}
