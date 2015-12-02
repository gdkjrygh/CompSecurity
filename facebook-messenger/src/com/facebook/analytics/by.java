// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;


// Referenced classes of package com.facebook.analytics:
//            bt, ak, bu

class by
    implements Runnable
{

    final bt a;

    private by(bt bt1)
    {
        a = bt1;
        super();
    }

    by(bt bt1, bu bu)
    {
        this(bt1);
    }

    public void run()
    {
        bt.a(a, bt.c(a).a());
    }
}
