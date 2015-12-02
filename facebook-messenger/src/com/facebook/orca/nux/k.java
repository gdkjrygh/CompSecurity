// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.w.o;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.contacts.upload.c;
import com.facebook.debug.log.b;
import com.facebook.orca.app.g;
import com.facebook.orca.common.ui.titlebar.m;
import com.facebook.orca.prefs.n;
import com.facebook.orca.sms.af;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.widget.text.CustomUrlLikeSpan;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.nux:
//            NuxFindingContactsView, s, h, m, 
//            NuxFindingContactsIntroView, n, o, NuxScrimView, 
//            LearnMoreActivity, NuxSmsIntroView, SmsNuxDetailActivity, p, 
//            q, r, t, l

public class k
{

    private static final Class a = com/facebook/orca/nux/k;
    private final h b;
    private final g c;
    private final d d;
    private final a e;
    private final a f;
    private final a g;
    private final af h;
    private final c i;
    private final android.support.v4.a.e j;
    private final av k;
    private final NuxFindingContactsIntroView l;
    private final NuxFindingContactsView m;
    private final NuxScrimView n;
    private final NuxSmsIntroView o;
    private BroadcastReceiver p;
    private t q;
    private boolean r;
    private boolean s;

    public k(h h1, g g1, d d1, a a1, a a2, a a3, af af1, 
            c c1, android.support.v4.a.e e1, av av1, NuxFindingContactsIntroView nuxfindingcontactsintroview, NuxFindingContactsView nuxfindingcontactsview, NuxScrimView nuxscrimview, NuxSmsIntroView nuxsmsintroview)
    {
        r = false;
        b = h1;
        c = g1;
        d = d1;
        e = a1;
        f = a2;
        g = a3;
        h = af1;
        i = c1;
        j = e1;
        k = av1;
        l = nuxfindingcontactsintroview;
        m = nuxfindingcontactsview;
        n = nuxscrimview;
        o = nuxsmsintroview;
    }

    static av a(k k1)
    {
        return k1.k;
    }

    private void a(ContactsUploadState contactsuploadstate, ContactsUploadProgressMode contactsuploadprogressmode)
    {
        m.setState(contactsuploadstate);
        com.facebook.orca.nux.s.a[contactsuploadstate.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 45
    //                   3 57;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (f())
        {
            d();
            return;
        }
          goto _L1
_L3:
        a(contactsuploadprogressmode);
        return;
    }

    private void a(m m1)
    {
        if (m1 == m.OPENED && f())
        {
            d();
        }
    }

    static void a(k k1, ContactsUploadState contactsuploadstate, ContactsUploadProgressMode contactsuploadprogressmode)
    {
        k1.a(contactsuploadstate, contactsuploadprogressmode);
    }

    static void a(k k1, m m1)
    {
        k1.a(m1);
    }

    private boolean a(ContactsUploadProgressMode contactsuploadprogressmode)
    {
        if (!f()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (b.j())
        {
            n();
            p();
        } else
        if (b.l())
        {
            g();
        } else
        {
            if (!i.e())
            {
                continue; /* Loop/switch isn't completed */
            }
            ContactsUploadProgressMode contactsuploadprogressmode1 = contactsuploadprogressmode;
            if (contactsuploadprogressmode == null)
            {
                contactsuploadprogressmode1 = i.c();
            }
            if (contactsuploadprogressmode1 != ContactsUploadProgressMode.SHOW_IN_DIVE_BAR_ONLY && !s)
            {
                j();
            }
        }
_L4:
        return true;
        if (!l()) goto _L1; else goto _L3
_L3:
        m();
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void b(k k1)
    {
        k1.h();
    }

    static void c(k k1)
    {
        k1.i();
    }

    static void d(k k1)
    {
        k1.k();
    }

    static Class e()
    {
        return a;
    }

    static void e(k k1)
    {
        k1.o();
    }

    static d f(k k1)
    {
        return k1.d;
    }

    private boolean f()
    {
        return r;
    }

    static g g(k k1)
    {
        return k1.c;
    }

    private void g()
    {
        b.q();
        if (((Boolean)e.b()).booleanValue())
        {
            i();
            return;
        } else
        {
            r = true;
            l.setOnFindContactsClickListener(new com.facebook.orca.nux.m(this));
            l.setOnSkipClickListener(new com.facebook.orca.nux.n(this));
            CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
            customurllikespan.a(new com.facebook.orca.nux.o(this));
            k.a((new cb("nux_shown")).e("finding_contacts_intro"));
            l.setLearnMoreLinkSpan(customurllikespan);
            n.h();
            l.h();
            return;
        }
    }

    private void h()
    {
        k.a((new cb("nux_hidden")).e("finding_contacts_intro"));
        r = false;
        l.i();
        n.i();
    }

    static void h(k k1)
    {
        k1.q();
    }

    private void i()
    {
        d.b().a(n.N, true).a();
        i.a(ContactsUploadProgressMode.SHOW_IN_THREAD_LIST_AND_DIVE_BAR);
    }

    private void j()
    {
        k.a((new cb("nux_shown")).e("finding_contacts_progress"));
        r = true;
        m.h();
    }

    private void k()
    {
        Intent intent = new Intent(l.getContext(), com/facebook/orca/nux/LearnMoreActivity);
        intent.putExtra("layout", com.facebook.k.orca_nux_finding_contacts_learn_more);
        l.getContext().startActivity(intent);
    }

    private boolean l()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (d.a(n.N, false))
        {
            flag = flag1;
            if (!d.a(com.facebook.contacts.upload.a.e, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private void m()
    {
        com.facebook.debug.log.b.b(a, "Starting divebar-only contacts upload.");
        i.a(ContactsUploadProgressMode.SHOW_IN_DIVE_BAR_ONLY);
    }

    private void n()
    {
        r = true;
        n.h();
        o.setClickable(false);
    }

    private void o()
    {
        h.d();
        Intent intent = new Intent(o.getContext(), com/facebook/orca/nux/SmsNuxDetailActivity);
        o.getContext().startActivity(intent);
    }

    private void p()
    {
        h.b(b.f(), ((Boolean)f.b()).booleanValue(), b.g(), ((Boolean)g.b()).booleanValue());
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new p(this));
        Resources resources = o.getResources();
        o o1 = new o(resources);
        if (((Boolean)f.b()).booleanValue())
        {
            o1.a(resources.getString(com.facebook.o.sms_nux_intro_force_blurb));
        } else
        if (b.f())
        {
            o1.a(resources.getString(com.facebook.o.sms_nux_intro_upgrade_blurb));
        } else
        {
            o1.a(resources.getString(com.facebook.o.sms_nux_intro_blurb));
        }
        o1.a("[[learn_more_link]]", resources.getString(com.facebook.o.sms_nux_learn_more_link), customurllikespan, 33);
        o.j();
        o.setBlurb(o1.b());
        n.b();
        if (((Boolean)f.b()).booleanValue() || b.g())
        {
            o.b();
        }
        o.h();
        o.setOnTryClickListener(new q(this));
        o.setOnSkipClickListener(new r(this));
    }

    private void q()
    {
        boolean flag = d.a(n.g, false);
        h.a(flag);
        b.o();
        o.i();
        n.i();
        if (q != null)
        {
            q.a();
        }
    }

    public void a()
    {
        p = new l(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        intentfilter.addAction("com.facebook.orca.common.ui.titlebar.DIVEBAR_STATE_CHANGED");
        j.a(p, intentfilter);
        a(i.b(), i.c());
    }

    public void a(t t1)
    {
        q = t1;
    }

    public void a(boolean flag)
    {
        s = flag;
    }

    public void b()
    {
        j.a(p);
        p = null;
    }

    public boolean c()
    {
        return a(((ContactsUploadProgressMode) (null)));
    }

    public void d()
    {
        k.a((new cb("nux_hidden")).e("finding_contacts_progress"));
        r = false;
        m.g();
    }

}
