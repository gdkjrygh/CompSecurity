// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package com.qihoo.security.gamebooster:
//            GameRecommendListActivity

class a
    implements android.widget.
{

    final GameRecommendListActivity a;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (i + j == k)
        {
            View view = abslistview.getChildAt(abslistview.getChildCount() - 1);
            if (abslistview.getBottom() == view.getBottom())
            {
                GameRecommendListActivity.a(a, true);
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    (GameRecommendListActivity gamerecommendlistactivity)
    {
        a = gamerecommendlistactivity;
        super();
    }
}
