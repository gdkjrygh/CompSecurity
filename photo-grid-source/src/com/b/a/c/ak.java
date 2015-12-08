// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.b.a.c:
//            aa

final class ak extends BroadcastReceiver
{

    final aa a;

    ak(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        aa.a(a, true);
    }
}
