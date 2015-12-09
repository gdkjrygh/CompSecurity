// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.tealium.library:
//            Tealium, u, RemoteCommand, b

public final class j
{

    private final Application a;
    private final String b;
    private final String c;
    private final String d;
    private final SharedPreferences e;
    private final Map f;
    private l g;
    private String h;
    private boolean i;
    private boolean j;
    private float k;
    private Set l;

    public static j create(Activity activity, String s, String s1, String s2)
    {
        if (activity == null)
        {
            u.e("Unable to initialize Tealium with a null Activity object, Tealum calls will have no effect.");
            return null;
        } else
        {
            return create(activity.getApplication(), s, s1, s2);
        }
    }

    public static  create(Application application, String s, String s1, String s2)
    {
        if (application == null)
        {
            u.e("Unable to initialize Tealium with a null Application object, Tealum calls will have no effect.");
            return null;
        }
        if (s == null)
        {
            u.e("Unable to initialize Tealium with an empty or null Account Name, Tealum calls will have no effect.");
            return null;
        }
        if (s1 == null)
        {
            u.e("Unable to initialize Tealium with an empty or null Profile Name, Tealum calls will have no effect.");
            return null;
        }
        if (s2 == null)
        {
            u.e("Unable to initialize Tealium with an empty or null Environment Name, Tealum calls will have no effect.");
            return null;
        } else
        {
            return new <init>(application, s, s1, s2);
        }
    }

    final SharedPreferences a()
    {
        return e;
    }

    public final e addGlobalCustomData(Map map)
    {
        if (map == null)
        {
            return this;
        }
        android.content.es.Editor editor = ((SharedPreferences)Tealium.a().get()).edit();
        java.util. ;
        for (map = map.entrySet().iterator(); map.hasNext(); editor.putString((String).y(), (String).lue()))
        {
             = (java.util.lue)map.next();
        }

        editor.apply();
        return this;
    }

    public final ditor.apply addRemoteCommand(RemoteCommand remotecommand)
    {
        if (remotecommand == null)
        {
            return this;
        }
        try
        {
            if (f.containsKey(remotecommand.a()))
            {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "Unable to add RemoteCommand with name \"%s\"; there's already a command with this name.", new Object[] {
                    remotecommand.a()
                }));
            }
        }
        // Misplaced declaration of an exception variable
        catch (RemoteCommand remotecommand)
        {
            u.a(remotecommand);
            return this;
        }
        f.put(remotecommand.a(), remotecommand);
        return this;
    }

    final Map b()
    {
        return f;
    }

    final boolean c()
    {
        return j;
    }

    final boolean d()
    {
        return i;
    }

    final l e()
    {
        return g;
    }

    final Application f()
    {
        return a;
    }

    final String g()
    {
        return b;
    }

    final String h()
    {
        return c;
    }

    final String i()
    {
        return d;
    }

    final String j()
    {
        if (h != null)
        {
            return h;
        }
        String s;
        String s1;
        Locale locale;
        try
        {
            s = URLEncoder.encode(b.a, "UTF-8");
        }
        catch (Throwable throwable)
        {
            throwable = "unknown";
        }
        locale = Locale.ROOT;
        if (i)
        {
            s1 = "https";
        } else
        {
            s1 = "http";
        }
        return String.format(locale, "%s://tags.tiqcdn.com/utag/%s/%s/%s/mobile.html?%s=%s&%s=%s&%s=%d", new Object[] {
            s1, b, c, d, "platform", "android", "library_version", s, "os_version", Integer.valueOf(android.os.DK_INT)
        });
    }

    public final d setAccelerationSensitivity(float f1)
    {
        if (f1 > 0.0F)
        {
            k = f1;
        }
        return this;
    }

    public final k setCrashTrackingEnabled(boolean flag)
    {
        j = flag;
        return this;
    }

    public final j setExcludedActivityClasses(Set set)
    {
        if (set == null)
        {
            l = null;
            return this;
        } else
        {
            l = new HashSet(set);
            return this;
        }
    }

    public final l setHTTPSEnabled(boolean flag)
    {
        i = flag;
        return this;
    }

    public final l setJavaScriptLogLevel(l l1)
    {
        if (l1 != null)
        {
            g = l1;
        }
        return this;
    }

    public final l setLibraryLogLevel(l l1)
    {
        if (l1 != null)
        {
            u.a(l1);
        }
        return this;
    }

    public final l setMobileHtmlUrlOverride(String s)
    {
        if (s != null)
        {
            h = s;
        }
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Tealium.Config : {\r\n                    \"account\" : \"")).append(b).append("\",\r\n                    \"profile\" : \"").append(c).append("\",\r\n                \"environment\" : \"").append(d).append("\",\r\n                \"libLogLevel\" : \"").append(u.a()).append("\",\r\n                 \"jsLogLevel\" : \"").append(g).append("\",\r\n                        \"uri\" : \"").append(j()).append("\",\r\n               \"httpsEnabled\" : \"").append(i).append("\",\r\n       \"crashTrackingEnabled\" : \"").append(j).append("\",\r\n    \"accelerationSensitivity\" : \"").append(k).append("\",\r\n             \"remoteCommands\" : {");
        if (f.size() > 0)
        {
            stringbuilder.append("\r\n");
            java.util.um.Config config;
            for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); stringbuilder.append("        \"").append((String)config.y()).append("\" : \"").append(((RemoteCommand)config.lue()).b()).append("\",\r\n"))
            {
                config = (java.util.ppend)iterator.next();
            }

            stringbuilder.append("    },\r\n");
        } else
        {
            stringbuilder.append("},\r\n");
        }
        stringbuilder.append("         \"excludedActivities\" : [");
        if (l != null && l.size() > 0)
        {
            stringbuilder.append("\r\n");
            Class class1;
            for (Iterator iterator1 = l.iterator(); iterator1.hasNext(); stringbuilder.append("        \"").append(class1.getName()).append("\",\r\n"))
            {
                class1 = (Class)iterator1.next();
            }

            stringbuilder.append("    ]\r\n");
        } else
        {
            stringbuilder.append("]\r\n");
        }
        return stringbuilder.append('}').toString();
    }

    private l(Application application, String s, String s1, String s2)
    {
        a = application;
        b = s;
        c = s1;
        d = s2;
        e = application.getSharedPreferences("tealium.sp", 0);
        g = l.g;
        i = true;
        j = true;
        h = null;
        k = 3.75F;
        f = new HashMap();
        if (Tealium.a().get() == null)
        {
            Tealium.a().set(a.getSharedPreferences("tealium.globaldata", 0));
        }
    }

    eferences(eferences eferences)
    {
        a = eferences.a;
        b = eferences.b;
        c = eferences.c;
        d = eferences.d;
        e = eferences.e;
        k = eferences.k;
        h = eferences.h;
        l = eferences.l;
        f = new HashMap(eferences.f);
        g = eferences.g;
        i = eferences.i;
        j = eferences.j;
    }
}
