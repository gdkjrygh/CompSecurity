// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

// Referenced classes of package com.facebook.appconfig:
//            l, AppConfig

public class b
{

    private final d a;
    private final ObjectMapper b;
    private volatile AppConfig c;

    public b(d d1, ObjectMapper objectmapper)
    {
        a = d1;
        b = objectmapper;
    }

    public AppConfig a()
    {
        AppConfig appconfig = null;
        if (c != null)
        {
            appconfig = c;
        } else
        {
            String s = a.a(l.c, null);
            long l1 = a.a(l.b, 0L);
            if (s != null)
            {
                AppConfig appconfig1;
                try
                {
                    appconfig1 = new AppConfig(b.readTree(s), l1);
                }
                catch (IOException ioexception)
                {
                    return null;
                }
                return appconfig1;
            }
        }
        return appconfig;
    }

    public void a(AppConfig appconfig)
    {
        if (appconfig == null)
        {
            return;
        } else
        {
            e e1 = a.b();
            e1.a(l.c, appconfig.c().toString());
            e1.a(l.b, System.currentTimeMillis());
            e1.a();
            c = appconfig;
            return;
        }
    }
}
