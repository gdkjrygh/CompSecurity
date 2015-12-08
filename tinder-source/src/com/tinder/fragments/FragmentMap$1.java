// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.a;
import com.tinder.model.SparksEvent;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

public final class b
    implements Runnable
{

    final double a;
    final double b;
    final FragmentMap c;

    public final void run()
    {
        SparksEvent sparksevent = new SparksEvent("Passport.MapPinDrop");
        sparksevent.put("pinLat", Double.valueOf(a));
        sparksevent.put("pinLon", Double.valueOf(b));
        sparksevent.put("myLocation", Boolean.valueOf(true));
        com.tinder.managers.a.a(sparksevent);
    }

    public (FragmentMap fragmentmap, double d, double d1)
    {
        c = fragmentmap;
        a = d;
        b = d1;
        super();
    }
}
