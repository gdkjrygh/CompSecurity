// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Jo;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashPhoneVerificationFragment

final class a
    implements android.view.VerificationFragment._cls1
{

    private CashPhoneVerificationFragment a;

    public final void onClick(View view)
    {
        Jo.a(a.getActivity(), CashPhoneVerificationFragment.a(a));
        a.getActivity().onBackPressed();
    }

    I(CashPhoneVerificationFragment cashphoneverificationfragment)
    {
        a = cashphoneverificationfragment;
        super();
    }
}
