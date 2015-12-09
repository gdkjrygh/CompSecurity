// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.bitrate;


public abstract class BitrateRange
{

    protected int maximal;
    protected int minimal;

    public BitrateRange(int i, int j)
    {
        minimal = i;
        maximal = j;
    }

    public int getMaximal()
    {
        return maximal;
    }

    public int getMinimal()
    {
        return minimal;
    }
}
