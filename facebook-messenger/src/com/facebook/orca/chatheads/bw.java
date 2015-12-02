// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


// Referenced classes of package com.facebook.orca.chatheads:
//            al, am

abstract class bw
    implements Runnable
{

    final al d;

    private bw(al al1)
    {
        d = al1;
        super();
    }

    bw(al al1, am am)
    {
        this(al1);
    }

    protected abstract void a();

    public final void run()
    {
        if (al.a(d))
        {
            return;
        } else
        {
            a();
            return;
        }
    }
}
