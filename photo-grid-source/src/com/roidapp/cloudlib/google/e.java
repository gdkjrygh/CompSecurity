// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.Intent;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity, d

final class e
    implements Runnable
{

    final GoogleAuthActivity a;
    final Intent b;
    final d c;

    e(d d, GoogleAuthActivity googleauthactivity, Intent intent)
    {
        c = d;
        a = googleauthactivity;
        b = intent;
        super();
    }

    public final void run()
    {
        if (!a.isFinishing())
        {
            a.startActivityForResult(b, 21588);
        }
    }
}
