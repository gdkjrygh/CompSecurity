// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;


public final class Shorts
{

    public static byte[] toByteArray(short word0)
    {
        return (new byte[] {
            (byte)(word0 >> 8), (byte)word0
        });
    }
}
