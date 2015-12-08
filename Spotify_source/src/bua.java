// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class bua
{

    private int a;

    protected bua(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 25)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag, "cert hash data has incorrect length");
        a = Arrays.hashCode(abyte0);
    }

    protected static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    abstract byte[] a();

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof bua))
        {
            return false;
        } else
        {
            obj = (bua)obj;
            return Arrays.equals(a(), ((bua) (obj)).a());
        }
    }

    public int hashCode()
    {
        return a;
    }
}
