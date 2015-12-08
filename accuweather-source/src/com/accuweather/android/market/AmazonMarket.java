// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.accuweather.android.market:
//            Market

public class AmazonMarket extends Market
{

    private static final String AMAZON_FREE_PACKAGE = "com.accuweather.amazon.android";
    private static final String AMAZON_PLATINUM_PACKAGE = "com.accuweather.amazon.paid.android";

    public AmazonMarket()
    {
    }

    public void goToFree(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=com.accuweather.amazon.android")));
    }

    public void goToPlatinum(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=com.accuweather.amazon.paid.android")));
    }
}
