// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android:
//            aB, Crashlytics, ar, E, 
//            aq

final class at
    implements Runnable
{

    private final Context a;
    private final float b;
    private ar c;

    at(ar ar1, Context context, float f)
    {
        c = ar1;
        super();
        a = context;
        b = f;
    }

    public final void run()
    {
        float f;
        aB.c((new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...").toString());
        f = b;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        Thread.sleep((long)(b * 1000F));
        Object obj;
        Crashlytics crashlytics = Crashlytics.getInstance();
        E e = crashlytics.o();
        obj = c.a();
        if (!e.a())
        {
            if (((List) (obj)).isEmpty() || crashlytics.a(a))
            {
                break MISSING_BLOCK_LABEL_363;
            }
            aB.c((new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((aq)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        ar.a(c, null);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aB.a("An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || Crashlytics.getInstance().o().a()) goto _L1; else goto _L2
_L2:
        aB.c((new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        aq aq1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.a(aq1))
        {
            aq1 = (aq)((Iterator) (obj)).next();
        }

        List list = c.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = ar.b()[Math.min(i, ar.b().length - 1)];
        aB.c((new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
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
