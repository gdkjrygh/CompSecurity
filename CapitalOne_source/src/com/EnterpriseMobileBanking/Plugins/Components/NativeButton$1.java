// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            NativeButton

static final class val.lastTouched
    implements Runnable
{

    final View val$lastTouched;

    public void run()
    {
        val$lastTouched.setPressed(true);
        val$lastTouched.invalidate();
    }

    (View view)
    {
        val$lastTouched = view;
        super();
    }
}
