// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.video:
//            p, q

final class s
    implements p
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public final void a(int i)
    {
        Message message = new Message();
        message.what = 12289;
        message.arg1 = i;
        q.j(a).sendMessage(message);
    }

    public final void a(int i, String s1)
    {
        q.a(a, i, s1);
    }

    public final void a(int i, boolean flag)
    {
        Message message = new Message();
        int j;
        if (flag)
        {
            j = 12290;
        } else
        {
            j = 12291;
        }
        message.what = j;
        message.arg1 = i;
        q.j(a).sendMessage(message);
    }
}
