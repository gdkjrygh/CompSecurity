// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;

final class g.Object
    implements Runnable
{

    private boolean a;
    private b b;

    public final void run()
    {
        if (end.p(b.b) != null && !a)
        {
            end.f(b.b).onRestoreInstanceState(end.p(b.b));
            end.q(b.b);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }

    // Unreferenced inner class end$1

/* anonymous class */
    final class end._cls1
        implements epg
    {

        final end a;

        public final void a(Object obj)
        {
            enx enx1;
            boolean flag1;
            flag1 = true;
            enx1 = (enx)obj;
            a.o();
            enx1.isLoading();
            int i = ((enw[])enx1.getItems()).length;
            if (!a.o()) goto _L2; else goto _L1
_L1:
            byte byte0;
            boolean flag;
            if (enx1.getUnrangedLength() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (enx1.isLoading() && flag) goto _L2; else goto _L3
_L3:
            a.R();
            a.O();
            if (end.a(a).d())
            {
                end.a(a).b();
            }
            if (flag && !end.b(a).b())
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (!end.c(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
            end.d(a).setVisibility(0);
            obj = end.e(a);
_L7:
            byte0 = 8;
_L8:
            ((View) (obj)).setVisibility(byte0);
            if (end.c(a).b() && (end.f(a) instanceof HideableHeadersListView))
            {
                ((HideableHeadersListView)end.f(a)).a();
            }
            if (flag && end.b(a).b())
            {
                end.h(a).a(a.a(0x7f0803de, new Object[] {
                    end.g(a)
                }));
                end.i(a).b(new int[] {
                    1
                });
            } else
            {
                end.i(a).a(new int[] {
                    1
                });
            }
            if (!flag && end.c(a).b())
            {
                end.i(a).b(new int[] {
                    2
                });
            } else
            {
                end.i(a).a(new int[] {
                    2
                });
            }
            end.a(a, enx1.a());
            end.b(a, enx1.b());
            if (!end.j(a))
            {
                end.k(a);
                end.l(a);
            }
            a.P();
            end.o(a).a(end.m(a), end.n(a));
            obj = a;
            if (flag)
            {
                flag1 = false;
            }
            ((end) (obj)).a(flag1);
            ((fpe)a.k()).P_();
            end.f(a).post(new end._cls1._cls1(this, flag));
_L2:
            return;
_L5:
            end.d(a).setVisibility(8);
            obj = end.e(a);
            if (byte0 == 0) goto _L7; else goto _L6
_L6:
            byte0 = 0;
              goto _L8
        }

        public final void a(String s)
        {
            end.a(a).b();
            Logger.c("Failed to load list of songs %s", new Object[] {
                s
            });
        }

            
            {
                a = end1;
                super();
            }
    }

}
