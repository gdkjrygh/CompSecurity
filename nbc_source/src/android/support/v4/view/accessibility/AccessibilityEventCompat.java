// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat, AccessibilityEventCompatKitKat

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

        public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
        {
            return AccessibilityEventCompatKitKat.getContentChangeTypes(accessibilityevent);
        }

        public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
        {
            AccessibilityEventCompatKitKat.setContentChangeTypes(accessibilityevent, i);
        }

        AccessibilityEventKitKatImpl()
        {
        }
    }

    static class AccessibilityEventStubImpl
        implements AccessibilityEventVersionImpl
    {

        public int getContentChangeTypes(AccessibilityEvent accessibilityevent)
        {
            return 0;
        }

        public void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
        {
        }

        AccessibilityEventStubImpl()
        {
        }
    }

    static interface AccessibilityEventVersionImpl
    {

        public abstract int getContentChangeTypes(AccessibilityEvent accessibilityevent);

        public abstract void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i);
    }


    private static final AccessibilityEventVersionImpl IMPL;

    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityevent)
    {
        return new AccessibilityRecordCompat(accessibilityevent);
    }

    public static int getContentChangeTypes(AccessibilityEvent accessibilityevent)
    {
        return IMPL.getContentChangeTypes(accessibilityevent);
    }

    public static void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i)
    {
        IMPL.setContentChangeTypes(accessibilityevent, i);
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
