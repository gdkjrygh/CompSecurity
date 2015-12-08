// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import com.skype.android.widget.bubbles.BubbleLinearLayout;

// Referenced classes of package com.skype.android.app.chat:
//            UrlMessageViewBinder, CombinedUrlViewHolder, UrlPreviewTextMessageViewHolder

public class CombinedMessageViewBinder
    implements UrlMessageViewBinder
{

    public CombinedMessageViewBinder()
    {
    }

    private void alignCombinedUrlPreview(UrlMessageViewBinder.ViewBinderParams viewbinderparams, CombinedUrlViewHolder combinedurlviewholder)
    {
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = combinedurlviewholder.getUrlPreviewTextMessageViewHolder();
        Resources resources = viewbinderparams.getContext().getResources();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)combinedurlviewholder.layoutBubble.getLayoutParams();
        int i = resources.getDimensionPixelSize(0x7f0c0267);
        if (urlpreviewtextmessageviewholder.isOutgoing())
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.b;
            layoutparams.addRule(11);
            layoutparams.addRule(9, 0);
            combinedurlviewholder.layoutBubble.setPadding(resources.getDimensionPixelSize(0x7f0c0269), i, resources.getDimensionPixelSize(0x7f0c0266), i);
            layoutparams.setMargins(resources.getDimensionPixelSize(0x7f0c007a), 0, 0, 0);
            combinedurlviewholder.layoutBubble.setBackgroundResource(0x7f0f003c);
        } else
        {
            viewbinderparams = com.skype.android.widget.bubbles.Bubblable.Direction.a;
            layoutparams.addRule(9);
            layoutparams.addRule(11, 0);
            combinedurlviewholder.layoutBubble.setPadding(resources.getDimensionPixelSize(0x7f0c0266), i, resources.getDimensionPixelSize(0x7f0c0269), i);
            layoutparams.setMargins(0, 0, resources.getDimensionPixelSize(0x7f0c007a), 0);
            combinedurlviewholder.layoutBubble.setBackgroundResource(0x7f0f0039);
        }
        combinedurlviewholder.layoutBubble.setLayoutParams(layoutparams);
        ((BubbleLinearLayout)combinedurlviewholder.getSubView()).setDirectionState(viewbinderparams, urlpreviewtextmessageviewholder.isChained());
    }

    public void bindView(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        alignCombinedUrlPreview(viewbinderparams, (CombinedUrlViewHolder)viewbinderparams.getSubtypeViewHolder());
    }
}
