// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.bb.e;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.g;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.l;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.af;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class o extends com.google.android.m4b.maps.cc.d
{

    private static final Map i = Collections.synchronizedMap(new TreeMap());
    boolean c;
    long d;
    private volatile j e;
    private com.google.android.m4b.maps.bn.g f;
    private final byte g[];
    private e h;

    private o(byte abyte0[], Set set)
    {
        super(set);
        g = abyte0;
        c = true;
        d = 0L;
    }

    public static o a(byte abyte0[])
    {
        return new o(abyte0, new HashSet());
    }

    public static o a(String as[], com.google.android.m4b.maps.bo.ap.b b1)
    {
        HashSet hashset = new HashSet();
        b1 = (l)b1.next();
        int ai[] = ((l) (b1)).b;
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            if (k1 >= 0 && k1 < as.length)
            {
                hashset.add(as[k1]);
            }
        }

        return new o(((l) (b1)).a, hashset);
    }

    public static void a(d d1)
    {
        GL10 gl10 = d1.a;
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvx(8960, 8704, 8448);
        d1.c();
        d1.r.d(d1);
    }

    private Bitmap d(d d1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        try
        {
            d1 = d1.c.a(g, options);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            return null;
        }
        return d1;
    }

    public final int a()
    {
        int i1 = 0;
        j j1 = e;
        if (j1 != null)
        {
            i1 = j1.h + 0;
        }
        return i1;
    }

    public final void a(d d1, b b1, ab ab)
    {
        j j1 = e;
        ab = j1;
        if (j1 == null)
        {
            int k1;
            int l1;
            if (!c)
            {
                b1 = d1.b;
                b1.b = ((af) (b1)).b + 20000;
                b1 = d(d1);
            } else
            if (d1.a(20000))
            {
                b1 = d(d1);
                h = new e(d, 250L, com.google.android.m4b.maps.bb.e.a.a);
            } else
            {
                b1 = null;
            }
            ab = j1;
            if (b1 != null)
            {
                j j2 = new j(d1);
                j2.d = true;
                j2.b(b1);
                e = j2;
                float f1 = j2.f;
                if (i.containsKey(Float.valueOf(f1)))
                {
                    ab = (com.google.android.m4b.maps.bn.g)i.get(Float.valueOf(f1));
                } else
                {
                    ab = new com.google.android.m4b.maps.bn.g(8);
                    int i1 = (int)(65536F * f1);
                    ab.a(0, 0);
                    ab.a(0, i1);
                    ab.a(i1, 0);
                    ab.a(i1, i1);
                    i.put(Float.valueOf(f1), ab);
                }
                f = ab;
                b1.recycle();
                ab = j2;
            }
        }
        if (ab == null)
        {
            return;
        }
        b1 = d1.a;
        f.d(d1);
        ab.a(b1);
        if (h != null)
        {
            l1 = h.a(d1);
            k1 = l1;
            if (l1 == 0x10000)
            {
                h = null;
                c = false;
                k1 = l1;
            }
        } else
        {
            k1 = 0x10000;
        }
        b1.glColor4x(k1, k1, k1, k1);
        b1.glDrawArrays(5, 0, 4);
    }

    public final int b()
    {
        int i1 = 96;
        if (g != null)
        {
            i1 = g.length + 16 + 96;
        }
        return i1;
    }

    public final void b(d d1)
    {
        if (e != null)
        {
            e.c();
            e = null;
            c = true;
        }
    }

    public final void c(d d1)
    {
        b(d1);
        b.clear();
    }

}
