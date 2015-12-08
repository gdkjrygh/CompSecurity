// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.am;
import com.nuance.b.b.a.ao;

// Referenced classes of package com.nuance.b.b:
//            ct

final class cu
    implements Runnable
{

    final am a;
    final ao b;
    final ct c;

    cu(ct ct, am am1, ao ao)
    {
        c = ct;
        a = am1;
        b = ao;
        super();
    }

    public final void run()
    {
        a.onRecordingStopped(b);
    }
}
