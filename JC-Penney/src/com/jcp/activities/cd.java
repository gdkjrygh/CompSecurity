// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            VisualSearchTutorialActivity

class cd extends DebouncingOnClickListener
{

    final VisualSearchTutorialActivity a;
    final VisualSearchTutorialActivity..ViewInjector b;

    cd(VisualSearchTutorialActivity..ViewInjector viewinjector, VisualSearchTutorialActivity visualsearchtutorialactivity)
    {
        b = viewinjector;
        a = visualsearchtutorialactivity;
        super();
    }

    public void doClick(View view)
    {
        a.onGotItClick();
    }
}
