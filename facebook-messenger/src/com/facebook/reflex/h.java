// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.facebook.common.d.e;

// Referenced classes of package com.facebook.reflex:
//            g

class h
    implements Runnable
{

    final e a;
    final g b;

    h(g g, e e1)
    {
        b = g;
        a = e1;
        super();
    }

    public void run()
    {
        a.a();
    }
}
