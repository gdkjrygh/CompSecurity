// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.gifencoder;


public class Giffle
{

    public Giffle()
    {
    }

    public native int AddFrame(int ai[]);

    public native void Close();

    public native void GenPalette(int ai[], int i);

    public native int Init(String s, int i, int j, int k, int l, int i1);

    static 
    {
        System.loadLibrary("gifflen");
    }
}
