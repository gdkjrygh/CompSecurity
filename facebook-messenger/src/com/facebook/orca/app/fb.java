// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.util.Printer;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.orca.app:
//            fa

class fb
    implements Printer
{

    final fa a;

    fb(fa fa)
    {
        a = fa;
        super();
    }

    public void println(String s)
    {
        if (b.b(2))
        {
            e.b(s);
        }
    }
}
