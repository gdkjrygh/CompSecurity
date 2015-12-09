// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            InAppPromoActivity

class s extends DebouncingOnClickListener
{

    final InAppPromoActivity a;
    final InAppPromoActivity..ViewInjector b;

    s(InAppPromoActivity..ViewInjector viewinjector, InAppPromoActivity inapppromoactivity)
    {
        b = viewinjector;
        a = inapppromoactivity;
        super();
    }

    public void doClick(View view)
    {
        a.close();
    }
}
