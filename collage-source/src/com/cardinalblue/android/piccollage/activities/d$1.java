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
    implements i
{

    final d a;

    public Object then(j j1)
        throws Exception
    {
        if ((j1.c() || j1.d()) && !k.b(a.getActivity()))
        {
            k.a(a.getActivity(), 0x7f07021d, 0);
            d.a(a, new android.view.View.OnClickListener() {

                final d._cls1 a;

                public void onClick(View view)
                {
                    d.a(a.a).b();
                }

            
            {
                a = d._cls1.this;
                super();
            }
            });
            d.a(a).c();
        }
        return null;
    }

    _cls1.a(d d1)
    {
        a = d1;
        super();
    }
}
