// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            j, d

final class g
    implements j
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public final void a(String s)
    {
        Message message = d.b(a).obtainMessage();
        message.what = 2;
        Bundle bundle = new Bundle();
        bundle.putString("message_key", s);
        message.setData(bundle);
        d.b(a).sendMessage(message);
    }

    public final void a(String s, String s1)
    {
        Message message = d.b(a).obtainMessage();
        message.what = 1;
        Bundle bundle = new Bundle();
        bundle.putString("message_key", s);
        bundle.putString("message_bitmap", s1);
        message.setData(bundle);
        d.b(a).sendMessage(message);
    }
}
