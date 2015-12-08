// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import com.google.bionics.goggles.api2.i;
import com.google.bionics.goggles.api2.s;
import com.google.f.e.l;
import java.util.ArrayList;

// Referenced classes of package com.google.android.goggles.b:
//            c

final class d
    implements com.google.android.apps.gsa.a.c.d
{

    final c a;
    private int b;

    d(c c1)
    {
        a = c1;
        super();
        b = 0;
    }

    public final l b()
    {
        l l1 = null;
        b;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 105;
           goto _L1 _L2
_L1:
        if (b <= a.b)
        {
            Object obj = a.c;
            int j = b;
            l1 = new l();
            obj = (i)((ArrayList) (obj)).get(j);
            l1.a(true);
            (new l()).a(true).setExtension(s.d, obj);
        }
_L4:
        b = b + 1;
        return l1;
_L2:
        l1 = (new l()).a(true).a("visualsearch-logging");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void close()
    {
        b = a.a;
    }
}
