// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.jcp.fragments:
//            o, PrimaryAddressFragment, s, t

class ck
    implements android.view.View.OnClickListener
{

    final PrimaryAddressFragment a;

    ck(PrimaryAddressFragment primaryaddressfragment)
    {
        a = primaryaddressfragment;
        super();
    }

    public void onClick(View view)
    {
        view = new o();
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("Title", "addAddress");
        ((Bundle) (obj)).putBoolean("isFromCard", PrimaryAddressFragment.a(a));
        ((Bundle) (obj)).putBoolean("isAddressNull", PrimaryAddressFragment.b(a));
        view.g(((Bundle) (obj)));
        obj = s.a(a.i());
        if (obj != null)
        {
            ((t) (obj)).c(view, "AddAddressFragment");
        }
    }
}
