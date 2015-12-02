// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.b.a.g;
import com.facebook.common.init.NeedsLowPriorityInitOnUiThread;
import com.facebook.fbservice.service.p;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;
import com.facebook.n.a.a;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;
import com.facebook.orca.chatheads.annotations.IsChatHeadsMultiProcessEnabled;
import com.facebook.orca.chatheads.annotations.IsChatHeadsPermitted;
import com.facebook.orca.chatheads.annotations.IsHeadCaseEnabled;
import com.facebook.orca.chatheads.annotations.IsHeadCasePermitted;
import com.facebook.orca.chatheads.b.f;
import com.facebook.orca.chatheads.b.k;
import com.facebook.push.annotations.IsDeviceForegroundEnabled;

// Referenced classes of package com.facebook.orca.chatheads:
//            dx, dy, dz, al, 
//            ct, ae, cs, eb, 
//            cy, cr, cq, cp, 
//            by, cu, ch, cw, 
//            cz, cx, bz, cv, 
//            ChatHeadsBlueService

public class cn extends c
{

    public cn()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new g())));
        a(((com.facebook.inject.ag) (new a())));
        a(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled).c(com/facebook/orca/chatheads/dx);
        a(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsChatHeadsPermitted).c(com/facebook/orca/chatheads/dy);
        a(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsHeadCaseEnabled).a(Boolean.FALSE);
        a(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsHeadCasePermitted).a(Boolean.FALSE);
        b(java/lang/Boolean).a(com/facebook/orca/chatheads/annotations/IsChatHeadsMultiProcessEnabled).a(Boolean.valueOf(false));
        a(java/lang/Boolean).a(com/facebook/push/annotations/IsDeviceForegroundEnabled).c(com/facebook/orca/chatheads/dz);
        a(com/facebook/orca/chatheads/al).a(new ct(this, null));
        a(com/facebook/orca/chatheads/ae).a(new cs(this, null));
        a(com/facebook/orca/chatheads/eb).a(new cy(null));
        a(com/facebook/orca/chatheads/b/k).a(new cr(null)).a();
        a(com/facebook/orca/chatheads/b/f).a(new cq(this, null));
        a(com/facebook/orca/f/a).a(new cp(this, null)).a();
        a(com/facebook/orca/chatheads/by).a(new cu(this, null)).a();
        a(com/facebook/orca/chatheads/ch).a(new cw(this, null)).a();
        a(com/facebook/orca/chatheads/cz).a(new cx(this, null));
        a(com/facebook/orca/chatheads/bz).a(new cv(this, null));
        a(com/facebook/n/j).a(com/facebook/orca/chatheads/annotations/ForChatHeads).b(com/facebook/n/j).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsLowPriorityInitOnUiThread).a(com/facebook/orca/chatheads/ch);
    }

    public void a(t t1)
    {
        ((p)t1.a(com/facebook/fbservice/service/p)).a(com.facebook.orca.chatheads.cz.a, com/facebook/orca/chatheads/ChatHeadsBlueService);
    }
}
