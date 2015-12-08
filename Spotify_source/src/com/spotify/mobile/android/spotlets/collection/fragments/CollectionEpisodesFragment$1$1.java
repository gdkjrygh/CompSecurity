// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.fragments;

import android.view.View;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;
import epg;
import fip;
import ftg;
import fzs;
import gjf;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.fragments:
//            CollectionEpisodesFragment

final class a
    implements Runnable
{

    private boolean a;
    private b b;

    public final void run()
    {
        if (CollectionEpisodesFragment.c(b.b) != null && !a)
        {
            CollectionEpisodesFragment.d(b.b).onRestoreInstanceState(CollectionEpisodesFragment.c(b.b));
            CollectionEpisodesFragment.e(b.b);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/collection/fragments/CollectionEpisodesFragment$1

/* anonymous class */
    final class CollectionEpisodesFragment._cls1
        implements epg
    {

        final CollectionEpisodesFragment a;

        public final void a(Object obj)
        {
            byte byte0 = 8;
            boolean flag1 = true;
            obj = (fip)obj;
            if (a.o())
            {
                boolean flag;
                if (((fio[])((fip) (obj)).getItems()).length == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!((fip) (obj)).isLoading() || !flag)
                {
                    CollectionEpisodesFragment.a(a).a((fio[])((fip) (obj)).getItems());
                    if (CollectionEpisodesFragment.b(a).e())
                    {
                        CollectionEpisodesFragment.b(a).b();
                    }
                    CollectionEpisodesFragment.d(a).post(new CollectionEpisodesFragment._cls1._cls1(this, flag));
                    if (CollectionEpisodesFragment.f(a).d())
                    {
                        CollectionEpisodesFragment.f(a).b();
                    }
                    obj = CollectionEpisodesFragment.g(a);
                    int i;
                    if (flag)
                    {
                        i = 0;
                    } else
                    {
                        i = 8;
                    }
                    ((View) (obj)).setVisibility(i);
                    obj = CollectionEpisodesFragment.d(a);
                    i = byte0;
                    if (!flag)
                    {
                        i = 0;
                    }
                    ((ListView) (obj)).setVisibility(i);
                    CollectionEpisodesFragment.h(a).d(3);
                    obj = a;
                    if (flag)
                    {
                        flag1 = false;
                    }
                    ((CollectionEpisodesFragment) (obj)).a(flag1);
                    if (CollectionEpisodesFragment.i(a) && flag)
                    {
                        CollectionEpisodesFragment.j(a).a();
                    }
                }
            }
        }

        public final void a(String s)
        {
            CollectionEpisodesFragment.f(a).b();
            Logger.c("Failed to load list of episodes %s", new Object[] {
                s
            });
        }

            
            {
                a = collectionepisodesfragment;
                super();
            }
    }

}
