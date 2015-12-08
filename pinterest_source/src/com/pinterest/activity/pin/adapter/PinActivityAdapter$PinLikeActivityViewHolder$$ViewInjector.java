// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

public class 
{

    public static void inject(butterknife.ewHolder ewholder,  , Object obj)
    {
        . = (LinearLayout)ewholder.likeActivityVw(obj, 0x7f0f03c2, "field 'likeActivityVw'");
        . = (WebImageView)ewholder.pinnerIv(obj, 0x7f0f03c4, "field 'pinnerIv'");
        . = (TextView)ewholder.dateTv(obj, 0x7f0f03c3, "field 'dateTv'");
        . = (TextView)ewholder.pinnerName(obj, 0x7f0f03c5, "field 'pinnerName'");
    }

    public static void reset( )
    {
        . = null;
        . = null;
        . = null;
        . = null;
    }

    public ()
    {
    }
}
