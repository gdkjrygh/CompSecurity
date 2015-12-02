// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadService

class o
    implements f
{

    final ChatHeadService a;

    o(ChatHeadService chatheadservice)
    {
        a = chatheadservice;
        super();
    }

    public void a(d d, ae ae)
    {
        if (com.facebook.orca.chatheads.ChatHeadService.a(a) && !((Boolean)ChatHeadService.b(a).b()).booleanValue())
        {
            ChatHeadService.c(a);
        }
    }
}
