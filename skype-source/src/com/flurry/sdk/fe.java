// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            do, eo

public final class fe
{

    private static final String a = com/flurry/sdk/fe.getSimpleName();

    public fe()
    {
    }

    public static long a(InputStream inputstream, OutputStream outputstream)
        throws IOException
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

    public static String a(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        char ac[] = new char[16];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'a';
        ac[11] = 'b';
        ac[12] = 'c';
        ac[13] = 'd';
        ac[14] = 'e';
        ac[15] = 'f';
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            byte byte1 = (byte)(byte0 & 0xf);
            stringbuilder.append(ac[(byte)((byte0 & 0xf0) >> 4)]);
            stringbuilder.append(ac[byte1]);
        }

        return stringbuilder.toString();
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

    public static boolean a(long l)
    {
        boolean flag = false;
        if (l == 0L || System.currentTimeMillis() <= l)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(Intent intent)
    {
        return com.flurry.sdk.do.a().c().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    public static String b(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            eo.a(5, a, (new StringBuilder("Cannot encode '")).append(s).append("'").toString());
            return "";
        }
        return s1;
    }

    public static boolean b(Intent intent)
    {
        boolean flag = false;
        if (intent != null)
        {
            intent = intent.resolveActivity(com.flurry.sdk.do.a().c());
            flag = com.flurry.sdk.do.a().b().getPackageName().equals(intent.getPackageName());
        }
        return flag;
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
            eo.a(5, a, (new StringBuilder("Cannot decode '")).append(s).append("'").toString());
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
            eo.a(6, a, (new StringBuilder("Unsupported SHA1: ")).append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

    public static String e(String s)
    {
        return s.replace("'", "\\'").replace("\\n", "").replace("\\r", "").replace("\\t", "");
    }

    public static Map f(String s)
    {
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            s = s.split("&");
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                String as[] = s[i].split("=");
                if (!as[0].equals("event"))
                {
                    hashmap.put(c(as[0]), c(as[1]));
                }
            }

        }
        return hashmap;
    }

    public static long g(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L4:
        return l1;
_L2:
        int j = s.length();
        long l = 0x3ffffffffffe5L;
        int i = 0;
        do
        {
            l1 = l;
            if (i >= j)
            {
                continue;
            }
            l1 = s.charAt(i);
            i++;
            l = l1 + l * 31L;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
