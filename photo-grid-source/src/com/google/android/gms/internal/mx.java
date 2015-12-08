// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzn;

// Referenced classes of package com.google.android.gms.internal:
//            mv, wb, rf

final class mx
    implements Runnable
{

    final rf a;
    final String b;
    final mv c;

    mx(mv mv1, rf rf1, String s)
    {
        c = mv1;
        a = rf1;
        b = s;
        super();
    }

    public final void run()
    {
        a.b(mv.a(c).zzbo().get(b));
    }
}
