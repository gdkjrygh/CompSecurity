// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import com.jcp.b.a;
import com.jcp.b.b;
import com.jcp.c.q;

// Referenced classes of package com.jcp.fragments:
//            o, s, PrimaryAddressFragment

class r
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final o b;

    r(o o1, int i)
    {
        b = o1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (a == 25 || a == 26 || a == 27 || a == 28)
        {
            com.jcp.b.b.a(true);
            if (o.i(b) && o.j(b))
            {
                com.jcp.fragments.o.a(b, new q(b.i()));
                o.k(b).a(b);
                o.k(b).a(6);
                com.jcp.b.a.h(true);
            } else
            if (com.jcp.fragments.s.a(b.i()) != null)
            {
                dialoginterface = new PrimaryAddressFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isFromCard", o.j(b));
                dialoginterface.g(bundle);
                com.jcp.b.a.d(true);
                b.i().f().c();
                com.jcp.b.a.h(true);
                return;
            }
        }
    }
}
