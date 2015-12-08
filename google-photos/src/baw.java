// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

public class baw extends qsu
    implements Closeable
{

    public baw(qsw qsw1, bau bau)
    {
        a(qsw1, qsw1.a(), bau);
    }

    public static byte[] a(String s)
    {
        byte abyte0[] = new byte[4];
        if (s != null)
        {
            for (int i = 0; i < Math.min(4, s.length()); i++)
            {
                abyte0[i] = (byte)s.charAt(i);
            }

        }
        return abyte0;
    }

    public final bbt a()
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            baz baz1 = (baz)iterator.next();
            if (baz1 instanceof bbt)
            {
                return (bbt)baz1;
            }
        }

        return null;
    }

    public void close()
    {
        i.close();
    }

    public String toString()
    {
        String s = String.valueOf(i.toString());
        return (new StringBuilder(String.valueOf(s).length() + 7)).append("model(").append(s).append(")").toString();
    }

    static 
    {
        qvb.a(baw);
    }
}
