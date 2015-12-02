// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.auth.f.b;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.ops.n;
import com.facebook.orca.f.k;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.orca.server.an;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.prefs.shared.f;
import com.facebook.user.User;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.d.a.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.prefs:
//            aw, n, ax, ay

public class av
    implements b
{

    private static Class a = com/facebook/orca/prefs/av;
    private final Handler b;
    private final com.facebook.fbservice.ops.k c;
    private final d d;
    private final f e = new aw(this);
    private final k f;
    private final a g;
    private n h;
    private Map i;
    private ModifyThreadParams j;
    private long k;
    private int l;
    private volatile boolean m;

    public av(d d1, com.facebook.fbservice.ops.k k1, k k2, a a1, Handler handler)
    {
        d = d1;
        c = k1;
        f = k2;
        g = a1;
        b = handler;
        d1.a(e);
    }

    static void a(av av1)
    {
        av1.e();
    }

    static void a(av av1, ae ae1)
    {
        av1.a(ae1);
    }

    private void a(ae ae1)
    {
_L2:
        return;
        if (m || !ae1.a(n.A)) goto _L2; else goto _L1
_L1:
        String as[] = ae1.b(n.A).split("/");
        if (as.length != 2) goto _L2; else goto _L3
_L3:
        ae1 = Uri.decode(as[0]);
        if (!"muted_until2".equals(as[1]) || f.b(ae1) == null) goto _L2; else goto _L4
_L4:
        Object obj = com.facebook.orca.prefs.n.a(ae1);
        obj = NotificationSetting.b(d.a(((ae) (obj)), 0L));
        this;
        JVM INSTR monitorenter ;
        b().put(ae1, (new an()).a(ae1).c(true).a(((NotificationSetting) (obj))).h());
        this;
        JVM INSTR monitorexit ;
        return;
        ae1;
        this;
        JVM INSTR monitorexit ;
        throw ae1;
    }

    private Map b()
    {
        if (i == null)
        {
            i = ik.a();
            k = 4000L;
            c();
        }
        return i;
    }

    static void b(av av1)
    {
        av1.f();
    }

    private void c()
    {
        b.postDelayed(new ax(this), k);
    }

    static void c(av av1)
    {
        av1.g();
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Map map = i;
        if (map != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h != null) goto _L1; else goto _L3
_L3:
        Object obj;
        obj = i.values().iterator();
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        i = null;
          goto _L1
        Exception exception;
        exception;
        throw exception;
        ModifyThreadParams modifythreadparams = (ModifyThreadParams)((Iterator) (obj)).next();
        ((Iterator) (obj)).remove();
        j = modifythreadparams;
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("modifyThreadParams", modifythreadparams);
        h = c.a(aq.v, ((Bundle) (obj))).a();
        com.google.common.d.a.i.a(h, new ay(this));
          goto _L1
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        h = null;
        j = null;
        k = 4000L;
        l = 0;
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        h = null;
        if (i == null)
        {
            i = ik.a();
        }
        String s = j.a();
        if (!i.containsKey(s))
        {
            i.put(s, j);
        }
        j = null;
        if ((long)l >= 5L) goto _L2; else goto _L1
_L1:
        l = l + 1;
        k = Math.min(2L * k, 0x927c0L);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Failed to update thread notification settings. Retrying in ").append(k / 1000L).append(" seconds").toString());
        c();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = 0;
        k = 4000L;
        i = null;
        com.facebook.debug.log.b.c(a, "Failed to update thread notification settings. Giving up.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        com.facebook.user.UserKey userkey;
        Object obj1;
        userkey = f.a().c();
        obj1 = f.c((FolderName)g.b());
        m = true;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        obj1 = ((List) (obj1)).iterator();
_L2:
        Object obj2;
        String s;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_230;
            }
            obj2 = (ThreadSummary)((Iterator) (obj1)).next();
            s = ((ThreadSummary) (obj2)).a();
            obj2 = ((ThreadSummary) (obj2)).a(userkey);
        } while (obj2 == null);
        obj2 = ((ThreadParticipant) (obj2)).h();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        ae ae1;
        NotificationSetting notificationsetting;
        ae1 = com.facebook.orca.prefs.n.a(s);
        notificationsetting = NotificationSetting.b(d.a(ae1, 0L));
        if (((NotificationSetting) (obj2)).d() != notificationsetting.d() && (j == null || !Objects.equal(j.a(), s))) goto _L3; else goto _L2
_L3:
        if (i == null || !i.containsKey(s)) goto _L4; else goto _L2
_L4:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj = d.b();
        ((e) (obj)).a(ae1, ((NotificationSetting) (obj2)).d());
          goto _L2
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        m = false;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        ((e) (obj)).a();
        m = false;
        return;
    }

    public void d()
    {
        d.b(e);
    }

}
