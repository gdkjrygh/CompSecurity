// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.messages.model.threads.Message;
import com.facebook.push.g;

// Referenced classes of package com.facebook.orca.notify:
//            av

class bb
    implements Runnable
{

    final String a;
    final Message b;
    final g c;
    final av d;

    bb(av av1, String s, Message message, g g)
    {
        d = av1;
        a = s;
        b = message;
        c = g;
        super();
    }

    public void run()
    {
        av.a(d, a, b, c);
    }
}
