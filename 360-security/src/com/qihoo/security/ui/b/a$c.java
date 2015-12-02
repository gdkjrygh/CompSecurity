// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.qihoo.security.locale.d;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.qihoo.security.ui.b:
//            a

class a
    implements Runnable
{

    wnLatch.countDown a;
    CountDownLatch b;
    wnLatch c;
    String d;
    final a e;

    private a a(a a1)
    {
        a a2;
        View view;
        SparseArray sparsearray;
        int i;
        int j;
        int k;
        try
        {
            a2 = new <init>();
            view = com.qihoo.security.ui.b.a.c(e).inflate(a1.b, null);
            a2.b = view;
            a1 = a1.c;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            return null;
        }
        if (a1 == null) goto _L2; else goto _L1
_L1:
        sparsearray = new SparseArray();
        a2.c = sparsearray;
        j = a1.length;
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = a1[i];
        sparsearray.put(k, view.findViewById(k));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        d = com.qihoo.security.locale.d.a().f();
        return a2;
    }

    public f a()
    {
        try
        {
            b.await();
        }
        catch (InterruptedException interruptedexception) { }
        return c;
    }

    public void run()
    {
        c = a(a);
        b.countDown();
    }

    on(a a1, on on)
    {
        e = a1;
        super();
        b = new CountDownLatch(1);
        a = on;
    }
}
