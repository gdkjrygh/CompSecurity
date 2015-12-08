// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.a.h;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityBanned;
import com.tinder.activities.ActivityBlend;
import com.tinder.activities.ActivityCallToActionBrowser;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.ActivityLogin;
import com.tinder.activities.ActivityMain;
import com.tinder.activities.ActivityPassport;
import com.tinder.activities.ActivityVerification;
import com.tinder.activities.WebViewActivityInstagram;
import com.tinder.adapters.ActivityMainPagerAdapter;
import com.tinder.adapters.ab;
import com.tinder.adapters.l;
import com.tinder.adapters.v;
import com.tinder.adapters.x;
import com.tinder.adapters.z;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.a;
import com.tinder.c.ae;
import com.tinder.c.ai;
import com.tinder.c.n;
import com.tinder.enums.Environment;
import com.tinder.fragments.FragmentIntro;
import com.tinder.fragments.FragmentMap;
import com.tinder.fragments.FragmentSideMenu;
import com.tinder.fragments.FragmentUsername;
import com.tinder.fragments.ac;
import com.tinder.fragments.af;
import com.tinder.fragments.aj;
import com.tinder.fragments.ay;
import com.tinder.fragments.ba;
import com.tinder.fragments.bc;
import com.tinder.fragments.bd;
import com.tinder.fragments.bh;
import com.tinder.fragments.bk;
import com.tinder.fragments.bm;
import com.tinder.fragments.bv;
import com.tinder.fragments.c;
import com.tinder.fragments.e;
import com.tinder.fragments.g;
import com.tinder.fragments.k;
import com.tinder.fragments.m;
import com.tinder.fragments.o;
import com.tinder.fragments.s;
import com.tinder.fragments.u;
import com.tinder.fragments.w;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerNotifications;
import com.tinder.managers.aa;
import com.tinder.managers.ad;
import com.tinder.managers.d;
import com.tinder.managers.f;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.parse.UserParse;
import com.tinder.services.GCMListenerService;
import com.tinder.services.GCMRegistrationIntentService;
import com.tinder.services.WearClientService;
import com.tinder.services.WearIntentService;
import com.tinder.utils.b;
import com.tinder.views.DevControls;
import com.tinder.views.LoadingView;
import com.tinder.views.MatchListLayout;
import com.tinder.views.RecCard;

public interface ak
{

    public abstract void a(h h1);

    public abstract void a(ActivityAddPhoto activityaddphoto);

    public abstract void a(ActivityBanned activitybanned);

    public abstract void a(ActivityBlend activityblend);

    public abstract void a(ActivityCallToActionBrowser activitycalltoactionbrowser);

    public abstract void a(ActivityEditProfile activityeditprofile);

    public abstract void a(ActivityLogin activitylogin);

    public abstract void a(ActivityMain activitymain);

    public abstract void a(ActivityPassport activitypassport);

    public abstract void a(ActivityVerification activityverification);

    public abstract void a(WebViewActivityInstagram webviewactivityinstagram);

    public abstract void a(ActivityMainPagerAdapter activitymainpageradapter);

    public abstract void a(ab ab);

    public abstract void a(l l1);

    public abstract void a(v v);

    public abstract void a(x x);

    public abstract void a(z z);

    public abstract void a(ActivitySignedInBase activitysignedinbase);

    public abstract void a(a a1);

    public abstract void a(ae ae);

    public abstract void a(ai ai);

    public abstract void a(com.tinder.c.ak ak1);

    public abstract void a(n n1);

    public abstract void a(com.tinder.c.v v);

    public abstract void a(com.tinder.c.x x);

    public abstract void a(com.tinder.c.z z);

    public abstract void a(com.tinder.cards.a a1);

    public abstract void a(FragmentIntro fragmentintro);

    public abstract void a(FragmentMap fragmentmap);

    public abstract void a(FragmentSideMenu fragmentsidemenu);

    public abstract void a(FragmentUsername fragmentusername);

    public abstract void a(com.tinder.fragments.a a1);

    public abstract void a(ac ac);

    public abstract void a(af af);

    public abstract void a(aj aj);

    public abstract void a(ay ay);

    public abstract void a(ba ba);

    public abstract void a(bc bc);

    public abstract void a(bd bd);

    public abstract void a(bh bh);

    public abstract void a(bk bk);

    public abstract void a(bm bm);

    public abstract void a(bv bv);

    public abstract void a(c c1);

    public abstract void a(e e1);

    public abstract void a(g g1);

    public abstract void a(k k1);

    public abstract void a(m m1);

    public abstract void a(o o1);

    public abstract void a(s s);

    public abstract void a(u u);

    public abstract void a(w w);

    public abstract void a(ManagerApp managerapp);

    public abstract void a(com.tinder.managers.w w);

    public abstract void a(GCMListenerService gcmlistenerservice);

    public abstract void a(GCMRegistrationIntentService gcmregistrationintentservice);

    public abstract void a(WearClientService wearclientservice);

    public abstract void a(WearIntentService wearintentservice);

    public abstract void a(com.tinder.utils.ae ae);

    public abstract void a(b b1);

    public abstract void a(DevControls devcontrols);

    public abstract void a(LoadingView loadingview);

    public abstract void a(MatchListLayout matchlistlayout);

    public abstract void a(RecCard reccard);

    public abstract Environment b();

    public abstract de.greenrobot.event.c c();

    public abstract UserParse d();

    public abstract f e();

    public abstract y f();

    public abstract d g();

    public abstract i h();

    public abstract com.tinder.managers.z i();

    public abstract com.tinder.managers.ae j();

    public abstract ad k();

    public abstract com.tinder.managers.g l();

    public abstract com.tinder.a.f m();

    public abstract aa n();

    public abstract ManagerNotifications o();

    public abstract com.tinder.managers.ab p();
}
