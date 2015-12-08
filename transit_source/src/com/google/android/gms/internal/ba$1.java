// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ba, ay, cn

class fu
    implements Runnable
{

    final ba fu;

    public void run()
    {
        try
        {
            ba.a(fu).y();
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not call onAdClicked.", remoteexception);
        }
    }

    (ba ba1)
    {
        fu = ba1;
        super();
    }
}
