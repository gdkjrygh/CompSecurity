// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.iap;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.kik.cards.web.iap:
//            b

final class c
    implements ServiceConnection
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.a(a, com.android.a.a.a.a.a(ibinder));
        b.a(a);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.a(a, null);
    }
}
