// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            f

final class g extends Handler
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            break;
        }
        if (message.obj == null)
        {
            f.a(a, null);
        } else
        {
            f.a(a, (List)((HashMap)message.obj).get("pics"));
        }
        a.d();
    }
}
