// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hb

public abstract class ha
{

    public ha()
    {
    }

    public abstract int a(byte abyte0[], int i, int j);

    public void a(int i)
    {
    }

    public final void a(byte abyte0[])
    {
        b(abyte0, 0, abyte0.length);
    }

    public final int b(byte abyte0[], int i)
    {
        int j;
        int k;
        for (j = 0; j < i; j += k)
        {
            k = a(abyte0, j + 0, i - j);
            if (k <= 0)
            {
                throw new hb((new StringBuilder("Cannot read. Remote side has closed. Tried to read ")).append(i).append(" bytes, but only got ").append(j).append(" bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)").toString(), (byte)0);
            }
        }

        return j;
    }

    public abstract void b(byte abyte0[], int i, int j);

    public byte[] b()
    {
        return null;
    }

    public int c()
    {
        return 0;
    }

    public int d()
    {
        return -1;
    }
}
