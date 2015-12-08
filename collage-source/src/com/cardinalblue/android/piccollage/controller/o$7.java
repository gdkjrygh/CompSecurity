// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.util.Log;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o, a

class a
    implements com.cardinalblue.android.piccollage.iab.util._cls7
{

    final o a;

    public void a(e e1, f f1)
    {
        Log.v("StickerBundleManager", "Query inventory finished.");
        if (e1.d())
        {
            Log.v("StickerBundleManager", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
            return;
        }
        Log.v("StickerBundleManager", "Query inventory was successful.");
        Object obj = o.a().g();
        e1 = new ArrayList();
        Object obj1 = f1.a("com.cardinalblue.piccollage.watermark");
        if (obj1 != null)
        {
            e1.add(obj1);
        }
        obj1 = com.cardinalblue.android.piccollage.controller.a.a().d().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.iab.util.g g = f1.a(((PurchasableBackground)((Iterator) (obj1)).next()).getPurchaseInfo().l());
            if (g != null)
            {
                e1.add(g);
            }
        } while (true);
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj2 = (StickerBundle)((Iterator) (obj)).next();
                if (!((StickerBundle) (obj2)).i() && (obj2 instanceof PurchasableStickerBundle))
                {
                    obj2 = f1.a(((StickerBundle) (obj2)).l());
                    if (obj2 != null)
                    {
                        e1.add(obj2);
                    }
                }
            } while (true);
            o.b(a).a(e1, a.b);
        }
        Log.v("StickerBundleManager", "Initial inventory query finished; enabling main UI.");
    }

    ndle(o o1)
    {
        a = o1;
        super();
    }
}
