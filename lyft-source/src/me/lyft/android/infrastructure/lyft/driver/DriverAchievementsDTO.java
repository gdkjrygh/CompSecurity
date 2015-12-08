// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;

import java.util.List;

public class DriverAchievementsDTO
{

    public final List activities;
    public final List cards;

    public DriverAchievementsDTO(List list, List list1)
    {
        activities = list;
        cards = list1;
    }
}
