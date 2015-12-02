// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import com.facebook.widget.images.e;

// Referenced classes of package com.facebook.orca.camera:
//            s

class t
    implements Runnable
{

    final e a;
    final boolean b;
    final s c;

    t(s s1, e e, boolean flag)
    {
        c = s1;
        a = e;
        b = flag;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
