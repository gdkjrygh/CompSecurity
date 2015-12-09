// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.widget.RelativeLayout;

// Referenced classes of package com.jcp.fragments:
//            gw

class gz
    implements Runnable
{

    final int a;
    final RelativeLayout b;
    final gw c;

    gz(gw gw1, int i, RelativeLayout relativelayout)
    {
        c = gw1;
        a = i;
        b = relativelayout;
        super();
    }

    public void run()
    {
        gw.a(c, a - b.getHeight());
    }
}
