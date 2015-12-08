// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import com.google.zxing.ResultPoint;

// Referenced classes of package com.google.zxing.datamatrix.detector:
//            Detector

private static final class <init>
{

    private final ResultPoint from;
    private final ResultPoint to;
    private final int transitions;

    ResultPoint getFrom()
    {
        return from;
    }

    ResultPoint getTo()
    {
        return to;
    }

    public int getTransitions()
    {
        return transitions;
    }

    public String toString()
    {
        return (new StringBuilder()).append(from).append("/").append(to).append('/').append(transitions).toString();
    }

    private (ResultPoint resultpoint, ResultPoint resultpoint1, int i)
    {
        from = resultpoint;
        to = resultpoint1;
        transitions = i;
    }

    transitions(ResultPoint resultpoint, ResultPoint resultpoint1, int i, transitions transitions1)
    {
        this(resultpoint, resultpoint1, i);
    }
}
