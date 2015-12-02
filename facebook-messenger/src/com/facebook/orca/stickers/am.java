// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.auth.userscope.UserScoped;
import com.facebook.d.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsStickersFeatureEnabled;
import com.facebook.orca.protocol.methods.b;
import com.facebook.orca.protocol.methods.m;

// Referenced classes of package com.facebook.orca.stickers:
//            a, h, ar, ap, 
//            ao, c, aq, k, 
//            as, al, aw, ak, 
//            av, e, au, w, 
//            at

public class am extends c
{

    public am()
    {
    }

    protected void a()
    {
        f(com/facebook/d/a/a);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsStickersFeatureEnabled).c(com/facebook/orca/stickers/a);
        a(com/facebook/orca/stickers/h).a(new ar(this, null)).a();
        a(com/facebook/orca/protocol/methods/m).a(new ap(this, null));
        a(com/facebook/orca/protocol/methods/b).a(new ao(this, null));
        a(com/facebook/orca/stickers/c).a(new aq(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/stickers/k).a(new as(this, null)).a();
        a(com/facebook/orca/stickers/al).a(new aw(this, null)).a();
        a(com/facebook/orca/stickers/ak).a(new av(this, null)).a();
        a(com/facebook/orca/stickers/e).a(new au(this, null)).a();
        a(com/facebook/orca/stickers/w).a(new at(this, null));
        c(com/facebook/auth/f/b).a(com/facebook/orca/stickers/ak);
    }
}
