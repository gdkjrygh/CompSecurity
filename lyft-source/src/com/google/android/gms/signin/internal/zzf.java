// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zze, CheckServerAuthResult

public interface zzf
    extends IInterface
{

    public abstract void a(int i);

    public abstract void a(int i, Account account, zze zze);

    public abstract void a(AuthAccountRequest authaccountrequest, zze zze);

    public abstract void a(IAccountAccessor iaccountaccessor, int i, boolean flag);

    public abstract void a(ResolveAccountRequest resolveaccountrequest, zzq zzq);

    public abstract void a(CheckServerAuthResult checkserverauthresult);

    public abstract void a(boolean flag);
}
