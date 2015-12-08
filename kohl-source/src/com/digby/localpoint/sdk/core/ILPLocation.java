// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;

import java.util.Set;

// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPGeopoint, ILPID

public interface ILPLocation
{

    public abstract void checkIn();

    public abstract String getBSSID();

    public abstract ILPGeopoint getCenter();

    public abstract String getCode();

    public abstract String getDescription();

    public abstract ILPID getID();

    public abstract String getName();

    public abstract String getSSID();

    public abstract Set getTags();

    public abstract boolean isDeviceIn();
}
