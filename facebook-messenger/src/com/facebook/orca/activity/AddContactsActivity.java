// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.c.s;
import com.facebook.contacts.g.a.h;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.inject.t;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.sms.bo;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.n;
import com.facebook.user.o;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.activity:
//            a, b

public class AddContactsActivity extends i
    implements d
{

    private String A;
    private a p;
    private h q;
    private com.facebook.contacts.g.a.a r;
    private k s;
    private com.facebook.user.i t;
    private com.google.common.d.a.s u;
    private com.google.common.d.a.s v;
    private bo w;
    private s x;
    private av y;
    private String z;

    public AddContactsActivity()
    {
    }

    static com.google.common.d.a.s a(AddContactsActivity addcontactsactivity, com.google.common.d.a.s s1)
    {
        addcontactsactivity.u = s1;
        return s1;
    }

    private void a(ProgressDialog progressdialog)
    {
        a(new cb("dismiss_check_phone_number"));
        progressdialog.dismiss();
    }

    private void a(cb cb1)
    {
        y.a(cb1.a(g_()).h(h()));
    }

    static void a(AddContactsActivity addcontactsactivity)
    {
        addcontactsactivity.k();
    }

    static void a(AddContactsActivity addcontactsactivity, ProgressDialog progressdialog)
    {
        addcontactsactivity.a(progressdialog);
    }

    static void a(AddContactsActivity addcontactsactivity, cb cb1)
    {
        addcontactsactivity.a(cb1);
    }

    static void a(AddContactsActivity addcontactsactivity, String s1, String s2)
    {
        addcontactsactivity.a(s1, s2);
    }

    private void a(String s1, String s2)
    {
        Intent intent = new Intent(this, com/facebook/orca/creation/CreateThreadActivity);
        intent.putExtra("focus_compose", true);
        s1 = (new o()).a(n.FACEBOOK, s2).a(s1).x();
        intent.putExtra("to", new UserWithIdentifier(s1, s1.i()));
        intent.setFlags(0x4000000);
        x.a(intent, this);
        b(s2);
        finish();
    }

    static String b(AddContactsActivity addcontactsactivity)
    {
        return addcontactsactivity.A;
    }

    private void b(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fbid", s1);
        v = s.a(com.facebook.contacts.server.d.j, bundle).a();
    }

    static bo c(AddContactsActivity addcontactsactivity)
    {
        return addcontactsactivity.w;
    }

    private void j()
    {
        A = getIntent().getStringExtra("phone_number");
        z = t.c(A);
        Bundle bundle = new Bundle();
        bundle.putString("phone_number", A);
        ProgressDialog progressdialog = ProgressDialog.show(this, getString(com.facebook.o.invite_searching_user), getString(com.facebook.o.invite_please_wait), true);
        a((new cb("show_check_phone_number")).b("phone_number", A));
        u = s.a(com.facebook.contacts.server.d.i, bundle).a();
        com.google.common.d.a.i.a(u, new com.facebook.orca.activity.a(this, progressdialog));
    }

    private void k()
    {
        a(new cb("show_invite_sms_prompt"));
        setContentView(com.facebook.k.orca_add_contacts);
        com.facebook.widget.titlebar.c.a(this);
        p = (a)b(com.facebook.i.titlebar);
        p.setTitle(getString(com.facebook.o.invite_title));
        ((TextView)b(com.facebook.i.phone_number_disp)).setText(z);
        ((Button)findViewById(com.facebook.i.smsButton)).setOnClickListener(new b(this));
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        q = (h)bundle.a(com/facebook/contacts/g/a/h);
        r = (com.facebook.contacts.g.a.a)bundle.a(com/facebook/contacts/g/a/a);
        s = (k)bundle.a(com/facebook/fbservice/ops/k);
        x = (s)bundle.a(com/facebook/c/s);
        t = (com.facebook.user.i)bundle.a(com/facebook/user/i);
        y = (av)bundle.a(com/facebook/analytics/av);
        w = (bo)bundle.a(com/facebook/orca/sms/bo);
        j();
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ADD_CONTACT_BY_PHONE_ACTIVITY_NAME;
    }
}
