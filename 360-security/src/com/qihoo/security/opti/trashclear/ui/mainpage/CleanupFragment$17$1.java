// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.malware.widget.RadarProgressBar;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class b
    implements Runnable
{

    final int a;
    final int b;
    final b c;

    public void run()
    {
        if (!c.c.isAdded() || CleanupFragment.g(c.c) == null || CleanupFragment.g(c.c).c())
        {
            return;
        } else
        {
            float f = (float)a / 100F;
            CleanupFragment.h(c.c).a(CleanupFragment.h(c.c).getProgress(), f * 360F, b, null);
            return;
        }
    }

    a(a a1, int i, int j)
    {
        c = a1;
        a = i;
        b = j;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17

/* anonymous class */
    class CleanupFragment._cls17
        implements CleanupFragment.d
    {

        final CleanupFragment a;

        public void a()
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls17._cls2());
                return;
            }
        }

        public void a(int i, int j)
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls17._cls1(this, i, j));
                return;
            }
        }

            
            {
                a = cleanupfragment;
                super();
            }

        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2

/* anonymous class */
        class CleanupFragment._cls17._cls2
            implements Runnable
        {

            final CleanupFragment._cls17 a;

            public void run()
            {
                if (!a.a.isAdded())
                {
                    return;
                } else
                {
                    CleanupFragment.h(a.a).a(CleanupFragment.h(a.a).getProgress(), 360F, 1000, CleanupFragment.i(a.a));
                    return;
                }
            }

                    
                    {
                        a = CleanupFragment._cls17.this;
                        super();
                    }
        }

    }

}
