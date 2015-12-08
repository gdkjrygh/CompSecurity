// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import com.jcp.JCP;
import com.jcp.activities.CartCheckoutActivity;
import com.jcp.util.af;

// Referenced classes of package com.jcp.fragments:
//            u

class z
    implements android.content.DialogInterface.OnClickListener
{

    final u a;

    z(u u1)
    {
        a = u1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a.i() != null && (a.i() instanceof CartCheckoutActivity))
        {
            if (JCP.s().c())
            {
                ((CartCheckoutActivity)a.i()).g();
                return;
            } else
            {
                u.a(a, false);
                return;
            }
        } else
        {
            u.a(a, false);
            return;
        }
    }
}
