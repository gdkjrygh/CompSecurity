// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.taplytics:
//            wildebeast, ax, hx, a

public final class ie
{

    private static final char f[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    String a;
    wildebeast b;
    String c;
    Charset d;
    List e;

    ie()
    {
        a = "form-data";
        b = wildebeast.a;
        c = null;
        d = null;
        e = null;
    }

    public static ie a()
    {
        return new ie();
    }

    static String a(String s, String s1, Charset charset)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("multipart/").append(s1).append("; boundary=");
        stringbuilder.append(s);
        if (charset != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(charset.name());
        }
        return stringbuilder.toString();
    }

    static String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Random random = new Random();
        int j = random.nextInt(11);
        for (int i = 0; i < j + 30; i++)
        {
            stringbuilder.append(f[random.nextInt(f.length)]);
        }

        return stringbuilder.toString();
    }

    public final ie a(String s, a a1)
    {
        ax.a(s, "Name");
        ax.a(a1, "Content body");
        s = new hx(s, a1);
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(s);
        return this;
    }

}
