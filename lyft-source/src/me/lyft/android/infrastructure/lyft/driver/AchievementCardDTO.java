// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;

import java.util.List;

public class AchievementCardDTO
{

    public final String buttonText;
    public final List dials;
    public final String footer;
    public final String infoUrl;
    public final String style;
    public final String subtitle;
    public final String title;

    public AchievementCardDTO(String s, String s1, String s2, String s3, String s4, String s5, List list)
    {
        style = s;
        title = s1;
        subtitle = s2;
        infoUrl = s3;
        buttonText = s4;
        footer = s5;
        dials = list;
    }
}
