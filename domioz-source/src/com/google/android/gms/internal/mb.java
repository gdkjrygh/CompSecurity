// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.p;

// Referenced classes of package com.google.android.gms.internal:
//            lz, lu

final class mb
    implements Runnable
{

    final String a;
    final String b;
    final lu c;
    final lz d;

    mb(lz lz1, String s, String s1, lu lu1)
    {
        d = lz1;
        a = s;
        b = s1;
        c = lu1;
        super();
    }

    public final void run()
    {
        try
        {
            boolean flag = lz.a(d).b();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
