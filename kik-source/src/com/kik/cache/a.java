// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.BitmapFactory;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.w;
import com.kik.m.e;
import java.io.IOException;
import kik.a.h.f;
import kik.android.util.bx;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.cache:
//            ac

public final class a extends ac
{

    private static final b f = org.c.c.a("Base64ImageRequest");
    private Object g;
    private final String h;

    private a(String s, String s1, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(s, s1, b1, 0, 0, config, a1);
        g = new Object();
        h = s;
    }

    public static a a(String s, com.android.volley.r.b b1, com.android.volley.r.a a1)
    {
        return new a(s, d(s), b1, a, a1);
    }

    private r c(k k)
    {
        if (k == null)
        {
            return r.a(new w("Null response"));
        }
        try
        {
            k = e.a(kik.a.h.f.a(h));
        }
        // Misplaced declaration of an exception variable
        catch (k k)
        {
            bx.a(k);
            (new StringBuilder("Failed base64 parse: ")).append(k.getMessage());
            k = null;
        }
        if (k != null)
        {
            k = BitmapFactory.decodeByteArray(k, 0, k.length);
        } else
        {
            k = null;
        }
        if (k == null)
        {
            return r.a(new w("Base64 decode returned null"));
        } else
        {
            return r.a(k, null);
        }
    }

    private static String d(String s)
    {
        String s1 = "http://127.0.0.1/base64/";
        if (s != null)
        {
            s1 = (new StringBuilder()).append("http://127.0.0.1/base64/").append(s.hashCode()).toString();
        }
        return s1;
    }

    public final String a(int i, int j)
    {
        String s = d(h);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("#W").append(i).append("#H").append(j);
        stringbuilder.append(s).append("#!#Base64ImageRequest");
        return stringbuilder.toString();
    }

    public final com.android.volley.b.a b(com.android.volley.b.a a1)
    {
        return null;
    }

    protected final r b(k k)
    {
        synchronized (g)
        {
            k = c(k);
        }
        return k;
        k;
        obj;
        JVM INSTR monitorexit ;
        throw k;
    }

    public final boolean e_()
    {
        return false;
    }

}
