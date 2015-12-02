// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.actionbarsherlock.a.b;
import com.actionbarsherlock.widget.c;
import com.facebook.i;
import com.facebook.orca.chatheads.a.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh

class dj
    implements c
{

    final dh a;

    dj(dh dh1)
    {
        a = dh1;
        super();
    }

    public boolean a(b b1)
    {
        if (b1.d() == i.open_full_view)
        {
            dh.k(a);
            return true;
        }
        if (b1.d() == i.refresh)
        {
            dh.l(a);
            return true;
        } else
        {
            return dh.m(a).a(new a(b1));
        }
    }
}
