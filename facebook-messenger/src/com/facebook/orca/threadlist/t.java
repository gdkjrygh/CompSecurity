// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.b.a.b;
import com.facebook.b.a.f;
import com.facebook.base.activity.l;
import com.facebook.common.w.n;
import com.facebook.contacts.annotations.IsContactsListEnabled;
import com.facebook.contacts.contactslist.ContactsListActivity;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.contacts.upload.c;
import com.facebook.h;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.o;
import com.facebook.orca.activity.k;
import com.facebook.orca.annotations.IsAppIconBadgingEnabled;
import com.facebook.orca.annotations.IsNuxSmsForced;
import com.facebook.orca.annotations.IsSmsNuxSendCliffDisabled;
import com.facebook.orca.annotations.ShouldSkipContactImportNux;
import com.facebook.orca.app.g;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.common.ui.titlebar.ap;
import com.facebook.orca.common.ui.widgets.SlidingOutSuggestionView;
import com.facebook.orca.d.af;
import com.facebook.orca.d.bf;
import com.facebook.orca.intents.e;
import com.facebook.orca.notify.as;
import com.facebook.orca.nux.NuxFindingContactsIntroView;
import com.facebook.orca.nux.NuxFindingContactsView;
import com.facebook.orca.nux.NuxScrimView;
import com.facebook.orca.nux.NuxSmsIntroView;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.orca.threadview.ThreadViewFragment;
import com.facebook.widget.ConfirmationView;
import com.google.common.a.es;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.threadlist:
//            s, ae, v, w, 
//            SyncDisabledWarningView, ad, ThreadListFragment, ac, 
//            u, x, y, z, 
//            VersionUpgradePromoView, aa, ab, f, 
//            q

public class t extends l
    implements d, f, k
{

    private static final Class a = com/facebook/orca/threadlist/s;
    private NuxFindingContactsIntroView A;
    private NuxScrimView B;
    private NuxSmsIntroView C;
    private ThreadViewFragment D;
    private String E;
    private boolean F;
    private boolean G;
    private AddressBookPeriodicRunner b;
    private av c;
    private bf d;
    private com.facebook.orca.d.m e;
    private af f;
    private javax.inject.a g;
    private com.facebook.widget.titlebar.a h;
    private ThreadListFragment i;
    private VersionUpgradePromoView j;
    private SlidingOutSuggestionView k;
    private SyncDisabledWarningView l;
    private ConfirmationView m;
    private com.facebook.zero.ui.d n;
    private com.facebook.orca.threadlist.f o;
    private a p;
    private c q;
    private android.support.v4.a.e r;
    private BroadcastReceiver s;
    private b t;
    private ap u;
    private com.facebook.launcherbadges.a v;
    private javax.inject.a w;
    private com.facebook.config.a.a x;
    private com.facebook.orca.nux.k y;
    private NuxFindingContactsView z;

    public t()
    {
    }

    private void A()
    {
        p.a(b());
    }

    private void B()
    {
        if (w() && r() != null)
        {
            String s1 = com.facebook.orca.intents.e.a(r(), "trigger");
            if (s1 != null)
            {
                D.a(s1);
            }
        }
    }

    private void C()
    {
        com.google.common.d.a.i.a(t.d(), new ae(this));
    }

    private void D()
    {
        if (w())
        {
            return;
        }
        if (y != null)
        {
            y.a(new v(this));
            if (y.c())
            {
                e(1);
                return;
            } else
            {
                e(-1);
                return;
            }
        } else
        {
            e(-1);
            return;
        }
    }

    private void E()
    {
        b(new Intent(b(), com/facebook/contacts/contactslist/ContactsListActivity));
    }

    private void F()
    {
        E = null;
        if (y != null)
        {
            y.a(false);
        }
        q q1 = p();
        if (!q1.c())
        {
            return;
        } else
        {
            ad ad1 = q1.a();
            ad1.a(com.facebook.b.orca_fade_in, com.facebook.b.orca_fade_out);
            ad1.c(i);
            ad1.b(D);
            ad1.a();
            q1.b();
            b(false);
            z();
            D.R();
            n.c();
            return;
        }
    }

    private boolean G()
    {
        if (D != null)
        {
            return true;
        }
        q q1 = p();
        D = (ThreadViewFragment)q1.a("threadViewFragment");
        if (D == null)
        {
            if (!q1.c())
            {
                return false;
            }
            D = new ThreadViewFragment();
            D.a(h);
            ad ad1 = q1.a();
            ad1.a(com.facebook.i.orca_threadlist_fragment_container, D, "threadViewFragment");
            ad1.b(D);
            ad1.a();
            q1.b();
        } else
        {
            D.a(h);
        }
        return true;
    }

    private void H()
    {
        if (F)
        {
            Looper.myQueue().addIdleHandler(new w(this));
        }
    }

    static com.facebook.orca.nux.k a(t t1)
    {
        return t1.y;
    }

    private void a(ContactsUploadState contactsuploadstate)
    {
        if (contactsuploadstate.a() == com.facebook.contacts.upload.k.FAILED)
        {
            m.setVisibility(0);
            l.setVisibility(8);
            k.setVisibility(8);
            return;
        }
        m.setVisibility(8);
        l.setVisibility(0);
        l.a();
        if (l.b())
        {
            k.setVisibility(8);
            return;
        } else
        {
            k.setVisibility(0);
            return;
        }
    }

    private void a(ThreadListFragment threadlistfragment)
    {
        threadlistfragment.a(new com.facebook.orca.threadlist.ad(this));
    }

    static void a(t t1, ContactsUploadState contactsuploadstate)
    {
        t1.a(contactsuploadstate);
    }

    static void a(t t1, String s1)
    {
        t1.a(s1);
    }

    private void a(String s1)
    {
        boolean flag = com.facebook.orca.intents.e.a(r(), "from_notification", false);
        boolean flag1 = com.facebook.orca.intents.e.a(r(), "focus_compose", false);
        if (!((s)b()).c_())
        {
            Intent intent = new Intent(b(), com/facebook/orca/threadview/ThreadViewActivity);
            intent.putExtra("thread_id", s1);
            intent.putExtra("trigger", "inbox");
            intent.putExtra("from_notification", flag);
            intent.putExtra("focus_compose", flag1);
            b(intent);
        } else
        if (G())
        {
            q q1 = p();
            if (q1.c())
            {
                b(true);
                ad ad1 = q1.a();
                ad1.a(com.facebook.b.orca_fade_in, com.facebook.b.orca_fade_out);
                ad1.c(D);
                ad1.b(i);
                ad1.a();
                q1.b();
                c.a("tap_conversation_thread");
                c.b("thread_view_module", true);
                if (flag)
                {
                    D.b();
                    i.a(false);
                }
                if (flag1)
                {
                    D.c();
                }
                D.a("inbox");
                D.a(ThreadViewSpec.a(s1));
                E = s1;
                D.b(u());
                n.d();
                if (y != null)
                {
                    y.a(true);
                }
                u.b();
                return;
            }
        }
    }

    static boolean a(t t1, boolean flag)
    {
        t1.G = flag;
        return flag;
    }

    static void b(t t1)
    {
        t1.F();
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            m.setVisibility(8);
            l.setVisibility(8);
            k.setVisibility(8);
            return;
        } else
        {
            a(q.b());
            return;
        }
    }

    static void c(t t1)
    {
        t1.H();
    }

    static av d(t t1)
    {
        return t1.c;
    }

    static c e(t t1)
    {
        return t1.q;
    }

    static a f(t t1)
    {
        return t1.p;
    }

    static Activity g(t t1)
    {
        return t1.b();
    }

    static Activity h(t t1)
    {
        return t1.b();
    }

    static boolean i(t t1)
    {
        return t1.F;
    }

    static Class y()
    {
        return a;
    }

    private void z()
    {
        h.setTitle(com.facebook.common.w.n.a(d(o.thread_list_title)));
        h.setHasProgressBar(true);
        h.setHasBackButton(false);
        h.setCustomTitleView(null);
        com.facebook.widget.titlebar.d d1 = com.facebook.widget.titlebar.d.newBuilder().a(1).a(s().getDrawable(h.orca_divebar_icon)).k();
        h.setButtonSpecs(es.a(d1));
        h.setOnToolbarButtonListener(new ac(this));
        if (h.getTitleBarDivebarButtonOverlay() != null)
        {
            u.a(h);
        }
    }

    public void a(Configuration configuration)
    {
        super.a(configuration);
        p.e();
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (fragment instanceof com.facebook.base.fragment.b)
        {
            if ((fragment instanceof ThreadListFragment) && fragment.j() == com.facebook.i.orca_threadlist_fragment)
            {
                ((com.facebook.base.fragment.b)fragment).a(new u(this));
                a((ThreadListFragment)fragment);
                return;
            }
            if (fragment instanceof ThreadViewFragment)
            {
                ((com.facebook.base.fragment.b)fragment).a(new x(this));
                return;
            }
        }
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.a(contextmenu, view, contextmenuinfo);
        ListView listview = i.c();
        if (view == listview)
        {
            view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
            view = ((View) (listview.getAdapter().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
            if (view instanceof ThreadSummary)
            {
                contextmenu.setHeaderTitle(o.thread_context_menu_title);
                contextmenu.add(com.facebook.i.menu_group_thread_list, 0, 0, o.thread_context_menu_archive_conversation);
                if (!com.facebook.orca.threads.m.g(((ThreadSummary)view).a()))
                {
                    contextmenu.add(com.facebook.i.menu_group_thread_list, 2, 2, o.thread_context_menu_mark_conversation_as_spam);
                }
                contextmenu.add(com.facebook.i.menu_group_thread_list, 1, 1, o.thread_context_menu_delete_conversation);
                if (G)
                {
                    contextmenu.add(com.facebook.i.menu_group_thread_list, 3, 3, o.thread_context_menu_show_chat_head);
                }
            }
        }
    }

    public void a(boolean flag)
    {
        super.a(flag);
        if (w())
        {
            D.b(flag);
        }
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        if (w())
        {
            if (keyevent.getAction() == 0 && keyevent.getKeyCode() == 4)
            {
                c.a((new cb("click")).a(g_()).f("android_button").g("back"));
            }
            return D.a(i1, keyevent) || super.a(i1, keyevent);
        } else
        {
            return super.a(i1, keyevent);
        }
    }

    public boolean a(KeyEvent keyevent)
    {
        return d.a(keyevent) || super.a(keyevent);
    }

    public boolean a(Menu menu)
    {
        super.a(menu);
        t().inflate(com.facebook.l.thread_list_menu, menu);
        if (!((Boolean)g.b()).booleanValue())
        {
            menu.removeItem(com.facebook.i.goto_contacts_list_menu_item);
        }
        return true;
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.facebook.i.goto_contacts_list_menu_item)
        {
            E();
            return true;
        } else
        {
            return super.a(menuitem);
        }
    }

    public boolean a_()
    {
        return true;
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        com.facebook.debug.log.b.b(a, "ThreadListActivity.onActivityCreate");
        q q1;
        com.facebook.inject.t t1;
        Object obj;
        boolean flag;
        if (bundle != null && bundle.containsKey("selectedThreadId"))
        {
            bundle = bundle.getString("selectedThreadId");
        } else
        {
            bundle = null;
        }
        c(com.facebook.k.orca_thread_list);
        t1 = n();
        g = t1.b(java/lang/Boolean, com/facebook/contacts/annotations/IsContactsListEnabled);
        b = (AddressBookPeriodicRunner)t1.a(com/facebook/contacts/database/AddressBookPeriodicRunner);
        c = (av)t1.a(com/facebook/analytics/av);
        d = (bf)t1.a(com/facebook/orca/d/bf);
        e = (com.facebook.orca.d.m)t1.a(com/facebook/orca/d/m);
        f = (af)t1.a(com/facebook/orca/d/af);
        p = (a)t1.a(com/facebook/orca/common/ui/titlebar/a);
        q = (c)t1.a(com/facebook/contacts/upload/c);
        r = (android.support.v4.a.e)t1.a(android/support/v4/a/e);
        t = (b)t1.a(com/facebook/b/a/b);
        u = (ap)t1.a(com/facebook/orca/common/ui/titlebar/ap);
        x = (com.facebook.config.a.a)t1.a(com/facebook/config/a/a);
        if (x.i() == com.facebook.config.a.d.MESSENGER)
        {
            v = (com.facebook.launcherbadges.a)t1.a(com/facebook/launcherbadges/a);
            w = t1.b(java/lang/Boolean, com/facebook/orca/annotations/IsAppIconBadgingEnabled);
        }
        s = new y(this);
        com.facebook.widget.titlebar.c.a(b());
        h = (com.facebook.widget.titlebar.a)b(com.facebook.i.titlebar);
        if (x.i() == com.facebook.config.a.d.MESSENGER)
        {
            ap.a();
        }
        z();
        q1 = p();
        i = (ThreadListFragment)q1.a(com.facebook.i.orca_threadlist_fragment);
        i.a(new z(this));
        D = (ThreadViewFragment)q1.a("threadViewFragment");
        if (D != null)
        {
            D.a(h);
        }
        obj = r();
        flag = com.facebook.orca.intents.e.a(((Intent) (obj)), "from_notification", false);
        if (((Intent) (obj)).hasExtra("thread_id"))
        {
            bundle = com.facebook.orca.intents.e.a(((Intent) (obj)), "thread_id");
            ((Intent) (obj)).putExtra("from_notification", flag);
        } else
        {
            i.a(flag);
        }
        j = (VersionUpgradePromoView)b(com.facebook.i.thread_list_version_upgrade_promo);
        k = (SlidingOutSuggestionView)b(com.facebook.i.thread_list_mute_warning);
        l = (SyncDisabledWarningView)b(com.facebook.i.thread_list_sync_disabled_warning);
        m = (ConfirmationView)b(com.facebook.i.thread_list_contacts_upload_failed);
        m.setListener(new aa(this));
        i.a(h);
        A = (NuxFindingContactsIntroView)b(com.facebook.i.nux_finding_contacts_intro);
        z = (NuxFindingContactsView)b(com.facebook.i.nux_finding_contacts);
        B = (NuxScrimView)b(com.facebook.i.nux_scrim);
        C = (NuxSmsIntroView)b(com.facebook.i.nux_sms_intro);
        obj = (com.facebook.orca.nux.h)t1.a(com/facebook/orca/nux/h);
        if (((com.facebook.orca.nux.h) (obj)).b())
        {
            y = new com.facebook.orca.nux.k(((com.facebook.orca.nux.h) (obj)), (g)t1.a(com/facebook/orca/app/g), (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d), t1.b(java/lang/Boolean, com/facebook/orca/annotations/ShouldSkipContactImportNux), t1.b(java/lang/Boolean, com/facebook/orca/annotations/IsNuxSmsForced), t1.b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNuxSendCliffDisabled), (com.facebook.orca.sms.af)t1.a(com/facebook/orca/sms/af), q, r, c, A, z, B, C);
            z.setContentOnClickListener(new ab(this));
        }
        o = new com.facebook.orca.threadlist.f((com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d), (as)t1.a(com/facebook/orca/notify/as), k);
        A();
        n = (com.facebook.zero.ui.d)t1.a(com/facebook/zero/ui/d);
        n.a((ViewStub)b(com.facebook.i.zero_rating_bottom_banner_stub)).c();
        if (bundle == null && D != null && !D.w())
        {
            ad ad1 = q1.a();
            ad1.b(D);
            ad1.a();
            q1.b();
        }
        q().setBackgroundDrawable(null);
        if (bundle != null)
        {
            a(bundle);
        }
    }

    public boolean b(MenuItem menuitem)
    {
        Object obj;
        if (menuitem.getGroupId() != com.facebook.i.menu_group_thread_list)
        {
            return super.b(menuitem);
        }
        i.c().getAdapter();
        obj = ((android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo()).targetView;
        if (!(obj instanceof com.facebook.orca.threadlist.q)) goto _L2; else goto _L1
_L1:
        obj = ((com.facebook.orca.threadlist.q)obj).getThreadSummary();
        menuitem.getItemId();
        JVM INSTR tableswitch 0 3: default 92
    //                   0 108
    //                   1 98
    //                   2 119
    //                   3 130;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return super.b(menuitem);
_L4:
        i.d(((ThreadSummary) (obj)));
        return true;
_L3:
        i.b(((ThreadSummary) (obj)));
        continue; /* Loop/switch isn't completed */
_L5:
        i.c(((ThreadSummary) (obj)));
        continue; /* Loop/switch isn't completed */
_L6:
        i.a(((ThreadSummary) (obj)));
        if (true) goto _L2; else goto _L7
_L7:
    }

    public a c()
    {
        return p;
    }

    protected void d()
    {
        super.d();
        com.facebook.debug.log.b.b(a, "ThreadListActivity.onStop");
        if (y != null)
        {
            y.b();
        }
    }

    protected void d(Bundle bundle)
    {
        super.d(bundle);
        bundle.putString("selectedThreadId", E);
    }

    protected void e()
    {
        super.e();
        com.facebook.debug.log.b.b(a, "ThreadListActivity.onPause");
        F = false;
        i.a(null);
        r.a(s);
        e.a();
        f.b();
        n.b();
        u.b();
        if (x.i() == com.facebook.config.a.d.MESSENGER && !((Boolean)w.b()).booleanValue())
        {
            v.a(0);
        }
    }

    protected void f()
    {
        super.f();
        com.facebook.debug.log.b.b(a, "ThreadListActivity.onResume");
        F = true;
        b.b();
        j.a();
        o.a();
        IntentFilter intentfilter = new IntentFilter("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        r.a(s, intentfilter);
        if (y != null)
        {
            y.a();
        }
        D();
        n.a();
        if (!w())
        {
            a(q.b());
            z();
        } else
        {
            n.d();
        }
        B();
        C();
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.THREAD_LIST_ACTIVITY_NAME;
    }

    public void h()
    {
        super.h();
        if (w())
        {
            D.d();
        } else
        if (i != null)
        {
            i.b();
            return;
        }
    }

    public void m()
    {
        if (!p.f() && p().c())
        {
            if (w())
            {
                if (!D.Q())
                {
                    F();
                    c.b("thread_view_module");
                    return;
                }
            } else
            {
                super.m();
                return;
            }
        }
    }

    public void o()
    {
        super.o();
        q().setFormat(1);
    }

    public ThreadViewSpec v()
    {
        if (w())
        {
            return D.O();
        } else
        {
            return ThreadViewSpec.a;
        }
    }

    public boolean w()
    {
        return D != null && E != null;
    }

    public boolean x()
    {
        return i.c().getFirstVisiblePosition() > 0;
    }

}
