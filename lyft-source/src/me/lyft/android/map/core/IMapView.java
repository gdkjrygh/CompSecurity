// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import java.util.List;
import rx.Observable;

public interface IMapView
{

    public abstract Observable animateToBounds(List list, int i);

    public abstract Observable observeCameraPositionChanged();

    public abstract Observable observeGoogleMapLoaded();

    public abstract Observable observeMapDragEnd();

    public abstract Observable observeMapDragStart();

    public abstract void setCenterMapGestures(boolean flag);
}
