// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.threadlist:
//            ThreadListFragment

class ao extends q
{

    final ThreadListFragment a;

    ao(ThreadListFragment threadlistfragment, Context context, IntentFilter intentfilter)
    {
        a = threadlistfragment;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        ThreadListFragment.a(a, intent);
    }
}
