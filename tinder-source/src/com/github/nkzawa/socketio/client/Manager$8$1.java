// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.a.a;
import java.util.TimerTask;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager

final class a
    implements Runnable
{

    final a a;

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
                a.a.a(new Manager.b() {

                    final Manager._cls8._cls1 a;

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
                a = Manager._cls8._cls1.this;
                super();
            }
                });
                return;
            }
        }
    }

    _cls1.a(_cls1.a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$8

/* anonymous class */
    final class Manager._cls8 extends TimerTask
    {

        final Manager a;
        final Manager b;

        public final void run()
        {
            com.github.nkzawa.f.a.a(new Manager._cls8._cls1(this));
        }

            
            {
                b = manager;
                a = manager1;
                super();
            }
    }

}
