// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class cor
{

    final cog a;
    public final LongSparseArray b;
    public final LongSparseArray c;
    public final LongSparseArray d;

    private cor(LongSparseArray longsparsearray, cog cog1, LongSparseArray longsparsearray1, LongSparseArray longsparsearray2)
    {
        b = (LongSparseArray)b.a(longsparsearray, "faceLocations", null);
        a = (cog)b.a(cog1, "keyFrameMetrics", null);
        c = (LongSparseArray)b.a(longsparsearray1, "saliencyMapVerticalProjection", null);
        d = (LongSparseArray)b.a(longsparsearray2, "saliencyMapHorizontalProjection", null);
    }

    public static cor a(cmf cmf1)
    {
        b.a(cmf1, "videoMetrics", null);
        cmf1 = (cmi)b.a(cmf1.d(), "videoMetrics.getPointMetrics()", null);
        LongSparseArray longsparsearray = cmf1.b(cos.g);
        LongSparseArray longsparsearray1 = cmf1.b(cos.v);
        LongSparseArray longsparsearray2 = cmf1.b(cos.w);
        return new cor(longsparsearray, ((cmi) (cmf1)).c, longsparsearray1, longsparsearray2);
    }
}
