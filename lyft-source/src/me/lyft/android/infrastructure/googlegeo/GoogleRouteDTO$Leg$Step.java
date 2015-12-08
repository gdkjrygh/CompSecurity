// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;


// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleLatLngDTO

public class olyLine
{

    private GoogleLatLngDTO endLocation;
    olyLine polyline;
    private GoogleLatLngDTO startLocation;

    public GoogleLatLngDTO getEndLocation()
    {
        return endLocation;
    }

    public olyLine getPolyline()
    {
        return polyline;
    }

    public GoogleLatLngDTO getStartLocation()
    {
        return startLocation;
    }

    public olyLine()
    {
    }
}
