// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.widget:
//            BackToTopButton

class a extends DebouncingOnClickListener
{

    final BackToTopButton a;
    final BackToTopButton..ViewInjector b;

    a(BackToTopButton..ViewInjector viewinjector, BackToTopButton backtotopbutton)
    {
        b = viewinjector;
        a = backtotopbutton;
        super();
    }

    public void doClick(View view)
    {
        a.onBackToTopClick();
    }
}
