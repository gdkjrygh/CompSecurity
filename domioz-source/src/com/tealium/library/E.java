// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.tealium.library:
//            e, m, B, RemoteCommand, 
//            I, u, K, J

final class E
    implements e, m
{

    private final Map a;
    private final SharedPreferences b;
    private final Context c;

    E(Tealium.Config config)
    {
        if (config == null)
        {
            throw new IllegalArgumentException("config must not be null.");
        } else
        {
            b = config.a();
            a = config.b();
            c = config.f().getApplicationContext();
            return;
        }
    }

    final void a(B b1)
    {
        RemoteCommand remotecommand = (RemoteCommand)a.get(b1.a());
        Object obj1 = remotecommand;
        if (remotecommand == null)
        {
            Object obj = b1.a();
            if ("_http".equals(obj))
            {
                obj = new I();
            } else
            if ("_push".equals(obj))
            {
                obj = K.a(c, b);
            } else
            if ("_mobilecompanion".equals(obj))
            {
                obj = new J();
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                a.put(((RemoteCommand) (obj)).a(), obj);
            }
            obj1 = obj;
            if (obj == null)
            {
                obj = String.format(Locale.ROOT, "No remote command with the name \"%s\" was found.", new Object[] {
                    b1.a()
                });
                u.d(((String) (obj)));
                b1.b().setStatus(404).setBody(((String) (obj))).send();
                return;
            }
        }
        u.a(com.tealium.library.c.a.a(b1.a(), b1.b().getRequestPayload()));
        ((RemoteCommand) (obj1)).a(b1);
    }

    public final void a(RemoteCommand remotecommand)
    {
        if (remotecommand == null)
        {
            throw new IllegalArgumentException("remoteCommand must not be null.");
        } else
        {
            a.put(remotecommand.a(), remotecommand);
            return;
        }
    }

    public final void b(RemoteCommand remotecommand)
    {
        if (remotecommand == null)
        {
            throw new IllegalArgumentException("remoteCommand must not be null.");
        } else
        {
            a.remove(remotecommand.a());
            return;
        }
    }
}
