// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.snapchat.android.Timber;
import com.snapchat.android.fragments.MiniProfileFragment;
import com.snapchat.android.util.StoriesPageStateManager;
import com.squareup.otto.Bus;

final class lang.Object
    implements android.view.OnLongClickListener
{

    private zg a;

    public final boolean onLongClick(View view)
    {
        Object obj = a;
        long l = SystemClock.elapsedRealtime();
        view = new IG(l - (long)ViewConfiguration.getLongPressTimeout(), l);
        Timber.c("MiniProfileStoriesListItemDecorator", (new StringBuilder("longClickPeriod ")).append(view).toString(), new Object[0]);
        IG ig = ((zg) (obj)).d.mLastScrollPeriod;
        boolean flag = ig.a(view);
        Timber.c("MiniProfileStoriesListItemDecorator", (new StringBuilder("lastScrollPeriod ")).append(ig).append(" viewPagerScrolledDuringLongClick ").append(flag).toString(), new Object[0]);
        if (flag)
        {
            flag = true;
        } else
        {
            IG ig1 = ((zg) (obj)).e.mLastPtrPeriod;
            flag = ig1.a(view);
            Timber.c("MiniProfileStoriesListItemDecorator", (new StringBuilder("pulledDuringLongClick ")).append(ig1).append(" pulledToRefreshDuringLongClick ").append(flag).toString(), new Object[0]);
            if (flag)
            {
                flag = true;
            } else
            {
                obj = ((zg) (obj)).e.mLastScrollPeriod;
                flag = ((IG) (obj)).a(view);
                Timber.c("MiniProfileStoriesListItemDecorator", (new StringBuilder("lastStoriesScrollPeriod ")).append(obj).append(" storiesListScrolledDuringLongClick ").append(flag).toString(), new Object[0]);
            }
        }
        if (!flag)
        {
            view = a;
            ((zg) (view)).c.a(new NT(false));
            if (((zg) (view)).a.H())
            {
                Jo.a(((zg) (view)).b.getContext(), ((zg) (view)).b.getRootView());
            }
            ((zg) (view)).a.I();
            obj = MiniProfileFragment.a(((zg) (view)).a.B(), 3);
            ((zg) (view)).c.a(new Oi(((com.snapchat.android.util.fragment.SnapchatFragment) (obj)), false));
            return true;
        } else
        {
            Timber.c("MiniProfileStoriesListItemDecorator", "Do not consume this long click since the pull-to-refresh view is being pulled.", new Object[0]);
            return false;
        }
    }

    >(zg zg1)
    {
        a = zg1;
        super();
    }
}
