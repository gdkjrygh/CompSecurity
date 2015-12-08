// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.net.Uri;
import com.android.volley.VolleyError;
import com.tinder.e.ab;
import com.tinder.f.ak;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            a, z, ManagerApp

public final class e
{

    public static boolean f;
    public Uri a;
    public User b;
    public String c;
    public String d;
    public String e;
    public SparksEvent g;
    public z h;

    public e(z z)
    {
        h = z;
    }

    static void a(e e1)
    {
        e1.a(e1.g);
        com.tinder.managers.a.a(e1.g);
        e1.g = null;
    }

    public final void a(SparksEvent sparksevent)
    {
label0:
        {
            if (sparksevent != null)
            {
                if (a == null)
                {
                    break label0;
                }
                sparksevent.put("from", "deepLink");
                if (b != null && b.hasBadge())
                {
                    sparksevent.put("badgeType", b.getFirstBadge());
                }
                sparksevent.put("referralURL", c);
                sparksevent.put("referralString", e);
            }
            return;
        }
        sparksevent.put("from", "recommended");
    }

    public final void a(String s, SparksEvent sparksevent)
    {
        if (b != null && s.equals(b.getId()))
        {
            a(sparksevent);
        }
    }

    public final void b(String s, SparksEvent sparksevent)
    {
        if (b != null && s.equals(b.getId()))
        {
            a(sparksevent);
        }
    }

    // Unreferenced inner class com/tinder/managers/e$1

/* anonymous class */
    public final class _cls1
        implements com.android.volley.i.b
    {

        final ab a;
        final e b;

        public final void a(Object obj)
        {
            obj = (String)obj;
            try
            {
                obj = ManagerApp.h().d().a(new JSONObject(((String) (obj))));
                b.b = ((User) (obj));
                e.f = false;
                e.a(b);
                a.onProfileLoaded(((User) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                v.a("Failed to get deep linked user", ((Throwable) (obj)));
            }
        }

            public 
            {
                b = e.this;
                a = ab1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/e$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.i.a
    {

        final ab a;
        final e b;

        public final void a(VolleyError volleyerror)
        {
            e.f = false;
            e.a(b);
            a.onProfileLoadFailed();
        }

            public 
            {
                b = e.this;
                a = ab1;
                super();
            }
    }

}
