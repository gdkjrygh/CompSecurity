// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package me.lyft.android.application.geo:
//            IEtaRepository

public class EtaRepository
    implements IEtaRepository
{

    Long eta;
    Long etd;
    Map rideTypeEtaMap;

    public EtaRepository()
    {
        rideTypeEtaMap = new HashMap();
    }

    public Long getClosestDriverEta(String s)
    {
        return (Long)rideTypeEtaMap.get(s);
    }

    public Long getEta()
    {
        return eta;
    }

    public Long getEtd()
    {
        return etd;
    }

    public void updateClosestDriverEtas(String s, Long long1)
    {
        rideTypeEtaMap.put(s, long1);
    }

    public void updateEta(Long long1)
    {
        eta = long1;
    }

    public void updateEtd(Long long1)
    {
        etd = long1;
    }
}
