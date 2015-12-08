// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IResolveAccountCallbacks;
import com.google.android.gms.signin.internal.ISignInCallbacks;
import java.util.Set;

public interface SignInClient
    extends com.google.android.gms.common.api.Api.Client
{

    public abstract void authAccount(IAccountAccessor iaccountaccessor, Set set, ISignInCallbacks isignincallbacks);

    public abstract void clearAccountFromSessionStore();

    public abstract void connect();

    public abstract void resolveAccount(IResolveAccountCallbacks iresolveaccountcallbacks);

    public abstract void saveDefaultAccount(IAccountAccessor iaccountaccessor, boolean flag);
}
