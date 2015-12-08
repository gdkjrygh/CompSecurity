// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

final class moj
    implements AccountManagerCallback
{

    private am a;
    private moi b;

    moj(moi moi1, am am1)
    {
        b = moi1;
        a = am1;
        super();
    }

    public final void run(AccountManagerFuture accountmanagerfuture)
    {
        try
        {
            if (a.i())
            {
                accountmanagerfuture = (Intent)((Bundle)accountmanagerfuture.getResult()).getParcelable("intent");
                moi.a(b, a, accountmanagerfuture);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            throw new IllegalStateException(accountmanagerfuture);
        }
    }
}
