// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.app.Activity;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a
    implements com.qihoo.security.malware.widget.
{

    final CleanupFragment a;

    public void a()
    {
        CleanupFragment.b(a).runOnUiThread(new Runnable() {

            final CleanupFragment._cls1 a;

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

            
            {
                a = CleanupFragment._cls1.this;
                super();
            }
        });
    }

    public void a(float f)
    {
    }

    _cls1.a(CleanupFragment cleanupfragment)
    {
        a = cleanupfragment;
        super();
    }
}
