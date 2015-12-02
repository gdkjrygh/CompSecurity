// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.base.activity.f;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsInAppNotificationsEnabled;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;

// Referenced classes of package com.facebook.orca.notify:
//            u, ak, ae, f, 
//            ab, d, z, j, 
//            ad, s, ac, e, 
//            aa, at, ag, av, 
//            ah, as, af, am

public class x extends c
{

    public x()
    {
    }

    protected void a()
    {
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsInAppNotificationsEnabled).c(com/facebook/orca/notify/u);
        a(com/facebook/orca/notify/ak).a(new ae(this, null)).a();
        a(com/facebook/orca/notify/f).a(new ab(this, null)).a();
        a(com/facebook/orca/notify/d).a(new z(this, null)).a();
        a(com/facebook/orca/notify/j).a(new ad(this, null)).a();
        a(com/facebook/orca/notify/s).a(new ac(this, null)).a();
        a(com/facebook/orca/notify/e).a(new aa(this, null)).a();
        a(com/facebook/orca/notify/at).a(new ag(this, null)).a();
        a(com/facebook/orca/notify/av).a(new ah(this, null)).c();
        a(com/facebook/orca/notify/as).a(new af(this, null));
        b(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled).a(com.google.inject.b.a.a(Boolean.valueOf(false)));
        c(com/facebook/orca/notify/am).a(com/facebook/orca/notify/d).a(com/facebook/orca/notify/j).a(com/facebook/orca/notify/f).a(com/facebook/orca/notify/e);
        c(com/facebook/base/activity/f).a(com/facebook/orca/notify/at).a(com/facebook/orca/notify/s);
    }
}
