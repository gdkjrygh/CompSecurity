// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.az;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android:
//            d, af, bc, ad

final class ah extends az
{

    private final float a;
    private af b;

    ah(af af1, float f)
    {
        b = af1;
        super();
        a = f;
    }

    public final void a()
    {
        float f;
        cm.a().b().a("Crashlytics", (new StringBuilder("Starting report processing in ")).append(a).append(" second(s)...").toString());
        f = a;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Thread.sleep((long)(a * 1000F));
        Object obj;
        d d1 = d.a();
        bc bc1 = d1.o();
        obj = b.a();
        if (!bc1.a())
        {
            if (((List) (obj)).isEmpty() || d1.s())
            {
                break MISSING_BLOCK_LABEL_409;
            }
            cm.a().b().a("Crashlytics", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ad)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        af.a(b, null);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            cm.a().b().a("Crashlytics", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || d.a().o().a()) goto _L1; else goto _L2
_L2:
        cm.a().b().a("Crashlytics", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        ad ad1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.a(ad1))
        {
            ad1 = (ad)((Iterator) (obj)).next();
        }

        List list = b.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = af.b()[Math.min(i, af.b().length - 1)];
        cm.a().b().a("Crashlytics", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
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
