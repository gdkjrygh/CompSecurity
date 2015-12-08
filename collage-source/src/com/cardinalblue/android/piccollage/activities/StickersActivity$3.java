// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.o;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

class a
    implements i
{

    final String a;
    final StickersActivity b;

    public Object then(j j)
        throws Exception
    {
        j = o.a();
        com.cardinalblue.android.piccollage.a.b.b("IAP interstitial", "sticker store", a);
        b.a(j.a(a));
        return null;
    }

    (StickersActivity stickersactivity, String s)
    {
        b = stickersactivity;
        a = s;
        super();
    }
}
