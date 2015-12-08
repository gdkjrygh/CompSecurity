// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Mf;
import Oi;
import android.view.View;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment, DeveloperSettingsFragment

final class gment
    implements android.view.
{

    public final void onClick(View view)
    {
        Mf.a().a(new Oi(new DeveloperSettingsFragment()));
    }

    gment()
    {
    }
}
