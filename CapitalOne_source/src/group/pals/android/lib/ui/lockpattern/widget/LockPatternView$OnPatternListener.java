// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern.widget;

import java.util.List;

// Referenced classes of package group.pals.android.lib.ui.lockpattern.widget:
//            LockPatternView

public static interface 
{

    public abstract void onPatternCellAdded(List list);

    public abstract void onPatternCleared();

    public abstract void onPatternDetected(List list);

    public abstract void onPatternStart();
}
