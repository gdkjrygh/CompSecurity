// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ar, a

class as extends ar
{

    as()
    {
    }

    public final void a(View view, a a1)
    {
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)a1.a());
    }

    public final boolean a(View view)
    {
        return view.canScrollVertically(-1);
    }

    public final boolean a(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }
}
