// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.accounts.AccountManagerFuture;
import android.content.DialogInterface;
import com.google.android.libraries.translate.e.k;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            n

final class p
    implements android.content.DialogInterface.OnCancelListener
{

    final k a;
    final AccountManagerFuture b;
    final n c;

    p(n n, k k1, AccountManagerFuture accountmanagerfuture)
    {
        c = n;
        a = k1;
        b = accountmanagerfuture;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel(true);
        b.cancel(true);
    }
}
