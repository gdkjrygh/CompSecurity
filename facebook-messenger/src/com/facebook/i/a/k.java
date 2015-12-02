// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.Handler;

// Referenced classes of package com.facebook.i.a:
//            d, l, a

class k
    implements android.os.IBinder.DeathRecipient
{

    final a a;
    final d b;

    k(d d1, a a1)
    {
        b = d1;
        a = a1;
        super();
    }

    public void binderDied()
    {
        d.b(b).post(new l(this));
    }
}
