// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.view.View;
import com.a.a.a;
import com.a.a.c;

// Referenced classes of package com.facebook.orca.threadlist:
//            i

class j extends c
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void b(a a1)
    {
        if (com.facebook.orca.threadlist.i.a(a) == i.b(a))
        {
            com.facebook.orca.threadlist.i.c(a).setVisibility(8);
            i.d(a).clearAnimation();
        } else
        {
            com.facebook.orca.threadlist.i.c(a).setVisibility(0);
            if (com.facebook.orca.threadlist.i.a(a) == 0)
            {
                i.d(a).clearAnimation();
                return;
            }
        }
    }
}
