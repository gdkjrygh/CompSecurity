// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.accuweather.android.market:
//            Market

public class BarnesAndNobleMarket extends Market
{

    private static final String BARNES_NOBLE_EAN = "2940043875044";

    public BarnesAndNobleMarket()
    {
    }

    public void goToFree(Context context)
    {
    }

    public void goToPlatinum(Context context)
    {
        Intent intent = new Intent();
        intent.setAction("com.bn.sdk.shop.details");
        intent.putExtra("product_details_ean", "2940043875044");
        context.startActivity(intent);
    }
}
