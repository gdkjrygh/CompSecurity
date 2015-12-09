// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityRecordCompat

public static interface 
{

    public abstract int getItemCount(Object obj);

    public abstract Object obtain();

    public abstract void setFromIndex(Object obj, int i);

    public abstract void setItemCount(Object obj, int i);

    public abstract void setMaxScrollX(Object obj, int i);

    public abstract void setMaxScrollY(Object obj, int i);

    public abstract void setScrollX(Object obj, int i);

    public abstract void setScrollY(Object obj, int i);

    public abstract void setScrollable(Object obj, boolean flag);

    public abstract void setSource(Object obj, View view);

    public abstract void setToIndex(Object obj, int i);
}
