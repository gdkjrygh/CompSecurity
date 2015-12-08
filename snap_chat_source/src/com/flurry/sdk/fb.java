// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.flurry.sdk:
//            el

public final class fb
{

    private static final String a = com/flurry/sdk/fb.getSimpleName();

    public fb()
    {
    }

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i >= 0)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static String a(String s)
    {
        return a(s, 255);
    }

    public static String a(String s, int i)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (s.length() > i)
            {
                return s.substring(0, i);
            }
        }
        return s1;
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static String c(String s)
    {
        String s1;
        try
        {
            s1 = URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            el.a(5, a, (new StringBuilder("Cannot decode '")).append(s).append("'").toString());
            return "";
        }
        return s1;
    }

    public static byte[] d(String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.update(s.getBytes(), 0, s.length());
            s = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            el.a(6, a, (new StringBuilder("Unsupported SHA1: ")).append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

}
