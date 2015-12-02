// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements Runnable
{

    final int a;
    final a b;

    public void run()
    {
        if (b.b.isAdded() && b.b.a(b.b))
        {
            if (CleanupFragment.e(b.b) == 0)
            {
                CleanupFragment.a(b.b, a);
                return;
            }
            if (CleanupFragment.e(b.b) == 2)
            {
                CleanupFragment.b(b.b, a);
                CleanupFragment.c(b.b, a);
                return;
            }
        }
    }

    I(I i, int j)
    {
        b = i;
        a = j;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$15

/* anonymous class */
    class CleanupFragment._cls15
        implements com.qihoo.security.ui.main.c.a
    {

        final CleanupFragment a;

        public void a(int i)
        {
            if (!a.a(a) || !a.isAdded())
            {
                return;
            } else
            {
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls15._cls1(this, i));
                return;
            }
        }

            
            {
                a = cleanupfragment;
                super();
            }
    }

}
