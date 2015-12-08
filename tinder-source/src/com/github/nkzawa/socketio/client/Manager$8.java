// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.f.a;
import java.util.TimerTask;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager

final class a extends TimerTask
{

    final Manager a;
    final Manager b;

    public final void run()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Manager._cls8 a;

            public final void run()
            {
                if (!Manager.l(a.a))
                {
                    Manager.c().fine("attempting reconnect");
                    int i = Manager.m(a.a).e;
                    com.github.nkzawa.socketio.client.Manager.a(a.a, "reconnect_attempt", new Object[] {
                        Integer.valueOf(i)
                    });
                    com.github.nkzawa.socketio.client.Manager.a(a.a, "reconnecting", new Object[] {
                        Integer.valueOf(i)
                    });
                    if (!Manager.l(a.a))
                    {
                        a.a.a(new Manager.b(this) {

                            final _cls1 a;

                            public final void a(Exception exception)
                            {
                                if (exception != null)
                                {
                                    Manager.c().fine("reconnect attempt error");
                                    Manager.n(a.a.a);
                                    Manager.o(a.a.a);
                                    com.github.nkzawa.socketio.client.Manager.a(a.a.a, "reconnect_error", new Object[] {
                                        exception
                                    });
                                    return;
                                } else
                                {
                                    Manager.c().fine("reconnect success");
                                    Manager.p(a.a.a);
                                    return;
                                }
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        return;
                    }
                }
            }

            
            {
                a = Manager._cls8.this;
                super();
            }
        });
    }

    _cls1.a(Manager manager, Manager manager1)
    {
        b = manager;
        a = manager1;
        super();
    }
}
