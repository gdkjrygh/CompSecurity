// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.tooltips;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;

public class Tooltip
    implements INullable
{

    public static final String ACCEPT_BUTTON = "accept_button";
    public static final int ALWAYS_SHOW = 0;
    public static final String ARRIVE_BUTTON = "arrive_button";
    public static final String CONFIRM_ARRIVAL_BUTTON = "confirm_arrival_button";
    public static final String CONFIRM_DROPOFF_BUTTON = "confirm_drop_off";
    public static final String COURIER_PROMO = "courierPromo";
    public static final String DROPOFF_BUTTON = "dropoff_button";
    public static final String DROPOFF_MODAL_NAVIGATE_BUTTON = "pickup_modal_navigate_button";
    public static final String NAVIGATE_BUTTON = "pickup_navigate_button";
    public static final String PICKUP_BUTTON = "pickup_button";
    public static final String RATE_PASSENGER = "star_5_button";
    public static final String SUBMIT_RATING_BUTTON = "submit_button";
    private String backgroundColor;
    private String id;
    private int maxTimesToDisplay;
    private String text;
    private int timesDisplayed;

    public Tooltip()
    {
    }

    public static Tooltip empty()
    {
        return NullTooltip.instance;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Tooltip)
        {
            if (Objects.equals(getId(), ((Tooltip) (obj = (Tooltip)obj)).getId()) && Objects.equals(getText(), ((Tooltip) (obj)).getText()))
            {
                return true;
            }
        }
        return false;
    }

    public String getBackgroundColor()
    {
        return backgroundColor;
    }

    public String getId()
    {
        return (String)Objects.firstNonNull(id, "");
    }

    public int getMaxTimesToDisplay()
    {
        return maxTimesToDisplay;
    }

    public String getText()
    {
        return (String)Objects.firstNonNull(text, "");
    }

    public int getTimesDisplayed()
    {
        return timesDisplayed;
    }

    public int hashCode()
    {
        return getId().hashCode() + getText().hashCode();
    }

    public boolean isNull()
    {
        return false;
    }

    public void markShown()
    {
        timesDisplayed = timesDisplayed + 1;
    }

    void setBackgroundColor(String s)
    {
        backgroundColor = s;
    }

    void setId(String s)
    {
        id = s;
    }

    void setMaxTimesToDisplay(int i)
    {
        maxTimesToDisplay = i;
    }

    void setText(String s)
    {
        text = s;
    }

    void setTimesDisplayed(int i)
    {
        timesDisplayed = i;
    }

    public boolean shouldShow()
    {
        while (maxTimesToDisplay == 0 || timesDisplayed < maxTimesToDisplay) 
        {
            return true;
        }
        return false;
    }

    private class NullTooltip extends Tooltip
    {

        private static Tooltip instance = new NullTooltip();

        public boolean isNull()
        {
            return true;
        }

        public boolean shouldShow()
        {
            return false;
        }



        private NullTooltip()
        {
        }
    }

}
