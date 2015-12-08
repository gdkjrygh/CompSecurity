// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            v, GCMReceiver

final class i
    implements v.a
{

    final String a;
    final GCMReceiver b;

    i(GCMReceiver gcmreceiver, String s)
    {
        b = gcmreceiver;
        a = s;
        super();
    }

    public final void a(v v1)
    {
        v1.c().a(a);
    }
}
