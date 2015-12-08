// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            k, q

final class l
    implements AccountManagerCallback
{

    final Activity a;
    final q b;
    final k c;

    l(k k1, Activity activity, q q)
    {
        c = k1;
        a = activity;
        b = q;
        super();
    }

    public final void run(AccountManagerFuture accountmanagerfuture)
    {
        if (c.b().length > 0)
        {
            c.a(a, b);
        }
    }
}
