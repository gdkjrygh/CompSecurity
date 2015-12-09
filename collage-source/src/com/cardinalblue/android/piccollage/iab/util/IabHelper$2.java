// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            d, c, e, f

class d
    implements Runnable
{

    final boolean a;
    final List b;
    final _cls1.b c;
    final Handler d;
    final d e;

    public void run()
    {
        f f;
        e e1;
        e1 = new e(0, "Inventory refresh successful.");
        f = null;
        f f1 = e.a(a, b);
        f = f1;
_L2:
        e.b();
        if (!e.d && c != null)
        {
            d.post(new Runnable(e1, f) {

                final e a;
                final f b;
                final IabHelper._cls2 c;

                public void run()
                {
                    c.c.a(a, b);
                }

            
            {
                c = IabHelper._cls2.this;
                a = e1;
                b = f;
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

    _cls1.b(d d1, boolean flag, List list, _cls1.b b1, Handler handler)
    {
        e = d1;
        a = flag;
        b = list;
        c = b1;
        d = handler;
        super();
    }
}
