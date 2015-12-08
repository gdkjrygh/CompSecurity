// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist;

import android.widget.ImageView;

public final class ViewScaleType extends Enum
{

    private static final ViewScaleType $VALUES[];
    public static final ViewScaleType CROP;
    public static final ViewScaleType FIT_INSIDE;

    private ViewScaleType(String s, int i)
    {
        super(s, i);
    }

    public static ViewScaleType fromImageView(ImageView imageview)
    {
        static class _cls1
        {

            static final int $SwitchMap$android$widget$ImageView$ScaleType[];

            static 
            {
                $SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.MATRIX.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.android.widget.ImageView.ScaleType[imageview.getScaleType().ordinal()])
        {
        default:
            return CROP;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return FIT_INSIDE;
        }
    }

    public static ViewScaleType valueOf(String s)
    {
        return (ViewScaleType)Enum.valueOf(com/nostra13/universalimageloader/core/assist/ViewScaleType, s);
    }

    public static ViewScaleType[] values()
    {
        return (ViewScaleType[])$VALUES.clone();
    }

    static 
    {
        FIT_INSIDE = new ViewScaleType("FIT_INSIDE", 0);
        CROP = new ViewScaleType("CROP", 1);
        $VALUES = (new ViewScaleType[] {
            FIT_INSIDE, CROP
        });
    }
}
