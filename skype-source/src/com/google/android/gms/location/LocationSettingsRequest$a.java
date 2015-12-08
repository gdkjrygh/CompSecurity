// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public static final class d
{

    private final ArrayList a = new ArrayList();
    private boolean b;
    private boolean c;
    private boolean d;

    public final d a()
    {
        b = true;
        return this;
    }

    public final b a(LocationRequest locationrequest)
    {
        a.add(locationrequest);
        return this;
    }

    public final LocationSettingsRequest b()
    {
        return new LocationSettingsRequest(a, b, c, d, (byte)0);
    }

    public ()
    {
        b = false;
        c = false;
        d = false;
    }
}
