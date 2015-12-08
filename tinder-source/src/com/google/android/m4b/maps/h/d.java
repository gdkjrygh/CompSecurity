// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.u;
import android.support.v4.app.v;
import android.util.SparseArray;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.x;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.h:
//            b, r, h, s

public interface com.google.android.m4b.maps.h.d
{
    public static final class a
    {

        private final Set a = new HashSet();
        private String b;
        private String c;
        private final Map d = new HashMap();
        private final Context e;
        private final Map f = new HashMap();
        private int g;
        private int h;
        private Looper i;
        private b.b j;
        private final Set k = new HashSet();
        private final Set l = new HashSet();
        private com.google.android.m4b.maps.dd.a m;

        public final a a(com.google.android.m4b.maps.h.b b1)
        {
            f.put(b1, null);
            a.addAll(b1.a);
            return this;
        }

        public final a a(b b1)
        {
            k.add(b1);
            return this;
        }

        public final a a(d d1)
        {
            l.add(d1);
            return this;
        }

        public final g a()
        {
            return new g(a, d, b, c, new com.google.android.m4b.maps.dd.d((byte)0));
        }

        public final com.google.android.m4b.maps.h.d b()
        {
            Object obj1;
            boolean flag;
            boolean flag3;
            flag3 = true;
            boolean flag2 = true;
            r r1;
            r.a a2;
            int i1;
            if (!f.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            x.b(flag, "must call addApi() to add at least one API");
            if (g < 0) goto _L2; else goto _L1
_L1:
            r1 = r.a();
            obj1 = new h(e.getApplicationContext(), i, a(), j, f, k, l, g, -1);
            i1 = g;
            x.a(obj1, "GoogleApiClient instance cannot be null");
            if (r1.c.indexOfKey(i1) < 0)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            x.a(flag, (new StringBuilder(54)).append("Already managing a GoogleApiClient with id ").append(i1).toString());
            a2 = new r.a(r1, i1, ((com.google.android.m4b.maps.h.d) (obj1)));
            r1.c.put(i1, a2);
            if (r1.a && !r1.b)
            {
                ((com.google.android.m4b.maps.h.d) (obj1)).b();
            }
_L6:
            return ((com.google.android.m4b.maps.h.d) (obj1));
_L2:
            s s1;
            int j1;
            if (h < 0)
            {
                break MISSING_BLOCK_LABEL_398;
            }
            s1 = s.a();
            j1 = h;
            if (s1.getActivity() == null) goto _L4; else goto _L3
_L3:
            s.a a1 = s1.b(j1);
            if (a1 == null) goto _L4; else goto _L5
_L5:
            obj1 = a1.j;
_L7:
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = new h(e.getApplicationContext(), i, a(), j, f, k, l, -1, h);
            }
            int k1 = h;
            x.a(obj, "GoogleApiClient instance cannot be null");
            boolean flag1;
            if (s1.a.indexOfKey(k1) < 0)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            x.a(flag1, (new StringBuilder(54)).append("Already managing a GoogleApiClient with id ").append(k1).toString());
            obj1 = new s.b(((com.google.android.m4b.maps.h.d) (obj)), (byte)0);
            s1.a.put(k1, obj1);
            obj1 = obj;
            if (s1.getActivity() != null)
            {
                v.a = false;
                s1.getLoaderManager().a(k1, s1);
                return ((com.google.android.m4b.maps.h.d) (obj));
            }
            if (true) goto _L6; else goto _L4
_L4:
            obj1 = null;
              goto _L7
            return new h(e, i, a(), j, f, k, l, -1, -1);
        }

        public a(Context context)
        {
            g = -1;
            h = -1;
            m = new com.google.android.m4b.maps.dd.a();
            e = context;
            i = context.getMainLooper();
            b = context.getPackageName();
            c = context.getClass().getName();
            j = com.google.android.m4b.maps.dd.a.a;
        }
    }

    public static interface b
    {

        public abstract void a(int i);

        public abstract void a(Bundle bundle);
    }

    public static interface c
    {

        public abstract void a(com.google.android.m4b.maps.g.a a1);

        public abstract void b(com.google.android.m4b.maps.g.a a1);
    }

    public static interface d
    {

        public abstract void a(com.google.android.m4b.maps.g.a a1);
    }

    public static interface e
    {

        public abstract boolean a();
    }


    public abstract Looper a();

    public abstract c.a a(c.a a1);

    public abstract void a(b b1);

    public abstract void a(d d1);

    public abstract void a(String s, PrintWriter printwriter);

    public abstract c.a b(c.a a1);

    public abstract void b();

    public abstract void b(b b1);

    public abstract void b(d d1);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();
}
