// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;

import android.os.Message;
import com.qihoo.security.opti.b.d;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            CleanupFragment

class a extends Thread
{

    final a a;
    final CleanupFragment b;

    public void run()
    {
        int i = 2;
        int j = d.a(CleanupFragment.k(b));
        if (j >= 2)
        {
            i = j;
        }
        a.endMessage(Message.obtain(a, 3, i, 0));
    }

    (CleanupFragment cleanupfragment,  )
    {
        b = cleanupfragment;
        a = ;
        super();
    }
}
