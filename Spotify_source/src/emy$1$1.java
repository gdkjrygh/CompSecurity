// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.List;

final class g.Object
    implements Runnable
{

    private List a;
    private l.List b;

    public final void run()
    {
        if (emy.e(b.b) != null && !a.isEmpty())
        {
            emy.f(b.b).onRestoreInstanceState(emy.e(b.b));
            emy.g(b.b);
        }
    }

    l.List(l.List list, List list1)
    {
        b = list;
        a = list1;
        super();
    }

    // Unreferenced inner class emy$1

/* anonymous class */
    final class emy._cls1
        implements epg
    {

        final emy a;

        public final void a(Object obj)
        {
            obj = (RecentlyPlayedItems)obj;
            if (a.o() && obj != null && !fzp.b(emy.a(a)))
            {
                List list = ((RecentlyPlayedItems) (obj)).items;
                boolean flag = ((RecentlyPlayedItems) (obj)).loaded;
                if (!list.isEmpty() || ((RecentlyPlayedItems) (obj)).loaded)
                {
                    emy.b(a).a(((RecentlyPlayedItems) (obj)).items);
                    emy.c(a).a(new int[] {
                        8
                    });
                    if (emy.d(a).e())
                    {
                        emy.d(a).b();
                    }
                    emy.f(a).post(new emy._cls1._cls1(this, list));
                    if (emy.h(a).d())
                    {
                        emy.h(a).b();
                    }
                    if (list.isEmpty())
                    {
                        emy.c(a).b(new int[] {
                            7
                        });
                    } else
                    {
                        emy.c(a).a(new int[] {
                            7
                        });
                    }
                    emy.c(a).d(6);
                }
            }
        }

        public final void a(String s)
        {
            Logger.c(s, new Object[] {
                "mDataLoaderObserver.onError()"
            });
        }

            
            {
                a = emy1;
                super();
            }
    }

}
