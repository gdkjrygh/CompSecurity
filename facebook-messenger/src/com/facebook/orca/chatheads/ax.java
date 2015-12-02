// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


// Referenced classes of package com.facebook.orca.chatheads:
//            al

class ax
    implements Runnable
{

    final al a;

    ax(al al1)
    {
        a = al1;
        super();
    }

    public void run()
    {
        if (a.e() || !al.l(a))
        {
            return;
        } else
        {
            al.m(a);
            return;
        }
    }
}
