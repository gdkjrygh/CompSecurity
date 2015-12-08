// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityEventCompat

static interface 
{

    public abstract void appendRecord(AccessibilityEvent accessibilityevent, Object obj);

    public abstract Object getRecord(AccessibilityEvent accessibilityevent, int i);

    public abstract int getRecordCount(AccessibilityEvent accessibilityevent);
}
