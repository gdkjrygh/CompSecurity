// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.SystemClock;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

// Referenced classes of package com.nuance.b.b:
//            fr

final class gl
{

    private static final long a = SystemClock.elapsedRealtime();
    private static final boolean b;

    static int a(String s, String s1)
    {
        int ai[];
        int ai1[];
        int i;
        boolean flag;
        flag = false;
        s = s.split("[\\-\\+]", 2);
        s1 = s1.split("[\\-\\+]", 2);
        ai = b(s[0]);
        ai1 = b(s1[0]);
        i = 0;
_L9:
        if (i >= ai.length && i >= ai1.length) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        if (i < ai.length)
        {
            j = ai[i];
        } else
        {
            j = 0;
        }
        if (i < ai1.length)
        {
            k = ai1[i];
        } else
        {
            k = 0;
        }
        if (j <= k) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        return i;
_L4:
        if (k > j)
        {
            return -1;
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (1 < s.length && 1 == s1.length)
        {
            return 1;
        }
        i = ((flag) ? 1 : 0);
        if (1 != s.length) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (1 >= s1.length) goto _L6; else goto _L7
_L7:
        return -1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static String a(InputStreamReader inputstreamreader)
    {
        inputstreamreader = new BufferedReader(inputstreamreader, 4096);
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            String s = inputstreamreader.readLine();
            if (s != null)
            {
                stringbuilder.append(s);
            } else
            {
                inputstreamreader.close();
                return stringbuilder.toString();
            }
        } while (true);
    }

    static String a(String s)
    {
        Pattern pattern = Pattern.compile("([^<]*)</?[^>]*>(.*)$");
        for (Object obj = null; !s.equalsIgnoreCase(((String) (obj)));)
        {
            obj = pattern.matcher(s);
            if (((Matcher) (obj)).find())
            {
                obj = (new StringBuilder()).append(((Matcher) (obj)).group(1)).append(((Matcher) (obj)).group(2)).toString();
                if (b)
                {
                    String s1 = ((String) (obj));
                    obj = s;
                    s = s1;
                } else
                {
                    Object obj1 = obj;
                    obj = s;
                    s = ((String) (obj1));
                }
            } else
            {
                obj = s;
            }
        }

        return s.trim();
    }

    public static String a(byte abyte0[])
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            obj = MessageDigest.getInstance("SHA-1");
            ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
            abyte0 = ((MessageDigest) (obj)).digest();
            obj = new StringBuilder();
            l = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            fr.a((new StringBuilder("Exception getting sha1 for password. ")).append(abyte0).toString());
            return "";
        }
        i = 0;
          goto _L1
_L5:
        if (k < 0 || k > 9) goto _L3; else goto _L2
_L2:
        ((StringBuilder) (obj)).append((char)(k + 48));
          goto _L4
_L3:
        ((StringBuilder) (obj)).append((char)((k - 10) + 97));
          goto _L4
_L7:
        abyte0 = ((StringBuilder) (obj)).toString().toLowerCase(Locale.US);
        return abyte0;
_L9:
        int j;
        byte byte0;
        j++;
        k = byte0 & 0xf;
          goto _L5
_L1:
        if (i >= l) goto _L7; else goto _L6
_L6:
        byte0 = abyte0[i];
        k = byte0 >>> 4 & 0xf;
        j = 0;
          goto _L5
_L4:
        if (j <= 0) goto _L9; else goto _L8
_L8:
        i++;
          goto _L1
    }

    static List a(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            return null;
        }
        if (jsonarray == null)
        {
            jsonarray = null;
        } else
        {
            String as[] = new String[jsonarray.length()];
            for (int i = 0; i < as.length; i++)
            {
                as[i] = jsonarray.optString(i, null);
            }

            jsonarray = as;
        }
        return Arrays.asList(jsonarray);
    }

    static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
        fr.a((new StringBuilder("Exception closing OutputStream: ")).append(outputstream.toString()).toString());
        return;
    }

    static void a(Reader reader)
    {
        if (reader == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        reader.close();
        return;
        reader;
        fr.a((new StringBuilder("Exception closing Reader: ")).append(reader.toString()).toString());
        return;
    }

    static void a(Throwable throwable)
    {
        if (b)
        {
            throwable.printStackTrace();
        }
    }

    static boolean a()
    {
        return b;
    }

    static long b()
    {
        return SystemClock.elapsedRealtime() - a;
    }

    private static int[] b(String s)
    {
        s = s.split("\\.");
        int ai[] = new int[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ai[i] = Integer.valueOf(s[i]).intValue();
        }

        return ai;
    }

    static 
    {
        boolean flag;
        try
        {
            java.io.InputStream inputstream = Thread.currentThread().getContextClassLoader().getResourceAsStream("nina_core.properties");
            Properties properties = new Properties();
            properties.load(inputstream);
            flag = Boolean.parseBoolean(properties.getProperty("debug_mode"));
        }
        catch (Exception exception)
        {
            flag = false;
        }
        b = flag;
    }
}
