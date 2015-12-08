// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.ak;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            kg, ip, jx, kb, 
//            io, kc, ko, kd, 
//            km, ka, kf

public final class jz
{
    public static interface a
    {

        public abstract void a(kd kd);
    }

    final class b extends km
    {

        final jz a;
        private final a b;

        protected final void a(kd kd1)
        {
            kd.a a1 = kd1.a();
            a.a(a1);
            if (a1.a() == Status.a && a1.b() == kd.a.a.a && a1.c() != null && a1.c().length > 0)
            {
                jz.a(a).a(a1.d().d(), a1.c());
                ak.b();
                b.a(kd1);
                return;
            }
            StringBuilder stringbuilder = new StringBuilder("Response status: ");
            if (a1.a().d())
            {
                kd1 = "SUCCESS";
            } else
            {
                kd1 = "FAILURE";
            }
            stringbuilder.append(kd1);
            ak.b();
            if (a1.a().d())
            {
                (new StringBuilder("Response source: ")).append(a1.b().toString());
                ak.b();
                (new StringBuilder("Response size: ")).append(a1.c().length);
                ak.b();
            }
            a.a(a1.d(), b);
        }

        b(kc kc1, ka ka, a a1)
        {
            a = jz.this;
            super(kc1, ka);
            b = a1;
        }
    }

    static final class c
    {

        private Status a;
        private Object b;
        private long c;

        public final long a()
        {
            return c;
        }

        public final void a(long l)
        {
            c = l;
        }

        public final void a(Status status)
        {
            a = status;
        }

        public final void a(Object obj)
        {
            b = obj;
        }

        public c(Status status, Object obj, long l)
        {
            a = status;
            b = obj;
            c = l;
        }
    }


    Map a;
    private final Context b;
    private final kg c;
    private final io d;
    private String e;
    private final Map f;

    public jz(Context context)
    {
        this(context, ((Map) (new HashMap())), new kg(context), ip.d());
    }

    private jz(Context context, Map map, kg kg1, io io1)
    {
        e = null;
        a = new HashMap();
        b = context;
        d = io1;
        c = kg1;
        f = map;
    }

    static kg a(jz jz1)
    {
        return jz1.c;
    }

    final void a(jx jx1, a a1)
    {
        c.a(jx1.d(), jx1.b(), kb.a, new kf(jx1, a1) {

            final jx a;
            final a b;
            final jz c;

            public final void a(Status status, Object obj, Integer integer, long l)
            {
                if (status.d())
                {
                    if (integer == kg.a)
                    {
                        status = kd.a.a.c;
                    } else
                    {
                        status = kd.a.a.b;
                    }
                    status = new kd.a(Status.a, a, null, (ke.c)obj, status, l);
                } else
                {
                    status = new kd.a(new Status(16, (new StringBuilder("There is no valid resource for the container: ")).append(a.a()).toString()), null, kd.a.a.b);
                }
                b.a(new kd(status));
            }

            
            {
                c = jz.this;
                a = jx1;
                b = a1;
                super();
            }
        });
    }

    final void a(kd.a a1)
    {
        Object obj = a1.d().a();
        Status status = a1.a();
        a1 = a1.e();
        if (a.containsKey(obj))
        {
            obj = (c)a.get(obj);
            ((c) (obj)).a(d.a());
            if (status == Status.a)
            {
                ((c) (obj)).a(status);
                ((c) (obj)).a(a1);
            }
            return;
        } else
        {
            a.put(obj, new c(status, a1, d.a()));
            return;
        }
    }

    public final void a(String s)
    {
        e = s;
    }

    public final void a(String s, Integer integer, String s1, a a1)
    {
        boolean flag1 = true;
        s1 = (new kc()).a(new jx(s, integer, s1));
        b b1 = new b(s1, kb.a, a1);
        s = s1.a().iterator();
        boolean flag = false;
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            integer = (jx)s.next();
            c c1 = (c)a.get(integer.a());
            long l;
            if (c1 != null)
            {
                l = c1.a();
            } else
            {
                l = c.a(integer.a());
            }
            if (l + 0xdbba0L < d.a())
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            integer = (ko)f.get(s1.b());
            s = integer;
            if (integer == null)
            {
                if (e == null)
                {
                    s = new ko();
                } else
                {
                    s = new ko(e);
                }
                f.put(s1.b(), s);
            }
            s.a(b, s1, b1);
            return;
        }
        s = s1.a();
        if (s.size() != 1)
        {
            flag1 = false;
        }
        y.b(flag1);
        a((jx)s.get(0), a1);
    }
}
