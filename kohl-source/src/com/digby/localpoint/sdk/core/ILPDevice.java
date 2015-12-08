// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;

import java.util.Set;

// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPID, ILPGeopoint

public interface ILPDevice
{

    public abstract ILPID getID();

    public abstract ILPGeopoint getLastKnownGeopoint();

    public abstract Set getLocationsIn();
}
