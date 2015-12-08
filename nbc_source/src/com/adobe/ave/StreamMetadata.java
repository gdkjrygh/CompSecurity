// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class StreamMetadata
{

    public float frameRate;
    public int level;
    public int outputHeight;
    public int outputWidth;
    public int profile;

    StreamMetadata(int i, int j, float f, int k, int l)
    {
        outputWidth = i;
        outputHeight = j;
        frameRate = f;
        profile = k;
        level = l;
    }
}
