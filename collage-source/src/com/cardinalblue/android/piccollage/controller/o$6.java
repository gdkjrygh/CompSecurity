// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.util.Log;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class a
    implements com.cardinalblue.android.piccollage.iab.util._cls6
{

    final o a;

    public void a(e e1)
    {
        Log.v("StickerBundleManager", "Setup finished.");
        if (!e1.c())
        {
            Log.v("StickerBundleManager", (new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString());
        } else
        if (o.b(a) != null)
        {
            Log.v("StickerBundleManager", "Setup successful. Querying inventory.");
            try
            {
                o.b(a).a(a.a);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                f.a(e1);
            }
            return;
        }
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
