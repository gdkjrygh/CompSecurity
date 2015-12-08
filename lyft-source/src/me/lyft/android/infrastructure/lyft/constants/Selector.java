// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

public class Selector
    implements INullable
{

    String activeColor;
    String iconFile;
    String label;

    public Selector()
    {
    }

    public static Selector empty()
    {
        return NullSelector.getInstance();
    }

    public String getActiveColor()
    {
        return activeColor;
    }

    public String getIconFile()
    {
        return iconFile;
    }

    public String getLabel()
    {
        return label;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullSelector extends Selector
    {

        private static final Selector INSTANCE = new NullSelector();

        public static Selector getInstance()
        {
            return INSTANCE;
        }

        public String getActiveColor()
        {
            return "";
        }

        public String getIconFile()
        {
            return "";
        }

        public String getLabel()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }


        NullSelector()
        {
        }
    }

}
