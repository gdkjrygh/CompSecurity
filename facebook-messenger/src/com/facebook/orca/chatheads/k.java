// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.a.c.a;
import com.facebook.n.b;
import com.facebook.n.c;
import com.google.common.d.a.ab;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadCloseTargetView, j

class k extends b
{

    final ChatHeadCloseTargetView a;

    private k(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        a = chatheadclosetargetview;
        super();
    }

    k(ChatHeadCloseTargetView chatheadclosetargetview, j j)
    {
        this(chatheadclosetargetview);
    }

    public void b(c c1)
    {
        if (c1 == com.facebook.orca.chatheads.ChatHeadCloseTargetView.c(a))
        {
            com.facebook.orca.chatheads.ChatHeadCloseTargetView.a(a, (float)c1.c());
        } else
        {
            if (c1 == ChatHeadCloseTargetView.d(a))
            {
                com.facebook.orca.chatheads.ChatHeadCloseTargetView.b(a, (float)c1.c());
                return;
            }
            if (c1 == ChatHeadCloseTargetView.e(a))
            {
                com.a.c.a.e(ChatHeadCloseTargetView.f(a), (float)c1.c());
                com.a.c.a.f(ChatHeadCloseTargetView.f(a), (float)c1.c());
                return;
            }
            if (c1 == ChatHeadCloseTargetView.g(a))
            {
                com.a.c.a.a(ChatHeadCloseTargetView.h(a), (float)c1.c());
                return;
            }
        }
    }

    public void c(c c1)
    {
        while (ChatHeadCloseTargetView.i(a) == null || !ChatHeadCloseTargetView.j(a)) 
        {
            return;
        }
        ChatHeadCloseTargetView.i(a).a_(null);
        com.facebook.orca.chatheads.ChatHeadCloseTargetView.a(a, null);
    }
}
