// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.h264.model;


public class ChromaFormat
{

    public static ChromaFormat MONOCHROME = new ChromaFormat(0, 0, 0);
    public static ChromaFormat YUV_420 = new ChromaFormat(1, 2, 2);
    public static ChromaFormat YUV_422 = new ChromaFormat(2, 2, 1);
    public static ChromaFormat YUV_444 = new ChromaFormat(3, 1, 1);
    private int id;
    private int subHeight;
    private int subWidth;

    public ChromaFormat(int i, int j, int k)
    {
        id = i;
        subWidth = j;
        subHeight = k;
    }

    public static ChromaFormat fromId(int i)
    {
        if (i == MONOCHROME.id)
        {
            return MONOCHROME;
        }
        if (i == YUV_420.id)
        {
            return YUV_420;
        }
        if (i == YUV_422.id)
        {
            return YUV_422;
        }
        if (i == YUV_444.id)
        {
            return YUV_444;
        } else
        {
            return null;
        }
    }

    public int getId()
    {
        return id;
    }

    public int getSubHeight()
    {
        return subHeight;
    }

    public int getSubWidth()
    {
        return subWidth;
    }

    public String toString()
    {
        return (new StringBuilder("ChromaFormat{\nid=")).append(id).append(",\n subWidth=").append(subWidth).append(",\n subHeight=").append(subHeight).append('}').toString();
    }

}
