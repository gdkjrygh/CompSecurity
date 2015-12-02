// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements a
{

    final CleanupFragment a;

    public void a(String s)
    {
        if (!a.isAdded())
        {
            return;
        } else
        {
            CleanupFragment.b(a).runOnUiThread(new Runnable(s) {

                final String a;
                final CleanupFragment._cls16 b;

                public void run()
                {
                    if (!b.a.isAdded())
                    {
                        return;
                    } else
                    {
                        CleanupFragment.f(b.a).setText(a);
                        return;
                    }
                }

            
            {
                b = CleanupFragment._cls16.this;
                a = s;
                super();
            }
            });
            return;
        }
    }

    _cls1.a(CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }
}
