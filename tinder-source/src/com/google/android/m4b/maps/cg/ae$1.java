// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ae, ap, ab

final class a
    implements a
{

    private View a;
    private ae b;

    public final void a(ap ap1)
    {
        if (ap1.i() > 0)
        {
            Object obj = ap1.h();
            ap1 = String.valueOf(ae.a(b).getString(com.google.android.m4b.maps.aps_YOUR_LOCATION));
            obj = ((_LOCATION) (obj)).a();
            ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj).length())).append(ap1).append(": ").append(((String) (obj))).toString();
            ab.a(a, ap1);
        }
    }

    (ae ae1, View view)
    {
        b = ae1;
        a = view;
        super();
    }
}
