// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.UnsupportedEncodingException;

public class cu extends fu
    implements Closeable
{

    public cu(fv fv1, cs cs)
    {
        initContainer(fv1, fv1.size(), cs);
    }

    public static String a(byte abyte0[])
    {
        byte abyte1[] = new byte[4];
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(4, 4));
        try
        {
            abyte0 = new String(abyte1, "ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new Error("Required character encoding is missing", abyte0);
        }
        return abyte0;
    }

    public static byte[] a(String s)
    {
        byte abyte0[] = new byte[4];
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < Math.min(4, s.length())) goto _L3; else goto _L2
_L2:
        return abyte0;
_L3:
        abyte0[i] = (byte)s.charAt(i);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void close()
    {
        dataSource.close();
    }

    public String toString()
    {
        return (new StringBuilder("model(")).append(dataSource.toString()).append(")").toString();
    }

    static 
    {
        fK.a(cu);
    }
}
