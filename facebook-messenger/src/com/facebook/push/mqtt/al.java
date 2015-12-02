// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.facebook.common.v.a;
import com.facebook.common.v.d;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.push.mqtt:
//            ai

class al extends q
{

    final ai a;

    al(ai ai1, Context context, IntentFilter intentfilter)
    {
        a = ai1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (Objects.equal(a.a, intent.getAction()) || Objects.equal(d.a, intent.getAction()))
        {
            a.b();
        }
    }
}
