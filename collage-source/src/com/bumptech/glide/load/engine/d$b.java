// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.load.engine:
//            d

private static class <init>
    implements android.os.ler.Callback
{

    public boolean handleMessage(Message message)
    {
        if (1 == message.what || 2 == message.what)
        {
            d d1 = (d)message.obj;
            if (1 == message.what)
            {
                d.a(d1);
            } else
            {
                d.b(d1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
