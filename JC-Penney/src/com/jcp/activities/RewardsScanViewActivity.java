// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.util.bt;

// Referenced classes of package com.jcp.activities:
//            an

public class RewardsScanViewActivity extends an
{

    protected TextView mBarcodeNumberView;
    protected ImageView mBarcodeView;
    protected TextView mExpiryView;
    protected TextView mRewardView;

    public RewardsScanViewActivity()
    {
    }

    protected String a()
    {
        return "REWARDSSCANVIEW";
    }

    protected boolean d()
    {
        return true;
    }

    public void onClickClose()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002d);
        ButterKnife.inject(this);
        Object obj = getIntent().getExtras();
        if (obj == null)
        {
            finish();
            return;
        } else
        {
            bundle = ((Bundle) (obj)).getString("reward");
            String s = ((Bundle) (obj)).getString("expiry");
            obj = ((Bundle) (obj)).getString("barcode_number");
            mRewardView.setText(bundle);
            mExpiryView.setText(s);
            bt.a(mBarcodeView, ((String) (obj)));
            mBarcodeNumberView.setText(((CharSequence) (obj)));
            return;
        }
    }
}
