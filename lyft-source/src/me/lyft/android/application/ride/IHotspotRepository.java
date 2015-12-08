// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import rx.Observable;

public interface IHotspotRepository
{

    public abstract Observable observeHotspotLocations();

    public abstract void update(List list);
}
