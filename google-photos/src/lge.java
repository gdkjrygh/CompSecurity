// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class lge
{

    String a;

    public lge()
    {
        a = "https://www.google-analytics.com";
    }

    static String a(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            lqh.a((new StringBuilder("Cannot encode the string: ")).append(s).toString());
            return "";
        }
        return s1;
    }
}
