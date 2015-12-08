// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.wobs.add.api.AddWobsApi;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GiftCardApi
{

    private static final Pattern EDIT_GIFT_CARD_URI_PATTERN = Pattern.compile("comgooglewallet:///giftcards/instance/(.+)/edit\\?.+");
    private static final Pattern FULL_EDIT_GIFT_CARD_URI_PATTERN = Pattern.compile("comgooglewallet:///giftcards/instance/(.+)/fullEdit");
    public static final com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings IMAGE_CAPTURE_ANALYTICS_STRINGS = new com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings("Scan Gift Card", "ScanCard", "SkipScanning", "ScanCard");

    public static Intent createNewGiftCardActivityIntentWithOcrResults(Context context, int i, ArrayList arraylist)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.giftcard.NewGiftCardActivity").putParcelableArrayListExtra("extra_wob_ocr_results", arraylist).putExtra("extra_ocr_result_code", i);
    }

    public static Intent createStartNewGiftCardFlowIntent(Context context, boolean flag)
    {
        if (flag)
        {
            return AddWobsApi.createCaptureImagesActivityIntent(context, IMAGE_CAPTURE_ANALYTICS_STRINGS, 1);
        } else
        {
            return InternalIntents.forClass(context, "com.google.android.apps.wallet.giftcard.NewGiftCardActivity");
        }
    }

    public static String parseGiftCardIdFromEditGiftCardUri(String s)
    {
        s = EDIT_GIFT_CARD_URI_PATTERN.matcher(s);
        if (s.matches())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    public static String parseGiftCardIdFromFullEditGiftCardUri(String s)
    {
        s = FULL_EDIT_GIFT_CARD_URI_PATTERN.matcher(s);
        if (s.matches())
        {
            return s.group(1);
        } else
        {
            return null;
        }
    }

    public static boolean uriMatchesEditGiftCardPattern(String s)
    {
        return EDIT_GIFT_CARD_URI_PATTERN.matcher(s).matches();
    }

    public static boolean uriMatchesFullEditGiftCardPattern(String s)
    {
        return FULL_EDIT_GIFT_CARD_URI_PATTERN.matcher(s).matches();
    }

}
