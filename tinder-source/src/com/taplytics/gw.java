// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            hc, gs, gt

final class gw
    implements hc
{

    final gt a;

    gw(gt gt)
    {
        a = gt;
        super();
    }

    public final void a(Exception exception)
    {
        if (exception != null)
        {
            gs.b("Deleting TLProperties From Disk", exception);
        }
    }
}
