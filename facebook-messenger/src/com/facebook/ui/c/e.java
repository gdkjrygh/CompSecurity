// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.c;

import com.facebook.o;
import com.facebook.ui.i.g;

// Referenced classes of package com.facebook.ui.c:
//            d

class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        g.a(d.a(a), o.low_disk_space_warning_message);
    }
}
