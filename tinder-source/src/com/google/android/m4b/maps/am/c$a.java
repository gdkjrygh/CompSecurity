// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import com.google.android.m4b.maps.a.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.am:
//            c

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
    {
          = new <init>();
        if (com.google.android.m4b.maps.am.c.a(inputstream) != 0x20150306)
        {
            throw new IOException();
        }
        .b = com.google.android.m4b.maps.am.c.c(inputstream);
        .c = com.google.android.m4b.maps.am.c.c(inputstream);
        if (.c.equals(""))
        {
            .c = null;
        }
        .d = com.google.android.m4b.maps.am.c.b(inputstream);
        .e = com.google.android.m4b.maps.am.c.b(inputstream);
        .f = com.google.android.m4b.maps.am.c.b(inputstream);
        .g = com.google.android.m4b.maps.am.c.b(inputstream);
        .h = com.google.android.m4b.maps.am.c.d(inputstream);
        return ;
    }

    public final boolean a(OutputStream outputstream)
    {
        com.google.android.m4b.maps.am.c.a(outputstream, 0x20150306);
        com.google.android.m4b.maps.am.c.a(outputstream, b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Object obj = "";
_L1:
        java.util.Entry entry;
        try
        {
            com.google.android.m4b.maps.am.c.a(outputstream, ((String) (obj)));
            com.google.android.m4b.maps.am.c.a(outputstream, d);
            com.google.android.m4b.maps.am.c.a(outputstream, e);
            com.google.android.m4b.maps.am.c.a(outputstream, f);
            com.google.android.m4b.maps.am.c.a(outputstream, g);
            obj = h;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            s.b("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        com.google.android.m4b.maps.am.c.a(outputstream, ((Map) (obj)).size());
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); com.google.android.m4b.maps.am.c.a(outputstream, (String)entry.getValue()))
        {
            entry = (java.util.Entry)((Iterator) (obj)).next();
            com.google.android.m4b.maps.am.c.a(outputstream, (String)entry.getKey());
        }

        break MISSING_BLOCK_LABEL_172;
        obj = c;
          goto _L1
        com.google.android.m4b.maps.am.c.a(outputstream, 0);
        outputstream.flush();
        return true;
    }

    private ()
    {
    }

    public (String s1, com.google.android.m4b.maps.a. )
    {
        b = s1;
        a = .a.length;
        c = .b;
        d = .c;
        e = .d;
        f = .e;
        g = .f;
        h = .g;
    }
}
