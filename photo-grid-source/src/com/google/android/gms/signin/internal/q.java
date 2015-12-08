// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.m;

// Referenced classes of package com.google.android.gms.signin.internal:
//            o, i

final class q
    implements Runnable
{

    final String a;
    final String b;
    final i c;
    final o d;

    q(o o1, String s, String s1, i j)
    {
        d = o1;
        a = s;
        b = s1;
        c = j;
        super();
    }

    public final void run()
    {
        try
        {
            boolean flag = o.a(d).b();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
