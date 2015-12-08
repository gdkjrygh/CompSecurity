// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import com.google.android.libraries.translate.e.c;
import org.apache.http.client.methods.HttpRequestBase;

// Referenced classes of package com.google.android.libraries.translate.core:
//            u

public final class t
{

    public static StringBuilder a()
    {
        return new StringBuilder("https://translate.google.com");
    }

    public static HttpRequestBase a(long l, String s, boolean flag, boolean flag1, boolean flag2)
    {
        c c1 = u.a("g", flag2);
        if (l > 0L)
        {
            c1.b("ts", String.valueOf(l));
        }
        u.a(c1, s);
        if (flag)
        {
            c1.b("io", "1");
        }
        if (flag1)
        {
            c1.b("io", "2");
        }
        return c1.a(false);
    }
}
