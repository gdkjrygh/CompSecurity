// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package kik.android.widget:
//            UpdatingDateView

final class eh extends BroadcastReceiver
{

    final UpdatingDateView a;

    eh(UpdatingDateView updatingdateview)
    {
        a = updatingdateview;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (UpdatingDateView.a(a) == -1L || "android.intent.action.TIME_TICK".equals(intent.getAction()) && System.currentTimeMillis() > UpdatingDateView.a(a))
        {
            return;
        } else
        {
            UpdatingDateView.b(a);
            return;
        }
    }
}
