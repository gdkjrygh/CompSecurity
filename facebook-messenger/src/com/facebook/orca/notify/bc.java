// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            i, av

class bc
    implements Runnable
{

    final String a;
    final av b;

    bc(av av1, String s)
    {
        b = av1;
        a = s;
        super();
    }

    public void run()
    {
        av.a(b, new i(a));
    }
}
