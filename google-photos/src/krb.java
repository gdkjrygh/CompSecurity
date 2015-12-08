// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class krb
{

    private static kre a;
    private static final krd b;

    public static boolean a(Context context, Intent intent)
    {
        return krd.a(context, intent);
    }

    public static AccountData b(Context context, Intent intent)
    {
        krd krd1 = b;
        b.f(context, "Context must not be null.");
        b.f(intent, "Intent must not be null.");
        if (!krd.a(context, intent))
        {
            return null;
        } else
        {
            return (AccountData)b.a(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
        }
    }

    static 
    {
        a = new kre();
        b = new krd(a);
    }
}
