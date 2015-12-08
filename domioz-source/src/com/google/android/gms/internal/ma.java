// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            lz, zzuw, lu

final class ma
    implements Runnable
{

    final List a;
    final String b;
    final lu c;
    final lz d;

    ma(lz lz1, List list, String s, lu lu1)
    {
        d = lz1;
        a = list;
        b = s;
        c = lu1;
        super();
    }

    public final void run()
    {
        try
        {
            Object obj = lz.a(d);
            Collections.unmodifiableSet(new HashSet(a));
            obj = ((p) (obj)).a();
            obj = new zzuw(((q) (obj)).a(), ((q) (obj)).b());
            c.a(((zzuw) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
