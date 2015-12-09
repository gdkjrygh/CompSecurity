// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import com.android.b.ad;
import com.android.b.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

// Referenced classes of package com.android.b.a:
//            d

class f
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    private f()
    {
    }

    public f(String s, c c1)
    {
        b = s;
        a = c1.a.length;
        c = c1.b;
        d = c1.c;
        e = c1.d;
        f = c1.e;
        g = c1.f;
        h = c1.g;
    }

    public static f a(InputStream inputstream)
    {
        f f1 = new f();
        if (com.android.b.a.d.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        f1.b = com.android.b.a.d.c(inputstream);
        f1.c = com.android.b.a.d.c(inputstream);
        if (f1.c.equals(""))
        {
            f1.c = null;
        }
        f1.d = com.android.b.a.d.b(inputstream);
        f1.e = com.android.b.a.d.b(inputstream);
        f1.f = com.android.b.a.d.b(inputstream);
        f1.g = com.android.b.a.d.b(inputstream);
        f1.h = com.android.b.a.d.d(inputstream);
        return f1;
    }

    public c a(byte abyte0[])
    {
        c c1 = new c();
        c1.a = abyte0;
        c1.b = c;
        c1.c = d;
        c1.d = e;
        c1.e = f;
        c1.f = g;
        c1.g = h;
        return c1;
    }

    public boolean a(OutputStream outputstream)
    {
        com.android.b.a.d.a(outputstream, 0x20150306);
        com.android.b.a.d.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        String s = "";
_L1:
        try
        {
            com.android.b.a.d.a(outputstream, s);
            com.android.b.a.d.a(outputstream, d);
            com.android.b.a.d.a(outputstream, e);
            com.android.b.a.d.a(outputstream, f);
            com.android.b.a.d.a(outputstream, g);
            com.android.b.a.d.a(h, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            ad.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        return true;
        s = c;
          goto _L1
    }
}
