// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;

final class dxt
    implements aop
{

    private WeakReference a;

    private dxt(dxr dxr1)
    {
        a = new WeakReference(dxr1);
    }

    dxt(dxr dxr1, byte byte0)
    {
        this(dxr1);
    }

    public final void a(GraphUser graphuser, aoz aoz1)
    {
        Object obj = (dxr)a.get();
        if (obj == null)
        {
            Assertion.a("Callback received when outer fragment is null", new IllegalStateException("Outer fragment is null"));
        } else
        {
            dxr.a(((dxr) (obj)));
            u u = ((dxr) (obj)).k();
            if (u == null)
            {
                Logger.c("Received callback without being attached to activity", new Object[0]);
                return;
            }
            if (graphuser == null)
            {
                if (aoz1 != null && aoz1.b != null)
                {
                    aoz1.b.toString();
                }
                dmz.a(ggc);
                ggc.a(u);
                dxr.b(((dxr) (obj)));
                return;
            }
            obj = Session.g();
            if (obj == null)
            {
                Logger.c("Unable to login, facebook session was null", new Object[0]);
                return;
            }
            aoz1 = (dxr)a.get();
            if (aoz1 != null)
            {
                obj = ((Session) (obj)).d();
                graphuser = graphuser.getId();
                boolean flag = aoz1.g().getBoolean("isSignUpFlow", false);
                aoz1.K().a(graphuser, ((String) (obj)), flag);
                return;
            }
        }
    }
}
