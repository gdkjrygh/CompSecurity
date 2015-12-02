// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.ap;
import android.widget.RemoteViews;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.s;
import com.facebook.i;
import com.facebook.messages.ipc.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.ui.images.b.h;
import com.facebook.ui.images.b.m;
import com.facebook.ui.images.b.o;
import com.facebook.ui.images.b.r;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.c;
import com.facebook.user.tiles.e;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.notify:
//            a, h, an, c, 
//            ak, ap, aj, ao, 
//            aq, bi, i, w

public class f extends com.facebook.orca.notify.a
{

    private static final Class a = com/facebook/orca/notify/f;
    private final Context b;
    private final NotificationManager c;
    private final an d;
    private final ak e;
    private final k f;
    private final d g;
    private final h h;
    private final c i;
    private final com.facebook.fbservice.ops.k j;
    private final KeyguardManager k;
    private final PowerManager l;
    private final a m;

    public f(Context context, NotificationManager notificationmanager, an an1, ak ak1, k k1, d d1, h h1, 
            c c1, com.facebook.fbservice.ops.k k2, KeyguardManager keyguardmanager, PowerManager powermanager, a a1)
    {
        b = context;
        c = notificationmanager;
        e = ak1;
        d = an1;
        f = k1;
        g = d1;
        h = h1;
        i = c1;
        j = k2;
        k = keyguardmanager;
        l = powermanager;
        m = a1;
    }

    private PendingIntent a(Message message)
    {
        message = new Intent("android.intent.action.VIEW", f.a(message.e()));
        message.setFlags(0x4000000);
        message.putExtra("from_notification", true);
        message.putExtra("trigger", "notification");
        if (((Boolean)m.b()).booleanValue())
        {
            message.putExtra("prefer_chat_if_possible", true);
            return PendingIntent.getService(b, 0, message, 0);
        } else
        {
            return PendingIntent.getActivity(b, 0, message, 0);
        }
    }

    private Bitmap a(ParticipantInfo participantinfo)
    {
        return a(participantinfo, false);
    }

    private Bitmap a(ParticipantInfo participantinfo, boolean flag)
    {
        if (participantinfo == null || !participantinfo.b())
        {
            return null;
        }
        participantinfo = participantinfo.e();
        Object obj = b.getResources();
        int i1;
        int j1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            j1 = (int)((Resources) (obj)).getDimension(0x1050006);
            i1 = (int)((Resources) (obj)).getDimension(0x1050005);
        } else
        {
            j1 = com.facebook.common.w.j.a(b, 48F);
            i1 = com.facebook.common.w.j.a(b, 48F);
        }
        obj = i.a(com.facebook.user.tiles.e.a(participantinfo), i1, j1);
        participantinfo = ((ParticipantInfo) (obj));
        if (flag)
        {
            participantinfo = com.facebook.ui.images.b.m.b(((m) (obj))).a(true).a();
        }
        return h.a(participantinfo).a();
    }

    private com.facebook.orca.notify.h a(String s1, Message message, boolean flag)
    {
        ParticipantInfo participantinfo = b(message);
        Bitmap bitmap;
        if (participantinfo != null && !n.a(participantinfo.d()))
        {
            s1 = participantinfo.d();
            String s2 = message.k();
            message = s1;
            s1 = s2;
        } else
        {
            message = b.getResources().getString(com.facebook.o.app_name);
        }
        if (flag)
        {
            bitmap = a(participantinfo);
        } else
        {
            bitmap = null;
        }
        return new com.facebook.orca.notify.h(message, s1, bitmap, null);
    }

    private void a(String s1, Message message, Notification notification, PendingIntent pendingintent)
    {
        notification.contentIntent = pendingintent;
        s1 = a(s1, message, true);
        int i1 = d(message.e());
        message = new RemoteViews(b.getPackageName(), com.facebook.k.notification_custom);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (com.facebook.orca.notify.h.a(s1) != null)
            {
                message.setImageViewBitmap(i.image, com.facebook.orca.notify.h.a(s1));
            } else
            {
                int j1 = d.e();
                message.setImageViewResource(i.image, j1);
            }
        } else
        {
            int k1 = d.e();
            message.setImageViewResource(i.icon, k1);
            if (com.facebook.orca.notify.h.a(s1) != null)
            {
                message.setImageViewBitmap(i.image, com.facebook.orca.notify.h.a(s1));
            } else
            {
                message.setViewVisibility(i.image, 4);
            }
        }
        message.setTextViewText(i.title, com.facebook.orca.notify.h.b(s1));
        message.setTextViewText(i.text, com.facebook.orca.notify.h.c(s1));
        if (i1 >= 0)
        {
            message.setTextViewText(i.count, Integer.toString(i1));
        } else
        {
            message.setViewVisibility(i.count, 8);
        }
        notification.contentView = message;
    }

    private ParticipantInfo b(Message message)
    {
        ParticipantInfo participantinfo = message.i();
        if (participantinfo == null)
        {
            return null;
        }
        message = e(message.e());
        if (message == null)
        {
            return participantinfo;
        }
        for (message = message.j().iterator(); message.hasNext();)
        {
            ThreadParticipant threadparticipant = (ThreadParticipant)message.next();
            if (Objects.equal(threadparticipant.d(), participantinfo.e()))
            {
                return threadparticipant.a();
            }
        }

        return participantinfo;
    }

    private List b()
    {
        Object obj = g.d(com.facebook.orca.prefs.n.B);
        if (((Set) (obj)).isEmpty())
        {
            return es.d();
        }
        et et1 = es.e();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); et1.b(Uri.decode(((ae)((Iterator) (obj)).next()).b(com.facebook.orca.prefs.n.B)))) { }
        return et1.b();
    }

    private void b(ParticipantInfo participantinfo)
    {
        a(participantinfo, true);
    }

    private void b(String s1)
    {
        String s2 = b.getResources().getString(com.facebook.o.retry_send_heading);
        long l1 = System.currentTimeMillis();
        Notification notification = new Notification(d.e(), s2, l1);
        e.a(notification, new com.facebook.orca.notify.c());
        Object obj = new Intent("android.intent.action.VIEW", f.a(s1));
        ((Intent) (obj)).setFlags(0x4000000);
        ((Intent) (obj)).putExtra("from_notification", true);
        s1 = b.getResources().getString(com.facebook.o.app_name);
        obj = PendingIntent.getActivity(b, 0, ((Intent) (obj)), 0);
        notification.setLatestEventInfo(b, s1, s2, ((PendingIntent) (obj)));
        c.notify(10001, notification);
    }

    private void b(String s1, Message message, Notification notification, PendingIntent pendingintent)
    {
        s1 = a(s1, message, false);
        notification.setLatestEventInfo(b, com.facebook.orca.notify.h.b(s1), com.facebook.orca.notify.h.c(s1), pendingintent);
    }

    private void c()
    {
        com.facebook.prefs.shared.e e1 = g.b();
        e1.b(com.facebook.orca.prefs.n.B);
        e1.a();
    }

    private void c(com.facebook.orca.notify.ap ap1)
    {
        String s1 = ap1.a();
        Message message = ap1.b();
        Object obj = ap1.e();
        long l1 = System.currentTimeMillis();
        int i1 = d.e();
        if (((com.facebook.orca.notify.c) (obj)).f() && !d())
        {
            ap1 = new Notification(i1, "", l1);
        } else
        {
            ap1 = new Notification(i1, s1, l1);
        }
        e.a(ap1, ((com.facebook.orca.notify.c) (obj)));
        obj = a(message);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a(s1, message, ap1, ((PendingIntent) (obj)));
        } else
        {
            b(s1, message, ap1, ((PendingIntent) (obj)));
        }
        com.facebook.debug.log.b.b(a, "Calling android NotificationManager notify");
        c.notify(message.e(), 10000, ap1);
    }

    private void c(String s1)
    {
        s1 = com.facebook.orca.prefs.n.c(s1);
        int i1 = g.a(s1, 0);
        com.facebook.prefs.shared.e e1 = g.b();
        e1.a(s1, i1 + 1);
        e1.a();
    }

    private int d(String s1)
    {
        s1 = com.facebook.orca.prefs.n.c(s1);
        return g.a(s1, 0);
    }

    private boolean d()
    {
        return k.inKeyguardRestrictedInputMode() || !l.isScreenOn();
    }

    private ThreadSummary e(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("fetchThreadParams", (new ac()).a(ThreadCriteria.a(s1)).a(s.DO_NOT_CHECK_SERVER).a(0).h());
        s1 = (OperationResult)com.facebook.common.g.d.a(j.a(aq.k, bundle).b());
        if (s1 == null)
        {
            return null;
        } else
        {
            return ((FetchThreadResult)s1.i()).a();
        }
    }

    public void a()
    {
        com.facebook.debug.log.b.b(a, "Clearing all notifications");
        String s1;
        for (Iterator iterator = b().iterator(); iterator.hasNext(); c.cancel(s1, 10000))
        {
            s1 = (String)iterator.next();
        }

        c.cancel(10001);
        c.cancel(10002);
        c.cancel(10004);
        c.cancel(10007);
        c();
    }

    public void a(aj aj1)
    {
        if (aj1 == aj.LOGGED_OUT)
        {
            c.cancel(10004);
        } else
        if (aj1 == aj.NEW_BUILD)
        {
            c.cancel(10007);
            return;
        }
    }

    protected void a(com.facebook.orca.notify.ap ap1)
    {
        b(b(ap1.b()));
    }

    public void a(String s1)
    {
        com.facebook.debug.log.b.b(a, "Clearing thread notification for %s", new Object[] {
            s1
        });
        c.cancel(s1, 10000);
    }

    protected void b(ao ao1)
    {
        int i1 = d.e();
        Object obj = PendingIntent.getActivity(b, 0, ao1.d(), 0x8000000);
        obj = (new ap(b)).a(ao1.a()).b(ao1.b()).c(ao1.c()).a(i1).a(((PendingIntent) (obj))).b(true).a();
        c.notify(null, 10007, ((Notification) (obj)));
        ao1.a(true);
        ao1.g();
    }

    protected void b(com.facebook.orca.notify.ap ap1)
    {
        com.facebook.orca.notify.aq aq1;
        com.facebook.orca.notify.c c1;
        aq1 = ap1.c();
        c1 = ap1.e();
        if (aq1 != aq.IN_APP_ACTIVE_30S && aq1 != aq.IN_APP_ACTIVE_10S) goto _L2; else goto _L1
_L1:
        if (!c1.b() && aq1 == aq.IN_APP_ACTIVE_30S)
        {
            e.a(c1);
        }
        if (c1.d()) goto _L4; else goto _L3
_L3:
        if (aq1 != aq.IN_APP_ACTIVE_10S) goto _L6; else goto _L5
_L5:
        e.b(c1);
_L4:
        return;
_L6:
        e.c(c1);
        return;
_L2:
        if (ap1.d() && !c1.j())
        {
            c(ap1.b().e());
            c(ap1);
            c1.k();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    protected void b(bi bi1)
    {
        for (bi1 = bi1.a().i_().iterator(); bi1.hasNext(); a((String)bi1.next())) { }
    }

    protected void b(com.facebook.orca.notify.i i1)
    {
        b(i1.a());
        i1.a(true);
        i1.g();
    }

    protected void b(w w1)
    {
        int i1 = d.e();
        Object obj = new Intent("android.intent.action.VIEW", f.a());
        ((Intent) (obj)).putExtra("from_notification", true);
        obj = PendingIntent.getActivity(b, 0, ((Intent) (obj)), 0x8000000);
        obj = (new ap(b)).a(w1.a()).b(w1.b()).c(w1.c()).a(i1).a(((PendingIntent) (obj))).b(true).a();
        e.a(((Notification) (obj)), new com.facebook.orca.notify.c());
        c.notify(null, 10004, ((Notification) (obj)));
        w1.a(true);
        w1.g();
    }

    protected void b(com.facebook.orca.push.a a1)
    {
        int i1 = d.e();
        Object obj1 = new Intent("android.intent.action.VIEW", f.b(a1.a()));
        ((Intent) (obj1)).putExtra("from_notification", true);
        Object obj = a(new ParticipantInfo(new UserKey(com.facebook.user.n.FACEBOOK, String.valueOf(a1.a())), null));
        obj1 = PendingIntent.getActivity(b, 0, ((Intent) (obj1)), 0x8000000);
        obj = (new ap(b)).a(a1.b()).b(a1.c()).c(a1.d()).a(i1).a(((Bitmap) (obj))).a(((PendingIntent) (obj1))).b(true).a();
        e.a(((Notification) (obj)), new com.facebook.orca.notify.c());
        c.notify(a1.a(), 10003, ((Notification) (obj)));
        a1.a(true);
        a1.g();
    }

}
