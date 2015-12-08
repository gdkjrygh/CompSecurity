// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.e.a.b;

// Referenced classes of package com.nuance.b.e:
//            c

final class j
    implements Runnable
{

    final String a;
    final boolean b = false;
    final c c;

    j(c c1, String s)
    {
        c = c1;
        a = s;
        super();
    }

    public final void run()
    {
        b b1 = com.nuance.b.e.c.c(c);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (a != null && !"".equals(a))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        b1.dismiss();
_L3:
        b1.waitForDismissComplete();
_L2:
        com.nuance.b.e.c.a(c, b);
        return;
        Log.e("Nina", a);
        b1.dismissWithError(a);
          goto _L3
        Object obj;
        obj;
        Log.w("Nina", "Interrupted while waiting for persona to be dismissed.  Will exit immediately.");
        com.nuance.b.e.c.a(c, b);
        return;
        obj;
        Log.w("Nina", "Caught RuntimeException dismissing persona.  Will exit immediately.", ((Throwable) (obj)));
        com.nuance.b.e.c.a(c, b);
        return;
        obj;
        com.nuance.b.e.c.a(c, b);
        throw obj;
    }
}
