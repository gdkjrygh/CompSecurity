// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.data.bl.BadgesBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.em;
import com.fitbit.data.bl.ft;
import com.fitbit.data.domain.Profile;
import com.fitbit.savedstate.d;
import com.fitbit.savedstate.m;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.util:
//            f, al

public class c
{

    public c()
    {
    }

    public static void a()
    {
        Profile profile = an.a().b();
        if (d(profile) || c(profile))
        {
            an.a().b(profile);
        }
    }

    public static void a(Context context)
    {
        if (a(an.a().b()))
        {
            f.a(new f.a(context.getApplicationContext()) {

                public void a(Context context1)
                {
                    Profile profile = an.a().c();
                    c.b(profile);
                    if (c.b(profile))
                    {
                        an.a().a(profile, context1);
                    }
                }

                public void b(Object obj)
                {
                    a((Context)obj);
                }

            });
        }
    }

    public static boolean a(Profile profile)
    {
        if (profile != null && com.fitbit.savedstate.d.k())
        {
            for (TimeZone timezone = TimeZone.getDefault(); profile.L() == null || !timezone.getID().equalsIgnoreCase(profile.L().c());)
            {
                return true;
            }

            return false;
        } else
        {
            return false;
        }
    }

    public static void b(Context context)
    {
        Profile profile = an.a().b();
        if (d(profile))
        {
            an.a().a(profile, context);
        }
    }

    public static boolean b(Profile profile)
    {
        TimeZone timezone = TimeZone.getDefault();
        com.fitbit.data.domain.TimeZone timezone1 = ft.a().a(timezone.getID());
        if (timezone1 != null && timezone1.c().equals(timezone.getID()))
        {
            profile.a(timezone1);
            return true;
        } else
        {
            return false;
        }
    }

    public static void c(Context context)
    {
        if (context != null)
        {
            android.content.Intent intent = em.a(context, true);
            BadgesBusinessLogic.a().b();
            context.startService(intent);
        }
    }

    private static boolean c(Profile profile)
    {
        return a(profile) && b(profile);
    }

    private static boolean d(Profile profile)
    {
        if (profile != null && m.h())
        {
            String s = al.b();
            if (!s.equals(profile.O()))
            {
                profile.j(s);
                return true;
            }
        }
        return false;
    }
}
