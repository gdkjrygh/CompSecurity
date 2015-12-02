// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class bj extends q
{

    final al a;

    bj(al al1, Context context, IntentFilter intentfilter)
    {
        a = al1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if ("com.facebook.orca.THREAD_UPDATED_CANONICAL_FOR_UI".equals(intent.getAction()))
        {
            al.a(a, intent);
        }
    }
}
