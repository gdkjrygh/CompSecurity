// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.activities:
//            RewardsScanViewActivity, bg

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, RewardsScanViewActivity rewardsscanviewactivity, Object obj)
    {
        rewardsscanviewactivity.mRewardView = (TextView)jector.View((View)jector.View(obj, 0x7f0e019d, "field 'mRewardView'"), 0x7f0e019d, "field 'mRewardView'");
        rewardsscanviewactivity.mExpiryView = (TextView)jector.View((View)jector.View(obj, 0x7f0e019e, "field 'mExpiryView'"), 0x7f0e019e, "field 'mExpiryView'");
        rewardsscanviewactivity.mBarcodeView = (ImageView)jector.eView((View)jector.eView(obj, 0x7f0e0198, "field 'mBarcodeView'"), 0x7f0e0198, "field 'mBarcodeView'");
        rewardsscanviewactivity.mBarcodeNumberView = (TextView)jector.eNumberView((View)jector.eNumberView(obj, 0x7f0e0199, "field 'mBarcodeNumberView'"), 0x7f0e0199, "field 'mBarcodeNumberView'");
        ((View)jector.eNumberView(obj, 0x7f0e0095, "method 'onClickClose'")).setOnClickListener(new bg(this, rewardsscanviewactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (RewardsScanViewActivity)obj, obj1);
    }

    public void reset(RewardsScanViewActivity rewardsscanviewactivity)
    {
        rewardsscanviewactivity.mRewardView = null;
        rewardsscanviewactivity.mExpiryView = null;
        rewardsscanviewactivity.mBarcodeView = null;
        rewardsscanviewactivity.mBarcodeNumberView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsScanViewActivity)obj);
    }

    public ()
    {
    }
}
