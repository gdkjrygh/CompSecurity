// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Intent;
import com.facebook.c.s;

// Referenced classes of package com.facebook.selfupdate:
//            af

class ag
    implements Runnable
{

    final Intent a;
    final af b;

    ag(af af1, Intent intent)
    {
        b = af1;
        a = intent;
        super();
    }

    public void run()
    {
        af.b(b).a(a, af.a(b));
    }
}
