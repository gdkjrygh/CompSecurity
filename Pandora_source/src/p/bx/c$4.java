// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import com.facebook.Session;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionState;
import com.pandora.android.data.h;
import java.util.Arrays;
import p.df.a;

// Referenced classes of package p.bx:
//            c

class .Object
    implements com.facebook.ion.StatusCallback
{

    final Activity a;
    final c b;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.openSession() --> OpenRequest.StatusCallback : SessionState = ").append(sessionstate).append(",  mRequestingReadPermission = ").append(c.d(b)).toString());
        if (sessionstate == SessionState.OPENED && c.d(b))
        {
            c.b(b, false);
            session.removeCallback(this);
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.openSession() --> OpenRequest.StatusCallback : requesting PUBLISH permissions");
            session.requestNewPublishPermissions((new com.facebook.ion.NewPermissionsRequest(a, Arrays.asList(p.bx.c.a(b).k()))).setDefaultAudience(SessionDefaultAudience.FRIENDS).setRequestCode(128));
        }
    }

    pp.Activity(c c1, Activity activity)
    {
        b = c1;
        a = activity;
        super();
    }
}
