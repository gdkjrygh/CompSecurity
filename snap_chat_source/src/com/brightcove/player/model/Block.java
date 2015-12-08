// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public class Block extends StyledElement
{

    public Integer beginTime;
    public Integer endTime;
    private String h;

    public Block()
    {
    }

    public int getBeginTime()
    {
        return beginTime.intValue();
    }

    public int getEndTime()
    {
        return endTime.intValue();
    }

    public String getRegion()
    {
        return h;
    }

    public void setBeginTime(int i)
    {
        beginTime = Integer.valueOf(i);
    }

    public void setEndTime(int i)
    {
        endTime = Integer.valueOf(i);
    }

    public void setRegion(String s)
    {
        h = s;
    }
}
