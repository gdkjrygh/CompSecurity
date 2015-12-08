// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.os.Bundle;
import com.vungle.publisher.net.http.HttpRequest;
import com.vungle.publisher.protocol.message.SessionEnd;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            SessionEndHttpRequest

public static class A extends A
{

    com.vungle.publisher.protocol.message._29_ g;

    protected final SessionEndHttpRequest a(long l, long l1)
        throws JSONException
    {
        SessionEndHttpRequest sessionendhttprequest = (SessionEndHttpRequest)a();
        ((HttpRequest) (sessionendhttprequest)).c.putString("Content-Type", "application/json");
        sessionendhttprequest.b = (new StringBuilder()).append(d).append("sessionEnd").toString();
        com.vungle.publisher.protocol.message.SessionStart sessionstart = g._29_._29_(l);
        SessionEnd sessionend = com.vungle.publisher.protocol.message._29_();
        sessionend.b = sessionstart;
        sessionend.a = Long.valueOf(l1);
        sessionendhttprequest.d = sessionend.c();
        return sessionendhttprequest;
    }

    protected final HttpRequest b()
    {
        return new SessionEndHttpRequest();
    }

    public A()
    {
    }
}
