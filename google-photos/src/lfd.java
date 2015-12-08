// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class lfd
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    private lfd()
    {
    }

    public lfd(String s, ksw ksw1)
    {
        b = s;
        a = ksw1.a.length;
        c = ksw1.b;
        d = ksw1.c;
        e = ksw1.d;
        f = ksw1.e;
        g = ksw1.f;
        h = ksw1.g;
    }

    public static lfd a(InputStream inputstream)
    {
        lfd lfd1 = new lfd();
        if (lfc.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        lfd1.b = lfc.c(inputstream);
        lfd1.c = lfc.c(inputstream);
        if (lfd1.c.equals(""))
        {
            lfd1.c = null;
        }
        lfd1.d = lfc.b(inputstream);
        lfd1.e = lfc.b(inputstream);
        lfd1.f = lfc.b(inputstream);
        lfd1.g = lfc.b(inputstream);
        lfd1.h = lfc.d(inputstream);
        return lfd1;
    }

    public final boolean a(OutputStream outputstream)
    {
        lfc.a(outputstream, 0x20150306);
        lfc.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.Map.Entry entry;
        try
        {
            lfc.a(outputstream, ((String) (obj)));
            lfc.a(outputstream, d);
            lfc.a(outputstream, e);
            lfc.a(outputstream, f);
            lfc.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            lew.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        lfc.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); lfc.a(outputstream, (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            lfc.a(outputstream, (String)entry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        lfc.a(outputstream, 0);
        outputstream.flush();
        return true;
    }
}
