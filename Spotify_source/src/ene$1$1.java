// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.List;

final class g.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        ene.d(a.a).onRestoreInstanceState(ene.c(a.a));
        ene.e(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class ene$1

/* anonymous class */
    final class ene._cls1
        implements epg
    {

        final ene a;

        public final void a(Object obj)
        {
            obj = (RecentlyPlayedItems)obj;
            if (a.o())
            {
                List list = ((RecentlyPlayedItems) (obj)).items;
                if (!list.isEmpty() || ((RecentlyPlayedItems) (obj)).loaded)
                {
                    ene.a(a).a(list);
                    ene.b(a).a(new int[] {
                        2
                    });
                    if (ene.c(a) != null && !list.isEmpty())
                    {
                        ene.d(a).post(new ene._cls1._cls1(this));
                    }
                    if (list.isEmpty())
                    {
                        ene.b(a).b(new int[] {
                            1
                        });
                    } else
                    {
                        ene.b(a).a(new int[] {
                            1
                        });
                    }
                    ene.b(a).d(0);
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
                a = ene1;
                super();
            }
    }

}
