// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;


// Referenced classes of package com.android.slyce.a:
//            d, aj

class e
    implements Runnable
{

    final aj a;
    final d b;

    e(d d1, aj aj)
    {
        b = d1;
        a = aj;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}
