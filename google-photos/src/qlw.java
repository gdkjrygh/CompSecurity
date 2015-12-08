// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class qlw
{

    public volatile int G;

    public qlw()
    {
        G = -1;
    }

    public static final qlw a(qlw qlw1, byte abyte0[])
    {
        return b(qlw1, abyte0, 0, abyte0.length);
    }

    public static final void a(qlw qlw1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = qlp.a(abyte0, 0, j);
            qlw1.a(((qlp) (abyte0)));
            if (((qlp) (abyte0)).a.remaining() != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (qlw qlw1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", qlw1);
        }
    }

    public static final boolean a(qlw qlw1, qlw qlw2)
    {
        boolean flag1 = false;
        boolean flag;
        if (qlw1 == qlw2)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (qlw1 != null)
            {
                flag = flag1;
                if (qlw2 != null)
                {
                    flag = flag1;
                    if (qlw1.getClass() == qlw2.getClass())
                    {
                        int i = qlw1.d();
                        flag = flag1;
                        if (qlw2.d() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            a(qlw1, abyte0, 0, i);
                            a(qlw2, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static final byte[] a(qlw qlw1)
    {
        byte abyte0[] = new byte[qlw1.d()];
        a(qlw1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    private static qlw b(qlw qlw1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = qlo.a(abyte0, 0, j);
            qlw1.a(abyte0);
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (qlw qlw1)
        {
            throw qlw1;
        }
        // Misplaced declaration of an exception variable
        catch (qlw qlw1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return qlw1;
    }

    public int a()
    {
        return 0;
    }

    public abstract qlw a(qlo qlo1);

    public void a(qlp qlp1)
    {
    }

    public qlw c()
    {
        return (qlw)super.clone();
    }

    public Object clone()
    {
        return c();
    }

    public final int d()
    {
        int i = a();
        G = i;
        return i;
    }

    public String toString()
    {
        return b.b(this);
    }
}
