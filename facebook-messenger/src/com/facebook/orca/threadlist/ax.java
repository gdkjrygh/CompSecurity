// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment, bc

class ax
    implements android.view.View.OnClickListener
{

    final ThreadListFragment a;

    ax(ThreadListFragment threadlistfragment)
    {
        a = threadlistfragment;
        super();
    }

    public void onClick(View view)
    {
        if (ThreadListFragment.d(a) != null)
        {
            ThreadListFragment.d(a).a();
        }
    }
}
