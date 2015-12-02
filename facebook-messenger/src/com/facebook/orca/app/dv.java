// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.app.Application;
import android.content.ComponentName;
import com.facebook.abtest.qe.g;
import com.facebook.analytics.ak;
import com.facebook.analytics.aw;
import com.facebook.analytics.bt;
import com.facebook.analytics.ck;
import com.facebook.auth.annotations.IsFirstPartySsoEnabled;
import com.facebook.auth.d.q;
import com.facebook.auth.login.ap;
import com.facebook.auth.login.y;
import com.facebook.base.a.h;
import com.facebook.base.c.a;
import com.facebook.bugreporter.annotations.IsOldVersionOfTheApp;
import com.facebook.bugreporter.o;
import com.facebook.common.e.d;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnBackgroundThread;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.config.server.IsBootstrapEnabled;
import com.facebook.config.server.k;
import com.facebook.contacts.annotations.IsMobileAppDataEnabled;
import com.facebook.contacts.service.ContactsQueueSet;
import com.facebook.debug.d.e;
import com.facebook.device_id.b;
import com.facebook.f.j;
import com.facebook.http.b.w;
import com.facebook.i.a.n;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.launcherbadges.AppLaunchClass;
import com.facebook.location.s;
import com.facebook.messages.ipc.peer.f;
import com.facebook.orca.a.i;
import com.facebook.orca.activity.l;
import com.facebook.orca.activity.m;
import com.facebook.orca.annotations.IsDataProcessEnabled;
import com.facebook.orca.annotations.MessagesForegroundProviderAuthority;
import com.facebook.orca.annotations.MessagesForegroundProviderUri;
import com.facebook.orca.auth.StartScreenActivity;
import com.facebook.orca.chatheads.annotations.IsChatHeadsMultiProcessEnabled;
import com.facebook.orca.chatheads.cn;
import com.facebook.orca.emoji.p;
import com.facebook.orca.g.aa;
import com.facebook.orca.notify.MessengerForegroundProvider;
import com.facebook.orca.notify.an;
import com.facebook.orca.reflex.IsReflexThreadListEnabled;
import com.facebook.orca.reflex.ReflexThreadListGatekeeper;
import com.facebook.orca.server.MessagesDataQueueSet;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.prefs.shared.ad;
import com.facebook.prefs.shared.t;
import com.facebook.push.mqtt.as;
import com.facebook.push.mqtt.ax;
import com.facebook.push.mqtt.ca;
import com.facebook.reflex.z;
import com.facebook.selfupdate.ae;
import com.facebook.selfupdate.u;
import com.facebook.vvm.annotations.IsVvmSmsDetailedReportingEnabledForUser;
import com.facebook.vvm.annotations.IsVvmSmsReportingEnabledForUser;
import com.facebook.zero.annotations.IsUserCurrentlyZeroRated;
import com.facebook.zero.annotations.IsZeroRatingFeatureEnabled;

// Referenced classes of package com.facebook.orca.app:
//            h, LoginReminderManager, ee, ex, 
//            eb, eu, ec, eg, 
//            dx, eh, el, em, 
//            en, du, ej, ez, 
//            fk, es, fl, et, 
//            ef, ea, ey, ep, 
//            eo, ei, dw, a, 
//            eq, fm, dy, ed, 
//            ek, er, ew, ev, 
//            dz, c, DataProcess, MessagesDataBlueService

public class dv extends c
{

    private final Application a;
    private final com.facebook.config.a.a b;

    public dv(Application application, com.facebook.config.a.a a1)
    {
        a = application;
        b = a1;
    }

    static Application a(dv dv1)
    {
        return dv1.a;
    }

    protected void a()
    {
        e e1 = e.a("OrcaAppModule.configure");
        f(com/facebook/base/c/a);
        a(((com.facebook.inject.ag) (new com.facebook.debug.log.a("msgr"))));
        f(com/facebook/common/f/a);
        f(com/facebook/common/e/d);
        a(((com.facebook.inject.ag) (new t("com.facebook.orca.prefs", "com.facebook.orca.provider.ACCESS"))));
        a(((com.facebook.inject.ag) (new com.facebook.h.d())));
        a(((com.facebook.inject.ag) (new ap())));
        a(((com.facebook.inject.ag) (new com.facebook.auth.broadcast.d())));
        a(((com.facebook.inject.ag) (new q())));
        a(((com.facebook.inject.ag) (new b())));
        a(((com.facebook.inject.ag) (new com.facebook.ui.g.a())));
        a(((com.facebook.inject.ag) (new j())));
        a(((com.facebook.inject.ag) (new com.facebook.orca.app.h())));
        a(((com.facebook.inject.ag) (new cn())));
        a(((com.facebook.inject.ag) (new n())));
        a(((com.facebook.inject.ag) (new f(com.facebook.messages.ipc.peer.j.Messenger))));
        a(((com.facebook.inject.ag) (new aw())));
        a(((com.facebook.inject.ag) (new com.facebook.contacts.data.d())));
        a(((com.facebook.inject.ag) (new w())));
        f(com/facebook/fbservice/b/a);
        a(((com.facebook.inject.ag) (new com.facebook.push.a())));
        a(((com.facebook.inject.ag) (new ax())));
        a(((com.facebook.inject.ag) (new com.facebook.orca.push.b.b())));
        a(((com.facebook.inject.ag) (new com.facebook.push.c2dm.d())));
        a(((com.facebook.inject.ag) (new com.facebook.push.fbpushdata.b())));
        a(((com.facebook.inject.ag) (new k())));
        a(((com.facebook.inject.ag) (new com.facebook.config.server.d("Orca-Android"))));
        a(((com.facebook.inject.ag) (new com.facebook.backgroundlocation.status.e())));
        f(com/facebook/reflex/z);
        a(((com.facebook.inject.ag) (new g())));
        a(((com.facebook.inject.ag) (new o())));
        a(((com.facebook.inject.ag) (new s())));
        a(((com.facebook.inject.ag) (new com.facebook.appconfig.f())));
        a(((com.facebook.inject.ag) (new com.facebook.config.background.b())));
        a(((com.facebook.inject.ag) (new u())));
        a(com/facebook/orca/app/LoginReminderManager).a(new ee(this, null)).c();
        a(com/facebook/config/a/c).b(com/facebook/config/a/a);
        a(java/lang/Boolean).a(com/facebook/auth/annotations/IsFirstPartySsoEnabled).a(Boolean.valueOf(true));
        a(com/facebook/config/a/a).a(b);
        a(com/facebook/orca/emoji/p).a(new ex(this, null)).a();
        a(com/facebook/config/a/b).a(new eb(this, null));
        a(com/facebook/config/a/d).a(new eu(this, null));
        a(java/lang/Boolean).a(com/facebook/zero/annotations/IsZeroRatingFeatureEnabled).c(com/facebook/orca/r/b);
        a(com/facebook/common/w/q).a(com/facebook/zero/annotations/IsUserCurrentlyZeroRated).c(com/facebook/orca/r/a);
        a(java/lang/Boolean).a(com/facebook/config/server/IsBootstrapEnabled).a(Boolean.TRUE);
        c(com/facebook/c/o).a(com/facebook/zero/rewrite/c);
        c(com/facebook/config/background/k).a(com/facebook/zero/a);
        c(com/facebook/auth/a/c).a(com/facebook/zero/a);
        a(com/facebook/orca/intents/b).a(new ec(this, null));
        a(com/facebook/messages/ipc/k).a(new eg(this, null)).a();
        a(com/facebook/analytics/ak).a(new dx(this, null)).a();
        a(com/facebook/orca/notify/an).a(new eh(this, null)).a();
        a(com/facebook/orca/notify/MessengerForegroundProvider).a(new el(this, null)).a();
        a(java/lang/String).a(com/facebook/orca/annotations/MessagesForegroundProviderUri).a("content://com.facebook.orca.notify.FbandroidMessagesForegroundProvider/orca_foreground");
        a(java/lang/String).a(com/facebook/orca/annotations/MessagesForegroundProviderAuthority).a("content://com.facebook.orca.notify.MessengerForegroundProvider/orca_foreground");
        a(com/facebook/auth/login/y).a(new em(this, null)).a();
        a(com/facebook/orca/activity/m).a(new en(this, null));
        a(com/facebook/orca/app/du).a(new ej(this, null));
        a(com/facebook/base/a/h).b(com/facebook/orca/app/du);
        a(com/facebook/orca/common/b/a).a(new ez(this, null));
        a(com/facebook/orca/app/fk).a(new es(this, null));
        a(com/facebook/orca/app/fl).a(new et(this, null));
        a(com/facebook/orca/app/fl).a(new et(this, null));
        a(com/facebook/ui/media/cache/k).a(new ef(this, null));
        a(com/facebook/ui/images/cache/c).a(new ea(null));
        a(com/facebook/orca/j/b).a(new ey(this, null));
        a(com/facebook/ui/f/a).a(new ep(this, null));
        a(com/facebook/orca/auth/c).b(com/facebook/orca/activity/n);
        a(com/facebook/orca/prefs/a).b(com/facebook/orca/activity/l);
        a(com/facebook/orca/activity/n).a(new eo(this, null));
        a(com/facebook/orca/activity/l).a(new ei(this, null));
        a(com.google.inject.a.a(new dw(this))).c(com/facebook/orca/app/a);
        a(java/lang/Boolean).a(com/facebook/contacts/annotations/IsMobileAppDataEnabled).c(com/facebook/orca/p/g);
        a(com/facebook/orca/n/a).a(new eq(this, null));
        a(com/facebook/selfupdate/ae).b(com/facebook/orca/n/a);
        a(com/facebook/orca/common/b/a).a(new ez(this, null));
        c(com/facebook/base/activity/f).a(com/facebook/base/a/h).a(com/facebook/auth/login/w).a(com/facebook/ui/f/b).a(com/facebook/orca/reflex/h);
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/orca/app/fk).a(com/facebook/zero/d/a);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/common/hardware/k).a(com/facebook/l/k).a(com/facebook/l/c).a(com/facebook/push/mqtt/ca).a(com/facebook/analytics/bt).a(com/facebook/common/c/a).a(com/facebook/orca/reflex/e).a(com/facebook/orca/app/fm);
        c(com/facebook/abtest/qe/f/b).a(com/facebook/orca/a/i);
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread).a(com/facebook/orca/app/fl).a(com/facebook/ui/media/cache/k).a(com/facebook/ui/images/cache/c).a(com/facebook/orca/j/b);
        c(com/facebook/prefs/shared/ad).a(com/facebook/orca/reflex/d);
        c(com/facebook/push/mqtt/as).a(com/facebook/push/mqtt/a);
        a(com/facebook/orca/auth/a).a(new dy(null));
        c(com/facebook/auth/broadcast/c).a(com/facebook/orca/auth/a);
        a(java/lang/Boolean).a(com/facebook/vvm/annotations/IsVvmSmsReportingEnabledForUser).c(com/facebook/orca/q/b);
        a(java/lang/Boolean).a(com/facebook/vvm/annotations/IsVvmSmsDetailedReportingEnabledForUser).c(com/facebook/orca/q/a);
        a(java/lang/Boolean).a(com/facebook/bugreporter/annotations/IsOldVersionOfTheApp).a(new ed(this, null));
        a(com/facebook/bugreporter/l).a(new ek(this, null)).a();
        a(com/facebook/analytics/ck).a(new er(this, null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/reflex/IsReflexThreadListEnabled).c(com/facebook/orca/reflex/b);
        a(android/content/ComponentName).a(com/facebook/orca/threadlist/ForThreadListActivity).c(com/facebook/orca/reflex/j);
        c(com/facebook/f/f).a(com/facebook/orca/reflex/c);
        a(com/facebook/common/w/q).a(com/facebook/orca/reflex/ReflexThreadListGatekeeper).a(new com.facebook.f.d("reflex_threadlistactivity"));
        a(com/facebook/orca/reflex/e).a(new ew(this, null)).a();
        a(com/facebook/orca/reflex/h).a(new ev(this, null));
        a(com/facebook/orca/common/ui/a/a).a(new dz(this, null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled).c(com/facebook/orca/app/c);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsDataProcessEnabled).c(com/facebook/orca/app/c);
        a(com/facebook/launcherbadges/a).a(new com.facebook.launcherbadges.b()).a();
        a(java/lang/Class).a(com/facebook/launcherbadges/AppLaunchClass).a(com/facebook/orca/auth/StartScreenActivity);
        e1.a();
    }

    public void a(com.facebook.inject.t t1)
    {
        boolean flag = ((Boolean)t1.a(java/lang/Boolean, com/facebook/orca/annotations/IsDataProcessEnabled)).booleanValue();
        com.facebook.fbservice.service.p p1 = (com.facebook.fbservice.service.p)t1.a(com/facebook/fbservice/service/p);
        com.facebook.d.b.a a1 = (com.facebook.d.b.a)t1.a(com/facebook/d/b/a);
        p1.a(com.facebook.orca.app.DataProcess.a, com/facebook/orca/app/MessagesDataBlueService);
        if (flag)
        {
            p1.b(com/facebook/orca/server/MessagesDataQueueSet, com/facebook/orca/app/MessagesDataBlueService);
            p1.b(com/facebook/contacts/service/ContactsQueueSet, com/facebook/orca/app/MessagesDataBlueService);
            t1 = com.facebook.orca.app.DataProcess.a;
        } else
        {
            t1 = ((com.facebook.common.process.d)t1.a(com/facebook/common/process/d)).c();
        }
        a1.a(com/facebook/orca/g/aa, t1);
        a1.a(com/facebook/contacts/data/b, t1);
        a1.a("contacts", t1);
    }
}
