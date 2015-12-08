// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.google.android.gms.internal:
//            zzvz

public interface mo
    extends IInterface
{

    public abstract void a(int i, Bundle bundle);

    public abstract void a(int i, FullWallet fullwallet, Bundle bundle);

    public abstract void a(int i, MaskedWallet maskedwallet, Bundle bundle);

    public abstract void a(int i, boolean flag, Bundle bundle);

    public abstract void a(Status status, zzvz zzvz, Bundle bundle);

    public abstract void b(int i, boolean flag, Bundle bundle);
}
