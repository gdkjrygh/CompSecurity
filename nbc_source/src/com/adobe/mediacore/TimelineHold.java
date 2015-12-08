// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


interface TimelineHold
{

    public abstract void addReference(long l);

    public abstract long getHoldTime();

    public abstract boolean isReleased();

    public abstract void releaseReference(long l);
}
