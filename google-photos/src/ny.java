// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

class ny
{

    ny()
    {
    }

    public void a(ViewParent viewparent, View view)
    {
        if (viewparent instanceof ma)
        {
            ((ma)viewparent).onStopNestedScroll(view);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        if (viewparent instanceof ma)
        {
            ((ma)viewparent).onNestedScroll(view, i, j, k, l);
        }
    }

    public void a(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        if (viewparent instanceof ma)
        {
            ((ma)viewparent).onNestedPreScroll(view, i, j, ai);
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1)
    {
        if (viewparent instanceof ma)
        {
            return ((ma)viewparent).onNestedPreFling(view, f, f1);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        if (viewparent instanceof ma)
        {
            return ((ma)viewparent).onNestedFling(view, f, f1, flag);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof ma)
        {
            return ((ma)viewparent).onStartNestedScroll(view, view1, i);
        } else
        {
            return false;
        }
    }

    public boolean a(ViewParent viewparent, View view, AccessibilityEvent accessibilityevent)
    {
        if (view == null)
        {
            return false;
        } else
        {
            ((AccessibilityManager)view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(accessibilityevent);
            return true;
        }
    }

    public void b(ViewParent viewparent, View view, View view1, int i)
    {
        if (viewparent instanceof ma)
        {
            ((ma)viewparent).onNestedScrollAccepted(view, view1, i);
        }
    }
}
