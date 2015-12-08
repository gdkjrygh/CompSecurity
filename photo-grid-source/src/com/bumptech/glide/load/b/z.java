// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.b:
//            x

final class z
    implements android.os.Handler.Callback
{

    private z()
    {
    }

    z(byte byte0)
    {
        this();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            ((x)message.obj).d();
            return true;
        } else
        {
            return false;
        }
    }
}
