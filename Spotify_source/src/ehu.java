// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class ehu
    implements egv, ehs
{

    private final ehr a;
    private final eht b;
    private egw c;

    public ehu(ehr ehr1, eht eht1)
    {
        a = ehr1;
        b = eht1;
    }

    public final void a()
    {
        a.d = this;
        ehr ehr1 = a;
        ehr1.b.execute(ehr1.f);
    }

    public final void a(byte byte0)
    {
        b.b(byte0);
    }

    public final void a(byte byte0, byte abyte0[])
    {
        b.a(byte0);
        if (c != null)
        {
            c.a(abyte0);
        }
    }

    public final void a(int i, byte abyte0[])
    {
        b.a(i, abyte0);
    }

    public final void a(egw egw1)
    {
        c = egw1;
    }

    public final void close()
    {
        a.a();
        eht eht1 = b;
        eht1.a();
        try
        {
            eht1.a.close();
        }
        catch (IOException ioexception)
        {
            eht.a(ioexception);
        }
        eht1.b.shutdown();
    }
}
