// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.queue;


public interface IBackoffManager
{

    public abstract void decreaseBackoff();

    public abstract int getBackoffValue();

    public abstract void increaseBackoff();
}
