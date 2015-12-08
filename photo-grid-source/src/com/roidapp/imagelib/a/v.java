// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.widget.ImageView;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, ah

final class v
    implements Runnable
{

    final i a;

    v(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        if (i.l(a) != null && !i.l(a).k())
        {
            i.n(a).setVisibility(8);
            i.n(a).startAnimation(i.x(a));
        }
    }
}
