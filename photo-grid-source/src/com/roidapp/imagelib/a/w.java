// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.widget.RelativeLayout;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class w
    implements Runnable
{

    final i a;

    w(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        i.t(a).setVisibility(8);
        i.t(a).startAnimation(i.x(a));
    }
}
