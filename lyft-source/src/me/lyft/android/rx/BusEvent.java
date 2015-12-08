// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import rx.Observable;

public interface BusEvent
{

    public abstract Observable observe();

    public abstract void post(Object obj);
}
