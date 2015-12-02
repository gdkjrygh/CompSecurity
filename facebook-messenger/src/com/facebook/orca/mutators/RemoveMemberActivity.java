// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.activity.e;
import com.facebook.orca.activity.i;
import com.facebook.orca.activity.j;
import com.facebook.orca.f.k;
import com.facebook.orca.server.RemoveMemberParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.ui.d.a;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.mutators:
//            i

public class RemoveMemberActivity extends e
    implements d
{

    private k p;
    private ThreadSummary q;
    private User r;
    private BlueServiceFragment s;

    public RemoveMemberActivity()
    {
    }

    private void a(OperationResult operationresult)
    {
        finish();
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).a(serviceexception).a(this).a();
    }

    static void a(RemoveMemberActivity removememberactivity, OperationResult operationresult)
    {
        removememberactivity.a(operationresult);
    }

    static void a(RemoveMemberActivity removememberactivity, ServiceException serviceexception)
    {
        removememberactivity.a(serviceexception);
    }

    private i m()
    {
        i l = new i();
        l.a(getString(o.thread_remove_member_confirm_heading));
        l.b(getString(o.thread_remove_member_confirm_msg, new Object[] {
            r.d().d()
        }));
        l.c(getString(o.thread_remove_member_confirm_ok_button));
        l.a(j.DELETE);
        return l;
    }

    private void n()
    {
        if (s.b() != com.facebook.fbservice.ops.j.INIT)
        {
            return;
        } else
        {
            RemoveMemberParams removememberparams = new RemoveMemberParams(q.a(), r.b());
            Bundle bundle = new Bundle();
            bundle.putParcelable("removeMemberParams", removememberparams);
            s.a(aq.o, bundle);
            return;
        }
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        p = (k)i().a(com/facebook/orca/f/k);
        Object obj = getIntent();
        bundle = ((Intent) (obj)).getStringExtra("threadid");
        obj = UserKey.a(((Intent) (obj)).getStringExtra("user_key"));
        q = p.b(bundle);
        r = p.a(((UserKey) (obj)));
        if (q == null || r == null)
        {
            finish();
            return;
        } else
        {
            a(m());
            s = BlueServiceFragment.a(this, "removeMemberOperation");
            s.a(new com.facebook.orca.mutators.i(this));
            s.a(new aa(this, o.thread_remove_member_progress));
            return;
        }
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.REMOVE_MEMBER_ACTIVITY_NAME;
    }

    protected void j()
    {
        n();
    }
}
