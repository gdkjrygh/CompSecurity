// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.SessionAuthorizationType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class gdh
{

    public static final List a = Collections.unmodifiableList(Arrays.asList(new String[] {
        "publish_actions"
    }));
    private static List b = Arrays.asList(new String[] {
        "public_profile", "email", "user_birthday", "user_friends"
    });

    public static void a(Activity activity)
    {
        a(new com.facebook.Session.OpenRequest(activity));
    }

    public static void a(Fragment fragment, ape ape)
    {
        fragment = new com.facebook.Session.OpenRequest(fragment);
        fragment.b(ape);
        a(((com.facebook.Session.OpenRequest) (fragment)));
    }

    private static void a(com.facebook.Session.OpenRequest openrequest)
    {
        Session session = Session.g();
        openrequest.b(b);
        openrequest.b();
        session.a(openrequest);
    }

    public static boolean a(List list)
    {
        boolean flag = false;
        list.toString();
        Session session = Session.g();
        if (session != null)
        {
            flag = session.e().containsAll(list);
        }
        return flag;
    }

    public static void b(Activity activity)
    {
        Object obj;
        Session session;
        obj = new com.facebook.Session.NewPermissionsRequest(activity, a);
        session = Session.g();
        if (session == null || !session.a())
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((com.facebook.Session.NewPermissionsRequest) (obj)).b();
        Session.a(((com.facebook.Session.AuthorizationRequest) (obj)), SessionAuthorizationType.b);
        Session.b(((com.facebook.Session.AuthorizationRequest) (obj)));
        activity = ((Activity) (session.lock));
        activity;
        JVM INSTR monitorenter ;
        if (session.pendingAuthorizationRequest != null)
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has a pending request.");
        }
        break MISSING_BLOCK_LABEL_72;
        obj;
        activity;
        JVM INSTR monitorexit ;
        throw obj;
        if (!session.state.a())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        session.pendingAuthorizationRequest = ((com.facebook.Session.AuthorizationRequest) (obj));
        activity;
        JVM INSTR monitorexit ;
        obj.validateSameFbidAsToken = session.d();
        session.a(((com.facebook.Session.AuthorizationRequest) (obj)).statusCallback);
        session.a(((com.facebook.Session.AuthorizationRequest) (obj)));
        return;
        if (session.state.b())
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has been closed.");
        } else
        {
            throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that is not currently open.");
        }
    }

}
