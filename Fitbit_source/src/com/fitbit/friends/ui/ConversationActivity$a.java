// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.dl;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Notification;
import com.fitbit.util.bi;

// Referenced classes of package com.fitbit.friends.ui:
//            ConversationActivity

private static class b extends bi
{

    private String a;
    private long b;

    private static IntentFilter d()
    {
        IntentFilter intentfilter = dl.d();
        intentfilter.addAction("com.fitbit.data.bl.SyncPendingObjectsOperation.BROADCAST_ACTION");
        return intentfilter;
    }

    protected Intent[] a()
    {
        return (new Intent[] {
            dl.a(getContext(), true), cw.a(getContext(), false)
        });
    }

    public getContext b()
    {
        getContext getcontext = new <init>();
        if (b > 0L)
        {
            a(getcontext, ah.a().a(b));
            if (a(getcontext) != null && a == null)
            {
                a = a(getcontext).g();
            }
        }
        if (a != null)
        {
            a(getcontext, s.a(getContext()).b(a));
            if (a(getcontext) == null)
            {
                a(getcontext, ah.a().a(a));
            }
        }
        return getcontext;
    }

    public Object f_()
    {
        return b();
    }

    public (Context context, String s1, long l)
    {
        super(context, d());
        a = s1;
        b = l;
    }
}
