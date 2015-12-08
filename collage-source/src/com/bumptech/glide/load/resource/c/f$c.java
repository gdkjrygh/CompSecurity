// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.os.Message;
import com.bumptech.glide.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            f

private class <init>
    implements android.os.ler.Callback
{

    final f a;

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (<init>)message.obj;
            a.a(message);
            return true;
        }
        if (message.what == 2)
        {
            g.a((a)message.obj);
        }
        return false;
    }

    private (f f1)
    {
        a = f1;
        super();
    }

    a(f f1, a a1)
    {
        this(f1);
    }
}
