// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia;

import android.app.Activity;
import com.millennialmedia.internal.e;
import com.millennialmedia.internal.g;
import com.millennialmedia.internal.utils.ThreadUtils;
import com.millennialmedia.internal.utils.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.millennialmedia:
//            c, f, a, e

public class d
{

    public static boolean a = false;
    public static Map b = new HashMap();
    public static boolean c = true;
    private static final String d = com/millennialmedia/d.getSimpleName();
    private static f e;
    private static com.millennialmedia.a f;
    private static com.millennialmedia.e g;

    public d()
    {
    }

    public static void a(Activity activity)
    {
        if (a)
        {
            com.millennialmedia.c.b(d, "Millennial Media SDK already initialized");
            return;
        }
        if (activity == null)
        {
            throw new IllegalArgumentException("Unable to initialize SDK, specified activity is null");
        } else
        {
            ThreadUtils.a();
            com.millennialmedia.internal.utils.a.a(activity);
            com.millennialmedia.internal.g.a();
            com.millennialmedia.internal.a.a();
            com.millennialmedia.internal.playlistserver.d.b();
            com.millennialmedia.internal.adadapters.a.a();
            com.millennialmedia.internal.adcontrollers.a.a();
            a("com.millennialmedia.clientmediation.AdMobMediationAdapter");
            a("com.millennialmedia.clientmediation.ConversentMediationAdapter");
            a("com.millennialmedia.clientmediation.InMobiMediationAdapter");
            a("com.millennialmedia.clientmediation.AdColonyMediationAdapter");
            a("com.millennialmedia.clientmediation.ChartboostMediationAdapter");
            a("com.millennialmedia.clientmediation.FacebookMediationAdapter");
            a("com.millennialmedia.clientmediation.MoPubMediationAdapter");
            a("com.millennialmedia.clientmediation.VungleMediationAdapter");
            a("com.millennialmedia.clientmediation.YahooMediationAdapter");
            a("com.millennialmedia.clientmediation.TapjoyMediationAdapter");
            com.millennialmedia.internal.g.a(true);
            com.millennialmedia.internal.e.a();
            a = true;
            return;
        }
    }

    public static void a(com.millennialmedia.a a1)
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to set app info, SDK must be initialized first");
        } else
        {
            f = a1;
            return;
        }
    }

    public static void a(f f1)
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to set user data, SDK must be initialized first");
        } else
        {
            e = f1;
            return;
        }
    }

    private static void a(String s)
    {
        Class class1;
        class1 = Class.forName(s);
        if (!com/millennialmedia/a/a.isAssignableFrom(class1))
        {
            com.millennialmedia.c.d(d, "Unable to register mediation adapter, specified class is not an instance of MediationAdapter");
            return;
        }
        try
        {
            ((com.millennialmedia.a.a)class1.newInstance()).a();
            if (com.millennialmedia.c.a())
            {
                com.millennialmedia.c.a(d, (new StringBuilder()).append("Registering client mediation adapter: ").append(class1.getName()).toString());
                return;
            }
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            if (com.millennialmedia.c.a())
            {
                com.millennialmedia.c.a(d, (new StringBuilder()).append("No class found for mediation adapter <").append(s).append(">").toString());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (com.millennialmedia.c.a())
            {
                com.millennialmedia.c.a(d, "Unable to create new instance of mediation adapter", s);
            }
        }
        return;
    }

    public static void a(boolean flag)
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to set location state, SDK must be initialized first");
        }
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(d, (new StringBuilder()).append("Setting location enabled: ").append(flag).toString());
        }
        c = flag;
    }

    public static boolean a()
    {
        return a;
    }

    public static f b()
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to get user data, SDK must be initialized first");
        } else
        {
            return e;
        }
    }

    public static com.millennialmedia.a c()
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to get app info, SDK must be initialized first");
        } else
        {
            return f;
        }
    }

    public static com.millennialmedia.e d()
    {
        if (!a)
        {
            throw new IllegalStateException("Unable to get test info, SDK must be initialized first");
        } else
        {
            return g;
        }
    }

}
