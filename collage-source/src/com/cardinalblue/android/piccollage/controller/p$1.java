// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            p

class a
    implements com.cardinalblue.android.piccollage.iab.util._cls1
{

    final p a;

    public void a(e e1)
    {
        p.a(a, "StickerBundleRestoreClient", "Setup finished.");
        if (!e1.c())
        {
            p.a(a, "StickerBundleRestoreClient", (new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString());
            return;
        } else
        {
            p.a(a, "StickerBundleRestoreClient", "Setup successful. Querying inventory.");
            p.a(a).a(false, a.a);
            return;
        }
    }

    (p p1)
    {
        a = p1;
        super();
    }
}
