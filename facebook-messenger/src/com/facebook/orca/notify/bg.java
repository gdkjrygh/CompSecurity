// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            av, ao

class bg
    implements Runnable
{

    final ao a;
    final av b;

    bg(av av1, ao ao)
    {
        b = av1;
        a = ao;
        super();
    }

    public void run()
    {
        av.a(b, a);
    }
}
