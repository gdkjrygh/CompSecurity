// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.am;

// Referenced classes of package com.nuance.b.b:
//            ct

final class cv
    implements Runnable
{

    final am a;
    final ak b;
    final ct c;

    cv(ct ct, am am1, ak ak)
    {
        c = ct;
        a = am1;
        b = ak;
        super();
    }

    public final void run()
    {
        a.onRecordingError(b);
    }
}
