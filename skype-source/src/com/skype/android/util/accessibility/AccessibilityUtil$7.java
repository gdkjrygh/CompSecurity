// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.view.View;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class a
    implements Runnable
{

    final View a;
    final AccessibilityUtil b;

    public final void run()
    {
        AccessibilityUtil.a(a, 128);
    }

    (AccessibilityUtil accessibilityutil, View view)
    {
        b = accessibilityutil;
        a = view;
        super();
    }
}
