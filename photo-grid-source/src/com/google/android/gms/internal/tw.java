// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            tu, tx, uj

final class tw extends b
{

    private final WeakReference a;

    tw(tu tu1)
    {
        a = new WeakReference(tu1);
    }

    public final void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        authaccountresult = (tu)a.get();
        if (authaccountresult == null)
        {
            return;
        } else
        {
            tu.c(authaccountresult).a(new tx(this, authaccountresult, authaccountresult, connectionresult));
            return;
        }
    }
}
