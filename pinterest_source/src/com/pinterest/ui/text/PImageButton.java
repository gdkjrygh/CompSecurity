// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class PImageButton extends ImageButton
{

    private ButtonStyle _currentStyle;

    public PImageButton(Context context)
    {
        this(context, null);
    }

    public PImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _currentStyle = ButtonStyle.PLAIN;
        init();
    }

    public ButtonStyle getStyle()
    {
        return _currentStyle;
    }

    protected void init()
    {
    }

    public void setStyle(ButtonStyle buttonstyle)
    {
        _currentStyle = buttonstyle;
        setEnabled(true);
        switch (_cls1..SwitchMap.com.pinterest.ui.text.PImageButton.ButtonStyle[buttonstyle.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setBackgroundResource(0x7f02009b);
            return;

        case 2: // '\002'
            setBackgroundResource(0x7f020064);
            return;

        case 3: // '\003'
            setBackgroundResource(0x7f020064);
            break;
        }
        setEnabled(false);
    }

    private class ButtonStyle extends Enum
    {

        private static final ButtonStyle $VALUES[];
        public static final ButtonStyle DISABLED;
        public static final ButtonStyle PLAIN;
        public static final ButtonStyle RED;

        public static ButtonStyle valueOf(String s)
        {
            return (ButtonStyle)Enum.valueOf(com/pinterest/ui/text/PImageButton$ButtonStyle, s);
        }

        public static ButtonStyle[] values()
        {
            return (ButtonStyle[])$VALUES.clone();
        }

        static 
        {
            RED = new ButtonStyle("RED", 0);
            PLAIN = new ButtonStyle("PLAIN", 1);
            DISABLED = new ButtonStyle("DISABLED", 2);
            $VALUES = (new ButtonStyle[] {
                RED, PLAIN, DISABLED
            });
        }

        private ButtonStyle(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$ui$text$PImageButton$ButtonStyle[];

        static 
        {
            $SwitchMap$com$pinterest$ui$text$PImageButton$ButtonStyle = new int[ButtonStyle.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$text$PImageButton$ButtonStyle[ButtonStyle.RED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$text$PImageButton$ButtonStyle[ButtonStyle.PLAIN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$text$PImageButton$ButtonStyle[ButtonStyle.DISABLED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
