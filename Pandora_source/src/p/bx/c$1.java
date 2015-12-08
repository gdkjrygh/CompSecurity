// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package p.bx:
//            c

class .Object
    implements com.facebook.ion.StatusCallback
{

    final c a;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        c.a(a, session, sessionstate, exception);
    }

    n(c c1)
    {
        a = c1;
        super();
    }
}
