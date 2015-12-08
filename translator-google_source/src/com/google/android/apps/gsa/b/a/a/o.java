// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import android.content.Context;
import android.net.http.HttpResponseCache;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.k;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.common.base.p;
import com.google.common.base.s;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            m

public final class o extends m
{

    private final Context e;
    private final long f = 0xa00000L;

    public o(Context context, Executor executor, k k, s s, b b1)
    {
        super(executor, k, s, b1);
        e = (Context)p.a(context);
    }

    protected final void a()
    {
        File file;
        if (HttpResponseCache.getInstalled() != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        file = new File(e.getCacheDir(), "platform-http");
        HttpResponseCache.install(file, f);
        L.a(4, "PlatformHttpEngine", "Installed HTTP response cache.", new Object[0]);
        return;
        IOException ioexception;
        ioexception;
        L.b("PlatformHttpEngine", "HTTP response cache installation failed.", new Object[0]);
        return;
    }

    protected final HttpURLConnection b(l l1, c c1)
    {
        try
        {
            l1 = (HttpURLConnection)l1.f.openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            throw c1.a(0x40012, l1);
        }
        return l1;
    }
}
