// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

public class c extends TouchDelegate
{

    final AccessibilityUtil a;
    private View b;
    private Rect c;

    public final View a()
    {
        return b;
    }

    public final Rect b()
    {
        return c;
    }

    public (AccessibilityUtil accessibilityutil, Rect rect, View view)
    {
        a = accessibilityutil;
        super(rect, view);
        b = view;
        c = rect;
    }
}
