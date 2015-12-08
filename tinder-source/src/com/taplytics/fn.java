// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            fm, em

final class fn
    implements Runnable
{

    final fm a;

    fn(fm fm1)
    {
        a = fm1;
        super();
    }

    public final void run()
    {
        a.b.a(a.a);
    }
}
