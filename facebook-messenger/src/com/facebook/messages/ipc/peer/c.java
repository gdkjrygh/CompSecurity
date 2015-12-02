// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.i.a.a.b;
import com.facebook.i.a.a.d;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d, a

public class c extends b
{

    private final a b;
    private boolean c;

    public c(int i)
    {
        super(d.a, i);
        b = new a(d.c, "peer://msg_notification_dash/active_threads");
    }

    public void a()
    {
        b.a();
        c = false;
    }

    public void a(Uri uri, d d1)
    {
        if (com.facebook.messages.ipc.peer.d.d.equals(uri))
        {
            d1.a = Boolean.valueOf(c);
            if (c)
            {
                d1.b = true;
            }
        } else
        if (b.a(uri))
        {
            b.a(uri, d1);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        bundle.putBoolean(com.facebook.messages.ipc.peer.d.d.getPath(), c);
        b.a(bundle);
    }

    public boolean a(Uri uri, Object obj)
    {
        boolean flag = true;
        if (com.facebook.messages.ipc.peer.d.b.equals(uri))
        {
            a();
            return true;
        }
        if (com.facebook.messages.ipc.peer.d.d.equals(uri))
        {
            boolean flag1 = Boolean.TRUE.equals(obj);
            if (flag1 == c)
            {
                flag = false;
            }
            c = flag1;
            return flag;
        }
        if (b.a(uri))
        {
            return b.a(uri, obj);
        } else
        {
            return false;
        }
    }

    public void b(Bundle bundle)
    {
        c = bundle.getBoolean(com.facebook.messages.ipc.peer.d.d.getPath(), false);
        b.b(bundle);
    }
}
