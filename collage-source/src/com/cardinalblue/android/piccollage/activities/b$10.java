// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            b

class a
    implements i
{

    final b a;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.th.a)
            {
                j1 = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                j1.putExtra("from", "other_profile");
                a.startActivityForResult(j1, 103);
            } else
            {
                k.a(a.getActivity(), 0x7f0700f8, 1);
            }
        }
        b.e(a);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    ivity(b b1)
    {
        a = b1;
        super();
    }
}
