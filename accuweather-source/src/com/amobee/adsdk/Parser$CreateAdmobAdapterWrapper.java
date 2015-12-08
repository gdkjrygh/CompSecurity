// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;

// Referenced classes of package com.amobee.adsdk:
//            Parser, AdManager, GmsAdsAdapter, BaseAdapter

static class 
{

    static BaseAdapter createAdmobAdapter(String s, String s1, String s2, String s3, Context context, String s4)
    {
        s1 = AdManager.getInstance();
        s = null;
        if (AdManager.doesClassExist("com.google.android.gms.ads.AdView"))
        {
            s = new GmsAdsAdapter(context, s1.parameters(), s2, s3, s4);
        }
        return s;
    }

    ()
    {
    }
}
