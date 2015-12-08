// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            hh, gs, gt

final class gu
    implements hh
{

    final gt a;

    gu(gt gt)
    {
        a = gt;
        super();
    }

    public final void a(Exception exception)
    {
        if (exception != null)
        {
            gs.b("Writing JSON to Disk: ", exception);
        }
    }
}
