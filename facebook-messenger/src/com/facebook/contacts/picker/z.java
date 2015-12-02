// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.debug.log.b;
import com.facebook.widget.a.h;
import com.facebook.widget.a.j;

// Referenced classes of package com.facebook.contacts.picker:
//            x, ab

class z
    implements h
{

    final ab a;
    final x b;

    z(x x1, ab ab1)
    {
        b = x1;
        a = ab1;
        super();
    }

    public void a(int i)
    {
    }

    public void a(j j)
    {
        com.facebook.debug.log.b.a(x.a(), "Received friends filtering state: %s", new Object[] {
            j
        });
        a.a(j);
        x.a(b);
    }
}
