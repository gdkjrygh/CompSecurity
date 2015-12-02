// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;

// Referenced classes of package com.facebook.orca.chatheads:
//            bw, al

class ao extends bw
{

    final Message a;
    final ThreadViewSpec b;
    final al c;

    ao(al al1, Message message, ThreadViewSpec threadviewspec)
    {
        c = al1;
        a = message;
        b = threadviewspec;
        super(al1, null);
    }

    protected void a()
    {
        al.a(c, a);
        al.a(c, "message", b);
    }
}
