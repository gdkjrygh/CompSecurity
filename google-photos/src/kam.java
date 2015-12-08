// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class kam
    implements Runnable
{

    private final int a;
    private final ConnectionResult b;
    private kak c;

    public kam(kak kak1, int i, ConnectionResult connectionresult)
    {
        c = kak1;
        super();
        a = i;
        b = connectionresult;
    }

    public final void run()
    {
        if (!kak.a(c) || kak.b(c))
        {
            return;
        }
        kak.a(c, true);
        kak.a(c, a);
        kak.a(c, b);
        if (b.a())
        {
            try
            {
                int i = c.O_().c().f().indexOf(c);
                b.a(c.O_(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                kak.c(c);
            }
            return;
        }
        if (jyc.b(b.c))
        {
            jyc.a(b.c, c.O_(), c, 2, c);
            return;
        } else
        {
            kak.a(c, a, b);
            return;
        }
    }
}
