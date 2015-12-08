// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.graphics.Bitmap;
import android.support.v4.g.e;
import com.google.android.m4b.maps.a.b;
import com.google.android.m4b.maps.a.d;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.a.m;
import com.google.android.m4b.maps.a.n;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.aj.i;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            aa

public final class p extends l
{
    static final class a extends aa
    {

        private final e a;
        private final n b;

        public final void a(k k1, m m1)
        {
            super.a(k1, m1);
            if (k1.g)
            {
                a.put(k1.b, m1);
            }
            b.a(k1, m1);
        }

        public final void a(k k1, m m1, Runnable runnable)
        {
            super.a(k1, m1, runnable);
            if (k1.g)
            {
                a.put(k1.b, m1);
            }
            b.a(k1, m1, runnable);
        }

        public final void a(k k1, r r)
        {
            super.a(k1, r);
            b.a(k1, r);
        }

        public a(e e1, n n1)
        {
            a = e1;
            b = n1;
        }
    }


    private final e k;
    private final d l = new d(i.a());

    p(b b, com.google.android.m4b.maps.a.e e1, e e2, n n)
    {
        super(b, e1, new a(e2, n));
        k = e2;
    }

    public final k a(k k1)
    {
        m m1 = (m)k.get(k1.b);
        if (m1 != null)
        {
            l.a(k1, m1);
            return k1;
        } else
        {
            return super.a(k1);
        }
    }

    // Unreferenced inner class com/google/android/m4b/maps/ay/p$1

/* anonymous class */
    final class _cls1 extends e
    {

        protected final int sizeOf(Object obj, Object obj1)
        {
            obj = (m)obj1;
            if (((m) (obj)).a instanceof Bitmap)
            {
                obj = (Bitmap)((m) (obj)).a;
                int j = ((Bitmap) (obj)).getRowBytes();
                return ((Bitmap) (obj)).getHeight() * j;
            }
            if (((m) (obj)).a instanceof String)
            {
                return ((String)((m) (obj)).a).getBytes().length;
            }
            if (((m) (obj)).a instanceof byte[])
            {
                return ((byte[])((m) (obj)).a).length;
            } else
            {
                obj = String.valueOf(((m) (obj)).a);
                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 52)).append("LruCache does not have a sizeOf implementation for: ").append(((String) (obj))).toString());
            }
        }

    }

}
