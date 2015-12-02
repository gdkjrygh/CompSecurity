// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.chatheads:
//            dt, al

class bg
    implements dt
{

    final al a;

    bg(al al1)
    {
        a = al1;
        super();
    }

    public void a(ThreadViewSpec threadviewspec, ThreadViewSpec threadviewspec1)
    {
        al.a(a, threadviewspec.h(), threadviewspec1);
    }

    public void a(ThreadSummary threadsummary)
    {
        al.a(a, threadsummary);
    }

    public void a(String s)
    {
        a.a(s);
    }
}
