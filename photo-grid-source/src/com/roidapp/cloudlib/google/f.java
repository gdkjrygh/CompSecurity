// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity, d

final class f
    implements Runnable
{

    final GoogleAuthActivity a;
    final d b;

    f(d d, GoogleAuthActivity googleauthactivity)
    {
        b = d;
        a = googleauthactivity;
        super();
    }

    public final void run()
    {
        if (!a.isFinishing())
        {
            an.a(aj.a(), at.i);
            a.setResult(0, a.getIntent());
            a.finish();
        }
    }
}
