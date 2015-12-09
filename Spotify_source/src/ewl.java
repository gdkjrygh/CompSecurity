// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.IntentFilter;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import org.json.JSONException;
import org.json.JSONObject;

public final class ewl
    implements ewe, ewf
{

    private static gip a = gip.b("offline-onboarding-impression-count");
    private static gip b = gip.b("offline-onboarding-dismiss-count");
    private static gip c = gip.b("offline-onboarding-onboarding-completed");
    private final gin d;
    private final String e;
    private boolean f;
    private final ewj g;
    private ewd h;
    private boolean i;
    private boolean j;

    public ewl(Verified verified, gin gin1, ewj ewj1, boolean flag)
    {
        g = ewj1;
        e = verified.toString();
        d = gin1;
        f = flag;
    }

    private static JSONObject a(gin gin1)
    {
        try
        {
            gin1 = gin1.a(a, new JSONObject());
        }
        // Misplaced declaration of an exception variable
        catch (gin gin1)
        {
            return new JSONObject();
        }
        return gin1;
    }

    private void c()
    {
        boolean flag = true;
        boolean flag1 = d.a(c, false);
        int k;
        if (!f || i)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0 && !flag1)
        {
            k = a(d).optInt(e, 0);
            int l = d.a(b, 0);
            if (k < 3 || l >= 3)
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (g.e() == flag)
        {
            return;
        }
        if (flag & j)
        {
            g.c();
            return;
        } else
        {
            g.d();
            return;
        }
    }

    public final void a()
    {
        d.b().a(c, true).b();
        g.d();
    }

    public final void a(Context context)
    {
        if (h == null)
        {
            h = new ewd(this);
        }
        IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(h, intentfilter);
    }

    public final void a(boolean flag)
    {
        i = flag;
        c();
    }

    public final void b()
    {
        int k = d.a(b, 0);
        if (k <= 3)
        {
            d.b().a(b, k + 1).b();
        }
        g.d();
    }

    public final void b(Context context)
    {
        if (h != null)
        {
            context.unregisterReceiver(h);
        }
    }

    public final void b(boolean flag)
    {
        j = flag;
        c();
        if (flag)
        {
            JSONObject jsonobject = a(d);
            int k = jsonobject.optInt(e, 0);
            if (k < 3)
            {
                try
                {
                    jsonobject.put(e, k + 1);
                }
                catch (JSONException jsonexception)
                {
                    Logger.b(jsonexception, "Unable to record user playable context impression", new Object[0]);
                    return;
                }
                d.b().a(a, jsonobject).b();
                return;
            }
        }
    }

}
