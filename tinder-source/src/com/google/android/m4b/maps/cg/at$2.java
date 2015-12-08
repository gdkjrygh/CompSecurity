// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            at, ap, av, ab

final class a
    implements a
{

    private at a;

    public final void a(ap ap1)
    {
        if (ap1.i() > 0)
        {
            Object obj = ap1.h();
            ap1 = String.valueOf(at.c(a).getString(com.google.android.m4b.maps.aps_YOUR_LOCATION));
            obj = ((_LOCATION) (obj)).a();
            ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj).length())).append(ap1).append(": ").append(((String) (obj))).toString();
            ab.a(at.d(a).k(), ap1);
        }
    }

    (at at1)
    {
        a = at1;
        super();
    }
}
