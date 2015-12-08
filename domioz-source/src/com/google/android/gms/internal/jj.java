// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.z;

// Referenced classes of package com.google.android.gms.internal:
//            ji

final class jj
    implements z
{

    final ji a;

    jj(ji ji1)
    {
        a = ji1;
        super();
    }

    public final void a(int i)
    {
        ji ji1 = a;
        i;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 37;
           goto _L1 _L2
_L1:
        ji1.a(new Status(i));
        return;
_L2:
        i = 13;
        if (true) goto _L1; else goto _L3
_L3:
    }
}
