// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.ComponentName;
import com.facebook.auth.annotations.IsWildfireRegEnabled;
import com.facebook.auth.annotations.ShouldExpireAuthToken;
import com.facebook.auth.userscope.UserScoped;
import com.facebook.b.a.g;
import com.facebook.breakpad.b;
import com.facebook.common.annotations.IsDebugLogsEnabled;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.common.w.q;
import com.facebook.contacts.annotations.IsContactEventsUploadPermitted;
import com.facebook.inject.c;
import com.facebook.l.j;
import com.facebook.messages.ipc.f;
import com.facebook.messages.threads.ui.name.DefaultThreadNameViewComputer;
import com.facebook.messages.threads.ui.name.NamesOnlyThreadNameViewComputer;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.annotations.IsAnalyticsEnabled;
import com.facebook.orca.annotations.IsAppIconBadgingEnabled;
import com.facebook.orca.annotations.IsBroadcastEnabled;
import com.facebook.orca.annotations.IsContactsUploadPermitted;
import com.facebook.orca.annotations.IsDataProcessEnabled;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsEnabled;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsNewSectionEnabled;
import com.facebook.orca.annotations.IsEmptyComposeLikeEnabled;
import com.facebook.orca.annotations.IsInstallMessengerChatHeadPromoEnabled;
import com.facebook.orca.annotations.IsInviteByPhonePermitted;
import com.facebook.orca.annotations.IsMergeThreadsEnabled;
import com.facebook.orca.annotations.IsMessengerBugReporterEnabled;
import com.facebook.orca.annotations.IsMobileOnlineAvailabilityPermitted;
import com.facebook.orca.annotations.IsMusicPresenceEnabled;
import com.facebook.orca.annotations.IsNuxSmsForced;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.annotations.IsPartialUpgradeEnabled;
import com.facebook.orca.annotations.IsPresenceEnabled;
import com.facebook.orca.annotations.IsSmsNuxSendCliffDisabled;
import com.facebook.orca.annotations.IsSuggestionsEnabled;
import com.facebook.orca.annotations.IsTesterPrefsEnabled;
import com.facebook.orca.annotations.IsTextOnlyEnabled;
import com.facebook.orca.annotations.IsThreadlistOnlineAndMobilePresenceEnabled;
import com.facebook.orca.annotations.IsThreadlistOnlinePresenceEnabled;
import com.facebook.orca.annotations.IsThreadviewDivebarButtonEnabled;
import com.facebook.orca.annotations.LoggedInUserPhoneNumber;
import com.facebook.orca.annotations.ShouldShowInviteAllContacts;
import com.facebook.orca.annotations.ShouldSkipContactImportNux;
import com.facebook.orca.annotations.ShowGroupsSectionInDivebar;
import com.facebook.orca.annotations.ShowThirdButtonInThreadList;
import com.facebook.orca.annotations.WillShowInstallMessengerChatHeadPromo;
import com.facebook.orca.broadcast.r;
import com.facebook.orca.common.ui.titlebar.ap;
import com.facebook.orca.compose.ar;
import com.facebook.orca.contacts.a.l;
import com.facebook.orca.contacts.annotations.IsChatContextEnabled;
import com.facebook.orca.contacts.divebar.bm;
import com.facebook.orca.contacts.divebar.bn;
import com.facebook.orca.contacts.divebar.bq;
import com.facebook.orca.contacts.divebar.bs;
import com.facebook.orca.contacts.picker.bi;
import com.facebook.orca.emoji.s;
import com.facebook.orca.f.ac;
import com.facebook.orca.f.ad;
import com.facebook.orca.f.af;
import com.facebook.orca.f.n;
import com.facebook.orca.f.z;
import com.facebook.orca.fbwebrtc.ai;
import com.facebook.orca.g.ab;
import com.facebook.orca.g.w;
import com.facebook.orca.login.an;
import com.facebook.orca.notify.x;
import com.facebook.orca.nux.i;
import com.facebook.orca.nux.u;
import com.facebook.orca.photos.b.o;
import com.facebook.orca.prefs.au;
import com.facebook.orca.prefs.av;
import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.k;
import com.facebook.orca.protocol.d;
import com.facebook.orca.protocol.methods.y;
import com.facebook.orca.server.aj;
import com.facebook.orca.server.module.a;
import com.facebook.orca.sms.ah;
import com.facebook.orca.stickers.am;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.orca.threadlist.bf;
import com.facebook.orca.threadlist.m;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threadview.aq;
import com.facebook.orca.threadview.ci;
import com.facebook.orca.threadview.dn;
import com.facebook.orca.threadview.do;
import com.facebook.orca.upsell.e;
import com.facebook.prefs.shared.IsInternalPrefsEnabled;
import com.facebook.push.annotations.IsMobileOnlineAvailabilityEnabled;
import com.facebook.user.p;

// Referenced classes of package com.facebook.orca.app:
//            bk, az, fg, bu, 
//            dt, bg, fj, bt, 
//            t, o, p, dj, 
//            cx, cj, l, co, 
//            cf, ci, ct, db, 
//            di, dl, cc, bp, 
//            bo, al, ae, bm, 
//            br, bw, z, v, 
//            af, bb, j, ap, 
//            cz, bh, g, bf, 
//            m, q, ai, aj, 
//            bd, at, k, ad, 
//            bq, ch, cq, an, 
//            y, x, ab, u, 
//            ac, w, aa, ak, 
//            ax, ar, as, au, 
//            ao, bs, ce, bx, 
//            ba, cr, cv, cw, 
//            cd, da, cs, dd, 
//            dc, bc, cy, ca, 
//            n, bi, av, aw, 
//            ay, ag, cl, bv, 
//            r, dg, de, by, 
//            df, bl, dn, bz, 
//            dm, dh, cp, cm, 
//            cn, b, do, dq, 
//            dr, ds, dp, bj, 
//            cg, s, ah, dk, 
//            aq, cb, bn, cu, 
//            ck, be, am

public class h extends c
{

    public h()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new bi())));
        a(((com.facebook.inject.ag) (new s())));
        a(((com.facebook.inject.ag) (new a())));
        a(((com.facebook.inject.ag) (new ah())));
        a(((com.facebook.inject.ag) (new ab())));
        a(((com.facebook.inject.ag) (new f())));
        a(((com.facebook.inject.ag) (new g())));
        a(((com.facebook.inject.ag) (new x())));
        a(((com.facebook.inject.ag) (new com.facebook.orca.d.s())));
        f(com/facebook/breakpad/b);
        a(((com.facebook.inject.ag) (new ai())));
        f(com/facebook/e/h);
        a(((com.facebook.inject.ag) (new com.facebook.orca.push.c())));
        a(((com.facebook.inject.ag) (new com.facebook.orca.background.f())));
        a(((com.facebook.inject.ag) (new d())));
        a(((com.facebook.inject.ag) (new com.facebook.zero.c())));
        a(((com.facebook.inject.ag) (new com.facebook.messages.b.a())));
        a(((com.facebook.inject.ag) (new com.facebook.user.x())));
        a(((com.facebook.inject.ag) (new com.facebook.user.tiles.g())));
        a(((com.facebook.inject.ag) (new am())));
        a(((com.facebook.inject.ag) (new o())));
        f(com/facebook/backgroundtasks/f);
        f(com/facebook/debug/f/h);
        f(com/facebook/debug/fps/d);
        f(com/facebook/d/a/a);
        a(com/facebook/common/w/q).a(com/facebook/orca/annotations/IsAnalyticsEnabled).c(com/facebook/orca/b/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsPresenceEnabled).a(Boolean.TRUE);
        a(com/facebook/l/j).c(com/facebook/orca/prefs/au);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsThreadlistOnlinePresenceEnabled).c(com/facebook/orca/presence/c);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsThreadlistOnlineAndMobilePresenceEnabled).c(com/facebook/orca/presence/b);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMusicPresenceEnabled).c(com/facebook/orca/presence/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled).c(com/facebook/orca/contacts/a/f);
        a(java/lang/Boolean).a(com/facebook/orca/contacts/annotations/IsChatContextEnabled).c(com/facebook/orca/contacts/a/b);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled).c(com/facebook/orca/contacts/a/g);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsThreadviewDivebarButtonEnabled).c(com/facebook/orca/threadview/h);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsTesterPrefsEnabled).c(com/facebook/orca/prefs/k);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMergeThreadsEnabled).c(com/facebook/orca/sms/j);
        a(java/lang/Boolean).a(com/facebook/contacts/annotations/IsContactEventsUploadPermitted).c(com/facebook/contacts/i/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsContactsUploadPermitted).c(com/facebook/orca/contacts/a/c);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShouldShowInviteAllContacts).c(com/facebook/orca/contacts/a/l);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsPartialAccount).c(com/facebook/orca/auth/b);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShouldSkipContactImportNux).c(com/facebook/orca/nux/i);
        a(java/lang/Boolean).a(com/facebook/prefs/shared/IsInternalPrefsEnabled).c(com/facebook/orca/prefs/g);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMessengerBugReporterEnabled).c(com/facebook/orca/e/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsInviteByPhonePermitted).c(com/facebook/orca/contacts/a/i);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsNuxSmsForced).c(com/facebook/orca/nux/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSmsNuxSendCliffDisabled).c(com/facebook/orca/nux/b);
        a(com/facebook/orca/a/a).c(com/facebook/orca/a/h);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShowGroupsSectionInDivebar).c(com/facebook/orca/contacts/divebar/bq);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSuggestionsEnabled).c(com/facebook/orca/creation/j);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsBroadcastEnabled).c(com/facebook/orca/broadcast/r);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShowThirdButtonInThreadList).c(com/facebook/orca/broadcast/s);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsEmptyComposeLikeEnabled).c(com/facebook/orca/compose/ar);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsInstallMessengerChatHeadPromoEnabled).c(com/facebook/orca/upsell/c);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/WillShowInstallMessengerChatHeadPromo).c(com/facebook/orca/upsell/e);
        a(com/facebook/orca/a/d).a(new bk(null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsTextOnlyEnabled).c(com/facebook/orca/contacts/divebar/bm);
        a(com/facebook/orca/threads/g).a(new com.facebook.orca.app.az(this, null));
        a(com/facebook/orca/threads/FolderType).a(com/facebook/orca/annotations/CurrentFolder).c(com/facebook/orca/threads/c);
        a(com/facebook/orca/threads/FolderName).a(com/facebook/orca/annotations/CurrentFolder).c(com/facebook/orca/threads/b);
        a(java/lang/Boolean).a(com/facebook/common/annotations/IsDebugLogsEnabled).c(com/facebook/common/c/e);
        b(java/lang/Boolean).a(com/facebook/orca/annotations/IsDataProcessEnabled).a(Boolean.valueOf(false));
        a(java/lang/String).a(com/facebook/orca/annotations/LoggedInUserPhoneNumber).c(com/facebook/orca/common/a/a);
        a(com/facebook/orca/app/fg).a(new bu(this, null)).a();
        a(com/facebook/orca/app/dt).a(new bg(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/app/fj).a(new bt(this, null));
        a(com/facebook/orca/f/k).a(new t(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/user/p).b(com/facebook/orca/f/k);
        a(com/facebook/orca/f/g).a(new com.facebook.orca.app.o(this, null));
        a(com/facebook/orca/f/i).a(new com.facebook.orca.app.p(this, null));
        a(com/facebook/orca/f/af).a(new dj(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/ac).a(new cx(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/r).a(new cj(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/b).a(new com.facebook.orca.app.l(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/x).a(new co(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/o).a(new cf(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/p).a(new com.facebook.orca.app.ci(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/f/z).a(new ct(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/threads/q).a(new db(this, null)).d();
        a(com/facebook/orca/f/ad).a(new di(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/prefs/az).a(new dl(this, null)).a();
        a(com/facebook/l/k).a(new cc(this, null)).a();
        a(com/facebook/l/b).a(new bp(this, null));
        a(com/facebook/l/c).a(new bo(this, null)).a();
        a(com/facebook/common/c/a).a(new al(this, null)).a();
        a(com/facebook/orca/photos/a/b).a(new ae(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/photos/a/e).a(new com.facebook.orca.app.bm(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/common/a/b).a(new br(this, null)).a();
        a(com/facebook/user/i).a(new bw(this, null)).a();
        a(com/facebook/orca/g/p).a(new com.facebook.orca.app.z(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/g/e).a(new v(this, null)).a();
        a(com/facebook/orca/f/l).a(new com.facebook.orca.app.af(this, null));
        a(com/facebook/orca/threadview/k).a(new bb(this, null)).d();
        a(com/facebook/orca/threads/a).a(new com.facebook.orca.app.j(null)).a();
        a(com/facebook/orca/prefs/b).a(new com.facebook.orca.app.ap(this, null)).c();
        a(com/facebook/orca/prefs/av).a(new cz(this, null)).a(com/facebook/auth/userscope/UserScoped, com.facebook.inject.f.EAGER);
        a(com/facebook/orca/server/aj).a(new bh(this, null)).c();
        a(com/facebook/orca/app/g).a(new com.facebook.orca.app.bf(this, null));
        a(com/facebook/orca/attachments/a).a(new com.facebook.orca.app.m(this, null)).d();
        a(com/facebook/orca/f/j).a(new com.facebook.orca.app.q(this, null));
        a(com/facebook/ui/d/a).a(new com.facebook.orca.app.ai(this, null));
        a(com/facebook/ui/d/d).a(new com.facebook.orca.app.aj(this, null));
        a(com/facebook/orca/common/ui/a/b).a(new bd(this, null));
        a(com/facebook/orca/p/e).a(new at(this, null)).a();
        a(com/facebook/orca/common/ui/widgets/a).a(new com.facebook.orca.app.k(this, null));
        a(com/facebook/messages/threads/ui/name/e).a(com/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer).a(new com.facebook.orca.app.ad(this, null));
        a(com/facebook/messages/threads/ui/name/e).a(com/facebook/messages/threads/ui/name/NamesOnlyThreadNameViewComputer).a(new com.facebook.orca.app.bq(this, null));
        a(com/facebook/orca/common/ui/widgets/text/f).a(new ch(this, null));
        a(com/facebook/messages/threads/ui/name/a).a(new cq(this, null));
        a(com/facebook/common/n/a).a(new com.facebook.orca.app.an(this, null));
        a(com/facebook/orca/g/o).a(new com.facebook.orca.app.y(this, null));
        a(com/facebook/orca/g/g).a(new com.facebook.orca.app.x(this, null));
        a(com/facebook/orca/g/r).a(new com.facebook.orca.app.ab(this, null));
        a(com/facebook/orca/g/a).a(new com.facebook.orca.app.u(this, null));
        a(com/facebook/orca/g/w).a(new com.facebook.orca.app.ac(this, null));
        a(com/facebook/orca/g/f).a(new com.facebook.orca.app.w(this, null));
        a(com/facebook/orca/g/q).a(new aa(this, null));
        a(com/facebook/ui/d/e).a(new ak(this, null));
        a(com/facebook/orca/h/c).a(new ax(this, null));
        a(com/facebook/orca/images/h).a(new com.facebook.orca.app.ar(this, null));
        a(com/facebook/orca/images/i).a(new as(this, null));
        a(com/facebook/orca/k/e).a(new com.facebook.orca.app.au(this, null));
        a(com/facebook/orca/k/b).a(new ao(this, null));
        a(com/facebook/orca/photos/picking/e).a(new com.facebook.orca.app.bs(this, null));
        a(com/facebook/orca/push/a/b).a(new ce(this, null));
        a(com/facebook/orca/f/n).a(new bx(this, null)).d();
        a(com/facebook/mqtt/a/a).a(new ba(this, null));
        a(com/facebook/orca/threadlist/m).a(new cr(this, null));
        a(com/facebook/orca/threadlist/af).a(new cv(this, null));
        a(com/facebook/orca/threadlist/bf).a(new cw(this, null));
        a(com/facebook/orca/threadlist/i).a(new cd(null));
        a(com/facebook/orca/nux/u).a(new da(this, null));
        a(com/facebook/orca/threads/n).a(new cs(this, null)).b();
        a(com/facebook/orca/threads/s).a(new dd(this, null));
        a(com/facebook/orca/threads/r).a(new dc(this, null));
        a(com/facebook/orca/threadview/s).a(new bc(this, null));
        a(com/facebook/orca/threadview/aq).a(new cy(this, null));
        a(com/facebook/contacts/e/e).a(new ca(this, null));
        a(com/facebook/orca/p/a).a(new com.facebook.orca.app.n(this, null));
        a(com/facebook/orca/threads/l).a(new com.facebook.orca.app.bi(this, null));
        a(com/facebook/orca/h/a).a(new com.facebook.orca.app.av(this, null));
        a(com/facebook/orca/h/b).a(new aw(this, null));
        a(com/facebook/orca/l/a).a(new ay(this, null));
        a(com/facebook/orca/i/a).a(new ag(this, null));
        a(com/facebook/orca/o/b).a(new cl(this, null));
        a(com/facebook/orca/nux/h).a(new bv(this, null)).a();
        a(com/facebook/orca/p/b).a(new com.facebook.orca.app.r(this, null));
        a(com/facebook/orca/threadview/dn).a(new dg(this, null));
        a(com/facebook/orca/threads/x).a(new de(this, null));
        a(com/facebook/orca/threadview/z).a(new by(this, null)).a();
        a(com/facebook/orca/threadview/ci).a(new df(this, null));
        a(com/facebook/orca/threadview/z).a(new by(this, null));
        a(com/facebook/orca/common/ui/widgets/text/a).a(new bl(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/c/a).a(new com.facebook.orca.app.dn(this, null));
        a(com/facebook/orca/phonenumber/identification/a).a(new bz(this, null));
        a(com/facebook/orca/phonenumber/identification/f).a(new dm(this, null)).a();
        a(com/facebook/orca/threadview/do).a(new dh(this, null)).a();
        a(com/facebook/orca/j/c).a(new cp(this, null)).a();
        a(com/facebook/orca/p/h).a(new cm(this, null));
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMobileOnlineAvailabilityPermitted).c(com/facebook/orca/prefs/i);
        a(java/lang/Boolean).a(com/facebook/push/annotations/IsMobileOnlineAvailabilityEnabled).c(com/facebook/orca/prefs/h);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsPartialUpgradeEnabled).c(com/facebook/orca/prefs/j);
        a(java/lang/Boolean).a(com/facebook/auth/annotations/ShouldExpireAuthToken).a(new cn(this, null));
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsAppIconBadgingEnabled).c(com/facebook/orca/app/b);
        a(java/lang/Boolean).a(com/facebook/auth/annotations/IsWildfireRegEnabled).a(Boolean.valueOf(true));
        a(com/facebook/orca/login/b).a(new com.facebook.orca.app.do(this, null));
        a(com/facebook/orca/login/af).a(new dq(this, null));
        a(com/facebook/orca/login/ai).a(new dr(this, null));
        a(com/facebook/orca/login/an).a(new ds(this, null));
        a(com/facebook/orca/contacts/divebar/bs).a(new dp(this, null)).a();
        a(com/facebook/orca/e/b).a(new bj(null)).a();
        a(com/facebook/orca/contacts/divebar/bn).a(new cg(null)).a();
        a(com/facebook/orca/threadlist/c).a(new com.facebook.orca.app.s(null)).a();
        a(com/facebook/orca/contacts/divebar/a).a(new com.facebook.orca.app.ah(null)).a();
        a(com/facebook/orca/common/ui/titlebar/ap).a(new dk(this, null));
        a(com/facebook/orca/compose/aq).a(new com.facebook.orca.app.aq(this, null)).a();
        a(com/facebook/orca/photos/c/a).a(new cb(this, null)).a();
        c(com/facebook/debug/log/e).a(com/facebook/common/c/a);
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/orca/app/fg);
        c(com/facebook/auth/a/b).a(com/facebook/orca/app/fj);
        c(com/facebook/f/f).a(com/facebook/orca/protocol/methods/y);
        c(com/facebook/abtest/qe/f/b).a(com/facebook/orca/a/c);
        c(com/facebook/auth/f/b).a(com/facebook/contacts/upload/c).a(com/facebook/orca/contacts/divebar/bs);
        c(com/facebook/bugreporter/c).a(com/facebook/orca/e/b);
        a(com/facebook/orca/presence/d).a(new com.facebook.orca.app.bn(null)).a();
        b(android/content/ComponentName).a(com/facebook/orca/threadlist/ForThreadListActivity).a(new cu(this, null));
        a(com/facebook/orca/threadview/a/a).a(new ck(null)).a();
        a(com/facebook/messages/model/threads/f).a(new be(null)).d();
        b(com/facebook/orca/common/ui/a/a).a(new com.facebook.orca.app.am(this, null)).a();
    }
}
