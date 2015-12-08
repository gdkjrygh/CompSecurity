// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.w;
import com.kik.g.as;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kik.a.d.d;
import kik.a.e.n;

// Referenced classes of package com.kik.cache:
//            ac, j

public final class i extends ac
{

    private static final as i = new j();
    private Object f;
    private final String g;
    private final n h;
    private final boolean j;

    private i(d d1, String s, String s1, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, com.android.volley.r.a a1, boolean flag, 
            n n1)
    {
        super(d1, s1, b1, 0, 0, config, a1);
        f = new Object();
        h = n1;
        g = s;
        j = flag;
        if (j)
        {
            a(i);
        }
    }

    public static i a(d d1, String s, com.android.volley.r.b b1, com.android.volley.r.a a1, boolean flag, n n1)
    {
        return new i(d1, s, d(s), b1, a, a1, flag, n1);
    }

    private static String d(String s)
    {
        String s1 = "http://127.0.0.1/chatImage/";
        if (s != null)
        {
            try
            {
                s1 = (new StringBuilder()).append("http://127.0.0.1/chatImage/").append(URLEncoder.encode(s, "UTF-8")).toString();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return "http://127.0.0.1/chatImage/";
            }
        }
        return s1;
    }

    public final String a(int k, int l)
    {
        String s = d(g);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("#W").append(k).append("#H").append(l);
        if (j)
        {
            stringbuilder.append("#BLUR");
        }
        stringbuilder.append(s).append("#!#ChatImageRequest");
        return stringbuilder.toString();
    }

    public final com.android.volley.b.a b(com.android.volley.b.a a1)
    {
        return null;
    }

    protected final r b(k k)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (k != null) goto _L2; else goto _L1
_L1:
        k = r.a(new w("Null response"));
_L3:
        obj;
        JVM INSTR monitorexit ;
        return k;
_L2:
        k = (Bitmap)h.a(((d)x()).b(), false);
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        k = r.a(new w("Null bitmap from composite"));
          goto _L3
        k = r.a(k, null);
          goto _L3
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
