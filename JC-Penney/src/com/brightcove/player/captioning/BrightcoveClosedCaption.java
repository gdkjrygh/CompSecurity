// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import com.brightcove.player.model.Block;
import java.util.List;

public class BrightcoveClosedCaption extends Block
{

    private List n;
    private String o;

    public BrightcoveClosedCaption()
    {
    }

    public BrightcoveClosedCaption(int i, int j, String s)
    {
        a = Integer.valueOf(i);
        b = Integer.valueOf(j);
        o = s;
    }

    public BrightcoveClosedCaption(int i, int j, List list)
    {
        a = Integer.valueOf(i);
        b = Integer.valueOf(j);
        n = list;
    }

    public String getCaption()
    {
        return o;
    }

    public List getLines()
    {
        return n;
    }

    public void setLines(List list)
    {
        n = list;
    }
}
