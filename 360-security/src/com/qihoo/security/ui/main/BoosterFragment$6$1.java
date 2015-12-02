// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.os.Handler;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

class a
    implements Runnable
{

    final int a;
    final b b;

    public void run()
    {
        while (!b.b.isAdded() || !b.b.a(b.b) || BoosterFragment.z(b.b) == a) 
        {
            return;
        }
        BoosterFragment.f(b.b, a);
        if (BoosterFragment.A(b.b) != b)
        {
            BoosterFragment.g(b.b, BoosterFragment.z(b.b));
            return;
        } else
        {
            BoosterFragment.g(b.b, BoosterFragment.z(b.b));
            return;
        }
    }

    ( , int i)
    {
        b = ;
        a = i;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/main/BoosterFragment$6

/* anonymous class */
    class BoosterFragment._cls6
        implements c.a
    {

        final BoosterFragment a;

        public void a(int i)
        {
            while (!a.a(a) || !a.isAdded() || BoosterFragment.p(a) == null) 
            {
                return;
            }
            BoosterFragment.p(a).post(new BoosterFragment._cls6._cls1(this, i));
        }

            
            {
                a = boosterfragment;
                super();
            }
    }

}
