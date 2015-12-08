// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.ui.imageview:
//            WebImageView

public class GrayWebImageView extends WebImageView
{

    private BorderStyle _borderStyle;

    public GrayWebImageView(Context context)
    {
        this(context, null);
    }

    public GrayWebImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GrayWebImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _borderStyle = BorderStyle.NONE;
        updateView();
    }

    private void updateView()
    {
        _cls1..SwitchMap.com.pinterest.ui.imageview.GrayWebImageView.BorderStyle[_borderStyle.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 59
    //                   2 83
    //                   3 107;
           goto _L1 _L2 _L3 _L4
_L1:
        int i;
        if (isOval())
        {
            i = 0x7f020243;
        } else
        {
            i = 0x7f020269;
        }
_L7:
        setBackgroundResource(i);
_L5:
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return;
_L2:
        if (isOval())
        {
            i = 0x7f020247;
        } else
        {
            i = 0x7f02026d;
        }
        setBackgroundResource(i);
        continue; /* Loop/switch isn't completed */
_L3:
        if (isOval())
        {
            i = 0x7f020244;
        } else
        {
            i = 0x7f02026b;
        }
        setBackgroundResource(i);
        if (true) goto _L5; else goto _L4
_L4:
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void setBorderStyle(BorderStyle borderstyle)
    {
        _borderStyle = borderstyle;
        updateView();
    }

    public void setOval(boolean flag)
    {
        super.setOval(flag);
        updateView();
    }

    private class BorderStyle extends Enum
    {

        private static final BorderStyle $VALUES[];
        public static final BorderStyle GRAY;
        public static final BorderStyle LIGHT_GRAY;
        public static final BorderStyle NONE;
        public static final BorderStyle TRANSPARENT;

        public static BorderStyle valueOf(String s)
        {
            return (BorderStyle)Enum.valueOf(com/pinterest/ui/imageview/GrayWebImageView$BorderStyle, s);
        }

        public static BorderStyle[] values()
        {
            return (BorderStyle[])$VALUES.clone();
        }

        static 
        {
            NONE = new BorderStyle("NONE", 0);
            LIGHT_GRAY = new BorderStyle("LIGHT_GRAY", 1);
            GRAY = new BorderStyle("GRAY", 2);
            TRANSPARENT = new BorderStyle("TRANSPARENT", 3);
            $VALUES = (new BorderStyle[] {
                NONE, LIGHT_GRAY, GRAY, TRANSPARENT
            });
        }

        private BorderStyle(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[];

        static 
        {
            $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle = new int[BorderStyle.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[BorderStyle.LIGHT_GRAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[BorderStyle.GRAY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[BorderStyle.TRANSPARENT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$imageview$GrayWebImageView$BorderStyle[BorderStyle.NONE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
