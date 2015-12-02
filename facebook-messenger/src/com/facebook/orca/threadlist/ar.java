// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.DialogInterface;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class ar
    implements android.content.DialogInterface.OnClickListener
{

    final ThreadSummary a;
    final ThreadListFragment b;

    ar(ThreadListFragment threadlistfragment, ThreadSummary threadsummary)
    {
        b = threadlistfragment;
        a = threadsummary;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ThreadListFragment.a(b, a);
    }
}
