// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, af, k, t

public class j extends r
{
    public final class a
    {

        final j a;
        private final String b;
        private final long c;

        private void c()
        {
            long l = a.n().a();
            android.content.SharedPreferences.Editor editor = j.a(a).edit();
            editor.remove(g());
            editor.remove(b());
            editor.putLong(f(), l);
            editor.commit();
        }

        private long d()
        {
            long l = e();
            if (l == 0L)
            {
                return 0L;
            } else
            {
                return Math.abs(l - a.n().a());
            }
        }

        private long e()
        {
            return j.a(a).getLong(f(), 0L);
        }

        private String f()
        {
            return (new StringBuilder()).append(b).append(":start").toString();
        }

        private String g()
        {
            return (new StringBuilder()).append(b).append(":count").toString();
        }

        public Pair a()
        {
            long l = d();
            if (l >= c)
            {
                if (l > c * 2L)
                {
                    c();
                    return null;
                }
                String s = j.a(a).getString(b(), null);
                l = j.a(a).getLong(g(), 0L);
                c();
                if (s != null && l > 0L)
                {
                    return new Pair(s, Long.valueOf(l));
                }
            }
            return null;
        }

        public void a(String s)
        {
            String s1;
            if (e() == 0L)
            {
                c();
            }
            s1 = s;
            if (s == null)
            {
                s1 = "";
            }
            this;
            JVM INSTR monitorenter ;
            long l = j.a(a).getLong(g(), 0L);
            if (l > 0L)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            s = j.a(a).edit();
            s.putString(b(), s1);
            s.putLong(g(), 1L);
            s.apply();
            this;
            JVM INSTR monitorexit ;
            return;
            boolean flag;
            if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (l + 1L))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s = j.a(a).edit();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_149;
            }
            s.putString(b(), s1);
            s.putLong(g(), l + 1L);
            s.apply();
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        protected String b()
        {
            return (new StringBuilder()).append(b).append(":value").toString();
        }

        private a(String s, long l)
        {
            a = j.this;
            super();
            z.a(s);
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z.b(flag);
            b = s;
            c = l;
        }

        a(String s, long l, _cls1 _pcls1)
        {
            this(s, l);
        }
    }


    private SharedPreferences a;
    private long b;
    private long c;
    private final a d = new a("monitoring", q().G());

    protected j(t t)
    {
        super(t);
        c = -1L;
    }

    static SharedPreferences a(j j1)
    {
        return j1.a;
    }

    protected void a()
    {
        a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public void a(String s)
    {
        m();
        D();
        android.content.SharedPreferences.Editor editor = a.edit();
        if (TextUtils.isEmpty(s))
        {
            editor.remove("installation_campaign");
        } else
        {
            editor.putString("installation_campaign", s);
        }
        if (!editor.commit())
        {
            e("Failed to commit campaign data");
        }
    }

    public long b()
    {
        m();
        D();
        if (b == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                b = l;
            } else
            {
                long l1 = n().a();
                android.content.SharedPreferences.Editor editor = a.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    e("Failed to commit first run time");
                }
                b = l1;
            }
        }
        return b;
    }

    public k c()
    {
        return new k(n(), b());
    }

    public long d()
    {
        m();
        D();
        if (c == -1L)
        {
            c = a.getLong("last_dispatch", 0L);
        }
        return c;
    }

    public void e()
    {
        m();
        D();
        long l = n().a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        c = l;
    }

    public String f()
    {
        m();
        D();
        String s = a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s;
        }
    }

    public a g()
    {
        return d;
    }
}
