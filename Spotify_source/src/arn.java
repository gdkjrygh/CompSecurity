// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.Session;
import com.facebook.SessionState;

final class arn
    implements ape
{

    private final ape a;
    private arl b;

    public arn(arl arl1, ape ape1)
    {
        b = arl1;
        super();
        a = ape1;
    }

    public final void a(Session session, SessionState sessionstate, Exception exception)
    {
        if (a != null && b.d)
        {
            a.a(session, sessionstate, exception);
        }
        if (session == null)
        {
            sessionstate.b();
        }
    }
}
