// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;

public final class alr
{

    public final byte a[];
    private volatile int b;

    private alr(byte abyte0[])
    {
        b = 0;
        a = abyte0;
    }

    public static alr a(String s)
    {
        try
        {
            s = new alr(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.", s);
        }
        return s;
    }

    public static alr a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        return new alr(abyte1);
    }

    public final void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(a, i, abyte0, j, k);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof alr))
            {
                return false;
            }
            alr alr1 = (alr)obj;
            int j = a.length;
            if (j != alr1.a.length)
            {
                return false;
            }
            obj = a;
            byte abyte0[] = alr1.a;
            int i = 0;
            while (i < j) 
            {
                if (obj[i] != abyte0[i])
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i = b;
        int k = i;
        if (i == 0)
        {
            byte abyte0[] = a;
            int l = a.length;
            k = 0;
            int j;
            byte byte0;
            for (j = l; k < l; j = byte0 + j * 31)
            {
                byte0 = abyte0[k];
                k++;
            }

            k = j;
            if (j == 0)
            {
                k = 1;
            }
            b = k;
        }
        return k;
    }

    static 
    {
        new alr(new byte[0]);
    }
}
