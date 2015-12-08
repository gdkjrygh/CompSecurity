// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public class DynamicDisplayOption
{

    public static final int LOCATION_BOTTOM = 1;
    public static final int LOCATION_END = 0;
    public static final int LOCATION_GONE = -1;
    public static final int LOCATION_TOP = 2;
    private Integer actionButtonLocation;
    private Boolean showFollowButton;
    private Boolean tapOnly;

    public DynamicDisplayOption()
    {
    }

    public DynamicDisplayOption(Boolean boolean1, Boolean boolean2, Integer integer)
    {
        showFollowButton = boolean1;
        tapOnly = boolean2;
        actionButtonLocation = integer;
    }

    public Integer getActionButtonLocation()
    {
        return actionButtonLocation;
    }

    public int getActionLocation()
    {
        if (actionButtonLocation == null)
        {
            return -1;
        } else
        {
            return actionButtonLocation.intValue();
        }
    }

    public Boolean getShowFollowButton()
    {
        return showFollowButton;
    }

    public Boolean getTapOnly()
    {
        return tapOnly;
    }

    public void setActionButtonLocation(Integer integer)
    {
        actionButtonLocation = integer;
    }

    public void setShowFollowButton(Boolean boolean1)
    {
        showFollowButton = boolean1;
    }

    public void setTapOnly(Boolean boolean1)
    {
        tapOnly = boolean1;
    }
}
