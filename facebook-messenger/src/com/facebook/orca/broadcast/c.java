// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;


// Referenced classes of package com.facebook.orca.broadcast:
//            q, i, BroadcastActivity

class c
    implements q
{

    final BroadcastActivity a;

    c(BroadcastActivity broadcastactivity)
    {
        a = broadcastactivity;
        super();
    }

    public void a()
    {
        BroadcastActivity.a(a, i.CONTACT_MULTIPICKER);
    }
}
