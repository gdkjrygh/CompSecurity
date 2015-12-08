// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncMediaViewAdapter

protected class der extends der
{

    SymbolView action;
    RelativeLayout actionProgressLayout;
    SymbolView centerSymbol;
    BubbleRelativeLayout mediaThumbnailLayout;
    CircularProgressBar progress;
    final AsyncMediaViewAdapter this$0;
    RelativeLayout videoFailureRetryLayout;

    void initializeViews()
    {
        mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
        mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f100225);
        videoFailureRetryLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10022a);
        thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f100226);
        progress = (CircularProgressBar)ViewUtil.a(itemView, 0x7f100229);
        action = (SymbolView)ViewUtil.a(itemView, 0x7f100228);
        centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f100227);
        actionProgressLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026e);
        android.app.Activity activity = getContext();
        progress.setProgressBackgroundColor(activity.getResources().getColor(0x7f0f013c));
        progress.setProgressColor(activity.getResources().getColor(0x7f0f0135));
        progress.setProgressWidth(activity.getResources().getDimensionPixelSize(0x7f0c00fe));
    }

    public der(View view)
    {
        this$0 = AsyncMediaViewAdapter.this;
        super(AsyncMediaViewAdapter.this, view);
    }
}
