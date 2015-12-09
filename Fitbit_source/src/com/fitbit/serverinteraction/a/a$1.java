// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;
import java.util.List;

// Referenced classes of package com.fitbit.serverinteraction.a:
//            a

class init> extends BroadcastReceiver
{

    final com.fitbit.serverinteraction.a.a a;

    public void onReceive(Context context, Intent intent)
    {
        com.fitbit.serverinteraction.a.a.a(a).clear();
        com.fitbit.e.a.a(a.d(), "Go to foreground", new Object[0]);
    }

    (com.fitbit.serverinteraction.a.a a1)
    {
        a = a1;
        super();
    }
}
