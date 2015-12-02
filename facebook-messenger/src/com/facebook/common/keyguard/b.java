// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.keyguard;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.facebook.common.keyguard:
//            KeyguardPendingIntentActivity

class b
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final KeyguardPendingIntentActivity b;

    b(KeyguardPendingIntentActivity keyguardpendingintentactivity, View view)
    {
        b = keyguardpendingintentactivity;
        a = view;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        KeyguardPendingIntentActivity.b(b);
        return true;
    }
}
