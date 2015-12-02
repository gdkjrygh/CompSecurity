// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


// Referenced classes of package com.facebook.orca.chatheads:
//            dh, ek

class do
    implements Runnable
{

    final dh a;

    do(dh dh1)
    {
        a = dh1;
        super();
    }

    public void run()
    {
        if (dh.d(a) != null)
        {
            dh.d(a).b();
            dh.d(a).c();
        }
    }
}
