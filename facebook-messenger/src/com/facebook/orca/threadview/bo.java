// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.DialogInterface;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bo
    implements android.content.DialogInterface.OnClickListener
{

    final ThreadSummary a;
    final ThreadViewFragment b;

    bo(ThreadViewFragment threadviewfragment, ThreadSummary threadsummary)
    {
        b = threadviewfragment;
        a = threadsummary;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ThreadViewFragment.b(b, a);
    }
}
