// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            MainActivity

class ac extends DebouncingOnClickListener
{

    final MainActivity a;
    final MainActivity..ViewInjector b;

    ac(MainActivity..ViewInjector viewinjector, MainActivity mainactivity)
    {
        b = viewinjector;
        a = mainactivity;
        super();
    }

    public void doClick(View view)
    {
        a.onScanClick();
    }
}
