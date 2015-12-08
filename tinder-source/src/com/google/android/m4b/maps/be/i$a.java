// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.util.Log;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.google.android.m4b.maps.be:
//            e, i

static final class f.a
    implements com.google.android.m4b.maps.be.e
{
    final class a
    {

        private i.a a;

        private a()
        {
            a = i.a.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
    {

        private i.a a;

        private b()
        {
            a = i.a.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
    {

        private int a;
        private i.a b;

        public c(int j)
        {
            b = i.a.this;
            super();
            a = j;
        }
    }

    final class d
    {

        private aa a;
        private int b;
        private i.a c;

        public d(aa aa1, int j)
        {
            c = i.a.this;
            super();
            a = aa1;
            b = j;
        }
    }

    final class e
    {

        private ac a;
        private int b;
        private i.a c;

        public e(ac ac, int j)
        {
            c = i.a.this;
            super();
            a = ac;
            b = j;
        }
    }

    final class f
    {

        private ac a;
        private i.a b;

        public f(ac ac)
        {
            b = i.a.this;
            super();
            a = ac;
        }
    }


    Queue a;
    Map b;

    public final void a()
    {
        a.clear();
        a.offer(new a((byte)0));
    }

    public final void a(int j)
    {
        a.offer(new c(j));
    }

    public final void a(long l)
    {
        ac ac = com.google.android.m4b.maps.al.b.a(l);
        if (ac != null)
        {
            a.offer(new f(ac));
        }
    }

    public final void a(long l, int j)
    {
        ac ac = com.google.android.m4b.maps.al.b.a(l);
        aa aa1 = (aa)b.remove(ac);
        if (ac != null && aa1 != null)
        {
            a.offer(new d(aa1, j));
        }
    }

    public final void b()
    {
        for (; a.size() > 0; a.poll()) { }
        if (b.size() > 0)
        {
            if (ab.a("SDCardTileCache", 6))
            {
                int j = b.size();
                Log.e("SDCardTileCache", (new StringBuilder(56)).append(j).append(" tiles were not inserted into the disk cache.").toString());
            }
            b.clear();
        }
    }

    public final void b(long l, int j)
    {
        ac ac = com.google.android.m4b.maps.al.b.a(l);
        if (ac != null)
        {
            a.offer(new e(ac, j));
        }
    }
}
