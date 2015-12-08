// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.view.g;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            g

class a
    implements i
{

    final com.cardinalblue.android.piccollage.lib.g a;

    public Void a(j j1)
        throws Exception
    {
        j1 = (File)j1.e();
        if (j1 != null && j1.exists())
        {
            g.b(a).a(j1);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (com.cardinalblue.android.piccollage.lib.g g1)
    {
        a = g1;
        super();
    }
}
