// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;


public class ApiVideoSource
{

    public final int bitRate;
    public final String codec;
    public final int height;
    public final String url;
    public final int width;

    public ApiVideoSource(String s, String s1, int i, int j, int k)
    {
        codec = s;
        url = s1;
        bitRate = i;
        width = j;
        height = k;
    }
}
