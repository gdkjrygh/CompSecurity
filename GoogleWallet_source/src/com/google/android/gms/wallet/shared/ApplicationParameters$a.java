// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            ApplicationParameters

public final class <init>
{

    final ApplicationParameters aVx;

    public final <init> A(Bundle bundle)
    {
        aVx.mArgs = bundle;
        return this;
    }

    public final rgs d(Account account)
    {
        aVx.aVv = account;
        return this;
    }

    public final v ln(int i)
    {
        aVx.aUz = i;
        return this;
    }

    public final z lo(int i)
    {
        aVx.mTheme = i;
        return this;
    }

    public final ApplicationParameters uZ()
    {
        return aVx;
    }

    private (ApplicationParameters applicationparameters)
    {
        aVx = applicationparameters;
        super();
    }

    aVx(ApplicationParameters applicationparameters, aVx avx)
    {
        this(applicationparameters);
    }
}
