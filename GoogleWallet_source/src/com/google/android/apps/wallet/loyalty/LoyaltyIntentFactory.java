// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsHandler

public class LoyaltyIntentFactory
{

    private static final Pattern FULL_EDIT_LOYALTY_CARD_URI_PATTERN = Pattern.compile("comgooglewallet:///loyalty/instance/(.+)/fullEdit");
    private final Application application;

    LoyaltyIntentFactory(Application application1, LoyaltyCardsHandler loyaltycardshandler)
    {
        application = application1;
    }

    static Intent createScanBarcodeActivity(Context context)
    {
        return (new Intent()).setClassName(context, "com.google.android.apps.wallet.loyalty.ScanBarcodeActivity");
    }

    static String parseWobIdFromFullEditLoyaltyCardUri(String s)
    {
        s = FULL_EDIT_LOYALTY_CARD_URI_PATTERN.matcher(s);
        if (s.matches())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    static boolean uriMatchesFullEditLoyaltyCardPattern(String s)
    {
        return FULL_EDIT_LOYALTY_CARD_URI_PATTERN.matcher(s).matches();
    }

    final Intent createNewLoyaltyCardActivityIntent(String s, boolean flag)
    {
        return InternalIntents.forClass(application, "com.google.android.apps.wallet.loyalty.NewLoyaltyCardActivity").putExtra("is_signup", flag).putExtra("extra_discoverable_id", s);
    }

}
