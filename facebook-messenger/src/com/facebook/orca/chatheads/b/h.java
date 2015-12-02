// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;


// Referenced classes of package com.facebook.orca.chatheads.b:
//            f, j

class h
    implements Runnable
{

    final j a;
    final f b;

    h(f f1, j j1)
    {
        b = f1;
        a = j1;
        super();
    }

    public void run()
    {
        b.c();
        if (a != null)
        {
            a.a();
        }
    }
}
