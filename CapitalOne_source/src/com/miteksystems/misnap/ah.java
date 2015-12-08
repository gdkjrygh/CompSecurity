// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            u, b

final class ah
    implements Runnable
{

    final u a;

    ah(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        if (u.h(a) != null && u.h(a).a())
        {
            u.h(a).c();
        }
        u.i(a).setVisibility(4);
        u.c(a);
    }
}
