// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Context;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            CancelPlasticCardActivity

static final class context
{

    private final int code;
    private final Context context;
    private final int stringResource;

    public final int getCode()
    {
        return code;
    }

    public final String toString()
    {
        return context.getString(stringResource);
    }

    public (int i, int j, Context context1)
    {
        stringResource = i;
        code = j;
        context = context1;
    }
}
