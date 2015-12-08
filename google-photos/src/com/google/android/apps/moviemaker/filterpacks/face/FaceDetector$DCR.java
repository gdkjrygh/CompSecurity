// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.face;

import android.graphics.PointF;
import android.graphics.RectF;
import java.nio.ByteBuffer;

public class makeDCR
{

    private int a;

    private static native int makeDCR();

    private static native boolean nativeApproved(int i);

    private static native boolean nativeGetBoundingBox(int i, float af[]);

    private static native float nativeGetConfidence(int i);

    private static native boolean nativeGetFrom(int i, int j);

    private static native boolean nativeGetNodePosition(int i, int j, float af[]);

    private static native boolean nativePutGrayImage(int i, ByteBuffer bytebuffer, int j, int k);

    private static native boolean nativePutRgbImage(int i, ByteBuffer bytebuffer, int j, int k);

    private static native boolean nativeRelease(int i);

    private static native boolean nativeSendTo(int i, int j);

    private static native boolean nativeSetFaceCoordinates(int i, float f, float f1, float f2, float f3, float f4, float f5);

    public final PointF a(int i)
    {
        float af[] = new float[2];
        if (nativeGetNodePosition(a, i, af))
        {
            return new PointF(af[0], af[1]);
        } else
        {
            return null;
        }
    }

    public final le a(le le)
    {
        nativeSendTo(a, com.google.android.apps.moviemaker.filterpacks.face.le.a(le));
        return this;
    }

    public final void a()
    {
        nativeRelease(a);
        a = 0;
    }

    public final void a(PointF pointf, PointF pointf1, PointF pointf2)
    {
        nativeSetFaceCoordinates(a, pointf.x, pointf.y, pointf1.x, pointf1.y, pointf2.x, pointf2.y);
    }

    public final void a(ByteBuffer bytebuffer, int i, int j)
    {
        nativePutGrayImage(a, bytebuffer, i, j);
    }

    public final le b(le le)
    {
        nativeGetFrom(a, com.google.android.apps.moviemaker.filterpacks.face.le.a(le));
        return this;
    }

    public final void b(ByteBuffer bytebuffer, int i, int j)
    {
        nativePutRgbImage(a, bytebuffer, i, j);
    }

    public final boolean b()
    {
        return nativeApproved(a);
    }

    public final float c()
    {
        return nativeGetConfidence(a);
    }

    public final le c(le le)
    {
        a(le);
        return b(le);
    }

    public final RectF d()
    {
        float af[] = new float[4];
        if (nativeGetBoundingBox(a, af))
        {
            return new RectF(af[0], af[1], af[2], af[3]);
        } else
        {
            return null;
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }

    public le()
    {
        a = 0;
        a = makeDCR();
    }
}
