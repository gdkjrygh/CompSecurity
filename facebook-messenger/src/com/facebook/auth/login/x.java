// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;

// Referenced classes of package com.facebook.auth.login:
//            w

class x extends q
{

    final w a;

    x(w w1, Context context, IntentFilter intentfilter)
    {
        a = w1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        w.a(a).finish();
    }
}
