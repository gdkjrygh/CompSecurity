// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class anc extends gyy
{

    private final float a;
    private anb b;

    anc(anb anb1, float f)
    {
        b = anb1;
        super();
        a = f;
    }

    public final void a()
    {
        float f;
        gya.a().a("CrashlyticsCore", (new StringBuilder("Starting report processing in ")).append(a).append(" second(s)...").toString());
        f = a;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Thread.sleep((long)(a * 1000F));
        Object obj;
        alu alu1 = alu.f();
        aly aly1 = alu1.b;
        obj = b.a();
        if (!aly1.b.get())
        {
            if (((List) (obj)).isEmpty() || ((Boolean)hbw.a().a(new alu._cls6(alu1), Boolean.valueOf(true))).booleanValue())
            {
                break MISSING_BLOCK_LABEL_421;
            }
            gya.a().a("CrashlyticsCore", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ana)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        anb.a(b);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gya.a().c("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || alu.f().b.b.get()) goto _L1; else goto _L2
_L2:
        gya.a().a("CrashlyticsCore", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        ana ana1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.a(ana1))
        {
            ana1 = (ana)((Iterator) (obj)).next();
        }

        List list = b.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = anb.b()[Math.min(i, anb.b().length - 1)];
        gya.a().a("CrashlyticsCore", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
        Thread.sleep(l * 1000L);
        i++;
        obj = list;
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        i = 0;
          goto _L4
    }
}
