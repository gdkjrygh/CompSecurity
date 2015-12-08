// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.LikeActionController;
import com.facebook.widget.FacebookDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public final class apk
{

    final ape a;
    private final Activity b;
    private final BroadcastReceiver c;
    private final de d;
    private UUID e;
    private arh f;

    public apk(Activity activity, ape ape)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException("activity cannot be null");
        } else
        {
            b = activity;
            a = ape;
            c = new apl(this, (byte)0);
            d = de.a(activity);
            f = arh.a();
            aph.a(activity);
            return;
        }
    }

    private void c()
    {
        while (e == null || f.b(e) == null) 
        {
            return;
        }
        d();
    }

    private void d()
    {
        f.a(e);
        e = null;
    }

    public final void a()
    {
        Object obj = Session.g();
        if (obj != null)
        {
            if (a != null)
            {
                ((Session) (obj)).a(a);
            }
            if (SessionState.b.equals(((Session) (obj)).c()))
            {
                ((Session) (obj)).a(null);
            }
        }
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
        ((IntentFilter) (obj)).addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        d.a(c, ((IntentFilter) (obj)));
    }

    public final void a(int i, int j, Intent intent)
    {
        Object obj;
label0:
        {
            obj = Session.g();
            if (obj != null)
            {
                ((Session) (obj)).a(b, i, j, intent);
            }
            if (!LikeActionController.a(b, i, intent) && e != null)
            {
                obj = f.b(e);
                if (obj != null && ((com.facebook.widget.FacebookDialog.PendingCall) (obj)).c == i)
                {
                    break label0;
                }
            }
            return;
        }
        if (intent == null)
        {
            c();
            return;
        }
        UUID uuid = arc.a(intent);
        if (uuid != null && e.equals(uuid))
        {
            FacebookDialog.a(((com.facebook.widget.FacebookDialog.PendingCall) (obj)), i, intent, null);
        } else
        {
            c();
        }
        d();
    }

    public final void a(Bundle bundle)
    {
        Session session = Session.g();
        if (session == null)
        {
            if (bundle != null)
            {
                session = Session.a(b, a, bundle);
            }
            Session session1 = session;
            if (session == null)
            {
                session1 = new Session(b);
            }
            Session.a(session1);
        }
        if (bundle != null)
        {
            Object obj = bundle.getString("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey");
            if (obj != null)
            {
                e = UUID.fromString(((String) (obj)));
            }
            obj = f;
            Object obj1 = bundle.getStringArrayList("com.facebook.internal.PendingCallStore.callIdArrayKey");
            if (obj1 != null)
            {
                obj1 = ((ArrayList) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    com.facebook.widget.FacebookDialog.PendingCall pendingcall = (com.facebook.widget.FacebookDialog.PendingCall)bundle.getParcelable(arh.a((String)((Iterator) (obj1)).next()));
                    if (pendingcall != null)
                    {
                        ((arh) (obj)).a.put(pendingcall.a.toString(), pendingcall);
                    }
                } while (true);
            }
        }
    }

    public final void b()
    {
        d.a(c);
        if (a != null)
        {
            Session session = Session.g();
            if (session != null)
            {
                session.b(a);
            }
        }
    }

    public final void b(Bundle bundle)
    {
        Session.a(Session.g(), bundle);
        if (e != null)
        {
            bundle.putString("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey", e.toString());
        }
        Object obj = f;
        bundle.putStringArrayList("com.facebook.internal.PendingCallStore.callIdArrayKey", new ArrayList(((arh) (obj)).a.keySet()));
        com.facebook.widget.FacebookDialog.PendingCall pendingcall;
        for (obj = ((arh) (obj)).a.values().iterator(); ((Iterator) (obj)).hasNext(); bundle.putParcelable(arh.a(pendingcall.a.toString()), pendingcall))
        {
            pendingcall = (com.facebook.widget.FacebookDialog.PendingCall)((Iterator) (obj)).next();
        }

    }
}
