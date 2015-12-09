// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


abstract class DecodedObject
{

    private final int newPosition;

    DecodedObject(int i)
    {
        newPosition = i;
    }

    final int getNewPosition()
    {
        return newPosition;
    }
}
