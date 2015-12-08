// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.volley.k;
import com.android.volley.r;
import com.android.volley.toolbox.f;
import com.android.volley.w;
import com.kik.android.a;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.n;
import kik.android.util.e;

// Referenced classes of package com.kik.cache:
//            ac, w, ad

public final class v extends ac
{

    private Object f;
    private final kik.a.e.r g;
    private final ad h;
    private final a i;
    private boolean j;

    private v(n n1, String s, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, com.android.volley.r.a a1, kik.a.e.r r1, boolean flag, 
            ad ad, a a2)
    {
        super(n1, s, b1, 0, 0, config, a1);
        f = new Object();
        g = r1;
        j = flag;
        i = a2;
        h = ad;
    }

    public static v a(n n1, com.android.volley.r.b b1, android.graphics.Bitmap.Config config, com.android.volley.r.a a1, kik.a.e.r r1, boolean flag, ad ad, a a2)
    {
        return new v(n1, c(n1), b1, config, a1, r1, flag, ad, a2);
    }

    public static String a(n n1)
    {
        return c(n1);
    }

    public static SimpleLruBitmapCache.a b(n n1)
    {
        return new com.kik.cache.w((new StringBuilder()).append(c(n1)).append("#!#GroupImageRequest").toString());
    }

    private static String c(n n1)
    {
        String s1 = "http://127.0.0.1/groupPic/";
        String s = s1;
        if (n1 != null)
        {
            s = s1;
            if (n1.b() != null)
            {
                try
                {
                    s = (new StringBuilder()).append("http://127.0.0.1/groupPic/").append(URLEncoder.encode(n1.b(), "UTF-8")).toString();
                }
                // Misplaced declaration of an exception variable
                catch (n n1)
                {
                    return "http://127.0.0.1/groupPic/";
                }
            }
        }
        return s;
    }

    public final String a(int l, int i1)
    {
        String s = c((n)x());
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("#W").append(l).append("#H").append(i1);
        if (j)
        {
            stringbuilder.append("#LARGE");
        }
        stringbuilder.append(s).append("#!#GroupImageRequest");
        return stringbuilder.toString();
    }

    public final com.android.volley.b.a b(com.android.volley.b.a a1)
    {
        return null;
    }

    protected final r b(k k1)
    {
        boolean flag = true;
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        if (k1 != null) goto _L2; else goto _L1
_L1:
        k1 = r.a(new w("Null response"));
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return k1;
_L2:
        Object obj;
        if (k1.b == null || k1.b.length <= 10)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = BitmapFactory.decodeByteArray(k1.b, 0, k1.b.length);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        k1 = r.a(obj, com.android.volley.toolbox.f.a(k1));
        ((r) (k1)).b.e = System.currentTimeMillis() + 0x41353000L;
        ((r) (k1)).b.d = System.currentTimeMillis() + 0x41353000L;
          goto _L3
        k1;
        obj1;
        JVM INSTR monitorexit ;
        throw k1;
        ArrayList arraylist;
        obj = (n)x();
        arraylist = new ArrayList();
        String s;
        for (Iterator iterator = ((n) (obj)).w().iterator(); iterator.hasNext(); arraylist.add(g.a(s, true)))
        {
            s = (String)iterator.next();
        }

        if (!j) goto _L5; else goto _L4
_L4:
        if (((n) (obj)).I())
        {
            flag = false;
        }
        obj = e.a(arraylist, 2, flag, h);
_L6:
        k1 = r.a(((kik.android.util.e.a) (obj)).a, com.android.volley.toolbox.f.a(k1));
        if (!((kik.android.util.e.a) (obj)).b)
        {
            break MISSING_BLOCK_LABEL_305;
        }
        ((r) (k1)).b.e = System.currentTimeMillis() + 0x41353000L;
        ((r) (k1)).b.d = System.currentTimeMillis() + 0x41353000L;
_L7:
        if (((kik.android.util.e.a) (obj)).a != null)
        {
            break MISSING_BLOCK_LABEL_332;
        }
        k1 = r.a(new w("Null bitmap from composite"));
          goto _L3
_L5:
        if (!((n) (obj)).I())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = e.a(arraylist, 1, flag, h);
          goto _L6
        ((r) (k1)).b.e = System.currentTimeMillis();
        ((r) (k1)).b.d = System.currentTimeMillis() + 0x41353000L;
          goto _L7
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ((kik.android.util.e.a) (obj)).a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        ((r) (k1)).b.a = bytearrayoutputstream.toByteArray();
          goto _L3
    }

    public final boolean e_()
    {
        return false;
    }

    public final n u()
    {
        return (n)x();
    }
}
