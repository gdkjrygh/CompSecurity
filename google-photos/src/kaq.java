// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class kaq
    implements Runnable
{

    private final int a;
    private final ConnectionResult b;
    private kan c;

    public kaq(kan kan1, int i, ConnectionResult connectionresult)
    {
        c = kan1;
        super();
        a = i;
        b = connectionresult;
    }

    public final void run()
    {
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
                kan.a(c);
            }
            return;
        }
        if (jyc.b(b.c))
        {
            jyc.a(b.c, c.O_(), c, 2, c);
            return;
        } else
        {
            kan.a(c, a, b);
            return;
        }
    }
}
