// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.d:
//            a

class b extends q
{

    final a a;

    b(a a1, Context context, IntentFilter intentfilter)
    {
        a = a1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (Objects.equal("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED", intent.getAction()))
        {
            a.c();
        }
    }
}
