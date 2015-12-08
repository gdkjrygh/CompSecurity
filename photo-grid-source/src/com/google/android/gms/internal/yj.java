// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            be, yi, xv

final class yj
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    private yj()
    {
    }

    public yj(String s, be be1)
    {
        b = s;
        a = be1.a.length;
        c = be1.b;
        d = be1.c;
        e = be1.d;
        f = be1.e;
        g = be1.f;
        h = be1.g;
    }

    public static yj a(InputStream inputstream)
    {
        yj yj1 = new yj();
        if (yi.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        yj1.b = yi.c(inputstream);
        yj1.c = yi.c(inputstream);
        if (yj1.c.equals(""))
        {
            yj1.c = null;
        }
        yj1.d = yi.b(inputstream);
        yj1.e = yi.b(inputstream);
        yj1.f = yi.b(inputstream);
        yj1.g = yi.b(inputstream);
        yj1.h = yi.d(inputstream);
        return yj1;
    }

    public final boolean a(OutputStream outputstream)
    {
        yi.a(outputstream, 0x20150306);
        yi.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.Map.Entry entry;
        try
        {
            yi.a(outputstream, ((String) (obj)));
            yi.a(outputstream, d);
            yi.a(outputstream, e);
            yi.a(outputstream, f);
            yi.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            xv.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        yi.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); yi.a(outputstream, (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            yi.a(outputstream, (String)entry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        yi.a(outputstream, 0);
        outputstream.flush();
        return true;
    }
}
