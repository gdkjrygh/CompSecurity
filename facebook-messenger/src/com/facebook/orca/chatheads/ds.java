// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.b.a.b;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.compose.am;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh

class ds
    implements am
{

    final dh a;

    ds(dh dh1)
    {
        a = dh1;
        super();
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            dh.j(a).b(threadviewspec.d(), "launch_media_picker");
        }
    }
}
