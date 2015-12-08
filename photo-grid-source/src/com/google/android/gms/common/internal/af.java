// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            bl, ba, aa, ai

public final class af
    implements ServiceConnection
{

    final aa a;
    private final int b;

    public af(aa aa1, int i)
    {
        a = aa1;
        super();
        b = i;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        bl.a(ibinder, "Expecting a valid IBinder");
        aa.a(a, ba.a(ibinder));
        componentname = a;
        int i = b;
        ((aa) (componentname)).b.sendMessage(((aa) (componentname)).b.obtainMessage(6, i, -1, new ai(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, b, 1));
    }
}
