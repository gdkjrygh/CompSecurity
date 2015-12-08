// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;

public final class cwd extends Draft_10
{

    public cwd()
    {
    }

    public final com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState a(cwk cwk)
    {
        if (c(cwk) == 13)
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        } else
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
    }

    public final cwl a(cwl cwl1)
    {
        super.a(cwl1);
        cwl1.a("Sec-WebSocket-Version", "13");
        return cwl1;
    }

    public final Draft c()
    {
        return new cwd();
    }
}
