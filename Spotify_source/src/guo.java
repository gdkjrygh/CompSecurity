// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;

public final class guo
{

    public static String a(Protocol protocol)
    {
        if (protocol == Protocol.a)
        {
            return "HTTP/1.0";
        } else
        {
            return "HTTP/1.1";
        }
    }

    public static String a(grj grj1)
    {
        int i = grj1.f.indexOf('/', grj1.a.length() + 3);
        int j = grj.a(grj1.f, i, grj1.f.length(), "?#");
        String s = grj1.f.substring(i, j);
        String s1 = grj1.e();
        grj1 = s;
        if (s1 != null)
        {
            grj1 = (new StringBuilder()).append(s).append('?').append(s1).toString();
        }
        return grj1;
    }
}
