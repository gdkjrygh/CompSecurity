// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.orca.server:
//            aj

class ak extends BroadcastReceiver
{

    final aj a;

    ak(aj aj1)
    {
        a = aj1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        aj.a(a);
    }
}
