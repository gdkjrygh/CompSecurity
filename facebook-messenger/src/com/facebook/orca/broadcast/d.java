// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import com.facebook.widget.titlebar.b;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.broadcast:
//            BroadcastActivity, i

class d extends b
{

    final BroadcastActivity a;

    d(BroadcastActivity broadcastactivity)
    {
        a = broadcastactivity;
        super();
    }

    public void a(com.facebook.widget.titlebar.d d1)
    {
        boolean flag1 = true;
        boolean flag = true;
        switch (d1.a())
        {
        default:
            return;

        case 1: // '\001'
            if (BroadcastActivity.c(a) != i.COMPOSE_BROADCAST)
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            BroadcastActivity.d(a);
            return;

        case 2: // '\002'
            break;
        }
        if (BroadcastActivity.c(a) == i.CONTACT_MULTIPICKER)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        BroadcastActivity.e(a);
        a.onBackPressed();
    }
}
