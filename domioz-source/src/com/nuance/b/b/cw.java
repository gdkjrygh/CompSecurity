// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.am;
import com.nuance.b.b.a.an;

// Referenced classes of package com.nuance.b.b:
//            ct

final class cw
    implements Runnable
{

    final am a;
    final an b;
    final ct c;

    cw(ct ct, am am1, an an)
    {
        c = ct;
        a = am1;
        b = an;
        super();
    }

    public final void run()
    {
        a.onRecordingStarted(b);
    }
}
