// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.am;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class be
    implements Runnable
{

    final am a;
    final j b;

    be(j j1, am am)
    {
        b = j1;
        a = am;
        super();
    }

    public final void run()
    {
        j.e(b).onOnPermissionsChange(a);
    }
}
