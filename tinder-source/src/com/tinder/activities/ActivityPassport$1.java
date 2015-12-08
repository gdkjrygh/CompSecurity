// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.util.Pair;
import com.tinder.adapters.g;
import com.tinder.managers.a;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;

// Referenced classes of package com.tinder.activities:
//            ActivityPassport

final class a
    implements Runnable
{

    final int a;
    final ActivityPassport b;

    public final void run()
    {
        TinderLocation tinderlocation = (TinderLocation)com.tinder.activities.ActivityPassport.a(b).getItem(a);
        SparksEvent sparksevent = new SparksEvent("Passport.MapSearchSelect");
        sparksevent.put("searched", tinderlocation.getLabels().first);
        sparksevent.put("method", "TAP");
        sparksevent.put("popular", Boolean.valueOf(ActivityPassport.b(b)));
        com.tinder.managers.a.a(sparksevent);
    }

    (ActivityPassport activitypassport, int i)
    {
        b = activitypassport;
        a = i;
        super();
    }
}
