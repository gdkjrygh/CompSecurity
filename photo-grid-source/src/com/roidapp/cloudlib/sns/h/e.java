// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            a

final class e
    implements Runnable
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (com.roidapp.cloudlib.sns.h.a.f(a) != null)
        {
            com.roidapp.cloudlib.sns.h.a.f(a).setClickable(false);
        }
    }
}
