// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Context;
import android.widget.ImageButton;

public class TrimHandleView extends ImageButton
{
    public static final class HandleType extends Enum
    {

        private static final HandleType $VALUES[];
        public static final HandleType LEFT;
        public static final HandleType RIGHT;
        private final int backgroundResId;
        private final android.widget.RelativeLayout.LayoutParams layoutParams;

        public static HandleType valueOf(String s)
        {
            return (HandleType)Enum.valueOf(com/soundcloud/android/creators/record/TrimHandleView$HandleType, s);
        }

        public static HandleType[] values()
        {
            return (HandleType[])$VALUES.clone();
        }

        static 
        {
            LEFT = new HandleType("LEFT", 0, TrimHandleView.getLeftLayoutParams(), 0x7f02018f);
            RIGHT = new HandleType("RIGHT", 1, TrimHandleView.getRightLayoutParams(), 0x7f020190);
            $VALUES = (new HandleType[] {
                LEFT, RIGHT
            });
        }



        private HandleType(String s, int i, android.widget.RelativeLayout.LayoutParams layoutparams, int j)
        {
            super(s, i);
            layoutParams = layoutparams;
            backgroundResId = j;
        }
    }


    private final HandleType type;

    public TrimHandleView(Context context, HandleType handletype)
    {
        super(context);
        setLayoutParams(handletype.layoutParams);
        setBackgroundResource(handletype.backgroundResId);
        setClickable(false);
        type = handletype;
    }

    private static android.widget.RelativeLayout.LayoutParams getLeftLayoutParams()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(12, 1);
        layoutparams.addRule(9, 1);
        return layoutparams;
    }

    public static android.widget.RelativeLayout.LayoutParams getRightLayoutParams()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(12, 1);
        layoutparams.addRule(11, 1);
        return layoutparams;
    }

    public volatile android.view.ViewGroup.LayoutParams getLayoutParams()
    {
        return getLayoutParams();
    }

    public android.widget.RelativeLayout.LayoutParams getLayoutParams()
    {
        return (android.widget.RelativeLayout.LayoutParams)super.getLayoutParams();
    }

    public void update(int i)
    {
        if (type == HandleType.LEFT)
        {
            getLayoutParams().leftMargin = i;
        } else
        {
            getLayoutParams().rightMargin = i;
        }
        requestLayout();
    }

}
