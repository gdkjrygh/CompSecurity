// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.Collections;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            RouteDTO

public class NullRouteDTO extends RouteDTO
{

    private static final NullRouteDTO instance = new NullRouteDTO();

    public NullRouteDTO()
    {
        super(null, Collections.emptyList(), null, Collections.emptyList(), null);
    }

    public static RouteDTO getInstance()
    {
        return instance;
    }

}
