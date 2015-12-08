// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class ABRProfileInfo
{

    public int bitsPerSecond;
    public String codecs;
    public int height;
    public int width;

    private ABRProfileInfo(int i, int j, int k, String s)
    {
        bitsPerSecond = i;
        width = j;
        height = k;
        codecs = s;
    }
}
