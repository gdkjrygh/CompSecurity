// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.SharedPreferences;
import com.cardinalblue.android.b.c;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            RatingNotifierManager

public class b
    implements b
{

    final RatingNotifierManager b;

    public boolean a()
    {
        SharedPreferences sharedpreferences = k.j();
        return !c.a(k.a()).equals(sharedpreferences.getString("pref_rating_prompt_version", null));
    }

    public void b()
    {
        android.content.  = k.j().edit();
        .remove("pref_rating_prompt_version");
        .apply();
    }

    public (RatingNotifierManager ratingnotifiermanager)
    {
        b = ratingnotifiermanager;
        super();
    }
}
