// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.accuweather.android.market:
//            Market

public class MobirooMarket extends Market
{

    public MobirooMarket()
    {
    }

    public final Uri getMobirooUri(Context context)
    {
        return Uri.parse("mma://app/86f3cfcf-420e-4fa4-8b27-9b1018b687f6");
    }

    public void goToFree(Context context)
    {
    }

    public void goToPlatinum(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", getMobirooUri(context)));
    }
}
