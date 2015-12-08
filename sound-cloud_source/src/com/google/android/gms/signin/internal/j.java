// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.signin.internal:
//            CheckServerAuthResult, f

final class j
    implements Runnable
{

    final List a;
    final String b;
    final f c;
    final i.a d;

    j(i.a a1, List list, String s, f f1)
    {
        d = a1;
        a = list;
        b = s;
        c = f1;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = i.a.a(d);
            java.util.Set set = Collections.unmodifiableSet(new HashSet(a));
            obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(b, set);
            obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zznl(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zznm());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }
}
