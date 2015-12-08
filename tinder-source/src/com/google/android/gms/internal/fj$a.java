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
//            fj, ez

static final class 
{

    public long a;
    public String b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long g;
    public Map h;

    public static  a(InputStream inputstream)
        throws IOException
    {
          = new <init>();
        if (fj.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        .b = fj.c(inputstream);
        .c = fj.c(inputstream);
        if (.c.equals(""))
        {
            .c = null;
        }
        .d = fj.b(inputstream);
        .e = fj.b(inputstream);
        .f = fj.b(inputstream);
        .g = fj.b(inputstream);
        .h = fj.d(inputstream);
        return ;
    }

    public final boolean a(OutputStream outputstream)
    {
        fj.a(outputstream, 0x20150306);
        fj.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.ntry ntry;
        try
        {
            fj.a(outputstream, ((String) (obj)));
            fj.a(outputstream, d);
            fj.a(outputstream, e);
            fj.a(outputstream, f);
            fj.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            ez.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        fj.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); fj.a(outputstream, (String)ntry.getValue()))
        {
            ntry = (java.util.ntry)((Iterator) (obj)).next();
            fj.a(outputstream, (String)ntry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        fj.a(outputstream, 0);
        outputstream.flush();
        return true;
    }

    private ()
    {
    }

    public (String s,  )
    {
        b = s;
        a = ..length;
        c = .;
        d = .;
        e = .;
        f = .;
        g = .;
        h = .;
    }
}
