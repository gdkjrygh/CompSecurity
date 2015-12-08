// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import java.util.Date;

// Referenced classes of package com.accuweather.android.market:
//            MarketUtils

public class RatingPrompter
{

    private static final int NUMBER_OF_DAYS_BEFORE_PROMPT = 14;
    private static final int ONE_DAY_MILLIS = 0x5265c00;
    private Context mContext;

    public RatingPrompter(Context context)
    {
        mContext = context;
    }

    private void checkForRatings()
    {
        if (!wasRatingsPromptShown() && Math.abs(((new Date()).getTime() - getInstallDate()) / 0x5265c00L) >= 14L)
        {
            (new android.app.AlertDialog.Builder(mContext)).setTitle(com.accuweather.android.R.string.PleaseRateOurApp).setMessage(com.accuweather.android.R.string.PhrasePleaseRateApp).setPositiveButton(com.accuweather.android.R.string.OK, new android.content.DialogInterface.OnClickListener() {

                final RatingPrompter this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    MarketUtils.rateThisApp(mContext);
                    setRatingsPromptShown();
                }

            
            {
                this$0 = RatingPrompter.this;
                super();
            }
            }).setNegativeButton(com.accuweather.android.R.string.Cancel, new android.content.DialogInterface.OnClickListener() {

                final RatingPrompter this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.dismiss();
                    setRatingsPromptShown();
                }

            
            {
                this$0 = RatingPrompter.this;
                super();
            }
            }).create().show();
        }
    }

    private long getInstallDate()
    {
        return PreferenceUtils.getLong(mContext, "", 0L);
    }

    private void setInstallDate(long l)
    {
        PreferenceUtils.save(mContext, "", l);
    }

    private void setRatingsPromptShown()
    {
        PreferenceUtils.save(mContext, "ratings_prompt", true);
    }

    private boolean wasRatingsPromptShown()
    {
        return PreferenceUtils.get(mContext, "ratings_prompt", false);
    }

    public void handleRatingsPrompt()
    {
        if (!PartnerCoding.isPartnerCodedIcontrol(mContext) && MarketUtils.shouldShowRateOrUpgrade(mContext) && getInstallDate() != 0L)
        {
            checkForRatings();
        }
    }

    public void setInstallDate()
    {
        if (getInstallDate() == 0L)
        {
            setInstallDate((new Date()).getTime());
        }
    }


}
