// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.dominos.android.sdk.common.FontManager;

// Referenced classes of package com.dominos.views:
//            QuantityView

public class TrackerTopBarView extends LinearLayout
{

    public static final String TAG = com/dominos/views/QuantityView.getSimpleName();
    ImageButton mHomeButton;
    ImageButton mMultiScreenButton;

    public TrackerTopBarView(Context context)
    {
        super(context);
    }

    public TrackerTopBarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(final OnTopBarClickListener listener)
    {
        mHomeButton.setOnClickListener(new _cls1());
        mMultiScreenButton.setOnClickListener(new _cls2());
    }

    public void setHomeButtonVisible(boolean flag)
    {
        if (flag)
        {
            mHomeButton.setVisibility(0);
            return;
        } else
        {
            mHomeButton.setVisibility(4);
            return;
        }
    }

    public void setmMultiScreenButtonVisible(boolean flag)
    {
        if (flag)
        {
            mMultiScreenButton.setVisibility(0);
            return;
        } else
        {
            mMultiScreenButton.setVisibility(4);
            return;
        }
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackerTopBarView this$0;
        final OnTopBarClickListener val$listener;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onHomeButtonClicked();
            }
        }

        _cls1()
        {
            this$0 = TrackerTopBarView.this;
            listener = ontopbarclicklistener;
            super();
        }

        private class OnTopBarClickListener
        {

            public abstract void onHomeButtonClicked();

            public abstract void onMultiScreenButtonClicked();
        }

    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final TrackerTopBarView this$0;
        final OnTopBarClickListener val$listener;

        public void onClick(View view)
        {
            listener.onMultiScreenButtonClicked();
        }

        _cls2()
        {
            this$0 = TrackerTopBarView.this;
            listener = ontopbarclicklistener;
            super();
        }
    }

}
