// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.b:
//            l

final class n
    implements android.os.Handler.Callback
{

    private n()
    {
    }

    n(byte byte0)
    {
        this();
    }

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what || 2 == message.what)
        {
            l l1 = (l)message.obj;
            if (1 == message.what)
            {
                l.a(l1);
            } else
            {
                l.b(l1);
            }
            return true;
        } else
        {
            return false;
        }
    }
}
