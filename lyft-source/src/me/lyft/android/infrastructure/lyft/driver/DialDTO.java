// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;


public class DialDTO
{

    public final Boolean goalMet;
    public final Integer maxValue;
    public final String subtitle;
    public final String title;
    public final String type;
    public final Integer value;

    public DialDTO(String s, String s1, String s2, Integer integer, Integer integer1, Boolean boolean1)
    {
        type = s;
        title = s1;
        subtitle = s2;
        value = integer;
        maxValue = integer1;
        goalMet = boolean1;
    }
}
