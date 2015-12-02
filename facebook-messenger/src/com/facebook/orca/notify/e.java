// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.c;
import com.facebook.messages.ipc.k;
import com.facebook.messages.ipc.peer.d;
import com.facebook.messages.model.threads.Message;
import com.google.common.a.ev;
import com.google.common.a.fi;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.notify:
//            a, ap, c, bi, 
//            i, w

public class e extends com.facebook.orca.notify.a
{

    private final Context a;
    private final com.facebook.messages.ipc.e b;
    private final c c;
    private final k d;
    private final a e;
    private final f f;

    public e(Context context, com.facebook.messages.ipc.e e1, c c1, k k1, a a1, f f1)
    {
        a = context;
        b = e1;
        c = c1;
        d = k1;
        e = a1;
        f = f1;
    }

    private PendingIntent a(Message message)
    {
        message = new Intent("android.intent.action.VIEW", d.a(message.e()));
        message.setFlags(0x4000000);
        message.putExtra("from_notification", true);
        message.putExtra("trigger", "notification");
        return PendingIntent.getActivity(a, 0, message, 0);
    }

    public void a()
    {
        b.a((String)e.b());
    }

    protected void a(ap ap1)
    {
        if (!ap1.d())
        {
            String s = ap1.b().e();
            if (!Boolean.TRUE.equals(f.a(com.facebook.messages.ipc.peer.d.a(s))))
            {
                ap1.e().b(true);
            }
        }
    }

    public void a(String s)
    {
        b.a(s, (String)e.b());
    }

    protected void b(ap ap1)
    {
        if (ap1.e().p())
        {
            return;
        } else
        {
            ap1 = ap1.b();
            ap1 = c.a(ap1, a(ap1));
            b.a(ap1, (String)e.b());
            return;
        }
    }

    protected void b(bi bi1)
    {
        for (bi1 = bi1.a().i_().iterator(); bi1.hasNext(); a((String)bi1.next())) { }
    }

    protected void b(i i)
    {
    }

    protected void b(w w)
    {
    }

    protected void b(com.facebook.orca.push.a a1)
    {
    }
}
