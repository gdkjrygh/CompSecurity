// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            de

final class kP
    implements ServiceConnection
{

    final de kP;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        kP.u(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        de.a(kP, null);
        kP.bb();
    }

    (de de1)
    {
        kP = de1;
        super();
    }
}
