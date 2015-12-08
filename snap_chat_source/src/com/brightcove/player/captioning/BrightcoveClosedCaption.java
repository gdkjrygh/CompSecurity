// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import com.brightcove.player.model.Block;
import java.util.List;

public class BrightcoveClosedCaption extends Block
{

    private List h;
    private String i;

    public BrightcoveClosedCaption()
    {
    }

    public BrightcoveClosedCaption(int j, int k, String s)
    {
        beginTime = Integer.valueOf(j);
        endTime = Integer.valueOf(k);
        i = s;
    }

    public BrightcoveClosedCaption(int j, int k, List list)
    {
        beginTime = Integer.valueOf(j);
        endTime = Integer.valueOf(k);
        h = list;
    }

    public String getCaption()
    {
        return i;
    }

    public List getLines()
    {
        return h;
    }

    public void setLines(List list)
    {
        h = list;
    }
}
