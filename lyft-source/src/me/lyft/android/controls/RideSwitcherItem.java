// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.controls:
//            ISwitcherItem

public class RideSwitcherItem
    implements ISwitcherItem
{

    final String activeColor;
    final boolean hasPrimeTime;
    final String id;
    final String label;

    public RideSwitcherItem(String s, String s1, String s2, boolean flag)
    {
        id = s;
        label = s1;
        activeColor = s2;
        hasPrimeTime = flag;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof RideSwitcherItem)
        {
            if (Objects.equals(getId(), ((RideSwitcherItem) (obj = (RideSwitcherItem)obj)).getId()) && Objects.equals(getLabel(), ((RideSwitcherItem) (obj)).getLabel()) && Objects.equals(getActiveColor(), ((RideSwitcherItem) (obj)).getActiveColor()) && Objects.equals(Boolean.valueOf(hasPrimeTime), Boolean.valueOf(((RideSwitcherItem) (obj)).hasPrimeTime())))
            {
                return true;
            }
        }
        return false;
    }

    public String getActiveColor()
    {
        return activeColor;
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public boolean hasPrimeTime()
    {
        return hasPrimeTime;
    }
}
