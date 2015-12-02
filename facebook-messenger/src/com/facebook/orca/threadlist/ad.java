// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Intent;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.orca.broadcast.BroadcastActivity;
import com.facebook.orca.creation.CreateThreadActivity;

// Referenced classes of package com.facebook.orca.threadlist:
//            bc, t

class ad
    implements bc
{

    final t a;

    ad(t t1)
    {
        a = t1;
        super();
    }

    private Intent d()
    {
        Intent intent = new Intent(t.h(a), com/facebook/orca/creation/CreateThreadActivity);
        intent.putExtra(CreateThreadActivity.r, true);
        return intent;
    }

    public void a()
    {
        t.d(a).a((new cb("click")).f("button").g("thread_list_message_button"));
        Intent intent = d();
        intent.putExtra("trigger", "thread_list_message_button");
        intent.putExtra("disable_create_thread_suggestions", true);
        a.b(intent);
    }

    public void b()
    {
        t.d(a).a((new cb("click")).f("button").g("thread_list_group_button"));
        Intent intent = d();
        intent.putExtra("trigger", "thread_list_group_button");
        a.b(intent);
    }

    public void c()
    {
        t.d(a).a((new cb("click")).f("button").g("thread_list_broadcast_button"));
        Intent intent = new Intent(t.g(a), com/facebook/orca/broadcast/BroadcastActivity);
        a.b(intent);
    }
}
