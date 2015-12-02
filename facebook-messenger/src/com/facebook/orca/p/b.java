// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.p;

import android.content.res.Resources;
import com.facebook.l.a;
import com.facebook.l.k;
import com.facebook.l.u;
import com.facebook.l.x;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.f.z;
import com.facebook.orca.threadview.v;
import com.facebook.user.LastActive;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.p:
//            c, d, e

public class b
{

    private final k a;
    private final com.facebook.orca.f.k b;
    private final z c;
    private final e d;
    private final Resources e;
    private final u f = new c(this);
    private boolean g;
    private v h;
    private ParticipantInfo i;
    private long j;
    private User k;
    private UserKey l;
    private x m;
    private long n;
    private d o;

    public b(k k1, com.facebook.orca.f.k k2, z z1, e e1, Resources resources)
    {
        m = x.a;
        a = k1;
        b = k2;
        c = z1;
        d = e1;
        e = resources;
    }

    static void a(b b1, UserKey userkey, x x1)
    {
        b1.a(userkey, x1);
    }

    private void a(UserKey userkey)
    {
        if (!Objects.equal(userkey, l))
        {
            m = x.a;
            if (l != null)
            {
                a.b(l, f);
            }
            l = userkey;
            if (l != null)
            {
                a.a(l, f);
                m = a.b(l);
                return;
            }
        }
    }

    private void a(UserKey userkey, x x1)
    {
        if (l != null && Objects.equal(userkey, l) && m != x1)
        {
            m = x1;
            if (o != null)
            {
                o.a(x1);
                return;
            }
        }
    }

    private void f()
    {
        UserKey userkey = null;
        if (g)
        {
            if (i != null)
            {
                userkey = i.e();
            }
            a(userkey);
            return;
        } else
        {
            a(((UserKey) (null)));
            return;
        }
    }

    private long g()
    {
        if (k == null || k.C() == null)
        {
            return 0L;
        }
        if (n != 0L)
        {
            return n;
        }
        n = k.C().a();
        if (j > n)
        {
            n = j;
        }
        Long long1 = c.a(k.c());
        if (long1 != null && long1.longValue() > n)
        {
            n = long1.longValue();
        }
        n = d.a(n, k.C().b(), m.a());
        return n;
    }

    private boolean h()
    {
        return k != null && k.C() != null && g() != 0L && k.C().b();
    }

    private String i()
    {
        if (k == null)
        {
            return "";
        } else
        {
            return d.a(n);
        }
    }

    private String j()
    {
        if (k == null)
        {
            return "";
        } else
        {
            return d.b(n);
        }
    }

    public ParticipantInfo a()
    {
        return i;
    }

    public void a(d d1)
    {
        o = d1;
    }

    public void a(v v1)
    {
        h = v1;
        if (h != null)
        {
            i = h.d();
            j = h.e();
        } else
        {
            i = null;
            j = 0L;
        }
        if (i != null)
        {
            k = b.a(i.e());
        } else
        {
            k = null;
        }
        f();
    }

    public void a(boolean flag)
    {
        g = flag;
        f();
    }

    public boolean b()
    {
        return i != null;
    }

    public x c()
    {
        return m;
    }

    public String d()
    {
        String s = null;
        if (m.a() == a.AVAILABLE || h())
        {
            s = e.getString(o.presence_active_now);
        } else
        {
            if (g() != 0L)
            {
                return i();
            }
            if (m.b())
            {
                return e.getString(o.presence_mobile);
            }
        }
        return s;
    }

    public String e()
    {
        if (m.a() == a.AVAILABLE || h() || g() == 0L)
        {
            return "";
        } else
        {
            return j();
        }
    }
}
