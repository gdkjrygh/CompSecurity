// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a
    implements a
{

    final BoosterFragment a;

    public void a(int i)
    {
        while (!a.a(a) || !a.isAdded() || BoosterFragment.p(a) == null) 
        {
            return;
        }
        BoosterFragment.p(a).post(new Runnable(i) {

            final int a;
            final BoosterFragment._cls6 b;

            public void run()
            {
                while (!b.a.isAdded() || !b.a.a(b.a) || BoosterFragment.z(b.a) == a) 
                {
                    return;
                }
                BoosterFragment.f(b.a, a);
                if (BoosterFragment.A(b.a) != BoosterFragment.e.d)
                {
                    BoosterFragment.g(b.a, BoosterFragment.z(b.a));
                    return;
                } else
                {
                    BoosterFragment.g(b.a, BoosterFragment.z(b.a));
                    return;
                }
            }

            
            {
                b = BoosterFragment._cls6.this;
                a = i;
                super();
            }
        });
    }

    _cls1.a(BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }
}
