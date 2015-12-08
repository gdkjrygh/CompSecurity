// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.os.Message;
import com.bumptech.glide.h;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            h, g

final class j
    implements android.os.Handler.Callback
{

    final g a;

    private j(g g1)
    {
        a = g1;
        super();
    }

    j(g g1, byte byte0)
    {
        this(g1);
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (com.bumptech.glide.load.resource.c.h)message.obj;
            a.a(message);
            return true;
        }
        if (message.what == 2)
        {
            h.a((com.bumptech.glide.load.resource.c.h)message.obj);
        }
        return false;
    }
}
