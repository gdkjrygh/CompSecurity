// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat

public class AccessibilityEventCompat
{
    static class AccessibilityEventIcsImpl extends AccessibilityEventStubImpl
    {

        AccessibilityEventIcsImpl()
        {
        }
    }

    static class AccessibilityEventKitKatImpl extends AccessibilityEventIcsImpl
    {

        AccessibilityEventKitKatImpl()
        {
        }
    }

    static class AccessibilityEventStubImpl
        implements AccessibilityEventVersionImpl
    {

        AccessibilityEventStubImpl()
        {
        }
    }

    static interface AccessibilityEventVersionImpl
    {
    }


    private static final AccessibilityEventVersionImpl IMPL;

    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
    {
        return new AccessibilityRecordCompat(accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new AccessibilityEventKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new AccessibilityEventIcsImpl();
        } else
        {
            IMPL = new AccessibilityEventStubImpl();
        }
    }
}
