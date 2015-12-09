// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.an;
import com.nuance.b.b.a.ao;
import com.nuance.b.c.j;

// Referenced classes of package com.nuance.b.b:
//            ct

final class dg
    implements j
{

    private final ct a;

    public dg(ct ct1)
    {
        a = ct1;
    }

    public final void a(Object obj)
    {
        if (obj instanceof an)
        {
            a.onRecordingStarted((an)obj);
        } else
        {
            if (obj instanceof ao)
            {
                a.onRecordingStopped((ao)obj);
                return;
            }
            if (obj instanceof ak)
            {
                a.onRecordingError((ak)obj);
                return;
            }
        }
    }
}
