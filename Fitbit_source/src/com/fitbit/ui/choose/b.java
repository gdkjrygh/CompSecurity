// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose;

import android.content.Context;
import android.content.IntentFilter;
import com.fitbit.activity.ui.e;

// Referenced classes of package com.fitbit.ui.choose:
//            a

public abstract class b extends e
{

    public b(Context context)
    {
        super(context, new IntentFilter("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK"));
    }

    protected void a(a a1, boolean flag)
    {
        if (a1.a() && !flag)
        {
            b();
            return;
        } else
        {
            d();
            return;
        }
    }

    protected volatile void a(Object obj, boolean flag)
    {
        a((a)obj, flag);
    }

    protected abstract void b();

    protected abstract void d();
}
