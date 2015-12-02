// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;

// Referenced classes of package com.facebook.orca.d:
//            af

class al
    implements Runnable
{

    final Runnable a;
    final af b;

    al(af af1, Runnable runnable)
    {
        b = af1;
        a = runnable;
        super();
    }

    public void run()
    {
        af.e(b);
        if (a != null)
        {
            af.f(b).post(a);
        }
    }
}
