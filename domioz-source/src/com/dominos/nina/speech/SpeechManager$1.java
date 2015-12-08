// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import com.dominos.android.sdk.common.LogUtil;
import com.nuance.b.b.a.b;
import com.nuance.b.b.a.e;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import com.nuance.b.b.a.h;
import com.nuance.b.b.a.i;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class this._cls0
    implements e
{

    final SpeechManager this$0;

    public void onConnect(b b)
    {
        LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina connected", new Object[0]);
    }

    public void onConnectError(com.nuance.b.b.a.c c1)
    {
        LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina connection error", new Object[0]);
    }

    public void onConnectionLost(f f1)
    {
        LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina Lost Connection", new Object[0]);
        SpeechManager.access$002(SpeechManager.this, false);
        if (f1.b == g.b)
        {
            if (c.i())
            {
                c.h();
            }
            connect();
        }
    }

    public void onDisconnect(h h)
    {
        LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina disconnected", new Object[0]);
    }

    public void onDisconnectError(i i)
    {
        LogUtil.d(SpeechManager.TAG, "ConnectionListener Nina disconnect error", new Object[0]);
    }

    ()
    {
        this$0 = SpeechManager.this;
        super();
    }
}
