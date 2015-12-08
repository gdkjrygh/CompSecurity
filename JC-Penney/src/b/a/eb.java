// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package b.a:
//            eu

public final class eb
{

    private String a;
    private String b;

    public eb(String s, String s1)
    {
        s.endsWith("/");
        s1.startsWith("/");
        a = s;
        b = s1;
    }

    public final URL a()
    {
        URL url;
        try
        {
            url = new URL((new StringBuilder()).append(a).append(b).toString());
        }
        catch (MalformedURLException malformedurlexception)
        {
            (new StringBuilder("Invalid url: ")).append(a).append(b);
            eu.b();
            return null;
        }
        return url;
    }
}
