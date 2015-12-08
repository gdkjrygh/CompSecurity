// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

public class Button
    implements INullable
{

    String borderColor;
    String color;
    String label;
    String labelSingleType;
    String pressedColor;

    public Button()
    {
    }

    public static Button empty()
    {
        return NullButton.getInstance();
    }

    public String getColor()
    {
        return color;
    }

    public String getLabel()
    {
        return label;
    }

    public String getLabelSingleType()
    {
        return labelSingleType;
    }

    public String getPressedColor()
    {
        return pressedColor;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullButton extends Button
    {

        private static final Button INSTANCE = new NullButton();

        static Button getInstance()
        {
            return INSTANCE;
        }

        public String getLabel()
        {
            return "";
        }

        public String getLabelSingleType()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }


        NullButton()
        {
        }
    }

}
