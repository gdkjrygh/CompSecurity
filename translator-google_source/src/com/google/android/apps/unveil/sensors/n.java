// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;


public final class n
{

    public static final n a = new n(512, 384, 95);
    public static final n b = new n(1600, 1200, 100);
    public static final n c = new n(4096, 4096, 100);
    public final int d;
    public final int e;
    public final int f;
    public final int g = 95;
    public final int h;

    private n(int i, int j, int k)
    {
        d = i;
        e = j;
        f = i * j;
        h = k;
    }

    public final String toString()
    {
        int i = d;
        int j = e;
        int k = g;
        int l = h;
        return (new StringBuilder(110)).append("[desiredWidth=").append(i).append(",desiredHeight=").append(j).append(",jpegQuality=").append(k).append(",recompressJpegQuality=").append(l).append("]").toString();
    }

}
