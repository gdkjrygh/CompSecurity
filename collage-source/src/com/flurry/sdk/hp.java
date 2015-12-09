// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Looper;
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
//            fp, gd

public final class hp
{

    private static final String a = com/flurry/sdk/hp.getSimpleName();

    public hp()
    {
    }

    public static double a(double d1, int j)
    {
        return (double)Math.round(Math.pow(10D, j) * d1) / Math.pow(10D, j);
    }

    public static long a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        long l = 0L;
        do
        {
            int j = inputstream.read(abyte0);
            if (j < 0)
            {
                return l;
            }
            outputstream.write(abyte0, 0, j);
            l += j;
        } while (true);
    }

    public static String a(String s)
    {
        Uri uri;
        if (!TextUtils.isEmpty(s))
        {
            if ((uri = Uri.parse(s)) != null && uri.getScheme() == null)
            {
                return (new StringBuilder()).append("http://").append(s).toString();
            }
        }
        return s;
    }

    public static String a(String s, int j)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (s.length() > j)
            {
                return s.substring(0, j);
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
        int k = abyte0.length;
        for (int j = 0; j < k; j++)
        {
            byte byte0 = abyte0[j];
            byte byte1 = (byte)(byte0 & 0xf);
            stringbuilder.append(ac[(byte)((byte0 & 0xf0) >> 4)]);
            stringbuilder.append(ac[byte1]);
        }

        return stringbuilder.toString();
    }

    public static void a()
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            throw new IllegalStateException("Must be called from the main thread!");
        } else
        {
            return;
        }
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
        return fp.a().e().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    public static String b(String s)
    {
        return a(s, 255);
    }

    public static String b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new String(abyte0, "ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gd.a(5, a, (new StringBuilder()).append("Unsupported ISO-8859-1:").append(abyte0.getMessage()).toString());
            return null;
        }
        return abyte0;
    }

    public static void b()
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            throw new IllegalStateException("Must be called from a background thread!");
        } else
        {
            return;
        }
    }

    public static String c(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            gd.a(5, a, (new StringBuilder()).append("Cannot encode '").append(s).append("'").toString());
            return "";
        }
        return s1;
    }

    public static String d(String s)
    {
        String s1;
        try
        {
            s1 = URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            gd.a(5, a, (new StringBuilder()).append("Cannot decode '").append(s).append("'").toString());
            return "";
        }
        return s1;
    }

    public static byte[] e(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            s = s.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gd.a(5, a, (new StringBuilder()).append("Unsupported UTF-8: ").append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

    public static byte[] f(String s)
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
            gd.a(6, a, (new StringBuilder()).append("Unsupported SHA1: ").append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

    public static String g(String s)
    {
        return s.replace("'", "\\'").replace("\\n", "").replace("\\r", "").replace("\\t", "");
    }

    public static Map h(String s)
    {
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            s = s.split("&");
            int k = s.length;
            for (int j = 0; j < k; j++)
            {
                String as[] = s[j].split("=");
                if (!as[0].equals("event"))
                {
                    hashmap.put(d(as[0]), d(as[1]));
                }
            }

        }
        return hashmap;
    }

    public static long i(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        long l1 = 0L;
_L4:
        return l1;
_L2:
        int k = s.length();
        long l = 0x3ffffffffffe5L;
        int j = 0;
        do
        {
            l1 = l;
            if (j >= k)
            {
                continue;
            }
            l1 = s.charAt(j);
            j++;
            l = l1 + l * 31L;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
