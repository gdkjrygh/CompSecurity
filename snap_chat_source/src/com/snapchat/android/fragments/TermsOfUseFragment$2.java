// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Bt;
import II;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.snapchat.android.database.SharedPreferenceKey;

// Referenced classes of package com.snapchat.android.fragments:
//            TermsOfUseFragment

final class a
    implements android.view.msOfUseFragment._cls2
{

    private TermsOfUseFragment a;

    public final void onClick(View view)
    {
        II.b(SharedPreferenceKey.DEVELOPER_OPTIONS_SHOW_TERMS_OF_USE.getKey(), false);
        TermsOfUseFragment.b(a);
        Bt.af();
        view = a.getActivity();
        view.setResult(-1);
        view.finish();
    }

    _cls9(TermsOfUseFragment termsofusefragment)
    {
        a = termsofusefragment;
        super();
    }
}
