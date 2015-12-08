// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncFileViewAdapter

private final class syncMediaViewHolder extends syncMediaViewHolder
{

    TextView actionText;
    TextView filename;
    RelativeLayout mediaInfoLayout;
    TextView subText;
    final AsyncFileViewAdapter this$0;

    final void initializeViews()
    {
        mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
        mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f100225);
        thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f100226);
        progress = (CircularProgressBar)ViewUtil.a(itemView, 0x7f100229);
        action = (SymbolView)ViewUtil.a(itemView, 0x7f100228);
        centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f100227);
        mediaInfoLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026f);
        actionProgressLayout = (RelativeLayout)ViewUtil.a(itemView, 0x7f10026e);
        filename = (TextView)ViewUtil.a(itemView, 0x7f100270);
        subText = (TextView)ViewUtil.a(itemView, 0x7f100271);
        actionText = (TextView)ViewUtil.a(itemView, 0x7f100272);
        android.app.Activity activity = getContext();
        progress.setProgressBackgroundColor(activity.getResources().getColor(0x7f0f0133));
        progress.setProgressColor(activity.getResources().getColor(0x7f0f013a));
        progress.setProgressWidth(activity.getResources().getDimensionPixelSize(0x7f0c0173));
    }

    public out(View view)
    {
        this$0 = AsyncFileViewAdapter.this;
        super(AsyncFileViewAdapter.this, view);
    }
}
