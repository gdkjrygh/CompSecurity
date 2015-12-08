// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417;


public final class PDF417ResultMetadata
{

    private String fileId;
    private boolean lastSegment;
    private int optionalData[];
    private int segmentIndex;

    public PDF417ResultMetadata()
    {
    }

    public String getFileId()
    {
        return fileId;
    }

    public int[] getOptionalData()
    {
        return optionalData;
    }

    public int getSegmentIndex()
    {
        return segmentIndex;
    }

    public boolean isLastSegment()
    {
        return lastSegment;
    }

    public void setFileId(String s)
    {
        fileId = s;
    }

    public void setLastSegment(boolean flag)
    {
        lastSegment = flag;
    }

    public void setOptionalData(int ai[])
    {
        optionalData = ai;
    }

    public void setSegmentIndex(int i)
    {
        segmentIndex = i;
    }
}
