// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.common.e.h;
import com.facebook.inject.t;
import com.google.common.base.Optional;

// Referenced classes of package com.facebook.c:
//            c, b

abstract class q extends BroadcastReceiver
    implements c
{

    q()
    {
    }

    t a(Context context)
    {
        return t.a(context);
    }

    protected boolean a(Context context, Intent intent)
    {
        return true;
    }

    protected abstract Optional b(Context context, Intent intent);

    protected abstract Iterable b();

    protected String c()
    {
        return getClass().getName();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!a(context, intent))
        {
            return;
        }
        Optional optional = b(context, intent);
        if (optional.isPresent())
        {
            ((b)optional.get()).a(context, intent, this);
            return;
        } else
        {
            context = (h)a(context).a(com/facebook/common/e/h);
            String s = c();
            context.a(s, (new StringBuilder()).append("Rejected the intent for the receiver because it was not registered: ").append(intent.getAction()).append(":").append(s).toString());
            return;
        }
    }
}
