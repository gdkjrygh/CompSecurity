// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

// Referenced classes of package com.android.volley.toolbox:
//            c

static class g
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public Map g;

    public static g a(InputStream inputstream)
        throws IOException
    {
        g g1 = new <init>();
        if (com.android.volley.toolbox.c.a(inputstream) != 0x20120504)
        {
            throw new IOException();
        }
        g1.b = com.android.volley.toolbox.c.c(inputstream);
        g1.c = com.android.volley.toolbox.c.c(inputstream);
        if (g1.c.equals(""))
        {
            g1.c = null;
        }
        g1.d = com.android.volley.toolbox.c.b(inputstream);
        g1.e = com.android.volley.toolbox.c.b(inputstream);
        g1.f = com.android.volley.toolbox.c.b(inputstream);
        g1.g = com.android.volley.toolbox.c.d(inputstream);
        return g1;
    }

    public com.android.volley.box.c.a a(byte abyte0[])
    {
        com.android.volley.c.a a1 = new com.android.volley.<init>();
        a1.a = abyte0;
        a1.b = c;
        a1.c = d;
        a1.d = e;
        a1.e = f;
        a1.f = g;
        return a1;
    }

    public boolean a(OutputStream outputstream)
    {
        com.android.volley.toolbox.c.a(outputstream, 0x20120504);
        com.android.volley.toolbox.c.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        String s = "";
_L1:
        try
        {
            com.android.volley.toolbox.c.a(outputstream, s);
            com.android.volley.toolbox.c.a(outputstream, d);
            com.android.volley.toolbox.c.a(outputstream, e);
            com.android.volley.toolbox.c.a(outputstream, f);
            com.android.volley.toolbox.c.a(g, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            n.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        return true;
        s = c;
          goto _L1
    }

    private ()
    {
    }

    public (String s, com.android.volley.c.a a1)
    {
        b = s;
        a = a1.a.length;
        c = a1.b;
        d = a1.c;
        e = a1.d;
        f = a1.e;
        g = a1.f;
    }
}
