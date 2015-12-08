// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.bubbles.BubbleFrameLayout;

// Referenced classes of package com.skype.android.app.chat:
//            SubtypeViewHolder

public class TwitterMessageViewHolder extends SubtypeViewHolder
{

    ImageView favIcon;
    BubbleFrameLayout twitterBubble;
    TextView twitterFooter;
    ImageView twitterImage;
    TextView twitterMessage;
    TextView twitterUserHandle;
    ImageView twitterUserIcon;
    TextView twitterUsername;

    public TwitterMessageViewHolder(boolean flag)
    {
        super(flag);
    }

    protected View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (isEmbedded())
        {
            i = 0x7f030132;
        } else
        {
            i = 0x7f030131;
        }
        layoutinflater = layoutinflater.inflate(i, viewgroup, flag);
        twitterBubble = (BubbleFrameLayout)ViewUtil.a(layoutinflater, 0x7f100582);
        twitterUserIcon = (ImageView)ViewUtil.a(layoutinflater, 0x7f100583);
        twitterUsername = (TextView)ViewUtil.a(layoutinflater, 0x7f100584);
        twitterUserHandle = (TextView)ViewUtil.a(layoutinflater, 0x7f100585);
        twitterMessage = (TextView)ViewUtil.a(layoutinflater, 0x7f100586);
        twitterImage = (ImageView)ViewUtil.a(layoutinflater, 0x7f100587);
        favIcon = (ImageView)ViewUtil.a(layoutinflater, 0x7f100589);
        twitterFooter = (TextView)ViewUtil.a(layoutinflater, 0x7f100588);
        return layoutinflater;
    }

    public void recycle()
    {
        twitterUserIcon.setImageBitmap(null);
        twitterImage.setImageBitmap(null);
        favIcon.setImageBitmap(null);
    }
}
