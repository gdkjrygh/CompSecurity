// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.ui:
//            d

class f extends q
{

    final d a;

    f(d d1, Context context, IntentFilter intentfilter)
    {
        a = d1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (Objects.equal(intent.getAction(), "com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED") || Objects.equal(intent.getAction(), "com.facebook.orca.ZERO_RATING_STATE_CHANGED"))
        {
            a.c();
        }
    }
}
