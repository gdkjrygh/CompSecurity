// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.utils.i;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

final class a
    implements com.android.volley.
{

    final ManagerLiveRail a;

    public final void a(VolleyError volleyerror)
    {
        v.b("Failed to get LiveRail manifest");
        a.r.a();
    }

    (ManagerLiveRail managerliverail)
    {
        a = managerliverail;
        super();
    }
}
