// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.activities.RewardsScanViewActivity;
import com.jcp.h.a;
import com.jcp.model.rewards.Certificate;

// Referenced classes of package com.jcp.adapters:
//            RewardsItemAdapter

class 
    implements android.view.der
{

    protected Button applyBagButton;
    protected ImageView barcodeImage;
    protected TextView earnRewardstv;
    protected TextView easyScanLayout;
    protected TextView rewardBarCodeNumber;
    protected TextView rewardSerialNumber;
    protected LinearLayout rewardsBottomSection;
    protected TextView rewardsExpDatetv;
    protected TextView rewardsavltv;

    public void launchRewardCardActivity(View view)
    {
        Intent intent = new Intent(view.getContext(), com/jcp/activities/RewardsScanViewActivity);
        intent.putExtra("reward", ((Certificate)view.getTag()).getType());
        intent.putExtra("barcode_number", ((Certificate)view.getTag()).getSerialNumber());
        intent.putExtra("expiry", ((Certificate)view.getTag()).getExpires());
        view.getContext().startActivity(intent);
    }

    public void onClick(View view)
    {
        view = (Certificate)view.getTag();
        if (!view.isApplied())
        {
            a.q();
        }
        com.jcp.adapters.RewardsItemAdapter.a(com.jcp.adapters.RewardsItemAdapter.a(), view);
    }

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
