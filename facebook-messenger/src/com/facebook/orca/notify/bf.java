// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            av, bi

class bf
    implements Runnable
{

    final bi a;
    final av b;

    bf(av av1, bi bi)
    {
        b = av1;
        a = bi;
        super();
    }

    public void run()
    {
        av.a(b, a);
    }
}
