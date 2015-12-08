// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public final class ps extends AccessibilityNodeProvider
{

    private pt a;

    public ps(pt pt1)
    {
        a = pt1;
        super();
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        return (AccessibilityNodeInfo)a.a(i);
    }

    public final List findAccessibilityNodeInfosByText(String s, int i)
    {
        return a.a(s, i);
    }

    public final boolean performAction(int i, int j, Bundle bundle)
    {
        return a.a(i, j, bundle);
    }
}
