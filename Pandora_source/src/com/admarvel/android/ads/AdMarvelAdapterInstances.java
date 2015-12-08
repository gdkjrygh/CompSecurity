// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAdapter

class AdMarvelAdapterInstances
{

    private static final Map instances = createInstances();

    AdMarvelAdapterInstances()
    {
    }

    static Map createInstances()
    {
        HashMap hashmap = new HashMap();
        try
        {
            hashmap.put("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarveladmobadapter.AdMarvelAdmobAdapter"));
        }
        catch (Exception exception8) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter"));
        }
        catch (Exception exception7) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter"));
        }
        catch (Exception exception6) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelmedialetsadapter.AdMarvelMedialetsAdapter"));
        }
        catch (Exception exception5) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter"));
        }
        catch (Exception exception4) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter"));
        }
        catch (Exception exception3) { }
        try
        {
            hashmap.put("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter"));
        }
        catch (Exception exception2) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelpinsightadapter.AdMarvelPinsightAdapter"));
        }
        catch (Exception exception1) { }
        try
        {
            hashmap.put("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter"));
        }
        catch (Exception exception)
        {
            return hashmap;
        }
        return hashmap;
    }

    static AdMarvelAdapter getInstance(String s)
    {
        return (AdMarvelAdapter)instances.get(s);
    }

}
