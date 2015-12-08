// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            DebugSettingsActivity

class h extends DebouncingOnClickListener
{

    final DebugSettingsActivity a;
    final DebugSettingsActivity..ViewInjector b;

    h(DebugSettingsActivity..ViewInjector viewinjector, DebugSettingsActivity debugsettingsactivity)
    {
        b = viewinjector;
        a = debugsettingsactivity;
        super();
    }

    public void doClick(View view)
    {
        a.onEnableFutureDate();
    }
}
