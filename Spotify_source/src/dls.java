// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class dls
    implements bqw, bqx, brd
{

    final Context a;
    DiscoveredDevice b;
    final dlv c;
    bqu d;
    dlu e;
    bpa f;
    boolean g;
    private final String h;
    private boolean i;

    dls(Context context, String s, dlv dlv1)
    {
        a = context;
        c = dlv1;
        h = s;
        bqi.a();
    }

    public final void a(int j)
    {
        i = true;
    }

    public final void a(Bundle bundle)
    {
        if (!i) goto _L2; else goto _L1
_L1:
        i = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"))
        {
            b(2005);
        }
_L4:
        return;
_L2:
        if (!g)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!a()) goto _L4; else goto _L3
_L3:
        bundle = new LaunchOptions();
        bundle.a();
        boh.b.a(d, h, bundle).a(this);
        return;
        if (!a()) goto _L4; else goto _L5
_L5:
        boh.b.a(d, h).a(this);
        return;
    }

    public final void a(brc brc)
    {
        brc = (boi)brc;
        brc.c();
        if (brc.c().b())
        {
            brc.a();
            brc.b();
            if (a())
            {
                e = new dlu(this, (byte)0);
                boolean flag;
                try
                {
                    boh.b.a(d, gej.c, e);
                }
                catch (Exception exception)
                {
                    Logger.c("onMessageChannelCreateFailed: %s", new Object[] {
                        exception
                    });
                    c.b(b);
                }
            }
            if (a())
            {
                if (f == null)
                {
                    f = new bpa();
                    new Object() {

                    };
                    new Object() {

                    };
                }
                try
                {
                    boh.b.a(d, f.a(), f);
                }
                catch (Exception exception1)
                {
                    Logger.c("onMediaChannelCreateFailed: %s", new Object[] {
                        exception1
                    });
                    c.b(b);
                }
            }
            flag = brc.b();
            f.a(d).a(new brd(flag) {

                private boolean a;
                private dls b;

                public final void a(brc brc1)
                {
                    brc1 = (bpb)brc1;
                    if (!brc1.c().b())
                    {
                        dls dls1 = b;
                        Logger.c("onRemotePlayerStatusFailed: %s", new Object[] {
                            Integer.valueOf(brc1.c().d())
                        });
                        dls1.c.b(dls1.b);
                        return;
                    } else
                    {
                        brc1 = b;
                        boolean flag1 = a;
                        ((dls) (brc1)).c.a(((dls) (brc1)).b, flag1);
                        return;
                    }
                }

            
            {
                b = dls.this;
                a = flag;
                super();
            }
            });
            return;
        } else
        {
            Logger.c("onApplicationConnectionFailed: %s", new Object[] {
                Integer.valueOf(brc.c().d())
            });
            c.b(b);
            return;
        }
    }

    public final void a(ConnectionResult connectionresult)
    {
        Logger.c("onServiceConnectionFailed: %s", new Object[] {
            bqt.a(connectionresult.c())
        });
        i = false;
        c.b(b);
    }

    final boolean a()
    {
        return d != null && d.d();
    }

    public final boolean a(float f1)
    {
        if (!a())
        {
            return false;
        }
        try
        {
            boh.b.a(d, f1);
        }
        catch (Exception exception) { }
        return true;
    }

    final void b(int j)
    {
        c.a(j);
    }

    public final boolean b()
    {
        if (!a())
        {
            return false;
        }
        try
        {
            double d1 = Math.min(boh.b.a(d) + 0.050000000000000003D, 1.0D);
            boh.b.a(d, d1);
        }
        catch (RuntimeException runtimeexception)
        {
            Assertion.a("Error invoking CastApi", runtimeexception);
        }
        catch (IOException ioexception) { }
        return true;
    }

    public final boolean c()
    {
        if (!a())
        {
            return false;
        }
        try
        {
            double d1 = Math.max(boh.b.a(d) - 0.050000000000000003D, 0.0D);
            boh.b.a(d, d1);
        }
        catch (RuntimeException runtimeexception)
        {
            Assertion.a("Error invoking CastApi", runtimeexception);
        }
        catch (IOException ioexception) { }
        return true;
    }

    public final float d()
    {
        if (!a())
        {
            return 0.0F;
        }
        double d1;
        try
        {
            d1 = boh.b.a(d);
        }
        catch (RuntimeException runtimeexception)
        {
            return 0.0F;
        }
        return (float)d1;
    }

    // Unreferenced inner class dls$4

/* anonymous class */
    final class _cls4
        implements brd
    {

        public final void a(brc brc)
        {
            brc = (bpb)brc;
            if (!brc.c().b())
            {
                Logger.c("Loading media failed: %s", new Object[] {
                    brc.c().a()
                });
            }
        }

    }


    // Unreferenced inner class dls$5

/* anonymous class */
    final class _cls5
        implements brd
    {

        public final void a(brc brc)
        {
            if (!((Status)brc).b())
            {
                Logger.c("Sending message failed", new Object[0]);
            }
        }

    }

}
