// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            SubtypeViewHolder

public class TextMessageViewHolder extends SubtypeViewHolder
{

    RelativeLayout messageContainer;
    SymbolView symbolView;
    BubbleTextView textView;

    public TextMessageViewHolder()
    {
        super(false);
    }

    public View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        layoutinflater = layoutinflater.inflate(0x7f03003f, viewgroup, flag);
        messageContainer = (RelativeLayout)ViewUtil.a(layoutinflater, 0x7f100298);
        symbolView = (SymbolView)ViewUtil.a(layoutinflater, 0x7f10029a);
        textView = (BubbleTextView)ViewUtil.a(layoutinflater, 0x7f100299);
        new SpannedAnimationDrawableCallback(textView);
        return layoutinflater;
    }

    public void recycle()
    {
    }
}
