// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity, d

final class g
    implements Runnable
{

    final GoogleAuthActivity a;
    final Bundle b;
    final d c;

    g(d d, GoogleAuthActivity googleauthactivity, Bundle bundle)
    {
        c = d;
        a = googleauthactivity;
        b = bundle;
        super();
    }

    public final void run()
    {
        if (!a.isFinishing())
        {
            Intent intent = a.getIntent();
            intent.putExtra("signData", b);
            a.setResult(-1, intent);
            a.finish();
        }
    }
}
