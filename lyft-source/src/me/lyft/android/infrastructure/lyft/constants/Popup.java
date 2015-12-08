// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

public class Popup
    implements INullable
{

    String backgroundColor;
    String description;
    String iconFile;
    String seats;
    Boolean showOnFirstSelection;
    String title;

    public Popup()
    {
    }

    public static Popup empty()
    {
        return NullPopup.getInstance();
    }

    public String getBackgroundColor()
    {
        return backgroundColor;
    }

    public String getDescription()
    {
        return description;
    }

    public String getIconFile()
    {
        return iconFile;
    }

    public String getSeats()
    {
        return seats;
    }

    public Boolean getShowOnFirstSelection()
    {
        return showOnFirstSelection;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullPopup extends Popup
    {

        private static final Popup INSTANCE = new NullPopup();

        static Popup getInstance()
        {
            return INSTANCE;
        }

        public String getBackgroundColor()
        {
            return "";
        }

        public String getDescription()
        {
            return "";
        }

        public String getIconFile()
        {
            return "";
        }

        public String getSeats()
        {
            return "";
        }

        public String getTitle()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }


        NullPopup()
        {
        }
    }

}
