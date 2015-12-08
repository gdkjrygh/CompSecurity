// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ot, oj, pa

final class ou
    implements Runnable
{

    final pa a;
    final ot b;

    ou(ot ot1, pa pa)
    {
        b = ot1;
        a = pa;
        super();
    }

    public final void run()
    {
        ot.a(b).zzb(a);
    }
}
