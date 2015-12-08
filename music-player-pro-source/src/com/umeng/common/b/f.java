// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

// Referenced classes of package com.umeng.common.b:
//            g

public class f
{

    public static int a;

    public f()
    {
    }

    public static String a(byte abyte0[], String s)
        throws UnsupportedEncodingException, DataFormatException
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return null;
        }
        Inflater inflater = new Inflater();
        byte abyte1[] = new byte[100];
        inflater.setInput(abyte0, 0, abyte0.length);
        abyte0 = new StringBuilder();
        do
        {
            if (inflater.needsInput())
            {
                inflater.end();
                return abyte0.toString();
            }
            abyte0.append(new String(abyte1, 0, inflater.inflate(abyte1), s));
        } while (true);
    }

    public static byte[] a(String s, String s1)
        throws IOException
    {
        Deflater deflater;
        if (g.c(s))
        {
            return null;
        }
        deflater = new Deflater();
        deflater.setInput(s.getBytes(s1));
        deflater.finish();
        s = new byte[8192];
        a = 0;
        s1 = new ByteArrayOutputStream();
_L1:
        if (!deflater.finished())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        deflater.end();
        if (s1 != null)
        {
            s1.close();
        }
        return s1.toByteArray();
        int i = deflater.deflate(s);
        a += i;
        s1.write(s, 0, i);
          goto _L1
        s;
_L3:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        s1 = null;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
