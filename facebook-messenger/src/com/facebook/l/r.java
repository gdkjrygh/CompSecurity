// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import com.facebook.messages.model.threads.Message;

// Referenced classes of package com.facebook.l:
//            k

class r
    implements Runnable
{

    final Message a;
    final k b;

    r(k k1, Message message)
    {
        b = k1;
        a = message;
        super();
    }

    public void run()
    {
        k.a(b, a);
    }
}
