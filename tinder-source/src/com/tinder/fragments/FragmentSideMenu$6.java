// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.tinder.c.v;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            FragmentSideMenu

final class a
    implements android.view.r
{

    final FragmentSideMenu a;

    public final void onClick(View view)
    {
        if (!ad.b(FragmentSideMenu.a(a)))
        {
            FragmentSideMenu.a(a, new v(a.getActivity(), 1, "menu"));
            FragmentSideMenu.a(a).show();
        }
    }

    (FragmentSideMenu fragmentsidemenu)
    {
        a = fragmentsidemenu;
        super();
    }
}
