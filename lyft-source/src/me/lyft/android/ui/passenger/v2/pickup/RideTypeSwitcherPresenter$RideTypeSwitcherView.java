// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import java.util.List;

interface 
    extends me.lyft.android.ui.ideTypeSwitcherView
{

    public abstract void setRideType(String s, boolean flag);

    public abstract void setRideTypeSwitcherItems(List list);

    public abstract boolean showCourierTooltip();
}
