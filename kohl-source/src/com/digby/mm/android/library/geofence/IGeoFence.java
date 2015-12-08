// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence;

import com.digby.mm.android.library.geoshape.IGeoShape;
import java.util.Set;

public interface IGeoFence
{

    public abstract String getBSSID();

    public abstract String getDescription();

    public abstract IGeoShape getGeoShape();

    public abstract long getID();

    public abstract String getLocationCode();

    public abstract String getName();

    public abstract String getSSID();

    public abstract Set getTags();

    public abstract boolean isValidEventType(Class class1);
}
