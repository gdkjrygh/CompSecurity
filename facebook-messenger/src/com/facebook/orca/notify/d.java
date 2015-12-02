// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.KeyguardManager;
import com.facebook.b.a.b;
import com.facebook.common.hardware.q;
import com.facebook.i.a.a.f;
import com.facebook.messages.model.threads.Message;
import com.google.common.a.ev;
import com.google.common.a.fi;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.notify:
//            a, ap, c, at, 
//            ak, bi

public class d extends com.facebook.orca.notify.a
{

    private final a a;
    private final ak b;
    private final KeyguardManager c;
    private final at d;
    private final b e;
    private final f f;
    private final q g;

    public d(a a1, ak ak1, KeyguardManager keyguardmanager, at at1, b b1, f f1, q q1)
    {
        a = a1;
        b = ak1;
        c = keyguardmanager;
        d = at1;
        e = b1;
        f = f1;
        g = q1;
    }

    private void a(Message message)
    {
        e.a(message);
    }

    private void b()
    {
        e.a();
    }

    public void a()
    {
        if (!((Boolean)a.b()).booleanValue())
        {
            return;
        } else
        {
            b();
            return;
        }
    }

    protected void a(ap ap1)
    {
        String s = ap1.b().e();
        ap1 = ap1.e();
        if (!((Boolean)a.b()).booleanValue())
        {
            ap1.a(true);
            return;
        }
        if (Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.b(s))))
        {
            ap1.b(true);
            return;
        }
        boolean flag = Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.d));
        boolean flag1 = Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.a(s)));
        if (flag && flag1)
        {
            ap1.a(true);
            return;
        }
        if (f.b(com.facebook.messages.ipc.peer.d.a) && !g.a())
        {
            ap1.a(true);
            return;
        } else
        {
            ap1.b(true);
            return;
        }
    }

    public void a(String s)
    {
        if (!((Boolean)a.b()).booleanValue())
        {
            return;
        } else
        {
            e.c(s, null);
            return;
        }
    }

    protected void b(ap ap1)
    {
        if (!ap1.e().o() && (!Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.j)) || !Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.n))) && (!c.inKeyguardRestrictedInputMode() || d.a() == null))
        {
            c c1 = ap1.e();
            if (!c1.f() && !ap1.b().t())
            {
                String s = ap1.b().e();
                if (ap1.d() || Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.b(s))) || Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.n)))
                {
                    a(ap1.b());
                    c1.g();
                }
                if (ap1.d())
                {
                    if (!c1.b())
                    {
                        b.a(c1);
                    }
                    if (!c1.d())
                    {
                        if (g.a())
                        {
                            b.b(c1);
                            return;
                        } else
                        {
                            b.c(c1);
                            return;
                        }
                    }
                }
            }
        }
    }

    protected void b(bi bi1)
    {
        if (((Boolean)a.b()).booleanValue())
        {
            bi1 = bi1.a().i_().iterator();
            while (bi1.hasNext()) 
            {
                String s = (String)bi1.next();
                e.c(s, "read_on_web");
            }
        }
    }
}
