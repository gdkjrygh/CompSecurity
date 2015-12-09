// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a

class a
    implements i
{

    final a a;

    public InstalledStickerBundle a(j j1)
        throws Exception
    {
        com.cardinalblue.android.piccollage.controller.a.b(a).set(false);
        if (j1.c())
        {
            b.G("cancel");
            com.cardinalblue.android.piccollage.controller.a.a(a, a.e, null);
            return null;
        }
        if (j1.d() || j1.e() == null)
        {
            b.G("fail");
            com.cardinalblue.android.piccollage.controller.a.a(a, a.d, Integer.valueOf(0x7f0700f8));
            return null;
        } else
        {
            com.cardinalblue.android.piccollage.controller.a.a(a, (InstalledStickerBundle)j1.e());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    StickerBundle(a a1)
    {
        a = a1;
        super();
    }
}
