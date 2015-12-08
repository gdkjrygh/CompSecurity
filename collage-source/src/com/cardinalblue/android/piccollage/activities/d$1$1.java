// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.View;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            d, e

class a
    implements android.view.nClickListener
{

    final a a;

    public void onClick(View view)
    {
        d.a(a.a).b();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/d$1

/* anonymous class */
    class d._cls1
        implements i
    {

        final d a;

        public Object then(j j1)
            throws Exception
        {
            if ((j1.c() || j1.d()) && !k.b(a.getActivity()))
            {
                k.a(a.getActivity(), 0x7f07021d, 0);
                d.a(a, new d._cls1._cls1(this));
                d.a(a).c();
            }
            return null;
        }

            
            {
                a = d1;
                super();
            }
    }

}
