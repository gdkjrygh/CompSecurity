// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            e

final class f
    implements Runnable
{

    final e a;
    final int b;
    final e.b c;

    f(e.b b1, e e1, int i)
    {
        c = b1;
        a = e1;
        b = i;
        super();
    }

    public final void run()
    {
        if (e.d(a) != null)
        {
            e.d(a).onApplicationDisconnected(b);
        }
    }
}
