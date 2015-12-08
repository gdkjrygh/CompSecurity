// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

public final class FinderPattern extends ResultPoint
{

    private final int count;
    private final float estimatedModuleSize;

    FinderPattern(float f, float f1, float f2)
    {
        this(f, f1, f2, 1);
    }

    private FinderPattern(float f, float f1, float f2, int i)
    {
        super(f, f1);
        estimatedModuleSize = f2;
        count = i;
    }

    boolean aboutEquals(float f, float f1, float f2)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (Math.abs(f1 - getY()) > f)
            {
                break label0;
            }
            flag = flag1;
            if (Math.abs(f2 - getX()) > f)
            {
                break label0;
            }
            f = Math.abs(f - estimatedModuleSize);
            if (f > 1.0F)
            {
                flag = flag1;
                if (f > estimatedModuleSize)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    FinderPattern combineEstimate(float f, float f1, float f2)
    {
        int i = count + 1;
        return new FinderPattern(((float)count * getX() + f1) / (float)i, ((float)count * getY() + f) / (float)i, ((float)count * estimatedModuleSize + f2) / (float)i, i);
    }

    int getCount()
    {
        return count;
    }

    public float getEstimatedModuleSize()
    {
        return estimatedModuleSize;
    }
}
