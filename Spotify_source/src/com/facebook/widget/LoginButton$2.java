// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import aop;
import aoz;
import arl;
import com.facebook.FacebookRequestError;
import com.facebook.Session;
import com.facebook.model.GraphUser;

// Referenced classes of package com.facebook.widget:
//            LoginButton

final class a
    implements aop
{

    private Session a;
    private LoginButton b;

    public final void a(GraphUser graphuser, aoz aoz1)
    {
        Session session = a;
        LoginButton.a(b);
        if (session == arl.a())
        {
            LoginButton.a(b, graphuser);
            LoginButton.a();
        }
        if (aoz1.b != null)
        {
            graphuser = aoz1.b.e;
        }
    }

    (LoginButton loginbutton, Session session)
    {
        b = loginbutton;
        a = session;
        super();
    }
}
