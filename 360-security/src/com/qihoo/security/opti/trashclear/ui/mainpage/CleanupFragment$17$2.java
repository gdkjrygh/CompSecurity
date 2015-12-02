// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.malware.widget.RadarProgressBar;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements Runnable
{

    final a a;

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

    b(b b)
    {
        a = b;
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
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls17._cls2(this));
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
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls17._cls1(i, j));
                return;
            }
        }

            
            {
                a = cleanupfragment;
                super();
            }

        // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1

/* anonymous class */
        class CleanupFragment._cls17._cls1
            implements Runnable
        {

            final int a;
            final int b;
            final CleanupFragment._cls17 c;

            public void run()
            {
                if (!c.a.isAdded() || CleanupFragment.g(c.a) == null || CleanupFragment.g(c.a).b())
                {
                    return;
                } else
                {
                    float f = (float)a / 100F;
                    CleanupFragment.h(c.a).a(CleanupFragment.h(c.a).getProgress(), f * 360F, b, null);
                    return;
                }
            }

                    
                    {
                        c = CleanupFragment._cls17.this;
                        a = i;
                        b = j;
                        super();
                    }
        }

    }

}
