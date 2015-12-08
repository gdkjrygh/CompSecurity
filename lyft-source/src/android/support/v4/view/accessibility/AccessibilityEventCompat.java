// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat

public class AccessibilityEventCompat
{

    private static final AccessibilityEventVersionImpl a;

    public static AccessibilityRecordCompat a(AccessibilityEvent accessibilityevent)
    {
        return new AccessibilityRecordCompat(accessibilityevent);
    }

    public static void a(AccessibilityEvent accessibilityevent, int i)
    {
        a.a(accessibilityevent, i);
    }

    public static int b(AccessibilityEvent accessibilityevent)
    {
        return a.a(accessibilityevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new AccessibilityEventKitKatImpl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new AccessibilityEventIcsImpl();
        } else
        {
            a = new AccessibilityEventStubImpl();
        }
    }

    private class AccessibilityEventVersionImpl
    {

        public abstract int a(AccessibilityEvent accessibilityevent);

        public abstract void a(AccessibilityEvent accessibilityevent, int i);
    }


    private class AccessibilityEventKitKatImpl extends AccessibilityEventIcsImpl
    {
        private class AccessibilityEventIcsImpl extends AccessibilityEventStubImpl
        {
            private class AccessibilityEventStubImpl
                implements AccessibilityEventVersionImpl
            {

                public int a(AccessibilityEvent accessibilityevent)
                {
                    return 0;
                }

                public void a(AccessibilityEvent accessibilityevent, int i)
                {
                }

                AccessibilityEventStubImpl()
                {
                }
            }


            AccessibilityEventIcsImpl()
            {
            }
        }


        public int a(AccessibilityEvent accessibilityevent)
        {
            return AccessibilityEventCompatKitKat.a(accessibilityevent);
        }

        public void a(AccessibilityEvent accessibilityevent, int i)
        {
            AccessibilityEventCompatKitKat.a(accessibilityevent, i);
        }

        AccessibilityEventKitKatImpl()
        {
        }
    }

}
