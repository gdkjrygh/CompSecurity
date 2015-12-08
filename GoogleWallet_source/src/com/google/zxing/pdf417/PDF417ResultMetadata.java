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

    public final void setFileId(String s)
    {
        fileId = s;
    }

    public final void setLastSegment(boolean flag)
    {
        lastSegment = flag;
    }

    public final void setOptionalData(int ai[])
    {
        optionalData = ai;
    }

    public final void setSegmentIndex(int i)
    {
        segmentIndex = i;
    }
}
