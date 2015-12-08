// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw.imageutils;

import ahu;
import ako;
import akq;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import java.nio.ByteBuffer;

public class RegionStatsCalculator
{

    private static final boolean a = Log.isLoggable("RegionStatsCalculator", 2);
    private final float b[] = new float[2];

    public RegionStatsCalculator()
    {
    }

    private static int a(int i, int j, int k)
    {
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = k;
            if (i <= k)
            {
                return i;
            }
        }
        return j;
    }

    private native void regionscore(ByteBuffer bytebuffer, int i, int j, int k, int l, int i1, float af[], 
            boolean flag);

    public final akq a(ahu ahu1, ako ako1, boolean flag)
    {
        int i = ahu1.m();
        int i1 = ahu1.n();
        ako1 = new RectF(Math.min(Math.min(ako1.a.x, ako1.b.x), Math.min(ako1.c.x, ako1.d.x)), Math.min(Math.min(ako1.a.y, ako1.b.y), Math.min(ako1.c.y, ako1.d.y)), Math.max(Math.max(ako1.a.x, ako1.b.x), Math.max(ako1.c.x, ako1.d.x)), Math.max(Math.max(ako1.a.y, ako1.b.y), Math.max(ako1.c.y, ako1.d.y)));
        int j = a((int)(((RectF) (ako1)).left * (float)i), 0, i - 1);
        int k = a((int)(((RectF) (ako1)).top * (float)i1), 0, i1 - 1);
        int l = a((int)(((RectF) (ako1)).right * (float)i), 0, i - 1);
        i1 = a((int)(((RectF) (ako1)).bottom * (float)i1), 0, i1 - 1);
        ako1 = ahu1.a(1);
        ako1.rewind();
        regionscore(ako1, i, j, k, l, i1, b, flag);
        ahu1.k();
        if (a)
        {
            float f = b[0];
            float f1 = b[1];
            (new StringBuilder(66)).append("Native calc stats: Mean = ").append(f).append(", Stdev = ").append(f1);
        }
        return new akq(b[0], b[1]);
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
