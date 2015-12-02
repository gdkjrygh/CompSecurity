// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class ap
    implements Runnable
{

    final Message a;
    final al b;

    ap(al al1, Message message)
    {
        b = al1;
        a = message;
        super();
    }

    public void run()
    {
        if (!al.s(b) && !b.e() && !n.a(a.k()))
        {
            al.b(b, a);
        }
    }
}
