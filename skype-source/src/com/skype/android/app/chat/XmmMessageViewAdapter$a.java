// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            XmmMessageViewAdapter

private final class MediaMessageViewHolder extends MediaMessageViewHolder
{

    SymbolView centerSymbol;
    BubbleRelativeLayout mediaThumbnailLayout;
    final XmmMessageViewAdapter this$0;
    TextView xmmTitle;

    final void initializeViews()
    {
        xmmTitle = (TextView)ViewUtil.a(itemView, 0x7f1002eb);
        mediaRemovedTextView = (BubbleTextView)ViewUtil.a(itemView, 0x7f1002b6);
        mediaThumbnailLayout = (BubbleRelativeLayout)ViewUtil.a(itemView, 0x7f1002e8);
        thumbnail = (ImageView)ViewUtil.a(mediaThumbnailLayout, 0x7f1002e9);
        centerSymbol = (SymbolView)ViewUtil.a(mediaThumbnailLayout, 0x7f1002ea);
    }

    public ut(View view)
    {
        this$0 = XmmMessageViewAdapter.this;
        super(XmmMessageViewAdapter.this, view);
    }
}
