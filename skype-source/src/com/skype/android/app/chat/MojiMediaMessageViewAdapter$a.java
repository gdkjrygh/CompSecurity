// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.ChatVideoTextureView;
import com.skype.android.widget.CircularProgressBar;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleTextView;
import com.skype.android.widget.fliks.FlikRelativeLayout;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

private final class essageViewHolder extends essageViewHolder
{

    TextView callToActionView;
    TextView copyrightInformationView;
    SymbolView forwardMojiButton;
    ProgressCircleView indeterminateProgressIndicator;
    RelativeLayout infoLayout;
    TextView itemInfoView;
    RelativeLayout itemLayout;
    View overlay;
    CircularProgressBar progressBar;
    SymbolView symbolView;
    final MojiMediaMessageViewAdapter this$0;
    ChatVideoTextureView videoTextureView;

    final void initializeViews()
    {
        android.view.ViewGroup viewgroup = getInlineContent();
        itemLayout = (RelativeLayout)ViewUtil.a(viewgroup, 0x7f1002a0);
        thumbnail = (ImageView)ViewUtil.a(viewgroup, 0x7f1002a1);
        overlay = ViewUtil.a(viewgroup, 0x7f1002a3);
        indeterminateProgressIndicator = (ProgressCircleView)ViewUtil.a(viewgroup, 0x7f1002a4);
        progressBar = (CircularProgressBar)ViewUtil.a(viewgroup, 0x7f1002a5);
        symbolView = (SymbolView)ViewUtil.a(viewgroup, 0x7f1002a6);
        videoTextureView = (ChatVideoTextureView)ViewUtil.a(viewgroup, 0x7f1002a2);
        mediaRemovedTextView = (BubbleTextView)ViewUtil.a(viewgroup, 0x7f1002b6);
        infoLayout = (RelativeLayout)ViewUtil.a(viewgroup, 0x7f10029b);
        itemInfoView = (TextView)ViewUtil.a(viewgroup, 0x7f10029c);
        callToActionView = (TextView)ViewUtil.a(viewgroup, 0x7f10029d);
        copyrightInformationView = (TextView)ViewUtil.a(viewgroup, 0x7f10029e);
        forwardMojiButton = (SymbolView)ViewUtil.a(viewgroup, 0x7f10029f);
        progressBar.setProgressBackgroundColor(getContext().getResources().getColor(0x7f0f00ae));
        progressBar.setProgressColor(getContext().getResources().getColor(0x7f0f00af));
        progressBar.setProgressWidth(getContext().getResources().getDimensionPixelSize(0x7f0c017d));
        ((FlikRelativeLayout)itemLayout).a(getContext().getResources().getColor(0x7f0f0135));
    }

    public essageViewHolder(View view)
    {
        this$0 = MojiMediaMessageViewAdapter.this;
        super(MojiMediaMessageViewAdapter.this, view);
    }
}
