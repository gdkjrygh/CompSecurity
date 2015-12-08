// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.ae;
import com.vungle.publisher.ai;
import com.vungle.publisher.by;
import com.vungle.publisher.cw;
import com.vungle.publisher.t;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.protocol:
//            ProtocolHttpGateway

static class  extends by
{

    Provider a;

    private void a(cw cw)
    {
        ((ProtocolHttpGateway)a.get()).b(cw);
    }

    public void onEvent(ae ae1)
    {
        a(ae1.a);
    }

    public void onEvent(ai ai)
    {
        a(null);
    }

    public void onEvent(t t)
    {
        a(null);
    }

    ()
    {
    }
}
