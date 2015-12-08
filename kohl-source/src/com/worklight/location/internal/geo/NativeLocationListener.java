// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo;

import com.worklight.location.api.geo.WLGeoPosition;

public interface NativeLocationListener
{

    public abstract void cancelNativeAcquisition();

    public abstract WLGeoPosition getCachedPosition();

    public abstract void startNativeAcquisition(boolean flag);
}
