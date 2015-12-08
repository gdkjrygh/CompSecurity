// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.view.View;
import com.jcp.adapters.r;
import com.jcp.c.c;
import com.jcp.util.au;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            o, UnitedAddressFragment, LPOAddressFragment

class q
    implements android.view.View.OnClickListener
{

    final o a;

    q(o o1)
    {
        a = o1;
        super();
    }

    public void onClick(View view)
    {
        a.O();
        com.jcp.fragments.o.c(a).a(a);
        o.d(a);
        JVM INSTR tableswitch 0 1: default 52
    //                   0 53
    //                   1 188;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        view = (UnitedAddressFragment)o.e(a).b(o.d(a));
        o.a(a, view.O());
        if (!o.f(a).equals("addAddress"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o.g(a) == null) goto _L1; else goto _L4
_L4:
        com.jcp.fragments.o.c(a).a(o.g(a), 25);
        return;
        if (!o.f(a).equals("editAddAddress") || o.g(a) == null) goto _L1; else goto _L5
_L5:
        com.jcp.fragments.o.c(a).a(o.g(a), o.h(a).getString("ADDRESS_ID"), 27);
        return;
_L3:
        String s;
        view = (LPOAddressFragment)o.e(a).b(o.d(a));
        o.a(a, view.b());
        view = (String)o.g(a).get("militaryAddressType");
        s = (String)o.g(a).get("state");
        if (!a.a(0x7f07007d).equalsIgnoreCase(view) && !a.a(0x7f0701e7).equalsIgnoreCase(view) && !a.a(0x7f07017e).equalsIgnoreCase(view) || !a.a(0x7f070054).equalsIgnoreCase(s) && !a.a(0x7f070076).equalsIgnoreCase(s) && !a.a(0x7f07007c).equalsIgnoreCase(s)) goto _L7; else goto _L6
_L6:
        if (!"addAddress".equals(o.f(a)))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o.g(a) == null) goto _L1; else goto _L8
_L8:
        com.jcp.fragments.o.c(a).a(o.g(a), 26);
        return;
        if (!"editAddAddress".equals(o.f(a)) || o.g(a) == null) goto _L1; else goto _L9
_L9:
        com.jcp.fragments.o.c(a).a(o.g(a), o.h(a).getString("ADDRESS_ID"), 28);
        return;
_L7:
        au.a(a.i(), a.a(0x7f0701bb), a.a(0x7f07047b));
        return;
    }
}
