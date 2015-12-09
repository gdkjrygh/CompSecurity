// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ajf
{

    public String a;
    public String b;
    public Boolean c;

    public ajf(String s, String s1, Boolean boolean1)
    {
        a = s;
        b = s1;
        c = boolean1;
    }

    private static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = s.length(); i < j; i++)
        {
            char c1 = Character.toLowerCase(s.charAt(i));
            if (c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 == '_' || c1 == '-' || c1 == '.')
            {
                stringbuilder.append(c1);
            }
        }

        return stringbuilder.toString();
    }

    public final String a()
    {
        Object obj;
        String s;
        obj = new StringBuilder();
        if (a == null || b == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s = a(a);
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        ((StringBuilder) (obj)).append("&").append(s).append("=").append(URLEncoder.encode(b, "UTF-8").replace("+", "%20"));
        obj = ((StringBuilder) (obj)).toString();
        return ((String) (obj));
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        return "";
    }
}
