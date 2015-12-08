// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.accounts.AccountManager;
import android.content.Context;
import com.google.inject.Provider;

public class AccountManagerProvider
    implements Provider
{

    protected Context context;

    public AccountManagerProvider()
    {
    }

    public AccountManager get()
    {
        return AccountManager.get(context);
    }

    public volatile Object get()
    {
        return get();
    }
}
