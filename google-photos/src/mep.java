// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public class mep
{

    public LatLngBounds a;

    public mep(LatLngBounds latlngbounds)
    {
        a = latlngbounds;
    }

    public meo a()
    {
        return new meo(a.b.b, a.b.c);
    }

    public meo b()
    {
        return new meo(a.c.b, a.c.c);
    }
}
