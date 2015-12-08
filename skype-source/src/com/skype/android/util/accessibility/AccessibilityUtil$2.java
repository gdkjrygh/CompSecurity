// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.view.View;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class b
    implements Runnable
{

    final View a;
    final CharSequence b;
    final AccessibilityUtil c;

    public final void run()
    {
        AccessibilityUtil.b(a, b);
    }

    (AccessibilityUtil accessibilityutil, View view, CharSequence charsequence)
    {
        c = accessibilityutil;
        a = view;
        b = charsequence;
        super();
    }
}
