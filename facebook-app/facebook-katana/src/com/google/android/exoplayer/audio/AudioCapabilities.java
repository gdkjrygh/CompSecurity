// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;

import java.util.Arrays;

public final class AudioCapabilities
{

    private final int a[];
    private final int b;

    public final boolean a(int i)
    {
        return Arrays.binarySearch(a, i) >= 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AudioCapabilities))
            {
                return false;
            }
            obj = (AudioCapabilities)obj;
            if (!Arrays.equals(a, ((AudioCapabilities) (obj)).a) || b != ((AudioCapabilities) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b + Arrays.hashCode(a) * 31;
    }

    public final String toString()
    {
        return (new StringBuilder("AudioCapabilities[maxChannelCount=")).append(b).append(", supportedEncodings=").append(Arrays.toString(a)).append("]").toString();
    }
}
