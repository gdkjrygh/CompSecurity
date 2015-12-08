// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import android.widget.CompoundButton;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            NotificationSettingsFragment

final class a
    implements android.widget.istener
{

    private NotificationSettingsFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        NotificationSettingsFragment.a(a);
        Bt.G(flag);
    }

    (NotificationSettingsFragment notificationsettingsfragment)
    {
        a = notificationsettingsfragment;
        super();
    }
}
