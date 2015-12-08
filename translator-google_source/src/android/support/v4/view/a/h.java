// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.a:
//            o

class h extends o
{

    h()
    {
    }

    public final Object a(int i)
    {
        return new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, null);
    }

    public final boolean a(Object obj, Object obj1)
    {
        return ((AccessibilityNodeInfo)obj).removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
    }
}
