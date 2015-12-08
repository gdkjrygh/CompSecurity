// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.chat:
//            SimpleMessageViewBinder, CombinedUrlViewHolder

public class SimpleMessageInCombinedPreviewViewBinder extends SimpleMessageViewBinder
{

    public SimpleMessageInCombinedPreviewViewBinder()
    {
    }

    public void bindView(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        boolean flag = viewbinderparams.isInAccessibilityMode();
        CombinedUrlViewHolder combinedurlviewholder = (CombinedUrlViewHolder)viewbinderparams.getSubtypeViewHolder();
        TextView textview = (TextView)viewbinderparams.getCustomView();
        configureTextView(viewbinderparams.getContext(), combinedurlviewholder.getItemView(), textview, textview, flag, viewbinderparams.isUrl(), combinedurlviewholder.getLayoutPosition(), viewbinderparams.getMessageHolder(), viewbinderparams.getTextMessageViewAdapter());
    }
}
