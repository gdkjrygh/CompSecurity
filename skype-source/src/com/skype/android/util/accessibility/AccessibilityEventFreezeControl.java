// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import com.skype.android.util.ref.ReferenceCounted;

// Referenced classes of package com.skype.android.util.accessibility:
//            AccessibilityUtil

public class AccessibilityEventFreezeControl
    implements ReferenceCounted
{

    final AccessibilityUtil a;

    public AccessibilityEventFreezeControl(AccessibilityUtil accessibilityutil)
    {
        a = accessibilityutil;
    }

    public void acquireOnce()
    {
        a.a(true);
    }

    public void releaseFully()
    {
        a.a(false);
    }

    public void releaseOnce()
    {
    }
}
