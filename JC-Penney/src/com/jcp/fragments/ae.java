// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import com.jcp.activities.SameDayPickUpCustomerServiceActivity;
import com.jcp.b.b;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            ad

class ae
    implements android.widget.AdapterView.OnItemClickListener
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            au.c(a.i(), a.j().getString(0x7f070304));
        } else
        {
            if (i == 1)
            {
                ad.a(a, a.a(0x7f07026d), b.M());
                return;
            }
            if (i == 2)
            {
                ad.a(a, b.I());
                return;
            }
            if (i == 3)
            {
                ad.a(a, a.a(0x7f0702f4), b.O());
                return;
            }
            if (i == 4)
            {
                ad.a(a, a.a(0x7f0703e6), b.P());
                return;
            }
            if (i == 5)
            {
                a.a(new Intent(a.i(), com/jcp/activities/SameDayPickUpCustomerServiceActivity));
                return;
            }
            if (i == 6)
            {
                ad.a(a, a.a(0x7f070353), b.N());
                return;
            }
            if (i == 7)
            {
                ad.a(a, b.L());
                return;
            }
            if (i == 8)
            {
                ad.a(a, b.J());
                return;
            }
            if (i == 9)
            {
                ad.a(a, b.T());
                return;
            }
            if (i == 10)
            {
                ad.a(a, b.Q());
                return;
            }
        }
    }
}
