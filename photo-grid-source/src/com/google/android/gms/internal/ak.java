// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface ak
    extends IInterface
{

    public abstract Bundle a(Account account);

    public abstract Bundle a(Account account, String s, Bundle bundle);

    public abstract Bundle a(Bundle bundle);

    public abstract Bundle a(String s, Bundle bundle);

    public abstract Bundle a(String s, String s1, Bundle bundle);

    public abstract AccountChangeEventsResponse a(AccountChangeEventsRequest accountchangeeventsrequest);
}
