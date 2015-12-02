// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


// Referenced classes of package com.facebook.orca.notify:
//            r, j

class l
    implements Runnable
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    public void run()
    {
        j.a(a, r.SLIDE_OUT);
    }
}
