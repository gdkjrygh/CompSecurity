// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.google.a.a.a.a.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class b
{

    private static final a a = new a("-._~", false);

    public b()
    {
    }

    public static a.a.c.a a(InputStream inputstream)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        for (inputstream = bufferedreader.readLine(); inputstream != null; inputstream = bufferedreader.readLine())
        {
            stringbuilder.append(inputstream);
        }

        return c(stringbuilder.toString());
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return a.a(s);
        }
    }

    public static void a(String s, String s1)
    {
        if (System.getProperty("debug") != null)
        {
            System.out.println((new StringBuilder()).append("[SIGNPOST] ").append(s).append(": ").append(s1).toString());
        }
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return "";
        }
        try
        {
            s = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
        return s;
    }

    public static a.a.c.a c(String s)
    {
        a.a.c.a a1 = new a.a.c.a();
        if (d(s))
        {
            return a1;
        }
        String as[] = s.split("\\&");
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            s = as[i];
            int k = s.indexOf('=');
            String s1;
            if (k < 0)
            {
                s1 = b(s);
                s = null;
            } else
            {
                s1 = b(s.substring(0, k));
                s = b(s.substring(k + 1));
            }
            a1.a(s1, s);
            i++;
        }
        return a1;
    }

    public static boolean d(String s)
    {
        return s == null || s.length() == 0;
    }

    public static a.a.c.a e(String s)
    {
        a.a.c.a a1 = new a.a.c.a();
        if (s != null && s.startsWith("OAuth "))
        {
            s = s.substring("OAuth ".length()).split(",");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                String as[] = s[i].split("=");
                a1.a(as[0].trim(), as[1].replace("\"", "").trim());
                i++;
            }
        }
        return a1;
    }

}
