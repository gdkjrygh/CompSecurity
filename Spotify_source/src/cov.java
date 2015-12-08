// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class cov
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    private cov()
    {
    }

    public cov(String s, bzy bzy1)
    {
        b = s;
        a = bzy1.a.length;
        c = bzy1.b;
        d = bzy1.c;
        e = bzy1.d;
        f = bzy1.e;
        g = bzy1.f;
        h = bzy1.g;
    }

    public static cov a(InputStream inputstream)
    {
        cov cov1 = new cov();
        if (cou.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        cov1.b = cou.c(inputstream);
        cov1.c = cou.c(inputstream);
        if (cov1.c.equals(""))
        {
            cov1.c = null;
        }
        cov1.d = cou.b(inputstream);
        cov1.e = cou.b(inputstream);
        cov1.f = cou.b(inputstream);
        cov1.g = cou.b(inputstream);
        cov1.h = cou.d(inputstream);
        return cov1;
    }

    public final boolean a(OutputStream outputstream)
    {
        cou.a(outputstream, 0x20150306);
        cou.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.Map.Entry entry;
        try
        {
            cou.a(outputstream, ((String) (obj)));
            cou.a(outputstream, d);
            cou.a(outputstream, e);
            cou.a(outputstream, f);
            cou.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            cop.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        cou.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); cou.a(outputstream, (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            cou.a(outputstream, (String)entry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        cou.a(outputstream, 0);
        outputstream.flush();
        return true;
    }
}
