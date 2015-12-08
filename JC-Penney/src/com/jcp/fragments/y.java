// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.widget.RelativeLayout;

// Referenced classes of package com.jcp.fragments:
//            u

class y
    implements Runnable
{

    final int a;
    final RelativeLayout b;
    final u c;

    y(u u1, int i, RelativeLayout relativelayout)
    {
        c = u1;
        a = i;
        b = relativelayout;
        super();
    }

    public void run()
    {
        u.a(c, a - b.getHeight());
    }
}
