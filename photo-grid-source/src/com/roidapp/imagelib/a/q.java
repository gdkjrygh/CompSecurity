// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.roidapp.imagelib.c;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class q
    implements Runnable
{

    final i a;

    q(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        if (a.isAdded())
        {
            android.view.animation.Animation animation = AnimationUtils.loadAnimation(i.d(a).getContext(), c.a);
            i.d(a).clearAnimation();
            i.d(a).startAnimation(animation);
            if (i.d(a).isShown())
            {
                i.d(a).setVisibility(8);
                return;
            }
        }
    }
}
