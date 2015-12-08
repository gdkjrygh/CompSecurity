// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.a.a.c:
//            x

final class J extends BroadcastReceiver
{

    final x a;

    J(x x1)
    {
        a = x1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        x.a(a, false);
    }
}
