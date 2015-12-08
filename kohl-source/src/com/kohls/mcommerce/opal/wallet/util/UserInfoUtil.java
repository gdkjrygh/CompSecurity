// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.rest.containers.Customer;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            WalletFontCache, CustomTypeFace, DateUtils

public class UserInfoUtil
{

    public UserInfoUtil()
    {
    }

    public static void getUserInfo(Activity activity, ProfileData profiledata)
    {
        Resources resources;
        resources = activity.getApplicationContext().getResources();
        android.graphics.Typeface typeface = WalletFontCache.getGothamBook(activity.getApplicationContext());
        android.graphics.Typeface typeface1 = WalletFontCache.getGothamBold(activity.getApplicationContext());
        Object obj = (TextView)activity.findViewById(0x7f0d0653);
        Object obj1;
        String s;
        int i;
        if (TextUtils.isEmpty(profiledata.getCustomerName().getFirstName()))
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            ((TextView) (obj)).setText((new StringBuilder()).append(DateUtils.convertStringToTitleCase(profiledata.getCustomerName().getFirstName())).append(" ").append(DateUtils.convertStringToTitleCase(profiledata.getCustomerName().getLastName())).toString());
        }
        obj = profiledata.getLoyaltyId();
        obj1 = (new StringBuilder()).append(((String) (obj)).substring(0, 4)).append("  ").append(((String) (obj)).substring(4, 8)).append("  ").append(((String) (obj)).substring(8)).toString();
        obj = obj1;
_L1:
        obj1 = (TextView)activity.findViewById(0x7f0d0654);
        s = (new StringBuilder()).append(resources.getString(0x7f080494)).append(" ").append(((String) (obj))).toString();
        i = s.indexOf(((String) (obj)));
        obj = new SpannableString(s);
        ((SpannableString) (obj)).setSpan(new CustomTypeFace(typeface), 0, i, 0);
        ((SpannableString) (obj)).setSpan(new TextAppearanceSpan(activity, 0x7f0f001d), 0, i, 0);
        ((SpannableString) (obj)).setSpan(new CustomTypeFace(typeface1), i, s.length(), 0);
        ((SpannableString) (obj)).setSpan(new TextAppearanceSpan(activity, 0x7f0f001d), i, s.length(), 0);
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        activity = (TextView)activity.findViewById(0x7f0d0655);
        Exception exception;
        if (TextUtils.isEmpty(profiledata.getMemberSince()))
        {
            activity.setVisibility(8);
            return;
        } else
        {
            activity.setText((new StringBuilder()).append(resources.getString(0x7f0803a4)).append(" ").append(DateUtils.prepareMonthYearFromString(profiledata.getMemberSince())).toString());
            activity.setVisibility(0);
            return;
        }
        exception;
          goto _L1
    }
}
