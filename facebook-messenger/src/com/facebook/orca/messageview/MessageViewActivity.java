// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.base.broadcast.q;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threadview.dn;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.messageview:
//            b, k, MessageViewFragment

public class MessageViewActivity extends i
    implements d
{

    private static final Class p = com/facebook/orca/messageview/MessageViewActivity;
    private a q;
    private com.facebook.orca.f.k r;
    private String s;
    private Message t;
    private ThreadSummary u;
    private q v;

    public MessageViewActivity()
    {
    }

    static String a(MessageViewActivity messageviewactivity)
    {
        return messageviewactivity.s;
    }

    static Message b(MessageViewActivity messageviewactivity)
    {
        return messageviewactivity.t;
    }

    private void j()
    {
        v.a();
    }

    private void k()
    {
        if (v != null)
        {
            v.b();
        }
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_message_view_activity);
        Object obj = i();
        r = (com.facebook.orca.f.k)((t) (obj)).a(com/facebook/orca/f/k);
        c.a(this);
        q = (a)b(com.facebook.i.titlebar);
        bundle = getIntent();
        s = bundle.getStringExtra("thread_id");
        u = r.b(s);
        t = (Message)bundle.getParcelableExtra("message");
        if (u == null || t == null)
        {
            finish();
            return;
        }
        obj = (dn)((t) (obj)).a(com/facebook/orca/threadview/dn);
        ((dn) (obj)).a(q);
        ((dn) (obj)).a(u);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.facebook.orca.ACTION_DELETED_MESSAGES_FOR_UI");
        v = new b(this, this, ((IntentFilter) (obj)));
        java.util.ArrayList arraylist = bundle.getParcelableArrayListExtra("readers");
        obj = bundle.getParcelableArrayListExtra("other_readers");
        ThreadSummary threadsummary = u;
        Message message = t;
        if (arraylist != null)
        {
            bundle = es.a(arraylist);
        } else
        {
            bundle = null;
        }
        if (obj != null)
        {
            obj = es.a(((java.util.Collection) (obj)));
        } else
        {
            obj = null;
        }
        bundle = new com.facebook.orca.messageview.k(threadsummary, message, bundle, ((es) (obj)));
        ((MessageViewFragment)f().a(com.facebook.i.message_view_fragment)).a(bundle);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.MESSAGE_VIEW_ACTIVITY_NAME;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        k();
    }

    protected void onStart()
    {
        super.onStart();
        j();
    }

    protected void onStop()
    {
        super.onStop();
        k();
    }

}
