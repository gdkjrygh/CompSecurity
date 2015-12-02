// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            av, w

class bd
    implements Runnable
{

    final w a;
    final av b;

    bd(av av1, w w)
    {
        b = av1;
        a = w;
        super();
    }

    public void run()
    {
        av.a(b, a);
    }
}
