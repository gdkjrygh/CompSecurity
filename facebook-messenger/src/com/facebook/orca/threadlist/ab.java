// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.orca.common.ui.titlebar.a;
import com.facebook.orca.nux.k;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class ab
    implements android.view.View.OnClickListener
{

    final t a;

    ab(t t1)
    {
        a = t1;
        super();
    }

    public void onClick(View view)
    {
        t.d(a).a((new cb("click")).f("view").g("find_contacts_progress_view"));
        com.facebook.orca.threadlist.t.a(a).d();
        t.f(a).g();
    }
}
