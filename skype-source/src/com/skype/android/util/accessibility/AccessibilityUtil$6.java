// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

final class a
    implements android.view.
{

    final AccessibilityUtil a;

    public final boolean onHover(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        int i = motionevent.getAction();
        if (i == 9 || i == 7)
        {
            flag = AccessibilityUtil.a(view, motionevent);
        }
        return flag;
    }

    (AccessibilityUtil accessibilityutil)
    {
        a = accessibilityutil;
        super();
    }
}
