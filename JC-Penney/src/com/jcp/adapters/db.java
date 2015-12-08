// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.support.v4.app.ac;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.jcp.adapters:
//            TrackPackageAdapter

class db
    implements android.view.View.OnClickListener
{

    final String a;
    final String b;
    final String c;
    final TrackPackageAdapter d;

    db(TrackPackageAdapter trackpackageadapter, String s, String s1, String s2)
    {
        d = trackpackageadapter;
        a = s;
        b = s1;
        c = s2;
        super();
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            if ("UPS".equalsIgnoreCase(b))
            {
                TrackPackageAdapter.a(d, b, c);
                return;
            } else
            {
                TrackPackageAdapter.a(d, a);
                return;
            }
        } else
        {
            Toast.makeText(TrackPackageAdapter.a(d), TrackPackageAdapter.a(d).getString(0x7f070445), 0).show();
            return;
        }
    }
}
