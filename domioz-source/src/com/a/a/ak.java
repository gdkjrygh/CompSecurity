// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.a.a:
//            z

final class ak extends BroadcastReceiver
{

    final z a;

    ak(z z1)
    {
        a = z1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        z.a(a, false);
    }
}
