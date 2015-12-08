// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.widget.LoginButton;

public final class asc
    implements ape
{

    private LoginButton a;

    private asc(LoginButton loginbutton)
    {
        a = loginbutton;
        super();
    }

    public asc(LoginButton loginbutton, byte byte0)
    {
        this(loginbutton);
    }

    public final void a(Session session, SessionState sessionstate, Exception exception)
    {
        LoginButton.g(a);
        LoginButton.h(a);
        LoginButton.d(a);
    }
}
