// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import Jo;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailSettingsFragment

final class a
    implements android.view.gs.email.EmailSettingsFragment._cls2
{

    private EmailSettingsFragment a;

    public final void onClick(View view)
    {
        Jo.a(a.getActivity(), a.getView());
        a.getActivity().onBackPressed();
    }

    (EmailSettingsFragment emailsettingsfragment)
    {
        a = emailsettingsfragment;
        super();
    }
}
