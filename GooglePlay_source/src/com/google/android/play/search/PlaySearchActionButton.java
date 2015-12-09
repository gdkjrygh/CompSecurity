// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener, PlaySearchVoiceController, PlaySearchController

public class PlaySearchActionButton extends ImageView
    implements PlaySearchListener
{

    private final boolean mCanPerformVoiceSearch;
    private Drawable mClearDrawable;
    PlaySearchController mController;
    private int mCurrentMode;
    private Drawable mMicDrawable;

    public PlaySearchActionButton(Context context)
    {
        this(context, null);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCurrentMode = 1;
        mClearDrawable = context.getResources().getDrawable(0x7f020215);
        mMicDrawable = context.getResources().getDrawable(0x7f0201ba);
        mCanPerformVoiceSearch = PlaySearchVoiceController.canPerformVoiceSearch(context);
        setMode(2);
    }

    private void handleChange()
    {
        if (mController == null)
        {
            return;
        }
        String s = mController.mCurrentQuery;
        if (mCanPerformVoiceSearch && (mController.isInSteadyStateMode() || TextUtils.isEmpty(s)))
        {
            setMode(2);
            return;
        } else
        {
            setMode(1);
            return;
        }
    }

    private void setMode(int i)
    {
        if (mCurrentMode != i)
        {
            mCurrentMode = i;
            Drawable drawable = null;
            int j = 0;
            if (i == 1)
            {
                drawable = mClearDrawable;
                j = 0x7f100336;
            } else
            if (i == 2)
            {
                drawable = mMicDrawable;
                j = 0x7f100339;
            }
            if (drawable != null)
            {
                setImageDrawable(drawable);
                setContentDescription(getContext().getResources().getString(j));
                setVisibility(0);
                return;
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        setOnClickListener(new android.view.View.OnClickListener() {

            final PlaySearchActionButton this$0;

            public final void onClick(View view)
            {
                if (mController != null)
                {
                    if (mCurrentMode == 1)
                    {
                        mController.setQueryInternal("", true);
                        return;
                    }
                    if (mCurrentMode == 2)
                    {
                        mController.setMode(4);
                        return;
                    }
                }
            }

            
            {
                this$0 = PlaySearchActionButton.this;
                super();
            }
        });
    }

    public final void onModeChanged(int i)
    {
        handleChange();
    }

    public final void onQueryChanged$505cbf4b(String s)
    {
        handleChange();
    }

    public final void onSearch$552c4e01()
    {
    }

    public final void onSuggestionClicked$299d808f()
    {
    }


}
