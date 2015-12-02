// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;

import android.graphics.Point;

// Referenced classes of package com.facebook.orca.chatheads.b:
//            k, e

class l
    implements Runnable
{

    final Point a;
    final e b;
    final k c;

    l(k k1, Point point, e e)
    {
        c = k1;
        a = point;
        b = e;
        super();
    }

    public void run()
    {
        k.a(c, a, b);
    }
}
