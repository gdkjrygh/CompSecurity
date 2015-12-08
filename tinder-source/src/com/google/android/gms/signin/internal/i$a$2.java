// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.signin.internal:
//            i, f

final class c
    implements Runnable
{

    final String a;
    final String b;
    final f c;
    final c d;

    public final void run()
    {
        try
        {
            boolean flag = c(d).d();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }

    ( , String s, String s1, f f1)
    {
        d = ;
        a = s;
        b = s1;
        c = f1;
        super();
    }
}
