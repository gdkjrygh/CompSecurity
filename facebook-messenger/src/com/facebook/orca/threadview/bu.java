// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import android.widget.EditText;
import com.facebook.analytics.cb;
import com.facebook.debug.log.b;
import com.facebook.messages.threads.model.ThreadViewSpec;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bu
    implements android.view.View.OnClickListener
{

    final ThreadViewFragment a;

    bu(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void onClick(View view)
    {
        view = (new cb("click")).f("button").g("cancel_group_name_button");
        ThreadViewFragment.a(a, view);
        ThreadViewFragment.f(a).setVisibility(8);
        ThreadViewFragment.g(a).setText("");
        if (!ThreadViewFragment.h(a).c())
        {
            b.b(ThreadViewFragment.U(), "Cancelled group name upsell");
            ThreadViewFragment.a(a, ThreadViewFragment.h(a).d());
        }
    }
}
