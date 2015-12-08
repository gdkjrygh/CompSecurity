// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.m4b.maps.v:
//            i, h

final class c
    implements Runnable
{

    private String a;
    private String b;
    private h c;
    private c d;

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

    ( , String s, String s1, h h1)
    {
        d = ;
        a = s;
        b = s1;
        c = h1;
        super();
    }
}
