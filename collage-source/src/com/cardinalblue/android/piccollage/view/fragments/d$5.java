// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gdata.UserFeed;
import com.google.android.gms.auth.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            d

class a
    implements i
{

    final com.cardinalblue.android.piccollage.view.fragments.d a;

    public UserFeed a(j j1)
        throws Exception
    {
        if (j1.d() || j1.c())
        {
            if (j1.f() instanceof d)
            {
                android.content.Intent intent = ((d)j1.f()).a();
                try
                {
                    a.startActivityForResult(intent, 300);
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    k.a(a.getActivity(), 0x7f0700f8, 0);
                }
            }
            throw j1.f();
        }
        j1 = (String)j1.e();
        if (TextUtils.isEmpty(j1))
        {
            throw new IllegalStateException("No return information for Google authentication");
        } else
        {
            return d.a(a, j1);
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    d(com.cardinalblue.android.piccollage.view.fragments.d d1)
    {
        a = d1;
        super();
    }
}
