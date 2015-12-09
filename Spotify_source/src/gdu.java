// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class gdu
{

    public static void a(Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        a(String.format(Locale.US, "%s\t%d\t%s\t%s\t%s\t%s\t%s\t\t\t%s", new Object[] {
            "ClientEvent", Integer.valueOf(3), verified.toString(), subview.toString(), clientevent.a.toString(), clientevent.b.toString(), clientevent.c, clientevent.a()
        }));
    }

    static void a(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("m", s);
        ctz.a("https://log.spotify.com".startsWith("https://"), "Doing insecure logging over HTTP and not HTTPS");
        ((dmj)dmz.a(dmj)).a("https://log.spotify.com").a("", hashmap, new dmi() {

            public final volatile void a(int i, Object obj)
            {
            }

            public final void a(Throwable throwable, String s1)
            {
                Logger.b(throwable, "Exception when logging over https: %s", new Object[] {
                    throwable.getMessage()
                });
                Logger.c("Log message: %s", new Object[] {
                    s1
                });
            }

        });
    }
}
