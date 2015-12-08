// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.view.ViewGroup;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class b
    implements Runnable
{

    final ViewGroup a;
    final boolean b;
    final AccessibilityUtil c;

    public final void run()
    {
        cessibleTouchMap cessibletouchmap = new cessibleTouchMap(c, a, b);
        a.setTag(cessibletouchmap);
    }

    cessibleTouchMap(AccessibilityUtil accessibilityutil, ViewGroup viewgroup, boolean flag)
    {
        c = accessibilityutil;
        a = viewgroup;
        b = flag;
        super();
    }
}
