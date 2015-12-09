// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

public final class gkr extends bbo
{

    public final UUID e;
    private final byte f[];
    private final Handler g;
    private final gks h;
    private boolean i;

    gkr(UUID uuid, Looper looper, bbn bbn, Handler handler, gks gks, byte abyte0[])
    {
        super(uuid, looper, bbn, handler, gks);
        f = abyte0;
        e = uuid;
        g = handler;
        h = gks;
    }

    static gks a(gkr gkr1)
    {
        return gkr1.h;
    }

    public final void a()
    {
        super.a();
    }

    public final void a(bbj bbj1)
    {
        if (g != null && h != null)
        {
            g.post(new Runnable() {

                private gkr a;

                public final void run()
                {
                    gkr.a(a).m();
                }

            
            {
                a = gkr.this;
                super();
            }
            });
        }
        super.a(bbj1);
        bbj1 = bbj1.a;
        if (i)
        {
            super.a();
            i = false;
            if (super.b() == 4 && g != null && h != null)
            {
                g.post(new Runnable() {

                    private gkr a;

                    public final void run()
                    {
                        gkr.a(a).b();
                    }

            
            {
                a = gkr.this;
                super();
            }
                });
            }
        }
    }

    public final void e()
    {
        if (i || f == null)
        {
            return;
        } else
        {
            super.a(new bbl("cenc", f));
            i = true;
            return;
        }
    }

    public final int f()
    {
        return super.b();
    }
}
