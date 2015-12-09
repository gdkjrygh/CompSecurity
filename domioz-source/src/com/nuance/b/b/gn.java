// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.b:
//            ad, v, bx

final class gn
    implements Runnable
{

    final ad a;

    gn(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void run()
    {
        Object obj;
        SharedPreferences sharedpreferences;
        try
        {
            obj = (CountDownLatch)ad.a(a).get();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        ((CountDownLatch) (obj)).await();
        obj = v.r();
        sharedpreferences = ((v) (obj)).c.getSharedPreferences("Nina.AppCtrl", 0);
        if (sharedpreferences == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!sharedpreferences.getBoolean("autoSessionTimeout", true))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        v.a(((v) (obj)));
        v.b(((v) (obj))).a(new f(-1L, g.b, null, null));
    }
}
