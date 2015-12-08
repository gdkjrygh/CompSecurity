// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.signin.internal:
//            o, CheckServerAuthResult, i

final class p
    implements Runnable
{

    final List a;
    final String b;
    final i c;
    final o d;

    p(o o1, List list, String s, i j)
    {
        d = o1;
        a = list;
        b = s;
        c = j;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = o.a(d);
            Collections.unmodifiableSet(new HashSet(a));
            obj = ((m) (obj)).a();
            obj = new CheckServerAuthResult(((n) (obj)).a(), ((n) (obj)).b());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
