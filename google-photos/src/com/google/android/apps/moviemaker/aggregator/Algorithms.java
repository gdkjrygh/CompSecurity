// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.aggregator;


public class Algorithms
{

    public static float a(float af[], int i, int j, int k)
    {
        if (j >= k || j < 0 || af.length < k)
        {
            throw new RuntimeException("Out of bound");
        } else
        {
            return nthElement(af, 0, j, k, 1);
        }
    }

    private static native float nthElement(float af[], int i, int j, int k, int l);

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
