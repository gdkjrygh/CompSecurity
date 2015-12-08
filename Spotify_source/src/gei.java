// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gei
{

    private static final Pattern a = Pattern.compile("([^=&]+)=?([^&]*)&?");

    public static String a(String s, int i)
    {
        String s1;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        if (i == 0)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (i != 1)
            {
                int k = s.length();
                char ac[] = new char[k * i];
                for (int j = 0; j < i; j++)
                {
                    s.getChars(0, k, ac, k * j);
                }

                return new String(ac);
            }
        }
        return s1;
    }

    public static String a(String s, String s1)
    {
        int i = 0;
        Assertion.a(Integer.valueOf(0), Integer.valueOf(s.length() % 2));
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for (; i < s.length(); i += 2)
        {
            bytearrayoutputstream.write(Integer.parseInt(s.substring(i, i + 2), 16) ^ Integer.parseInt(s1.substring(i, i + 2), 16));
        }

        try
        {
            s = new String(bytearrayoutputstream.toByteArray(), "UTF-16");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError();
        }
        return s;
    }

    public static String a(String s, Locale locale)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        }
        s = new StringBuilder(s.toLowerCase(locale));
        int i = 0;
        int j;
        do
        {
            s.replace(i, i + 1, s.substring(i, i + 1).toUpperCase(locale));
            j = s.indexOf(" ", i) + 1;
            if (j <= 0)
            {
                break;
            }
            i = j;
        } while (j < s.length());
        return s.toString();
    }

    public static void a(String s, List list, List list1)
    {
        for (s = a.matcher(s); s.find(); list1.add(Uri.decode(s.group(2))))
        {
            list.add(Uri.decode(s.group(1)));
        }

    }

    public static String b(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(" \u2014 ").append(s1).toString();
    }

}
