// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.driver;


public class PowerDriverProgressDTO
{

    public final Integer currentProgress;
    public final Boolean goalMet;
    public final Integer maxProgress;

    public PowerDriverProgressDTO(Integer integer, Integer integer1, Boolean boolean1)
    {
        currentProgress = integer;
        maxProgress = integer1;
        goalMet = boolean1;
    }
}
