// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.res.Resources;
import com.google.android.m4b.maps.cg.ap;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            f

final class a
    implements com.google.android.m4b.maps.cg.
{

    private f a;

    public final void a(ap ap1)
    {
        if (ap1.i() > 0)
        {
            Object obj = ap1.h();
            ap1 = String.valueOf(f.c(a).getString(com.google.android.m4b.maps.maps_YOUR_LOCATION));
            obj = ((com.google.android.m4b.maps.cg.) (obj)).a();
            ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj).length())).append(ap1).append(": ").append(((String) (obj))).toString();
            a.setContentDescription(ap1);
        }
    }

    (f f1)
    {
        a = f1;
        super();
    }
}
