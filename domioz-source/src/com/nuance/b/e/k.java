// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.am;
import com.nuance.b.b.a.an;
import com.nuance.b.b.a.ao;
import com.nuance.b.b.bx;
import com.nuance.b.e.a.d;

// Referenced classes of package com.nuance.b.e:
//            c

final class k
    implements am
{

    final c a;

    k(c c1)
    {
        a = c1;
        super();
    }

    private void a()
    {
        c.a(a, d.i);
        c.f().b(this);
    }

    public final void onRecordingError(ak ak)
    {
        a();
    }

    public final void onRecordingStarted(an an)
    {
    }

    public final void onRecordingStopped(ao ao)
    {
        a();
    }
}
