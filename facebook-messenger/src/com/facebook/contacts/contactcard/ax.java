// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.os.Bundle;
import com.facebook.common.time.a;
import com.facebook.contacts.server.FetchVoipInfoParams;
import com.facebook.contacts.server.FetchVoipInfoResult;
import com.facebook.contacts.server.d;
import com.facebook.e.c;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.contacts.contactcard:
//            az, ay

public class ax
{

    private static final Class a = com/facebook/contacts/contactcard/ax;
    private final javax.inject.a b;
    private final javax.inject.a c;
    private final c d;
    private final a e;
    private final k f;
    private az g;
    private UserKey h;
    private s i;
    private boolean j;
    private FetchVoipInfoResult k;
    private long l;

    public ax(javax.inject.a a1, javax.inject.a a2, c c1, a a3, k k1)
    {
        l = 0L;
        b = a1;
        c = a2;
        d = c1;
        e = a3;
        f = k1;
    }

    static long a(ax ax1, long l1)
    {
        ax1.l = l1;
        return l1;
    }

    static a a(ax ax1)
    {
        return ax1.e;
    }

    static FetchVoipInfoResult a(ax ax1, FetchVoipInfoResult fetchvoipinforesult)
    {
        ax1.k = fetchvoipinforesult;
        return fetchvoipinforesult;
    }

    static s a(ax ax1, s s1)
    {
        ax1.i = s1;
        return s1;
    }

    static boolean a(ax ax1, boolean flag)
    {
        ax1.j = flag;
        return flag;
    }

    static void b(ax ax1)
    {
        ax1.h();
    }

    static Class g()
    {
        return a;
    }

    private void h()
    {
        if (g != null)
        {
            g.a();
        }
    }

    public void a(az az1)
    {
        g = az1;
    }

    public void a(UserKey userkey)
    {
        if (userkey == null || !userkey.equals(h))
        {
            f();
            h = userkey;
            k = null;
            j = false;
        }
        if (!a())
        {
            h();
        } else
        if (!e())
        {
            if (c() && e.a() - l < 10000L)
            {
                h();
                return;
            } else
            {
                long l1 = Long.parseLong(h.b());
                userkey = new Bundle();
                userkey.putParcelable("fetchVoipInfoParams", new FetchVoipInfoParams(l1));
                i = f.a(d.l, userkey).a();
                com.google.common.d.a.i.a(i, new ay(this));
                return;
            }
        }
    }

    public boolean a()
    {
        return ((Boolean)b.b()).booleanValue() && h != null && h.a() == n.FACEBOOK;
    }

    public boolean b()
    {
        return a() && j;
    }

    public boolean c()
    {
        if (((Boolean)c.b()).booleanValue() && !d.b())
        {
            return false;
        }
        if (b() && k != null)
        {
            return k.a();
        } else
        {
            return false;
        }
    }

    public String d()
    {
        if (b() && k != null)
        {
            return k.b();
        } else
        {
            return null;
        }
    }

    public boolean e()
    {
        return i != null;
    }

    public void f()
    {
        if (i != null)
        {
            i.cancel(false);
            i = null;
        }
    }

}
