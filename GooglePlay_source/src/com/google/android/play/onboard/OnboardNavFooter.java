// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.play.utils.Assertions;
import com.google.android.play.utils.TextViewUtils;
import com.google.android.play.widget.PageIndicator;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardNavFooterButtonInfo, OnboardPageInfo, OnboardHostControl

public class OnboardNavFooter extends FrameLayout
{

    protected final TextView mEndButton;
    protected final PageIndicator mPageIndicator;
    protected final TextView mStartButton;

    public OnboardNavFooter(Context context)
    {
        this(context, null);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    public OnboardNavFooter(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i);
        LayoutInflater.from(context).inflate(0x7f040122, this);
        setBackgroundColor(context.getResources().getColor(0x7f0b0281));
        mStartButton = (TextView)findViewById(0x7f0d032a);
        mEndButton = (TextView)findViewById(0x7f0d032b);
        mPageIndicator = (PageIndicator)findViewById(0x7f0d02cc);
    }

    private void updateButton(TextView textview, final OnboardNavFooterButtonInfo clickRunnable)
    {
        android.graphics.drawable.Drawable drawable;
        int i;
        if (clickRunnable.isVisible())
        {
            i = 0;
        } else
        {
            i = 4;
        }
        textview.setVisibility(i);
        textview.setEnabled(clickRunnable.isEnabled());
        textview.setText(clickRunnable.getLabel());
        textview.setContentDescription(null);
        if (clickRunnable.getIconResId() == 0)
        {
            drawable = null;
        } else
        {
            drawable = getResources().getDrawable(clickRunnable.getIconResId());
        }
        if (textview == mStartButton)
        {
            TextViewUtils.setDrawable(textview, drawable, true);
        } else
        {
            TextViewUtils.setDrawable(textview, drawable, false);
        }
        clickRunnable = clickRunnable.getClickRunnable();
        if (clickRunnable == null)
        {
            clickRunnable = null;
        } else
        {
            clickRunnable = new android.view.View.OnClickListener() {

                final OnboardNavFooter this$0;
                final Runnable val$clickRunnable;

                public final void onClick(View view)
                {
                    clickRunnable.run();
                }

            
            {
                this$0 = OnboardNavFooter.this;
                clickRunnable = runnable;
                super();
            }
            };
        }
        textview.setOnClickListener(clickRunnable);
    }

    public final void updatePageInfo(OnboardHostControl onboardhostcontrol, OnboardPageInfo onboardpageinfo)
    {
        PageIndicator pageindicator;
        int i;
        int j;
        boolean flag;
        if (onboardpageinfo.isNavFooterVisible$5669347f())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        pageindicator = mPageIndicator;
        j = onboardpageinfo.getGroupPageCount$5669346e();
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.checkArgument(flag, "numPages must be >=0");
        i = pageindicator.getChildCount();
        if (j >= i) goto _L2; else goto _L1
_L1:
        pageindicator.removeViews(j, i - j);
_L4:
        pageindicator.updateContentDescription();
        mPageIndicator.setSelectedPage(onboardpageinfo.getGroupPageIndex$5669346e());
        updateButton(mStartButton, onboardpageinfo.getStartButtonInfo(onboardhostcontrol));
        updateButton(mEndButton, onboardpageinfo.getEndButtonInfo(onboardhostcontrol));
        return;
_L2:
        if (j > i)
        {
            while (i < j) 
            {
                ImageView imageview = new ImageView(pageindicator.getContext());
                imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                imageview.setImageResource(0x7f020278);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                int k = pageindicator.getResources().getDimensionPixelSize(0x7f0c0323) / 2;
                layoutparams.gravity = 16;
                layoutparams.setMargins(k, 0, k, 0);
                pageindicator.addView(imageview, layoutparams);
                boolean flag1;
                if (i == pageindicator.mSelectedPage)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                pageindicator.setDotState(imageview, flag1);
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
