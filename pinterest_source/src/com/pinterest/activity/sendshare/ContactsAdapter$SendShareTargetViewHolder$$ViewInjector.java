// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.ui.grid.RoundProfileImageCell;

public class 
{

    public static void inject(butterknife.Holder holder,  , Object obj)
    {
        . = (RoundProfileImageCell)holder._webIconIv(obj, 0x7f0f04ca, "field '_webIconIv'");
        . = (ImageView)holder._iconIv(obj, 0x7f0f0076, "field '_iconIv'");
        . = (TextView)holder._iconOverlayTv(obj, 0x7f0f04cb, "field '_iconOverlayTv'");
        . = (TextView)holder._textTv(obj, 0x7f0f0469, "field '_textTv'");
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
