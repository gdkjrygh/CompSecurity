// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;
import com.spotify.mobile.android.util.logging.Logger;

public final class gmj
    implements egv
{

    egw a;
    private final String b;
    private final bqu c;
    private gmk d;

    public gmj(String s, bqu bqu, gmk gmk1)
    {
        b = s;
        c = bqu;
        d = gmk1;
    }

    public final void a()
    {
    }

    public final void a(int i, byte abyte0[])
    {
        d.a(c, b, "/wear/message", abyte0).a(new brd() {

            public final void a(brc brc)
            {
                brc = (cqk)brc;
                if (brc.c().b())
                {
                    brc.a();
                    return;
                } else
                {
                    Logger.c("Message not sent: %s", new Object[] {
                        brc.c().a()
                    });
                    return;
                }
            }

        });
    }

    public final void a(egw egw)
    {
        a = egw;
    }

    public final void close()
    {
    }
}
