// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.analytics.av;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class at
    implements android.widget.AdapterView.OnItemClickListener
{

    final ThreadListFragment a;

    at(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ThreadListFragment.b(a).a(ThreadListFragment.a(a));
        if (i == 0)
        {
            return;
        } else
        {
            ThreadListFragment.a(a, i - 1);
            return;
        }
    }
}
