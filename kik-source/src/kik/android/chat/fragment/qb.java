// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikWelcomeFragment, SimpleFragmentWrapperActivity, KikRegistrationFragment

final class qb
    implements android.view.View.OnClickListener
{

    final KikWelcomeFragment a;

    qb(KikWelcomeFragment kikwelcomefragment)
    {
        a = kikwelcomefragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new Intent(a.getActivity(), kik/android/chat/fragment/SimpleFragmentWrapperActivity);
        view.addFlags(0x4000000);
        view.putExtra("SimpleFragmentWrapperActivity.fragmentlaunchclass", kik/android/chat/fragment/KikRegistrationFragment.getCanonicalName());
        a.startActivityForResult(view, 1);
    }
}
