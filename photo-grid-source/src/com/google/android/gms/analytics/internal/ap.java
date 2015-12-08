// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            am

final class ap
    implements Runnable
{

    final am a;

    ap(am am1)
    {
        a = am1;
        super();
    }

    public final void run()
    {
        a.c();
    }
}
