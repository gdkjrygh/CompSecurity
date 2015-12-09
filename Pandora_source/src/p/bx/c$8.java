// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import p.df.a;

// Referenced classes of package p.bx:
//            c

class .Object
    implements p.cm..Object
{

    final b a;
    final Activity b;
    final c c;

    public void a()
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.connect() : GetFacebookInfoAsyncTask.onSuccess() --> openSession(...)");
        c.a(a, b);
    }

    public void b()
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.connect() : GetFacebookInfoAsyncTask.onFailure() --> authListener.onAuthFail");
        a.b();
    }

    pp.Activity(c c1, ty ty, Activity activity)
    {
        c = c1;
        a = ty;
        b = activity;
        super();
    }
}
