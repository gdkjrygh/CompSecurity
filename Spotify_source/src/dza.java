// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.spotify.mobile.android.orbit.OrbitPushNotificationsInterface;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class dza
    implements dzd
{

    public byg a;
    public gfi b;
    public gfi c;
    public dzc d;
    Boolean e;
    String f;
    private final Context g;
    private final OrbitPushNotificationsInterface h;
    private final dzb i = new dzb() {

        private dza a;

        public final void a(String s)
        {
            String s1 = "";
            if (s != null)
            {
                s1 = s;
            }
            s = (String)s1;
            if (!s.isEmpty() && !s.equals(a.f))
            {
                Logger.a("Got user: %s", new Object[] {
                    "anonymized"
                });
                a.f = s;
                dza.a(a);
            } else
            if (s.isEmpty() && !a.f.isEmpty())
            {
                Logger.a("Detected log out", new Object[0]);
                a.f = s;
                dza.a(a);
                return;
            }
        }

        public final void a(boolean flag)
        {
            if (a.e != null && a.e.booleanValue() == flag)
            {
                return;
            } else
            {
                a.e = Boolean.valueOf(flag);
                Boolean boolean1 = a.e;
                dza.a(a);
                return;
            }
        }

            
            {
                a = dza.this;
                super();
            }
    };

    public dza(Context context, OrbitPushNotificationsInterface orbitpushnotificationsinterface)
    {
        f = "";
        g = context;
        h = orbitpushnotificationsinterface;
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        orbitpushnotificationsinterface = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.T);
        orbitpushnotificationsinterface.a("availability", Integer.toString(j));
        dmz.a(fop);
        fop.a(context, ViewUri.bC, orbitpushnotificationsinterface);
        if (j == 0)
        {
            a = byg.a(g);
            b = new gfi(g, new dyz(i));
            c = new gfi(g, new dze(i));
            return;
        } else
        {
            Logger.b("Google Play Services not available, push messages disabled: %d", new Object[] {
                Integer.valueOf(j)
            });
            return;
        }
    }

    static void a(dza dza1)
    {
        if (dza1.e != null)
        {
            boolean flag;
            if (dza1.e.booleanValue() && !TextUtils.isEmpty(dza1.f))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && dza1.d == null)
            {
                dza1.d = new dzc(dza1.g, dza1, dza1.a, dza1.f);
                dza1.d.a.a();
            }
            if (!flag && dza1.d != null)
            {
                (new dzc._cls2(dza1.d)).execute(new Void[0]);
                dza1.d.a();
                dza1.d = null;
            }
        }
    }

    public final void a(String s, boolean flag)
    {
        if (flag)
        {
            h.setPreviousGcmRegistrationId(s);
            return;
        } else
        {
            h.registerGcmDevice(s);
            return;
        }
    }
}
