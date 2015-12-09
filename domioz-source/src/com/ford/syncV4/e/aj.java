// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.z;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class aj
    implements Runnable
{

    final z a;
    final j b;

    aj(j j1, z z)
    {
        b = j1;
        a = z;
        super();
    }

    public final void run()
    {
        j.e(b).onListFilesResponse(a);
    }
}
