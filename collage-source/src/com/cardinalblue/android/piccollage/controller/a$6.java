// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

class a
    implements i
{

    final a a;

    public Void a(j j1)
        throws Exception
    {
        File file1 = com.cardinalblue.android.piccollage.controller.a.d(a);
        File file = file1;
        k.a("nvdciuewkbnbdsgydsg", (File)j1.e(), file1);
        file = file1;
        k.a(file1, com.cardinalblue.android.piccollage.controller.a.e(a));
        if (file1 != null)
        {
            file1.delete();
        }
_L2:
        return null;
        j1;
        file1 = null;
_L5:
        file = file1;
        f.a(j1);
        if (file1 == null) goto _L2; else goto _L1
_L1:
        file1.delete();
        return null;
        j1;
        file = null;
_L4:
        if (file != null)
        {
            file.delete();
        }
        throw j1;
        j1;
        if (true) goto _L4; else goto _L3
_L3:
        j1;
          goto _L5
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
