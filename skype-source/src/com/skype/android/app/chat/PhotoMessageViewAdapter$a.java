// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.ImageView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            PhotoMessageViewAdapter

private final class diaMessageViewHolder extends diaMessageViewHolder
{

    SymbolView failureIcon;
    View overlay;
    SymbolView placeholder;
    ProgressCircleView progressIndicator;
    SymbolView retryButton;
    final PhotoMessageViewAdapter this$0;
    BubbleRelativeLayout thumbnailLayout;

    final void initializeViews()
    {
        thumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f1002b2);
        mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
        thumbnail = (ImageView)ViewUtil.a(thumbnailLayout, 0x7f1002b3);
        retryButton = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f10022c);
        progressIndicator = (ProgressCircleView)ViewUtil.a(thumbnailLayout, 0x7f1002a4);
        overlay = ViewUtil.a(thumbnailLayout, 0x7f1002a3);
        failureIcon = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f1002b4);
        placeholder = (SymbolView)ViewUtil.a(thumbnailLayout, 0x7f1002b5);
    }

    public (View view)
    {
        this$0 = PhotoMessageViewAdapter.this;
        super(PhotoMessageViewAdapter.this, view);
    }
}
