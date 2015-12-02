// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements Runnable
{

    final String a;
    final a b;

    public void run()
    {
        if (!b.b.isAdded())
        {
            return;
        } else
        {
            CleanupFragment.f(b.b).setText(a);
            return;
        }
    }

    I(I i, String s)
    {
        b = i;
        a = s;
        super();
    }

    // Unreferenced inner class com/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16

/* anonymous class */
    class CleanupFragment._cls16
        implements CleanupFragment.h
    {

        final CleanupFragment a;

        public void a(String s)
        {
            if (!a.isAdded())
            {
                return;
            } else
            {
                CleanupFragment.b(a).runOnUiThread(new CleanupFragment._cls16._cls1(this, s));
                return;
            }
        }

            
            {
                a = cleanupfragment;
                super();
            }
    }

}
