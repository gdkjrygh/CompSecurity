// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.video:
//            p, q

final class x
    implements p
{

    final q a;

    x(q q1)
    {
        a = q1;
        super();
    }

    public final void a(int i)
    {
        Message message = new Message();
        message.what = 8193;
        message.arg1 = i;
        q.j(a).sendMessage(message);
    }

    public final void a(int i, String s)
    {
        Message message = new Message();
        message.what = 8196;
        message.arg1 = i;
        if (q.a(a, s))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        message.arg2 = i;
        q.j(a).sendMessage(message);
    }

    public final void a(int i, boolean flag)
    {
        Message message = new Message();
        int j;
        if (flag)
        {
            j = 8194;
        } else
        {
            j = 8195;
        }
        message.what = j;
        message.arg1 = i;
        q.j(a).sendMessage(message);
    }
}
