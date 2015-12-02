// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ag;
import com.facebook.c.s;
import com.facebook.contacts.g.c;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.models.g;
import com.facebook.contacts.server.CreateContactClaimParams;
import com.facebook.contacts.server.DeleteContactClaimParams;
import com.facebook.contacts.server.PrivacyParam;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.annotations.IsMergeThreadsEnabled;
import com.facebook.orca.nux.LearnMoreActivity;
import com.facebook.orca.prefs.n;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserKey;
import com.facebook.widget.ConfirmationView;
import com.facebook.widget.text.CustomUrlLikeSpan;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            UpsellContactView, h, b, c, 
//            d, e, f, g

public class a
{

    private final Context a;
    private final ag b;
    private final javax.inject.a c;
    private final c d;
    private final k e;
    private final g f;
    private final s g;
    private final com.facebook.prefs.shared.d h;
    private final ConfirmationView i;
    private final UpsellContactView j;
    private com.google.common.d.a.s k;
    private com.google.common.d.a.s l;
    private ThreadSummary m;
    private String n;
    private String o;
    private Contact p;

    public a(Context context, ag ag1, ConfirmationView confirmationview, UpsellContactView upsellcontactview, com.facebook.prefs.shared.d d1, s s1)
    {
        a = context;
        b = ag1;
        g = s1;
        context = t.a(context);
        c = context.b(java/lang/Boolean, com/facebook/orca/annotations/IsMergeThreadsEnabled);
        d = (c)context.a(com/facebook/contacts/g/c);
        e = (k)context.a(com/facebook/fbservice/ops/k);
        f = (g)context.a(com/facebook/contacts/models/g);
        i = confirmationview;
        j = upsellcontactview;
        h = d1;
    }

    static Context a(a a1)
    {
        return a1.a;
    }

    static Contact a(a a1, Contact contact)
    {
        a1.p = contact;
        return contact;
    }

    static com.google.common.d.a.s a(a a1, com.google.common.d.a.s s1)
    {
        a1.k = s1;
        return s1;
    }

    private void a(OperationResult operationresult)
    {
        j.setVisibility(8);
        operationresult = i.getResources();
        i.setMessage(operationresult.getString(o.merged_thread_upsell_confirmation));
        i.setPositiveButtonTitle(operationresult.getString(o.merged_thread_upsell_confirmation_positive_button));
        i.setNegativeButtonTitle(operationresult.getString(o.merged_thread_upsell_confirmation_negative_button));
        i.setVisibility(0);
        i.setListener(new h(this));
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(a).a(o.app_error_dialog_title).b(o.audio_message_error_name).a();
    }

    static void a(a a1, OperationResult operationresult)
    {
        a1.a(operationresult);
    }

    static void a(a a1, ServiceException serviceexception)
    {
        a1.a(serviceexception);
    }

    private void a(String s1, String s2)
    {
        s1 = new b(this, s1, s2);
        if (b.a(0) == null)
        {
            b.a(0, null, s1);
            return;
        } else
        {
            b.b(0, null, s1);
            return;
        }
    }

    static com.google.common.d.a.s b(a a1, com.google.common.d.a.s s1)
    {
        a1.l = s1;
        return s1;
    }

    private void b()
    {
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new com.facebook.orca.threadview.upsell.c(this));
        Resources resources = i.getResources();
        com.facebook.common.w.o o1 = new com.facebook.common.w.o(resources);
        o1.a(resources.getString(o.merged_thread_upsell_detail_blurb));
        o1.a("[[learn_more_link]]", resources.getString(o.merged_thread_upsell_learn_more_link), customurllikespan, 33);
        i.b();
        i.setBlurb(o1.b());
        i.setPositiveButtonTitle(resources.getString(o.merged_thread_upsell_intro_positive_button));
        i.setNegativeButtonTitle(resources.getString(o.merged_thread_upsell_intro_negative_button));
        j.setContact(p);
        j.setVisibility(0);
        i.setVisibility(0);
        j.setListener(new com.facebook.orca.threadview.upsell.d(this));
        i.setListener(new e(this));
    }

    static void b(a a1)
    {
        a1.b();
    }

    private void c()
    {
        if (k != null)
        {
            return;
        } else
        {
            Object obj = d.a(o, 1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("createContactClaimParams", new CreateContactClaimParams(p.getContactId(), p.getGraphApiWriteId(), ((String) (obj)), PrivacyParam.b));
            obj = e.a(d.b, bundle);
            ((m) (obj)).a(new aa(a, o.contact_add_phone_progress));
            k = ((m) (obj)).a();
            com.google.common.d.a.i.a(k, new f(this));
            return;
        }
    }

    static void c(a a1)
    {
        a1.f();
    }

    static ConfirmationView d(a a1)
    {
        return a1.i;
    }

    private void d()
    {
        Object obj;
        if (l == null)
        {
            if ((obj = f.a(p.getContactId(), o)) != null)
            {
                Bundle bundle = new Bundle();
                bundle.putParcelable("deleteContactClaimParams", new DeleteContactClaimParams(((PhoneEntry) (obj)).getGraphApiWriteId(), p.getGraphApiWriteId(), p.getContactId()));
                obj = e.a(d.c, bundle);
                ((m) (obj)).a(new aa(a, o.contact_delete_phone_progress));
                l = ((m) (obj)).a();
                com.google.common.d.a.i.a(l, new com.facebook.orca.threadview.upsell.g(this));
                return;
            }
        }
    }

    private void e()
    {
        j.setVisibility(8);
        i.setVisibility(8);
    }

    static void e(a a1)
    {
        a1.e();
    }

    static com.facebook.prefs.shared.d f(a a1)
    {
        return a1.h;
    }

    private void f()
    {
        Context context = i.getContext();
        Intent intent = new Intent(context, com/facebook/orca/nux/LearnMoreActivity);
        intent.putExtra("layout", com.facebook.k.orca_nux_finding_contacts_learn_more);
        g.a(intent, context);
    }

    static void g(a a1)
    {
        a1.c();
    }

    static void h(a a1)
    {
        a1.d();
    }

    public void a()
    {
        if (h.a(n.l, false))
        {
            i.c();
        }
    }

    public void a(ThreadSummary threadsummary)
    {
        if (threadsummary != m)
        {
            m = threadsummary;
            e();
            if (((Boolean)c.b()).booleanValue() && com.facebook.orca.threads.m.g(m.a()) && m.h())
            {
                threadsummary = m.i();
                boolean flag;
                if (threadsummary.a() == com.facebook.user.n.PHONE_NUMBER)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
                n = m.a(threadsummary).f();
                o = threadsummary.b();
                a();
                a(o, n);
                return;
            }
        }
    }
}
