// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.SharedPreferences;
import com.cardinalblue.android.a.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.lib.d;
import com.cardinalblue.android.piccollage.model.gson.PICDeviceConfig;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            RatingNotifierManager

public class <init> extends <init>
{

    final RatingNotifierManager a;

    public boolean a()
    {
        boolean flag = super.a();
        int i = k.j().getInt("pref_rating_launch_count", -1);
        d d1 = (d)com.cardinalblue.android.a.a.a(com/cardinalblue/android/piccollage/lib/d);
        return flag && i >= d1.a().getRatePromptMinUses();
    }

    public void b()
    {
        super.b();
        android.content.  = k.j().edit();
        .remove("pref_rating_launch_count");
        .apply();
    }

    public (RatingNotifierManager ratingnotifiermanager)
    {
        a = ratingnotifiermanager;
        super(ratingnotifiermanager);
    }
}
