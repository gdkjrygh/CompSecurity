// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.widget.BindingFrameLayout;

// Referenced classes of package com.google.android.play.onboard:
//            OnboardPage, OnboardPageInfo, OnboardHostControl, OnboardNavFooterButtonInfo

public class OnboardTutorialPage extends BindingFrameLayout
    implements OnboardPage
{
    public static final class Builder
    {

        protected final Context mContext;
        protected Data mData;
        protected final int mPageCount = 3;
        protected final int mPageIndex;

        public final Data build()
        {
            if (mData.get(0x7f0d0055) == null)
            {
                mData.put(0x7f0d0055, (new StringBuilder("tutorial")).append(mPageIndex).toString());
            }
            if (mData.get(0x7f0d0056) == null)
            {
                mData.put(0x7f0d0056, new DefaultTutorialPageInfo(mContext.getApplicationContext(), mPageIndex, 3));
            }
            return mData;
        }

        public final Builder setBackgroundColor(int i)
        {
            mData.put(0x7f0d0059, Integer.valueOf(i));
            return this;
        }

        public final Builder setBodyText(int i)
        {
            String s = mContext.getString(i);
            mData.put(0x7f0d005a, s);
            return this;
        }

        public final Builder setIconDrawableId(int i)
        {
            mData.put(0x7f0d005b, Integer.valueOf(i));
            return this;
        }

        public final Builder setPageInfo(OnboardPageInfo onboardpageinfo)
        {
            mData.put(0x7f0d0056, onboardpageinfo);
            return this;
        }

        public final Builder setTitleText(int i)
        {
            String s = mContext.getString(i);
            mData.put(0x7f0d005c, s);
            return this;
        }

        public Builder(Context context, int i)
        {
            mData = new Data();
            mContext = context;
            mPageIndex = i;
            mData.put(0x7f0d0003, Integer.valueOf(0x7f040126));
        }
    }

    public static final class DefaultTutorialPageInfo
        implements OnboardPageInfo
    {

        protected final Context mContext;
        private final int mPageCount;
        private final int mPageIndex;

        public final boolean allowSwipeToNext$5669347f()
        {
            return true;
        }

        public final boolean allowSwipeToPrevious$5669347f()
        {
            return true;
        }

        public final OnboardNavFooterButtonInfo getEndButtonInfo(OnboardHostControl onboardhostcontrol)
        {
            return (new OnboardNavFooterButtonInfo()).setIconResId(0x7f02019c).setLabel(mContext, 0x7f100343).setClickRunnable(onboardhostcontrol. new Runnable() {

                final DefaultTutorialPageInfo this$0;
                final OnboardHostControl val$hostControl;

                public final void run()
                {
                    hostControl.goToNextPage();
                }

            
            {
                this$0 = final_defaulttutorialpageinfo;
                hostControl = OnboardHostControl.this;
                super();
            }
            });
        }

        public final int getGroupPageCount$5669346e()
        {
            return mPageCount;
        }

        public final int getGroupPageIndex$5669346e()
        {
            return mPageIndex;
        }

        public final OnboardNavFooterButtonInfo getStartButtonInfo(OnboardHostControl onboardhostcontrol)
        {
            return (new OnboardNavFooterButtonInfo()).setVisible$1466a8b4();
        }

        public final boolean isNavFooterVisible$5669347f()
        {
            return true;
        }

        public final boolean shouldAdjustPagePaddingToFitNavFooter$5669347f()
        {
            return true;
        }

        public DefaultTutorialPageInfo(Context context, int i, int j)
        {
            mContext = context;
            mPageIndex = i;
            mPageCount = j;
        }
    }


    public static final int DK_BACKGROUND_COLOR = 0x7f0d0059;
    public static final int DK_BODY_TEXT = 0x7f0d005a;
    public static final int DK_ICON_DRAWABLE_ID = 0x7f0d005b;
    public static final int DK_TITLE_TEXT = 0x7f0d005c;
    protected OnboardHostControl mHostControl;

    public OnboardTutorialPage(Context context)
    {
        this(context, null);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public OnboardTutorialPage(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final OnboardPageInfo getPageInfo()
    {
        Object obj = getData();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Data) (obj)).get(0x7f0d0056);
        }
        return (OnboardPageInfo)obj;
    }

    public final void setOnboardHostControl(OnboardHostControl onboardhostcontrol)
    {
        mHostControl = onboardhostcontrol;
    }

}
