// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.os.Bundle;
import com.vungle.publisher.net.http.HttpRequest;
import com.vungle.publisher.protocol.message.SessionStart;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            SessionStartHttpRequest

public static class  extends 
{

    com.vungle.publisher.protocol.message. g;

    protected final SessionStartHttpRequest a(long l)
        throws JSONException
    {
        SessionStartHttpRequest sessionstarthttprequest = (SessionStartHttpRequest)a();
        ((HttpRequest) (sessionstarthttprequest)).c.putString("Content-Type", "application/json");
        sessionstarthttprequest.b = (new StringBuilder()).append(d).append("sessionStart").toString();
        sessionstarthttprequest.d = g.(l).c();
        return sessionstarthttprequest;
    }

    protected final HttpRequest b()
    {
        return new SessionStartHttpRequest();
    }

    public ()
    {
    }
}
