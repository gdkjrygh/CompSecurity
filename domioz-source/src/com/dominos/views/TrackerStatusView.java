// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.utils.TrackerStatusUtil;

// Referenced classes of package com.dominos.views:
//            QuantityView

public class TrackerStatusView extends LinearLayout
{

    public static final String TAG = com/dominos/views/QuantityView.getSimpleName();
    TextView mCompletedStageTitleView;
    private final Context mContext;
    ImageView mCurrentStageAnimationView;
    ImageView mCurrentStageImageView;
    TextView mStageDetailView;
    TextView mStageSummaryView;
    Animation mTrackerPillAnimation;
    TrackerStatusUtil mTrackerStatusUtil;

    public TrackerStatusView(Context context)
    {
        super(context);
        mContext = context;
    }

    public TrackerStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    private void setCurrentStageAnimation(OrderStatus orderstatus)
    {
        int i;
        int j;
        clearAnimation();
        j = 0x7f020182;
        i = j;
        if (orderstatus == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[orderstatus.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 82
    //                   2 88
    //                   3 94
    //                   4 100
    //                   5 81
    //                   6 81;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L3:
        i = j;
_L2:
        mCurrentStageAnimationView.setImageResource(i);
        mCurrentStageAnimationView.startAnimation(mTrackerPillAnimation);
_L8:
        return;
_L4:
        i = 0x7f020183;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f02017d;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f020184;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f02017f;
        if (true) goto _L2; else goto _L9
_L9:
    }

    private void setCurrentStagePillImage(OrderStatus orderstatus)
    {
        int i;
        int j;
        j = 0x7f02017e;
        i = j;
        if (orderstatus == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[orderstatus.ordinal()];
        JVM INSTR tableswitch 1 6: default 56
    //                   1 67
    //                   2 73
    //                   3 79
    //                   4 85
    //                   5 91
    //                   6 91;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L3:
        i = j;
_L2:
        mCurrentStageImageView.setImageResource(i);
        return;
_L4:
        i = 0x7f020058;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f020059;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f02005a;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f02005b;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f02005c;
        if (true) goto _L2; else goto _L9
_L9:
    }

    public void clearAnimation()
    {
        mTrackerPillAnimation.reset();
        mCurrentStageAnimationView.clearAnimation();
    }

    public void setCurrentStatus(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus == null)
        {
            return;
        } else
        {
            setCurrentStagePillImage(trackerorderstatus.getOrderStatus());
            mCompletedStageTitleView.setText(mTrackerStatusUtil.getTitle(trackerorderstatus));
            mStageSummaryView.setText(mTrackerStatusUtil.getSummary(trackerorderstatus));
            mStageDetailView.setText(mTrackerStatusUtil.getDetail(trackerorderstatus));
            setCurrentStageAnimation(trackerorderstatus.getOrderStatus());
            return;
        }
    }

    public void setStatusAsStarted(ServiceMethod servicemethod)
    {
        mCurrentStageImageView.setImageResource(0x7f020057);
        TextView textview = mCompletedStageTitleView;
        if (servicemethod == ServiceMethod.DELIVERY)
        {
            servicemethod = mContext.getString(0x7f0800f3);
        } else
        {
            servicemethod = mContext.getString(0x7f080085);
        }
        textview.setText(servicemethod);
        setCurrentStagePillImage(null);
        setCurrentStageAnimation(null);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
