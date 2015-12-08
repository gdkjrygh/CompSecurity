// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// Referenced classes of package com.google.a.c:
//            d, b

final class c extends d
{

    final b a;
    private final Charset b;

    private c(b b1, Charset charset)
    {
        a = b1;
        super();
        b = (Charset)ad.a(charset);
    }

    c(b b1, Charset charset, byte byte0)
    {
        this(b1, charset);
    }

    public final Reader a()
    {
        return new InputStreamReader(a.a(), b);
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a.toString()));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 15 + s1.length())).append(s).append(".asCharSource(").append(s1).append(")").toString();
    }
}
