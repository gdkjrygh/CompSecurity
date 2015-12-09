// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Handler;

public abstract class daz extends dbh
{

    final Context a;

    public daz(Context context, AccountManagerCallback accountmanagercallback, Handler handler)
    {
        super(accountmanagercallback, handler);
        a = context;
    }
}
