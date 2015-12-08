// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import p.df.a;

// Referenced classes of package p.bx:
//            c, d, b

class .Object
    implements .Object
{

    final b a;
    final c b;

    public void a()
    {
        p.bx.d.a().b(this);
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthSucceed --> Facebook Auth Success : enabling auto-share --> setFacebookAutoShareSetting(true ...)");
        p.bx.d.a().a(true, true, false);
        a.a();
    }

    public void b()
    {
        p.bx.d.a().b(this);
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthFail --> Facebook Auth Failed : auto-share remaining off");
        a.b();
    }

    public void c()
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthFail --> Facebook Disconnect : treating as authFailure. Auto-share remaining off");
        p.bx.d.a().b(this);
        a.b();
    }

    .Object(c c1, .Object obj)
    {
        b = c1;
        a = obj;
        super();
    }
}
