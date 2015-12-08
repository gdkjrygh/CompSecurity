// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.metrics;


public class RecordHistogram
{

    public RecordHistogram()
    {
    }

    private static native int nativeGetHistogramValueCountForTesting(String s, int i);

    private static native void nativeInitialize();

    private static native void nativeRecordBooleanHistogram(String s, int i, boolean flag);

    private static native void nativeRecordCustomCountHistogram(String s, int i, int j, int k, int l, int i1);

    private static native void nativeRecordCustomTimesHistogramMilliseconds(String s, int i, long l, long l1, long l2, 
            int j);

    private static native void nativeRecordEnumeratedHistogram(String s, int i, int j, int k);

    private static native void nativeRecordLinearCountHistogram(String s, int i, int j, int k, int l, int i1);

    private static native void nativeRecordSparseHistogram(String s, int i, int j);
}
