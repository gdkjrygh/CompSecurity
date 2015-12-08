// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;

// Referenced classes of package com.amobee.adsdk:
//            Parser, MillennialAdapter, AdManager, AmobeeAdPlaceholder, 
//            BaseAdapter

static class 
{

    static BaseAdapter createMillennialAdapter(String s, String s1, String s2, String s3, Context context, AmobeeAdPlaceholder amobeeadplaceholder, String s4)
    {
        return new MillennialAdapter(context, AdManager.getInstance().parameters(), s2, s3, amobeeadplaceholder, s4);
    }

    ()
    {
    }
}
