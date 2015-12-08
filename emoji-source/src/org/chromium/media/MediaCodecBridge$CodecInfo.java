// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            MediaCodecBridge

private static class <init>
{

    private final String mCodecName;
    private final String mCodecType;
    private final int mDirection;

    private String codecName()
    {
        return mCodecName;
    }

    private String codecType()
    {
        return mCodecType;
    }

    private int direction()
    {
        return mDirection;
    }

    private (String s, String s1, int i)
    {
        mCodecType = s;
        mCodecName = s1;
        mDirection = i;
    }

    mDirection(String s, String s1, int i, mDirection mdirection)
    {
        this(s, s1, i);
    }
}
