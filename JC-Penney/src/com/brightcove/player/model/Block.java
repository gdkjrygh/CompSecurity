// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public class Block extends StyledElement
{

    protected Integer a;
    protected Integer b;
    protected String c;

    public Block()
    {
    }

    public int getBeginTime()
    {
        return a.intValue();
    }

    public int getEndTime()
    {
        return b.intValue();
    }

    public String getRegion()
    {
        return c;
    }

    public void setBeginTime(int i)
    {
        a = Integer.valueOf(i);
    }

    public void setEndTime(int i)
    {
        b = Integer.valueOf(i);
    }

    public void setRegion(String s)
    {
        c = s;
    }
}
