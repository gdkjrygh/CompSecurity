// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.q;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.j;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.contacts.picker.ContactPickerFragment;
import com.facebook.orca.contacts.picker.x;
import com.facebook.orca.contacts.picker.y;
import com.facebook.orca.server.AddMembersParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.ui.d.a;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserFbidIdentifier;
import com.facebook.widget.titlebar.c;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            dn, a, b, c

public class AddMembersActivity extends i
    implements d
{

    private static final Class p = com/facebook/orca/threadview/AddMembersActivity;
    private BlueServiceFragment A;
    private com.facebook.orca.f.k q;
    private com.facebook.l.k r;
    private q s;
    private InputMethodManager t;
    private dn u;
    private av v;
    private com.facebook.widget.titlebar.a w;
    private Button x;
    private ContactPickerFragment y;
    private ThreadSummary z;

    public AddMembersActivity()
    {
    }

    static void a(AddMembersActivity addmembersactivity)
    {
        addmembersactivity.k();
    }

    static com.facebook.l.k b(AddMembersActivity addmembersactivity)
    {
        return addmembersactivity.r;
    }

    static Class j()
    {
        return p;
    }

    private void k()
    {
        if (A.b() != j.INIT)
        {
            return;
        }
        Object obj = y.a();
        if (((es) (obj)).isEmpty())
        {
            com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(o.add_members_missing_people).a();
            return;
        } else
        {
            t.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            obj = new AddMembersParams(z.a(), RecipientInfo.a(((es) (obj))));
            Bundle bundle = new Bundle();
            bundle.putParcelable("addMembersParams", ((android.os.Parcelable) (obj)));
            A.a(aq.n, bundle);
            v.a((new cb("add_member")).b("thread_id", z.a()).a(g_()).g("add_person"));
            return;
        }
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_add_members);
        bundle = i();
        q = (com.facebook.orca.f.k)bundle.a(com/facebook/orca/f/k);
        r = (com.facebook.l.k)bundle.a(com/facebook/l/k);
        s = (q)bundle.a(android/support/v4/app/q);
        t = (InputMethodManager)bundle.a(android/view/inputmethod/InputMethodManager);
        u = (dn)bundle.a(com/facebook/orca/threadview/dn);
        v = (av)bundle.a(com/facebook/analytics/av);
        c.a(this);
        w = (com.facebook.widget.titlebar.a)b(com.facebook.i.titlebar);
        x = (Button)b(com.facebook.i.add_members_button);
        bundle = getWindow().getWindowManager().getDefaultDisplay();
        if (bundle.getWidth() <= bundle.getHeight());
        bundle = getIntent().getStringExtra("thread_id");
        z = q.b(bundle);
        if (z == null)
        {
            finish();
            return;
        }
        u.a(w);
        u.a(z);
        y = (ContactPickerFragment)s.a(com.facebook.i.add_members_contact_picker);
        x.setOnClickListener(new com.facebook.orca.threadview.a(this));
        bundle = new b(this);
        y.a(bundle);
        y.a(x.FACEBOOK_LIST);
        y.P();
        y.a(y.ADD_MEMBERS);
        y.a(getString(o.name_search_hint));
        bundle = hq.a();
        Iterator iterator = z.j().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (ThreadParticipant)iterator.next();
            if (((ThreadParticipant) (obj)).b())
            {
                obj = q.a(((ThreadParticipant) (obj)).d());
                if (obj != null)
                {
                    bundle.add(((User) (obj)).i().c());
                }
            }
        } while (true);
        y.a(es.a(bundle));
        A = BlueServiceFragment.a(this, "addMembersOperation");
        A.a(new com.facebook.orca.threadview.c(this));
        A.a(new aa(this, o.add_members_progress));
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.ADD_MEMBERS_ACTIVITY_NAME;
    }

    public void onBackPressed()
    {
        t.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        super.onBackPressed();
    }

}
