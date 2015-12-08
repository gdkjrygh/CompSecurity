// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;


// Referenced classes of package me.lyft.android.domain.driver:
//            PowerDriverProgress

public class  extends PowerDriverProgress
{

    private static PowerDriverProgress instance = new <init>();

    public static PowerDriverProgress getInstance()
    {
        return instance;
    }

    public Integer getCurrentProgress()
    {
        return Integer.valueOf(0);
    }

    public Integer getMaxProgress()
    {
        return Integer.valueOf(0);
    }

    public Boolean isGoalMet()
    {
        return Boolean.valueOf(false);
    }

    public boolean isNull()
    {
        return true;
    }


    private ()
    {
    }
}
