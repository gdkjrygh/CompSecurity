// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.widget.ScrollView;
import android.widget.Scroller;

// Referenced classes of package com.jcp.views:
//            aa

class ab
    implements Runnable
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public void run()
    {
        if (aa.a(a).computeScrollOffset())
        {
            aa.b(a).scrollTo(aa.a(a).getCurrX(), aa.a(a).getCurrY());
        }
        if (!aa.a(a).isFinished())
        {
            aa.b(a).post(this);
        }
    }
}
