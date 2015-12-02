// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;
import android.widget.EditText;
import com.facebook.analytics.cb;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bv
    implements android.view.View.OnClickListener
{

    final ThreadViewFragment a;

    bv(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void onClick(View view)
    {
        view = (new cb("click")).f("button").g("save_group_name_button");
        ThreadViewFragment.a(a, view);
        ThreadViewFragment.b(a, ThreadViewFragment.g(a).getText().toString().trim());
    }
}
