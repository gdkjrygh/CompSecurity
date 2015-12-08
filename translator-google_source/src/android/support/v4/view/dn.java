// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            dm, dp

final class dn extends dm
{

    dn()
    {
    }

    public final void a(ViewParent viewparent, View view)
    {
        try
        {
            viewparent.onStopNestedScroll(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onStopNestedScroll");
        }
    }

    public final void a(ViewParent viewparent, View view, int i, int j, int k, int l)
    {
        try
        {
            viewparent.onNestedScroll(view, i, j, k, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedScroll");
        }
    }

    public final void a(ViewParent viewparent, View view, int i, int j, int ai[])
    {
        try
        {
            viewparent.onNestedPreScroll(view, i, j, ai);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedPreScroll");
        }
    }

    public final boolean a(ViewParent viewparent, View view, float f, float f1)
    {
        return dp.a(viewparent, view, f, f1);
    }

    public final boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
    {
        return dp.a(viewparent, view, f, f1, flag);
    }

    public final boolean a(ViewParent viewparent, View view, View view1, int i)
    {
        return dp.a(viewparent, view, view1, i);
    }

    public final void b(ViewParent viewparent, View view, View view1, int i)
    {
        try
        {
            viewparent.onNestedScrollAccepted(view, view1, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            (new StringBuilder("ViewParent ")).append(viewparent).append(" does not implement interface method onNestedScrollAccepted");
        }
    }
}
