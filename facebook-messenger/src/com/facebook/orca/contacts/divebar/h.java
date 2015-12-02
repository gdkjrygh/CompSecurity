// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.a.e;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.c.s;
import com.facebook.common.v.a;
import com.facebook.contacts.picker.p;
import com.facebook.contacts.picker.q;
import com.facebook.contacts.upload.ContactsUploadProgressMode;
import com.facebook.contacts.upload.c;
import com.facebook.orca.prefs.n;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.d;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            j, i, m, DivebarContactsUploaderLearnMoreActivity

public class h
    implements p
{

    private final javax.inject.a a;
    private final d b;
    private final e c;
    private final c d;
    private final av e;
    private final s f;
    private BroadcastReceiver g;
    private ViewGroup h;
    private m i;
    private q j;

    public h(javax.inject.a a1, d d1, e e1, c c1, av av, s s1)
    {
        a = a1;
        b = d1;
        c = e1;
        d = c1;
        e = av;
        f = s1;
    }

    static void a(h h1)
    {
        h1.f();
    }

    private void e()
    {
        IntentFilter intentfilter;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        g = new j(this);
        intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED");
        intentfilter.addAction(a.a);
        c.a(g, intentfilter);
    }

    private void f()
    {
        if (i != null)
        {
            h.removeView(i);
            i = null;
            c.a(g);
            g = null;
            j.a();
        }
    }

    private void g()
    {
        b.b().a(o.q, true).a();
        f();
    }

    public void a(ViewGroup viewgroup, q q1)
    {
        e();
        h = viewgroup;
        j = q1;
        if (i == null)
        {
            viewgroup = new i(this);
            i = new m(h.getContext(), e, viewgroup);
            h.addView(i);
        }
    }

    public boolean a()
    {
        return ((Boolean)a.b()).booleanValue() && !b.a(o.q, false) && !d.e();
    }

    public void b()
    {
        b.b().a(n.N, true).a();
        d.a(ContactsUploadProgressMode.SHOW_IN_DIVE_BAR_ONLY);
        g();
    }

    public void c()
    {
        g();
    }

    public void d()
    {
        android.content.Context context = h.getContext();
        Intent intent = new Intent(context, com/facebook/orca/contacts/divebar/DivebarContactsUploaderLearnMoreActivity);
        f.a(intent, context);
    }
}
