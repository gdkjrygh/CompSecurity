// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.Session;
import com.facebook.SessionState;
import java.lang.ref.WeakReference;

public final class apg extends Handler
{

    private WeakReference a;
    private WeakReference b;

    apg(Session session, apf apf1)
    {
        super(Looper.getMainLooper());
        a = new WeakReference(session);
        b = new WeakReference(apf1);
    }

    public final void handleMessage(Message message)
    {
        Session session;
        Object obj;
        obj = message.getData().getString("access_token");
        session = (Session)a.get();
        if (session == null || obj == null) goto _L2; else goto _L1
_L1:
        obj = message.getData();
        message = ((Message) (session.lock));
        message;
        JVM INSTR monitorenter ;
        SessionState sessionstate = session.state;
        com.facebook.Session._cls4.a[session.state.ordinal()];
        JVM INSTR tableswitch 4 5: default 196
    //                   4 135
    //                   5 153;
           goto _L3 _L4 _L5
_L3:
        Log.d(Session.a, (new StringBuilder("refreshToken ignored in state ")).append(session.state).toString());
_L2:
        message = (apf)b.get();
        if (message != null)
        {
            Session.i().unbindService(message);
            apf.a(message);
        }
        return;
_L4:
        session.state = SessionState.e;
        session.a(sessionstate, session.state, null);
_L5:
        session.tokenInfo = AccessToken.a(session.tokenInfo, ((Bundle) (obj)));
        if (session.tokenCachingStrategy != null)
        {
            session.tokenCachingStrategy.a(session.tokenInfo.b());
        }
        message;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L6
_L6:
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
