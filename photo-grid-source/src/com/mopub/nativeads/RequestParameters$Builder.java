// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.location.Location;
import java.util.EnumSet;

// Referenced classes of package com.mopub.nativeads:
//            RequestParameters

public final class 
{

    private String a;
    private Location b;
    private EnumSet c;

    static String a( )
    {
        return .a;
    }

    static Location b(a a1)
    {
        return a1.b;
    }

    static EnumSet c(b b1)
    {
        return b1.c;
    }

    public final RequestParameters build()
    {
        return new RequestParameters(this, (byte)0);
    }

    public final c desiredAssets(EnumSet enumset)
    {
        c = EnumSet.copyOf(enumset);
        return this;
    }

    public final c keywords(String s)
    {
        a = s;
        return this;
    }

    public final a location(Location location1)
    {
        b = location1;
        return this;
    }

    public ()
    {
    }
}
