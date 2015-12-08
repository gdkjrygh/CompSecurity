// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.wallet.rest.containers.LoyaltyProfileResponse;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            WalletFontCache, CustomTypeFace, PointsIndicatorSeekBar

public class PointsIndicatorUtil
{

    Typeface boldFont;
    Typeface regularFont;

    public PointsIndicatorUtil()
    {
        regularFont = WalletFontCache.getGothamBook(KohlsPhoneApplication.getInstance());
        boldFont = WalletFontCache.getGothamBold(KohlsPhoneApplication.getInstance());
    }

    public static int getThresholdPoints(int i, int j)
    {
        int k = i;
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = 100;
_L4:
        return i;
_L2:
        do
        {
            i = k;
            if (j <= k)
            {
                continue;
            }
            k += 100;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setCurrentPtsView(Activity activity, int i)
    {
        ((TextView)activity.findViewById(0x7f0d0499)).setText((new StringBuilder()).append(i).append(" ").append(activity.getResources().getString(0x7f08043e)).toString());
    }

    public SpannableString getRewardText(LoyaltyProfileResponse loyaltyprofileresponse, Context context)
    {
        Object obj = null;
        if (TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointBalance()))
        {
            loyaltyprofileresponse.getProfile().setPointBalance("0");
            loyaltyprofileresponse.getProfile().setPointThreshold("0");
        }
        SpannableString spannablestring = obj;
        if (!TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointThreshold()))
        {
            spannablestring = obj;
            if (!TextUtils.isEmpty(loyaltyprofileresponse.getProfile().getPointBalance()))
            {
                int i = getThresholdPoints(Integer.parseInt(loyaltyprofileresponse.getProfile().getPointThreshold()), Integer.parseInt(loyaltyprofileresponse.getProfile().getPointBalance()));
                int j = Integer.parseInt(loyaltyprofileresponse.getProfile().getPointBalance());
                loyaltyprofileresponse = (new StringBuilder()).append(context.getResources().getString(0x7f0803c8)).append(" ").append(i - j).append(" ").append(context.getString(0x7f0803ca)).append(" ").append(context.getResources().getString(0x7f0803c6)).append(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getLoyaltyReward()).append(" ").append(context.getResources().getString(0x7f0803c7)).toString();
                i = context.getResources().getString(0x7f0803c4).length();
                j = loyaltyprofileresponse.indexOf(context.getResources().getString(0x7f0803c6));
                spannablestring = new SpannableString(loyaltyprofileresponse);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), 0, i, 0);
                spannablestring.setSpan(new CustomTypeFace(regularFont), 0, i, 0);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), i, j, 0);
                spannablestring.setSpan(new CustomTypeFace(boldFont), i, j, 0);
                spannablestring.setSpan(new TextAppearanceSpan(context, 0x7f0f001d), j, loyaltyprofileresponse.length(), 0);
                spannablestring.setSpan(new CustomTypeFace(regularFont), j, loyaltyprofileresponse.length(), 0);
            }
        }
        return spannablestring;
    }

    public void setPointsIndicatorBar(Activity activity, int i)
    {
        PointsIndicatorSeekBar pointsindicatorseekbar = (PointsIndicatorSeekBar)activity.findViewById(0x7f0d049a);
        if (pointsindicatorseekbar != null)
        {
            TextView textview = (TextView)activity.findViewById(0x7f0d0499);
            TextView textview1 = (TextView)activity.findViewById(0x7f0d04c5);
            TextView textview2 = (TextView)activity.findViewById(0x7f0d04c6);
            pointsindicatorseekbar.setOnTouchListener(new _cls1());
            int j = getThresholdPoints(100, i);
            pointsindicatorseekbar.setMax(100);
            pointsindicatorseekbar.setProgress(i - (j - 100));
            pointsindicatorseekbar.setThumb(activity.getResources().getDrawable(0x7f0201b2));
            textview.setText((new StringBuilder()).append(i).append(" ").append(activity.getResources().getString(0x7f08043e)).toString());
            if (textview1 != null)
            {
                textview1.setText(String.valueOf(j - 100));
            }
            if (textview2 != null)
            {
                textview2.setText(String.valueOf(j));
            }
        }
    }

    /* member class not found */
    class _cls1 {}

}
