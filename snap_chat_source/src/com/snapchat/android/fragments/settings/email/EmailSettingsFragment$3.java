// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailSettingsFragment

final class a
    implements android.view.gs.email.EmailSettingsFragment._cls3
{

    private EmailSettingsFragment a;

    public final void onClick(View view)
    {
        EmailSettingsFragment.b(a).setText("");
        EmailSettingsFragment.c(a).setVisibility(8);
        EmailSettingsFragment.d(a).setVisibility(8);
    }

    (EmailSettingsFragment emailsettingsfragment)
    {
        a = emailsettingsfragment;
        super();
    }
}
