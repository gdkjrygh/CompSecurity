// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            d, c, e, f

class _cls1.b
    implements Runnable
{

    final boolean a;
    final List b;
    final List c;
    final _cls1.b d;
    final Handler e;
    final d f;

    public void run()
    {
        f f1;
        e e1;
        e1 = new e(0, "Inventory refresh successful.");
        f1 = null;
        f f2 = f.a(a, b, c);
        f1 = f2;
_L2:
        f.d();
        if (!f.d && d != null)
        {
            e.post(new Runnable(e1, f1) {

                final e a;
                final f b;
                final IabHelper._cls3 c;

                public void run()
                {
                    c.d.a(a, b);
                }

            
            {
                c = IabHelper._cls3.this;
                a = e1;
                b = f1;
                super();
            }
            });
        }
        return;
        c c1;
        c1;
        c1 = c1.a();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
