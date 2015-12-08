// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;


// Referenced classes of package com.google.zxing.qrcode.detector:
//            FinderPattern

public final class FinderPatternInfo
{

    private final FinderPattern bottomLeft;
    private final FinderPattern topLeft;
    private final FinderPattern topRight;

    public FinderPatternInfo(FinderPattern afinderpattern[])
    {
        bottomLeft = afinderpattern[0];
        topLeft = afinderpattern[1];
        topRight = afinderpattern[2];
    }

    public FinderPattern getBottomLeft()
    {
        return bottomLeft;
    }

    public FinderPattern getTopLeft()
    {
        return topLeft;
    }

    public FinderPattern getTopRight()
    {
        return topRight;
    }
}
