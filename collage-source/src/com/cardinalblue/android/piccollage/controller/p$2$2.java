// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.h;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.gson.IBackground;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            a, p

class b
    implements i
{

    final h a;
    final f b;
    final a c;

    public Void a(j j)
        throws Exception
    {
        com.cardinalblue.android.piccollage.controller.a.a().h();
        a.a(Integer.valueOf(((Integer)a.a()).intValue() + p.a(c.c, b)));
        if (((Integer)a.a()).intValue() <= 0)
        {
            com.cardinalblue.android.piccollage.a.b.o("no purchases");
        }
        return null;
    }

    public Object then(j j)
        throws Exception
    {
        return a(j);
    }

    a(a a1, h h1, f f)
    {
        c = a1;
        a = h1;
        b = f;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/p$2

/* anonymous class */
    class p._cls2
        implements com.cardinalblue.android.piccollage.iab.util.d.e
    {

        final p a;

        public void a(e e1, f f1)
        {
            p.a(a, "StickerBundleRestoreClient", "Query inventory finished.");
            if (e1.d())
            {
                p.a(a, "StickerBundleRestoreClient", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
                com.cardinalblue.android.piccollage.a.b.o("iap failed");
                com.cardinalblue.android.piccollage.controller.p.b(a);
                return;
            }
            p.a(a, "StickerBundleRestoreClient", "Query inventory was successful.");
            h h1 = new h(Integer.valueOf(0));
            a a1 = com.cardinalblue.android.piccollage.controller.a.a();
            Object obj = a1.c();
            e1 = null;
            j j1 = j.a(Boolean.valueOf(true));
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                IBackground ibackground = (IBackground)((Iterator) (obj)).next();
                if ((ibackground instanceof PurchasableBackground) && f1.a(((PurchasableBackground)ibackground).getPurchaseInfo().l()) != null)
                {
                    j1 = a1.a(((PurchasableBackground)ibackground).getPurchaseInfo());
                    if (e1 != null)
                    {
                        e1.b(new p._cls2._cls1(j1));
                    } else
                    {
                        e1 = j1;
                    }
                    h1.a(Integer.valueOf(((Integer)h1.a()).intValue() + 1));
                }
            } while (true);
            j1.a(new p._cls2._cls2(this, h1, f1));
        }

            
            {
                a = p1;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/controller/p$2$1

/* anonymous class */
        class p._cls2._cls1
            implements i
        {

            final j a;
            final p._cls2 b;

            public j a(j j1)
                throws Exception
            {
                return a;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

                    
                    {
                        b = p._cls2.this;
                        a = j1;
                        super();
                    }
        }

    }

}
