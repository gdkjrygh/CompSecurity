// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            pa, oj, pb

final class ok
    implements Runnable
{

    final pb a;
    final oj b;

    ok(oj oj1, pb pb)
    {
        b = oj1;
        a = pb;
        super();
    }

    public final void run()
    {
        b.zzb(new pa(a));
    }
}
