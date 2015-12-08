// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.a;

import com.android.volley.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.volley.a:
//            c

static final class h
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    public static h a(InputStream inputstream)
        throws IOException
    {
        h h1 = new <init>();
        if (com.android.volley.a.c.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        h1.b = com.android.volley.a.c.c(inputstream);
        h1.c = com.android.volley.a.c.c(inputstream);
        if (h1.c.equals(""))
        {
            h1.c = null;
        }
        h1.d = com.android.volley.a.c.b(inputstream);
        h1.e = com.android.volley.a.c.b(inputstream);
        h1.f = com.android.volley.a.c.b(inputstream);
        h1.g = com.android.volley.a.c.b(inputstream);
        h1.h = com.android.volley.a.c.d(inputstream);
        return h1;
    }

    public final boolean a(OutputStream outputstream)
    {
        com.android.volley.a.c.a(outputstream, 0x20150306);
        com.android.volley.a.c.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.Entry entry;
        try
        {
            com.android.volley.a.c.a(outputstream, ((String) (obj)));
            com.android.volley.a.c.a(outputstream, d);
            com.android.volley.a.c.a(outputstream, e);
            com.android.volley.a.c.a(outputstream, f);
            com.android.volley.a.c.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            l.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        com.android.volley.a.c.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); com.android.volley.a.c.a(outputstream, (String)entry.getValue()))
        {
            entry = (java.util.Entry)((Iterator) (obj)).next();
            com.android.volley.a.c.a(outputstream, (String)entry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        com.android.volley.a.c.a(outputstream, 0);
        outputstream.flush();
        return true;
    }

    private ()
    {
    }

    public (String s, com.android.volley.a a1)
    {
        b = s;
        a = a1.a.length;
        c = a1.b;
        d = a1.c;
        e = a1.d;
        f = a1.e;
        g = a1.f;
        h = a1.g;
    }
}
