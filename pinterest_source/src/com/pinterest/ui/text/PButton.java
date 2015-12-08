// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.pinterest.kit.utils.DrawableUtils;

public class PButton extends Button
{

    private ButtonStyle _currentStyle;
    private int _iconTint;

    public PButton(Context context)
    {
        this(context, null);
    }

    public PButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _currentStyle = ButtonStyle.PLAIN;
        _iconTint = 0x7f0e006d;
        setAllCaps(true);
        init();
    }

    public Runnable disableUntilAfter(int i)
    {
        setEnabled(false);
        _cls1 _lcls1 = new _cls1();
        postDelayed(_lcls1, i);
        return _lcls1;
    }

    public ButtonStyle getStyle()
    {
        return _currentStyle;
    }

    protected void init()
    {
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        super.setCompoundDrawablesWithIntrinsicBounds(DrawableUtils.tintIcon(drawable, _iconTint), DrawableUtils.tintIcon(drawable1, _iconTint), DrawableUtils.tintIcon(drawable2, _iconTint), DrawableUtils.tintIcon(drawable3, _iconTint));
    }

    public void setIconTint(int i)
    {
        _iconTint = i;
    }

    public void setStyle(ButtonStyle buttonstyle)
    {
        _currentStyle = buttonstyle;
        setEnabled(true);
        switch (_cls2..SwitchMap.com.pinterest.ui.text.PButton.ButtonStyle[buttonstyle.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setBackgroundResource(0x7f02009b);
            setTextColor(-1);
            return;

        case 2: // '\002'
            setBackgroundResource(0x7f020064);
            setTextColor(getResources().getColor(0x7f0e00a9));
            return;

        case 3: // '\003'
            setBackgroundResource(0x7f02008e);
            setTextColor(-1);
            return;

        case 4: // '\004'
            setBackgroundResource(0x7f020064);
            break;
        }
        setTextColor(getResources().getColor(0x7f0e00aa));
        setEnabled(false);
    }

    private class ButtonStyle extends Enum
    {

        private static final ButtonStyle $VALUES[];
        public static final ButtonStyle DISABLED;
        public static final ButtonStyle INVERTED;
        public static final ButtonStyle PLAIN;
        public static final ButtonStyle RED;

        public static ButtonStyle valueOf(String s)
        {
            return (ButtonStyle)Enum.valueOf(com/pinterest/ui/text/PButton$ButtonStyle, s);
        }

        public static ButtonStyle[] values()
        {
            return (ButtonStyle[])$VALUES.clone();
        }

        static 
        {
            RED = new ButtonStyle("RED", 0);
            PLAIN = new ButtonStyle("PLAIN", 1);
            INVERTED = new ButtonStyle("INVERTED", 2);
            DISABLED = new ButtonStyle("DISABLED", 3);
            $VALUES = (new ButtonStyle[] {
                RED, PLAIN, INVERTED, DISABLED
            });
        }

        private ButtonStyle(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
        implements Runnable
    {

        final PButton this$0;

        public void run()
        {
            setEnabled(true);
        }

        _cls1()
        {
            this$0 = PButton.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle[];

        static 
        {
            $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle = new int[ButtonStyle.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle[ButtonStyle.RED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle[ButtonStyle.PLAIN.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle[ButtonStyle.INVERTED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$text$PButton$ButtonStyle[ButtonStyle.DISABLED.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
