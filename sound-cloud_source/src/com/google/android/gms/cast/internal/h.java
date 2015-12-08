// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            e, ApplicationStatus

final class h
    implements Runnable
{

    final e a;
    final ApplicationStatus b;
    final e.b c;

    h(e.b b1, e e1, ApplicationStatus applicationstatus)
    {
        c = b1;
        a = e1;
        b = applicationstatus;
        super();
    }

    public final void run()
    {
        e.a(a, b);
    }
}
