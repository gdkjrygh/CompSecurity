// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            aw, bd, ek, an

final class ao
    implements Runnable
{

    final aw a;
    final an b;

    ao(an an, aw aw1)
    {
        b = an;
        a = aw1;
        super();
    }

    public final void run()
    {
        try
        {
            a.c.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ek.a("Could not destroy mediation adapter.", remoteexception);
        }
    }
}
