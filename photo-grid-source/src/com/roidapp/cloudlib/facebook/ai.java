// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.widget.AbsListView;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbPhotoFragment

final class ai
    implements android.widget.AbsListView.OnScrollListener
{

    final FbPhotoFragment a;

    ai(FbPhotoFragment fbphotofragment)
    {
        a = fbphotofragment;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0 && !FbPhotoFragment.a(a))
        {
            if (abslistview.getLastVisiblePosition() == abslistview.getCount() - 1)
            {
                FbPhotoFragment.a(a, true);
                a.d();
                return;
            }
            if (abslistview.getFirstVisiblePosition() == 0)
            {
                FbPhotoFragment.a(a, false);
                a.d();
                return;
            }
        }
    }
}
