// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.common.d.e;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadService

class t
    implements Runnable
{

    final e a;
    final ChatHeadService b;

    t(ChatHeadService chatheadservice, e e1)
    {
        b = chatheadservice;
        a = e1;
        super();
    }

    public void run()
    {
        a.a();
    }
}
