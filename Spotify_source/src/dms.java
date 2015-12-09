// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.StatFs;
import com.spotify.mobile.android.http.WebgateTokenManager;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.okhttp.Protocol;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer;
import java.util.List;

public class dms
    implements dmx
{

    public final gro a;
    public final gro b;
    public boolean c;
    private String d;
    private grl e;
    private grl f;

    public dms(Context context, WebgateTokenManager webgatetokenmanager)
    {
        e = new grl() {

            private dms a;

            public final grt a(grm grm1)
            {
                if (dms.a(a))
                {
                    return (new gru()).a(grm1.a()).a(Protocol.b).a(503).a(grv.a(grn.a("text"), "Offline mode enabled")).a();
                } else
                {
                    return grm1.a(grm1.a());
                }
            }

            
            {
                a = dms.this;
                super();
            }
        };
        f = new grl() {

            private dms a;

            public final grt a(grm grm1)
            {
                grr grr1 = grm1.a().c();
                if (grm1.a().a("User-Agent") == null)
                {
                    grr1.b("User-Agent", dms.b(a));
                }
                return grm1.a(grr1.b());
            }

            
            {
                a = dms.this;
                super();
            }
        };
        geh.b();
        a = new gro();
        a.a().add(e);
        a.a().add(f);
        a.a().add(new dmv());
        a.a().add(new dmu(webgatetokenmanager));
        b = new gro();
        b.a().add(e);
        b.a().add(f);
        try
        {
            context = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
            if (!context.exists() && !context.mkdir())
            {
                throw new IOException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.c("Could not create cache, %s", new Object[] {
                "picasso-cache"
            });
            Assertion.b("Could not create cache");
            return;
        }
        b.a(new gqm(context, a(context)));
        return;
    }

    private static long a(File file)
    {
        long l;
        try
        {
            file = new StatFs(file.getAbsolutePath());
            l = file.getBlockCount();
            l = ((long)file.getBlockSize() * l) / 50L;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            l = 0x500000L;
        }
        return Math.max(Math.min(l, 0x3200000L), 0x500000L);
    }

    private String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (d == null)
        {
            d = Normalizer.normalize((new StringBuilder("Spotify/4.2.0.739 Android/")).append(android.os.Build.VERSION.SDK_INT).append(" (").append(gcz.i()).append(")").toString(), java.text.Normalizer.Form.NFKD).replaceAll("[^\\x00-\\x7F]", "");
        }
        s = d;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    static boolean a(dms dms1)
    {
        return dms1.c;
    }

    static String b(dms dms1)
    {
        return dms1.a();
    }
}
