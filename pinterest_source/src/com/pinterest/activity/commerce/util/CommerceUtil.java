// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;

import android.content.Context;
import android.content.Intent;
import com.pinterest.activity.commerce.SecureDialogActivity;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;

public class CommerceUtil
{

    public CommerceUtil()
    {
    }

    public static void goAddressIntent(Context context)
    {
        goAddressIntent(context, null);
    }

    public static void goAddressIntent(Context context, DetailedShipping detailedshipping)
    {
        Intent intent = new Intent(context, com/pinterest/activity/commerce/SecureDialogActivity);
        intent.putExtra("dialog_type", "address");
        if (detailedshipping != null)
        {
            intent.putExtra("user_address", detailedshipping);
        }
        context.startActivity(intent);
    }

    public static void goPaymentIntent(Context context)
    {
        goPaymentIntent(context, null);
    }

    public static void goPaymentIntent(Context context, UserCard usercard)
    {
        Intent intent = new Intent(context, com/pinterest/activity/commerce/SecureDialogActivity);
        intent.putExtra("dialog_type", "payment");
        if (usercard != null)
        {
            intent.putExtra("user_card", usercard);
        }
        context.startActivity(intent);
    }
}
