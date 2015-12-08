// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.a.r;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ai

class b
    implements i
{

    final PicUser a;
    final String b;
    final ai c;

    public Void a(j j1)
        throws Exception
    {
        if (j1.d())
        {
            if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.th.a)
            {
                c.a = a;
                j1 = new Intent(c.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                j1.putExtra("from", "collage search user");
                c.startActivityForResult(j1, 1);
            } else
            {
                k.a(c.getActivity(), 0x7f0700f8, 1);
            }
            ai.a(c).a(b);
            ai.b(c).a(b);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    y(ai ai1, PicUser picuser, String s)
    {
        c = ai1;
        a = picuser;
        b = s;
        super();
    }
}
