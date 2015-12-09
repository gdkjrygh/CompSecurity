// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.util.Log;
import com.cardinalblue.android.piccollage.events.k;
import com.cardinalblue.android.piccollage.events.l;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.iab.util.f;
import com.cardinalblue.android.piccollage.iab.util.g;
import com.squareup.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements com.cardinalblue.android.piccollage.iab.util._cls1
{

    final g a;
    final b b;

    public void a(e e1, f f1)
    {
        Log.v("Editor", "Query inventory finished.");
        if (e1.d())
        {
            Log.v("Editor", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
        } else
        {
            Log.v("Editor", "Query inventory was successful.");
            e1 = f1.a(b.b.a());
            if (a != null)
            {
                PhotoProtoActivity.A(b.b).a(e1, null);
                return;
            }
        }
    }

    ( , g g)
    {
        b = ;
        a = g;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$38

/* anonymous class */
    class PhotoProtoActivity._cls38
        implements com.cardinalblue.android.piccollage.iab.util.d.c
    {

        final k a;
        final PhotoProtoActivity b;

        public void a(e e1, g g1)
        {
            Log.v("Editor", (new StringBuilder()).append("Purchase finished: ").append(e1).append(", purchase: ").append(g1).toString());
            if (PhotoProtoActivity.A(b) == null || e1 == null)
            {
                com.cardinalblue.android.piccollage.controller.d.a().c(new l(false));
                return;
            }
            switch (e1.a())
            {
            default:
                com.cardinalblue.android.piccollage.controller.d.a().c(new l(false));
                return;

            case 7: // '\007'
                com.cardinalblue.android.b.k.a(b, 0x7f0701ef, 0);
                com.cardinalblue.android.piccollage.controller.d.a().c(new l(true));
                return;

            case 0: // '\0'
                com.cardinalblue.android.piccollage.a.b.f(g1.d(), "share menu");
                com.cardinalblue.android.piccollage.controller.d.a().c(new l(true));
                return;

            case 6: // '\006'
                e1 = new ArrayList();
                e1.add(a.a());
                PhotoProtoActivity.A(b).a(true, e1, new PhotoProtoActivity._cls38._cls1(this, g1));
                return;
            }
        }

            
            {
                b = photoprotoactivity;
                a = k1;
                super();
            }
    }

}
