// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.a.b;
import com.cardinalblue.android.piccollage.controller.e;
import com.cardinalblue.android.piccollage.model.Collage;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment

class a
    implements i
{

    final b a;
    final OverlayShareMenuFragment b;

    public j a(j j1)
        throws Exception
    {
        j.a(new Callable(j1) {

            final j a;
            final OverlayShareMenuFragment._cls15 b;

            public Void a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.model.k.a((File)a.e(), k.a());
                OverlayShareMenuFragment.c(b.b);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = OverlayShareMenuFragment._cls15.this;
                a = j1;
                super();
            }
        });
        return (new e(b.getActivity())).a((File)j1.e(), a, OverlayShareMenuFragment.d(b), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.e(b).j().getBytes());
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    _cls1.a(OverlayShareMenuFragment overlaysharemenufragment, b b1)
    {
        b = overlaysharemenufragment;
        a = b1;
        super();
    }
}
