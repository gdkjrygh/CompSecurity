// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class a
    implements i
{

    final o a;

    public InstalledStickerBundle a(j j1)
        throws Exception
    {
        o.c(a).set(false);
        if (j1.c())
        {
            b.G("cancel");
            o.a(a, a.e, null);
            return null;
        }
        if (j1.d() || j1.e() == null)
        {
            b.G("fail");
            o.a(a, a.d, Integer.valueOf(0x7f0700f8));
            return null;
        }
        j1 = (InstalledStickerBundle)j1.e();
        b.G("success");
        o.a(a, a.c, j1);
        int k = o.d(a).indexOf(j1);
        if (k >= 0)
        {
            o.d(a).set(k, j1);
        } else
        {
            f.a(new IllegalStateException((new StringBuilder()).append(j1).append(" should be find in sticker bundle list").toString()));
        }
        o.a(a, com.cardinalblue.android.piccollage.controller.a.f, j1.f());
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    StickerBundle(o o1)
    {
        a = o1;
        super();
    }
}
