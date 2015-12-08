// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;


// Referenced classes of package com.roidapp.baselib.hlistview:
//            AdapterView

final class v
    implements Runnable
{

    final AdapterView a;

    private v(AdapterView adapterview)
    {
        a = adapterview;
        super();
    }

    v(AdapterView adapterview, byte byte0)
    {
        this(adapterview);
    }

    public final void run()
    {
        if (a.aj)
        {
            if (a.p() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            AdapterView.b(a);
            AdapterView.c(a);
            return;
        }
    }
}
