// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.events.match;


public class EventMatchHeaderSizeChanged
{

    private int mHeaderHeight;

    public EventMatchHeaderSizeChanged(int i)
    {
        mHeaderHeight = i;
    }

    public int getHeaderHeight()
    {
        return mHeaderHeight;
    }
}
