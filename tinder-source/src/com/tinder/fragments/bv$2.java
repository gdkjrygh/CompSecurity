// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.a;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;

// Referenced classes of package com.tinder.fragments:
//            bv

final class a
    implements Runnable
{

    final TinderLocation a;
    final bv b;

    public final void run()
    {
        SparksEvent sparksevent = new SparksEvent("Passport.MenuChooseLocation");
        sparksevent.put("newLat", Double.valueOf(a.getLatitude()));
        sparksevent.put("newLon", Double.valueOf(a.getLongitude()));
        com.tinder.managers.a.a(sparksevent);
    }

    ation(bv bv1, TinderLocation tinderlocation)
    {
        b = bv1;
        a = tinderlocation;
        super();
    }
}
