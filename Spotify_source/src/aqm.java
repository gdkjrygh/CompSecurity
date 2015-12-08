// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.internal.LikeActionController;

public abstract class aqm
{

    protected String a;
    public FacebookRequestError b;
    private Request c;

    protected aqm(String s)
    {
        a = s;
    }

    public final void a(aou aou1)
    {
        aou1.a(c);
    }

    protected abstract void a(aoz aoz);

    protected void a(FacebookRequestError facebookrequesterror)
    {
        facebookrequesterror = LoggingBehavior.a;
        LikeActionController.h();
        facebookrequesterror = a;
        arb.b();
    }

    protected final void a(Request request)
    {
        c = request;
        request.f = "v2.1";
        request.d = new aoo() {

            private aqm a;

            public final void a(aoz aoz1)
            {
                a.b = aoz1.b;
                if (a.b != null)
                {
                    a.a(a.b);
                    return;
                } else
                {
                    a.a(aoz1);
                    return;
                }
            }

            
            {
                a = aqm.this;
                super();
            }
        };
    }
}
