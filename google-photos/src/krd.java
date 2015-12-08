// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class krd
{

    public krd(kre kre)
    {
        b.f(kre, "Callbacks must not be null.");
    }

    public static boolean a(Context context, Intent intent)
    {
        b.f(context, "Context must not be null.");
        b.f(intent, "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
