// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.view.a.r;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ad

class c
    implements i
{

    final String a;
    final r b;
    final String c;
    final ad d;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d())
        {
            if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.th.a)
            {
                ad.a(d);
                j1 = new Intent(d.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                j1.putExtra("from", a);
                d.startActivityForResult(j1, 3);
            } else
            {
                k.a(d.getActivity(), 0x7f0700f8, 1);
            }
            b.a(c);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    y(ad ad1, String s, r r1, String s1)
    {
        d = ad1;
        a = s;
        b = r1;
        c = s1;
        super();
    }
}
