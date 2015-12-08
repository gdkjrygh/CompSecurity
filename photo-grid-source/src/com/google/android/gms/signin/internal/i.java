// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.as;
import com.google.android.gms.common.internal.bc;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f, CheckServerAuthResult, RecordConsentRequest

public interface i
    extends IInterface
{

    public abstract void a(int j);

    public abstract void a(int j, Account account, f f);

    public abstract void a(AuthAccountRequest authaccountrequest, f f);

    public abstract void a(ResolveAccountRequest resolveaccountrequest, bc bc);

    public abstract void a(as as, int j, boolean flag);

    public abstract void a(CheckServerAuthResult checkserverauthresult);

    public abstract void a(RecordConsentRequest recordconsentrequest, f f);

    public abstract void a(f f);

    public abstract void a(boolean flag);
}
