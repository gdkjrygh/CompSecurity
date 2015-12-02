// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


// Referenced classes of package com.facebook.orca.chatheads:
//            bs, ChatHeadService, bz

class s
    implements bs
{

    final ChatHeadService a;

    s(ChatHeadService chatheadservice)
    {
        a = chatheadservice;
        super();
    }

    public void a()
    {
        ChatHeadService.f(a).a();
    }

    public void b()
    {
        ChatHeadService.f(a).b();
    }

    public void c()
    {
        ChatHeadService.c(a);
    }
}
