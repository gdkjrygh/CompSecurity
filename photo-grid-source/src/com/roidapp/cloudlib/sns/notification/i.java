// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.view.View;
import com.roidapp.cloudlib.sns.basepost.v;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f

final class i extends v
{

    final int d;
    final f e;

    i(f f1, int j, int k, long l, int i1)
    {
        e = f1;
        d = i1;
        super(j, k, l, 4097);
    }

    public final void onClick(View view)
    {
        if (f.c(e) != null)
        {
            view.setTag(Integer.valueOf(d));
            view.setId(4097);
            f.c(e).onClick(view);
        }
        super.onClick(view);
    }
}
