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

    final a a;

    public void run()
    {
        if (CleanupFragment.a(a.a) || !a.a.isAdded())
        {
            return;
        } else
        {
            CleanupFragment.a(a.a, false);
            return;
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$1

/* anonymous class */
    class CleanupFragment._cls1
        implements com.qihoo.security.malware.widget.RadarProgressBar.a
    {

        final CleanupFragment a;

        public void a()
        {
            CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls1._cls1(this));
        }

        public void a(float f)
        {
        }

            
            {
                a = cleanupfragment;
                super();
            }
    }

}
