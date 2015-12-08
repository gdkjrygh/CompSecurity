// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import LA;
import android.widget.CompoundButton;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a
    implements android.widget.eListener
{

    private DeveloperSettingsFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        DeveloperSettingsFragment.b(a).b(flag);
    }

    (DeveloperSettingsFragment developersettingsfragment)
    {
        a = developersettingsfragment;
        super();
    }
}
