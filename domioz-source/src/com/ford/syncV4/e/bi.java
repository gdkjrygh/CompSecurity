// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ak;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bi
    implements Runnable
{

    final ak a;
    final j b;

    bi(j j1, ak ak)
    {
        b = j1;
        a = ak;
        super();
    }

    public final void run()
    {
        j.e(b).onOnLanguageChange(a);
    }
}
