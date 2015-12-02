// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.server.aq;
import com.google.common.a.ik;
import com.google.common.d.a.i;
import java.util.Map;

// Referenced classes of package com.facebook.orca.f:
//            q

public class p
{

    private final k a;
    private final Map b = ik.a();

    public p(k k1)
    {
        a = k1;
    }

    static Map a(p p1)
    {
        return p1.b;
    }

    public void a(String s, MessageDraft messagedraft)
    {
        b.put(s, messagedraft);
        Bundle bundle = new Bundle();
        bundle.putString("threadId", s);
        bundle.putParcelable("draft", messagedraft);
        i.a(a.a(aq.t, bundle).a(), new q(this, s));
    }

    public boolean a(String s)
    {
        return b.containsKey(s);
    }

    public MessageDraft b(String s)
    {
        return (MessageDraft)b.get(s);
    }
}
