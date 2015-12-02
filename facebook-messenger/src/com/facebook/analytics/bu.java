// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;


// Referenced classes of package com.facebook.analytics:
//            bt

class bu
    implements Runnable
{

    final long a;
    final bt b;

    bu(bt bt1, long l)
    {
        b = bt1;
        a = l;
        super();
    }

    public void run()
    {
        bt.a(b, a);
    }
}
