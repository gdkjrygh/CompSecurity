// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.a.b;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.microsoft.onlineid.sts:
//            n

public static final class g extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private final b c;

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/microsoft/onlineid/sts/n$d, s);
    }

    public static g[] values()
    {
        return (g[])d.clone();
    }

    public final b a()
    {
        return c;
    }

    static 
    {
        a = new <init>("Production", 0, "production", "https://go.microsoft.com/fwlink/?LinkId=398559");
        b = new <init>("Int", 1, "int", "https://go.microsoft.com/fwlink/?LinkId=398560");
        d = (new d[] {
            a, b
        });
    }

    private .a.b(String s, int i, String s1, String s2)
    {
        super(s, i);
        try
        {
            c = new b(s1, new URL(s2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid known environment URL: ")).append(s2).toString());
        }
    }
}
