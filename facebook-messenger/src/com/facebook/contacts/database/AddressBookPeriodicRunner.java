// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.f.b;
import com.facebook.common.time.a;
import com.facebook.contacts.data.i;
import com.facebook.contacts.data.k;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.ops.m;
import com.google.common.base.Preconditions;
import com.google.common.d.a.s;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.contacts.database:
//            a, c, d, b

public class AddressBookPeriodicRunner
    implements b
{

    private static final Class a = com/facebook/contacts/database/AddressBookPeriodicRunner;
    private final Context b;
    private final AlarmManager c;
    private final k d;
    private final com.facebook.auth.b.b e;
    private final com.facebook.fbservice.ops.k f;
    private final a g;
    private final ExecutorService h;
    private final javax.inject.a i;
    private final com.facebook.common.v.a j;
    private final com.facebook.config.a.d k;
    private s l;
    private s m;
    private long n;
    private long o;
    private PendingIntent p;
    private volatile boolean q;

    public AddressBookPeriodicRunner(Context context, AlarmManager alarmmanager, k k1, com.facebook.auth.b.b b1, com.facebook.fbservice.ops.k k2, a a1, ExecutorService executorservice, 
            javax.inject.a a2, com.facebook.common.v.a a3, com.facebook.config.a.d d1)
    {
        o = -1L;
        b = context;
        c = alarmmanager;
        d = k1;
        e = b1;
        f = k2;
        g = a1;
        h = executorservice;
        i = a2;
        j = a3;
        k = d1;
    }

    static void a(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        addressbookperiodicrunner.o();
    }

    static void b(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        addressbookperiodicrunner.l();
    }

    private void b(boolean flag)
    {
        h.submit(new com.facebook.contacts.database.a(this, flag));
    }

    static void c(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        addressbookperiodicrunner.j();
    }

    static Class g()
    {
        return a;
    }

    private boolean h()
    {
        if (!e.b())
        {
            return false;
        }
        if (o == -1L)
        {
            o = d.a(i.a, -1L);
        }
        return i();
    }

    private boolean i()
    {
        long l1 = g.a() - o;
        boolean flag = j.a();
        if (o == -1L)
        {
            com.facebook.debug.log.b.b(a, "Contacts sync interval reached: sync has not been run");
            return true;
        }
        if (flag && l1 >= 0x5265c00L)
        {
            com.facebook.debug.log.b.b(a, "Contacts sync background interval reached: last sync %dms ago", new Object[] {
                Long.valueOf(l1)
            });
            return true;
        }
        if (!flag && l1 >= 0x36ee80L)
        {
            com.facebook.debug.log.b.b(a, "Contacts sync foreground interval reached: last sync %dms ago", new Object[] {
                Long.valueOf(l1)
            });
            return true;
        }
        Class class1 = a;
        String s1;
        if (flag)
        {
            s1 = "background";
        } else
        {
            s1 = "foreground";
        }
        com.facebook.debug.log.b.a(class1, "Shouldn't sync friends/contacts in %s, last sync %dms ago", new Object[] {
            s1, Long.valueOf(l1)
        });
        return false;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        m = null;
        com.facebook.debug.log.b.b(a, "Downloading contacts complete.");
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void k()
    {
        o = g.a();
        n = 0L;
        a(false);
        com.facebook.contacts.h.a.a(b.getApplicationContext().getContentResolver());
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        m = null;
        l = null;
        if (n != 0L)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        n = 30000L;
_L1:
        n = Math.min(n, 0x36ee80L);
        a(false);
        this;
        JVM INSTR monitorexit ;
        return;
        n = 2L * n;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        Object obj;
        boolean flag;
        if (l == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        obj = new Bundle();
        obj = f.a(d.g, ((Bundle) (obj)));
        com.facebook.debug.log.b.b(a, "startFavoritesSync - starting");
        l = ((m) (obj)).a();
        com.google.common.d.a.i.a(l, new c(this));
    }

    private void n()
    {
        Bundle bundle;
        boolean flag;
        if (m == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        bundle = new Bundle();
        m = f.a(d.a, bundle).a();
        com.google.common.d.a.i.a(m, new com.facebook.contacts.database.d(this));
    }

    private void o()
    {
        n();
        l = null;
    }

    public void a()
    {
        b(true);
    }

    void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        PendingIntent pendingintent = p;
        if (pendingintent == null || flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (q || !((Boolean)i.b()).booleanValue() || !h())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        n = 0L;
        Intent intent = new Intent(b, com/facebook/contacts/database/AddressBookPeriodicRunner$LocalBroadcastReceiver);
        intent.setAction("com.facebook.orca.database.ACTION_ALARM");
        p = PendingIntent.getBroadcast(b, -1, intent, 0);
        long l1 = g.a();
        long l2 = n;
        c.set(1, l1 + l2, p);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        b(false);
    }

    void c()
    {
        h.submit(new com.facebook.contacts.database.b(this));
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.debug.log.b.b(a, "Clearing cached user data.");
        if (m != null)
        {
            m.cancel(false);
            m = null;
        }
        if (l != null)
        {
            l.cancel(false);
            l = null;
        }
        e();
        n = 0L;
        o = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (p != null)
        {
            c.cancel(p);
            p = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!h()) goto _L2; else goto _L1
_L1:
        if (l == null) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.b(a, "Not processing address book (favorites sync operation in progress)");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        com.facebook.debug.log.b.b(a, "Not processing address book (contact sync operation in progress)");
          goto _L2
        Exception exception;
        exception;
        throw exception;
label0:
        {
            if (k != com.facebook.config.a.d.POKE)
            {
                break label0;
            }
            o();
        }
          goto _L2
        m();
          goto _L2
    }

}
