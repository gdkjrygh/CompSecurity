// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.taplytics:
//            z

final class ad extends BroadcastReceiver
{

    final z a;

    ad(z z1)
    {
        a = z1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        a.h();
    }
}
