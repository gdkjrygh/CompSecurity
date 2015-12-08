// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.accessibility.c;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            m, RecyclerView

final class t> extends a
{

    final m a;

    public final void a(View view, c c)
    {
        super.a(view, c);
        if (!a.a.hasPendingAdapterUpdates() && a.a.getLayoutManager() != null)
        {
            a.a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c);
        }
    }

    public final boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!a.a.hasPendingAdapterUpdates() && a.a.getLayoutManager() != null)
        {
            return a.a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        } else
        {
            return false;
        }
    }

    ibility.c(m m1)
    {
        a = m1;
        super();
    }
}
