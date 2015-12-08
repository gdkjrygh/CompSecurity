// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.activities:
//            RewardsCardViewActivity, bf

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, RewardsCardViewActivity rewardscardviewactivity, Object obj)
    {
        rewardscardviewactivity.mBarcodeView = (ImageView)jector.eView((View)jector.eView(obj, 0x7f0e0198, "field 'mBarcodeView'"), 0x7f0e0198, "field 'mBarcodeView'");
        rewardscardviewactivity.mBarcodeNumberView = (TextView)jector.eNumberView((View)jector.eNumberView(obj, 0x7f0e0199, "field 'mBarcodeNumberView'"), 0x7f0e0199, "field 'mBarcodeNumberView'");
        rewardscardviewactivity.mDividerView = (View)jector.rView(obj, 0x7f0e019b, "field 'mDividerView'");
        rewardscardviewactivity.mMemberTypeView = (TextView)jector.TypeView((View)jector.TypeView(obj, 0x7f0e019a, "field 'mMemberTypeView'"), 0x7f0e019a, "field 'mMemberTypeView'");
        rewardscardviewactivity.mEarnView = (TextView)jector.ew((View)jector.ew(obj, 0x7f0e019c, "field 'mEarnView'"), 0x7f0e019c, "field 'mEarnView'");
        ((View)jector.ew(obj, 0x7f0e0095, "method 'onClickClose'")).setOnClickListener(new bf(this, rewardscardviewactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (RewardsCardViewActivity)obj, obj1);
    }

    public void reset(RewardsCardViewActivity rewardscardviewactivity)
    {
        rewardscardviewactivity.mBarcodeView = null;
        rewardscardviewactivity.mBarcodeNumberView = null;
        rewardscardviewactivity.mDividerView = null;
        rewardscardviewactivity.mMemberTypeView = null;
        rewardscardviewactivity.mEarnView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsCardViewActivity)obj);
    }

    public ()
    {
    }
}
