// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.discover.ui.EmptyDSnapView;
import com.snapchat.android.discover.ui.fragment.EditionViewerPager;
import java.util.List;

public final class wu extends wt
{

    public wu()
    {
    }

    public final int a(int i)
    {
        return 0;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (EditionViewerPager)viewgroup;
        EmptyDSnapView emptydsnapview = new EmptyDSnapView(SnapchatApplication.get());
        viewgroup.addView(emptydsnapview);
        return new wt.a(emptydsnapview, "dummy", false);
    }

    public final void a(ViewGroup viewgroup)
    {
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
    }

    public final void a(List list)
    {
    }

    public final boolean a(View view, Object obj)
    {
        return true;
    }

    public final int b(Object obj)
    {
        return 0;
    }

    public final View b(ViewGroup viewgroup, int i)
    {
        if (i != 0)
        {
            return null;
        } else
        {
            return viewgroup.getChildAt(0);
        }
    }

    public final int c()
    {
        return 1;
    }

    public final int c(int i)
    {
        return 0;
    }
}
