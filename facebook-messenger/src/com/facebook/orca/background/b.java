// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.orca.background:
//            a

class b extends BroadcastReceiver
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        com.facebook.orca.background.a.a(a);
    }
}
