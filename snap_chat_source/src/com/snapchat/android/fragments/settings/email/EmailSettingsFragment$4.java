// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailSettingsFragment

final class a
    implements TextWatcher
{

    private EmailSettingsFragment a;

    public final void afterTextChanged(Editable editable)
    {
        EmailSettingsFragment.e(a);
        a.h();
        EmailSettingsFragment.f(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (EmailSettingsFragment emailsettingsfragment)
    {
        a = emailsettingsfragment;
        super();
    }
}
