// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.IntentFilter;
import com.fitbit.data.bl.dg;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.u;

// Referenced classes of package com.fitbit.util:
//            bi

public abstract class bj extends bi
    implements u
{

    private static final String a = "SyncListenerDataLoader";
    private boolean b;

    public bj(Context context)
    {
        super(context);
    }

    public bj(Context context, IntentFilter intentfilter)
    {
        super(context, intentfilter);
    }

    public void e()
    {
        com.fitbit.e.a.a("SyncListenerDataLoader", "syncStarted", new Object[0]);
    }

    public void g()
    {
        com.fitbit.e.a.a("SyncListenerDataLoader", "syncFinished %s", new Object[] {
            getClass().getSimpleName()
        });
        b = true;
        onContentChanged();
    }

    protected boolean l()
    {
        return b;
    }

    protected void onReset()
    {
        super.onReset();
        dg.d().b(this);
    }

    protected void onStartLoading()
    {
        dg.d().a(this);
        super.onStartLoading();
    }

    protected void onStopLoading()
    {
        super.onStopLoading();
        dg.d().b(this);
    }
}
