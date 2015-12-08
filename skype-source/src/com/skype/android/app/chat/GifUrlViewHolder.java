// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.chat:
//            SubtypeViewHolder

public class GifUrlViewHolder extends SubtypeViewHolder
{

    ImageView thumbnailView;
    FrameLayout urlBubble;

    public GifUrlViewHolder(boolean flag)
    {
        super(flag);
    }

    protected View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (isEmbedded())
        {
            i = 0x7f030130;
        } else
        {
            i = 0x7f03012f;
        }
        layoutinflater = layoutinflater.inflate(i, viewgroup, flag);
        thumbnailView = (ImageView)ViewUtil.a(layoutinflater, 0x7f10057d);
        urlBubble = (FrameLayout)ViewUtil.a(layoutinflater, 0x7f10057a);
        return layoutinflater;
    }

    public void recycle()
    {
    }
}
