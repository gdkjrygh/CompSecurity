// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import android.os.Bundle;
import com.facebook.analytics.cn;
import com.facebook.base.a.d;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.notify.av;
import com.facebook.orca.notify.bi;
import com.facebook.orca.notify.w;
import com.facebook.orca.server.aq;
import com.facebook.push.g;
import com.google.common.base.Objects;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.push:
//            a

public class b
{

    private final a a;
    private final av b;
    private final k c;
    private final d d;
    private final cn e;

    public b(a a1, av av1, k k1, d d1, cn cn1)
    {
        a = a1;
        b = av1;
        c = k1;
        d = d1;
        e = cn1;
    }

    private void a(String s, Message message, g g1)
    {
        if (Objects.equal(a.b(), message.i().e()))
        {
            e.a(message.e(), message.d(), g1.toString(), "from_viewer");
            return;
        } else
        {
            b.a(s, message, g1);
            return;
        }
    }

    public void a(bi bi)
    {
        b.a(bi);
    }

    public void a(w w)
    {
        b.a(w);
    }

    public void a(com.facebook.orca.push.a a1)
    {
        b.a(a1);
    }

    public void a(String s, String s1, Message message, g g1)
    {
        d.b();
        Bundle bundle = new Bundle();
        bundle.putString("threadId", s1);
        bundle.putParcelable("message", message);
        c.a(aq.y, bundle).a(true).a();
        if (s != null)
        {
            a(s, message, g1);
        }
    }
}
