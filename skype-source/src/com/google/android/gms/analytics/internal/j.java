// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, al, s, k

public final class j extends q
{
    public final class a
    {

        final j a;
        private final String b;
        private final long c;

        private void b()
        {
            long l = a.l().a();
            android.content.SharedPreferences.Editor editor = j.a(a).edit();
            editor.remove(e());
            editor.remove(f());
            editor.putLong(d(), l);
            editor.commit();
        }

        private long c()
        {
            return j.a(a).getLong(d(), 0L);
        }

        private String d()
        {
            return (new StringBuilder()).append(b).append(":start").toString();
        }

        private String e()
        {
            return (new StringBuilder()).append(b).append(":count").toString();
        }

        private String f()
        {
            return (new StringBuilder()).append(b).append(":value").toString();
        }

        public final Pair a()
        {
            long l = c();
            if (l == 0L)
            {
                l = 0L;
            } else
            {
                l = Math.abs(l - a.l().a());
            }
            if (l < c)
            {
                return null;
            }
            if (l > c * 2L)
            {
                b();
                return null;
            }
            String s1 = j.a(a).getString(f(), null);
            l = j.a(a).getLong(e(), 0L);
            b();
            if (s1 == null || l <= 0L)
            {
                return null;
            } else
            {
                return new Pair(s1, Long.valueOf(l));
            }
        }

        public final void a(String s1)
        {
            String s2;
            if (c() == 0L)
            {
                b();
            }
            s2 = s1;
            if (s1 == null)
            {
                s2 = "";
            }
            this;
            JVM INSTR monitorenter ;
            long l = j.a(a).getLong(e(), 0L);
            if (l > 0L)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            s1 = j.a(a).edit();
            s1.putString(f(), s2);
            s1.putLong(e(), 1L);
            s1.apply();
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
            s1 = j.a(a).edit();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_149;
            }
            s1.putString(f(), s2);
            s1.putLong(e(), l + 1L);
            s1.apply();
            this;
            JVM INSTR monitorexit ;
            return;
            s1;
            this;
            JVM INSTR monitorexit ;
            throw s1;
        }

        private a(String s1, long l)
        {
            a = j.this;
            super();
            y.a(s1);
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.b(flag);
            b = s1;
            c = l;
        }

        a(String s1, long l, byte byte0)
        {
            this(s1, l);
        }
    }


    private SharedPreferences a;
    private long b;
    private long c;
    private final a d;

    protected j(s s1)
    {
        super(s1);
        c = -1L;
        d = new a("monitoring", ((Long)al.P.a()).longValue(), (byte)0);
    }

    static SharedPreferences a(j j1)
    {
        return j1.a;
    }

    protected final void a()
    {
        a = m().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final void a(String s1)
    {
        s.r();
        B();
        android.content.SharedPreferences.Editor editor = a.edit();
        if (TextUtils.isEmpty(s1))
        {
            editor.remove("installation_campaign");
        } else
        {
            editor.putString("installation_campaign", s1);
        }
        if (!editor.commit())
        {
            f("Failed to commit campaign data");
        }
    }

    public final long b()
    {
        s.r();
        B();
        if (b == 0L)
        {
            long l = a.getLong("first_run", 0L);
            if (l != 0L)
            {
                b = l;
            } else
            {
                long l1 = l().a();
                android.content.SharedPreferences.Editor editor = a.edit();
                editor.putLong("first_run", l1);
                if (!editor.commit())
                {
                    f("Failed to commit first run time");
                }
                b = l1;
            }
        }
        return b;
    }

    public final k c()
    {
        return new k(l(), b());
    }

    public final long d()
    {
        s.r();
        B();
        if (c == -1L)
        {
            c = a.getLong("last_dispatch", 0L);
        }
        return c;
    }

    public final void e()
    {
        s.r();
        B();
        long l = l().a();
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("last_dispatch", l);
        editor.apply();
        c = l;
    }

    public final String f()
    {
        s.r();
        B();
        String s1 = a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return s1;
        }
    }

    public final a g()
    {
        return d;
    }
}
