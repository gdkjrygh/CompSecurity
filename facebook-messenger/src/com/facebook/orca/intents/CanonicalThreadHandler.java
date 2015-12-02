// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.o;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.orca.threadview.do;
import com.facebook.ui.d.a;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.UserWithIdentifier;
import com.facebook.user.n;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.orca.intents:
//            a

public class CanonicalThreadHandler extends i
    implements d
{

    private com.facebook.orca.f.k p;
    private BlueServiceFragment q;
    private EmptyListViewItem r;
    private ComponentName s;
    private do t;
    private UserKey u;

    public CanonicalThreadHandler()
    {
    }

    private void a(Intent intent, Intent intent1)
    {
        intent = intent.getStringExtra("trigger");
        if (intent != null)
        {
            intent1.putExtra("trigger", intent);
        }
    }

    private void a(OperationResult operationresult)
    {
        operationresult = (FetchThreadResult)operationresult.i();
        Object obj = operationresult.d();
        ThreadSummary threadsummary = operationresult.a();
        operationresult = getIntent();
        boolean flag = operationresult.getBooleanExtra("focus_compose", false);
        if (threadsummary != null)
        {
            obj = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
            ((Intent) (obj)).putExtra("thread_id", threadsummary.a());
            ((Intent) (obj)).putExtra("focus_compose", flag);
            a(((Intent) (operationresult)), ((Intent) (obj)));
            startActivity(((Intent) (obj)));
            finish();
            return;
        }
        if (obj != null)
        {
            if (((User) (obj)).c().a() == n.FACEBOOK && Objects.equal(((User) (obj)).E(), "user"))
            {
                obj = ThreadViewSpec.a(RecipientInfo.a(new UserWithIdentifier(((User) (obj)), ((User) (obj)).i())));
                Intent intent = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
                intent.putExtra("thread_view_spec", ((android.os.Parcelable) (obj)));
                intent.putExtra("focus_compose", flag);
                a(((Intent) (operationresult)), intent);
                startActivity(intent);
                finish();
                return;
            }
            Intent intent1 = new Intent(this, com/facebook/orca/creation/CreateThreadActivity);
            if (Objects.equal(((User) (obj)).E(), "page"))
            {
                intent1.putExtra("disableContactPicker", true);
            }
            com.facebook.user.UserFbidIdentifier userfbididentifier = ((User) (obj)).i();
            if (userfbididentifier == null)
            {
                if (((User) (obj)).o() != null)
                {
                    intent1.putExtra("to", new UserWithIdentifier(((User) (obj)), ((User) (obj)).o()));
                }
            } else
            {
                intent1.putExtra("to", new UserWithIdentifier(((User) (obj)), userfbididentifier));
            }
            intent1.putExtra("focus_compose", true);
            a(((Intent) (operationresult)), intent1);
            startActivity(intent1);
            finish();
            return;
        } else
        {
            com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).a(this).a();
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).a(this).a(serviceexception).a();
    }

    static void a(CanonicalThreadHandler canonicalthreadhandler, OperationResult operationresult)
    {
        canonicalthreadhandler.a(operationresult);
    }

    static void a(CanonicalThreadHandler canonicalthreadhandler, ServiceException serviceexception)
    {
        canonicalthreadhandler.a(serviceexception);
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_loading_screen);
        bundle = i();
        p = (com.facebook.orca.f.k)bundle.a(com/facebook/orca/f/k);
        r = (EmptyListViewItem)b(com.facebook.i.empty_item_view);
        s = (ComponentName)bundle.a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity);
        t = (do)bundle.a(com/facebook/orca/threadview/do);
        Intent intent = getIntent();
        u = UserKey.a(intent.getStringExtra("user_key"));
        if (u == null)
        {
            finish();
        } else
        {
            q = BlueServiceFragment.a(this, "fetchCanonicalThread");
            q.a(new com.facebook.orca.intents.a(this));
            r.setMessage(getString(o.thread_list_loading));
            r.a(true);
            ThreadSummary threadsummary = p.c(u);
            if (threadsummary != null)
            {
                boolean flag = intent.getBooleanExtra("focus_compose", false);
                if (intent.getBooleanExtra("use_thread_list", false))
                {
                    bundle = new Intent();
                    bundle.setComponent(s);
                    bundle.setFlags(0x4000000);
                } else
                {
                    bundle = new Intent(this, com/facebook/orca/threadview/ThreadViewActivity);
                }
                bundle.putExtra("thread_id", threadsummary.a());
                bundle.putExtra("focus_compose", flag);
                a(intent, bundle);
                startActivity(bundle);
                finish();
                return;
            }
        }
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.CANONICAL_THREAD_HANDLER_ACTIVITY_NAME;
    }

    protected void onResume()
    {
        super.onResume();
        if (!q.a())
        {
            com.facebook.orca.server.FetchThreadParams fetchthreadparams = (new ac()).a(s.STALE_DATA_OKAY).a(ThreadCriteria.a(u)).h();
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchThreadParams", fetchthreadparams);
            q.a(aq.k, bundle);
        }
    }
}
