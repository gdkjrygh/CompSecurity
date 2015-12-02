// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.b;

import android.net.Uri;
import com.facebook.analytics.a;
import com.facebook.analytics.bs;
import com.facebook.config.server.j;
import com.facebook.http.c.i;
import com.facebook.http.f.c;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.orca.b:
//            c

public class b extends bs
{

    private static Class b = com/facebook/orca/b/b;
    private final j c;
    private final f d = new com.facebook.orca.b.c(this);

    public b(a a1, j j1, d d1)
    {
        super(a1);
        c = j1;
        d1.a(d);
    }

    static void a(b b1, ae ae1)
    {
        b1.a(ae1);
    }

    private void a(ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ae1.a(c.i))
        {
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ae1;
        throw ae1;
    }

    public ev a()
    {
        i k = c.a();
        return (new ew()).b(k.a().appendEncodedPath("method/logging.mobilelogs").build().toString(), "log").b("https://www.facebook.com/mobile/orca_android_crash_logs/", "crash_report").b(k.a().toString(), "api").b(k.b().toString(), "graph").b();
    }

}
