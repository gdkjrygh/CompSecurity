// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//            c

static class deInfo extends deInfo
{

    public final void d(Object obj, View view)
    {
        ((AccessibilityNodeInfo)obj).setLabelFor(view);
    }

    deInfo()
    {
    }
}
