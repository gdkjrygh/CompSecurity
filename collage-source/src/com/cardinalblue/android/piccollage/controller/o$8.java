// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.util.Log;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class a
    implements com.cardinalblue.android.piccollage.iab.util._cls8
{

    final o a;

    public void a(List list, List list1)
    {
        Log.v("StickerBundleManager", (new StringBuilder()).append("Consumption finished. Purchase: ").append(list).append(", result: ").append(list1).toString());
        Log.v("StickerBundleManager", "End consumption flow.");
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
