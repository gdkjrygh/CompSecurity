// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;


public class OneDReader
{

    public OneDReader()
    {
    }

    static native int nativePatternMatchVariance(int ai[], int ai1[], int i);

    static native boolean nativeRecordPattern(boolean aflag[], int i, int ai[]);
}
