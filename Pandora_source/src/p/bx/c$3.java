// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import com.pandora.android.data.h;
import p.cm.ae;
import p.df.a;

// Referenced classes of package p.bx:
//            c

class .Object
    implements com.facebook.est.GraphUserCallback
{

    final Session a;
    final c b;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        response = response.getError();
        if (response != null)
        {
            p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.onFacebookSessionCallback --> MeRequest.onComplete() : Could not get current user info.  ").append(response.getErrorMessage()).toString());
            (new ae()).execute(new Object[] {
                p.cm..c
            });
        } else
        if (a == Session.getActiveSession())
        {
            p.bx.c.a(b).a(graphuser);
            if (c.b(b))
            {
                p.bx.c.a(b, false);
                c.c(b);
                return;
            } else
            {
                (new ae()).execute(new Object[] {
                    p.cm..b
                });
                return;
            }
        }
    }

    ook.Session(c c1, Session session)
    {
        b = c1;
        a = session;
        super();
    }
}
