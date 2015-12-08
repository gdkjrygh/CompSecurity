// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAnalyticsAdapter

class AdMarvelAnalyticsAdapterInstances
{

    private static Map instances = null;

    AdMarvelAnalyticsAdapterInstances()
    {
    }

    static Map createInstances(Context context)
    {
        HashMap hashmap = new HashMap();
        try
        {
            hashmap.put("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", AdMarvelAnalyticsAdapter.createInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return hashmap;
        }
        return hashmap;
    }

    static AdMarvelAnalyticsAdapter getInstance(String s, Context context)
    {
        if (instances == null)
        {
            instances = createInstances(context);
        }
        return (AdMarvelAnalyticsAdapter)instances.get(s);
    }

}
