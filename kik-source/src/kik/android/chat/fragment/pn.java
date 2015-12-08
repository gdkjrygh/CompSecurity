// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.AbsListView;
import java.util.HashSet;

// Referenced classes of package kik.android.chat.fragment:
//            KikSponsoredBaseFragment

final class pn
    implements android.widget.AbsListView.OnScrollListener
{

    final KikSponsoredBaseFragment a;

    pn(KikSponsoredBaseFragment kiksponsoredbasefragment)
    {
        a = kiksponsoredbasefragment;
        super();
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (a.getUserVisibleHint())
        {
            for (k = i; k < i + j; k++)
            {
                if (!KikSponsoredBaseFragment.a(a).contains(Integer.valueOf(k)) && !KikSponsoredBaseFragment.b(a).contains(Integer.valueOf(k)))
                {
                    KikSponsoredBaseFragment.b(a).add(Integer.valueOf(k));
                }
            }

        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
