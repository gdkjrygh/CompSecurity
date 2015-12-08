// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
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
        if (ena.k(b.b) != null && !a)
        {
            ena.g(b.b).onRestoreInstanceState(ena.k(b.b));
            ena.l(b.b);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }

    // Unreferenced inner class ena$1

/* anonymous class */
    final class ena._cls1
        implements epg
    {

        final ena a;

        public final void a(Object obj)
        {
            obj = (fip)obj;
            a.o();
            ((fip) (obj)).isLoading();
            int i = ((fdj[])((fip) (obj)).getItems()).length;
            if (!a.o()) goto _L2; else goto _L1
_L1:
            byte byte0;
            boolean flag;
            if (((fip) (obj)).getUnrangedLength() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (((fip) (obj)).isLoading() && flag) goto _L2; else goto _L3
_L3:
            if (!flag && ena.a(a).b())
            {
                obj = ((fdj[])((fip) (obj)).getItems())[0];
                ena.a(a).a(((fdj) (obj)).a(), ((fdj) (obj)).b(), true);
            }
            a.R();
            a.O();
            if (ena.b(a).d())
            {
                ena.b(a).b();
            }
            if (flag && !ena.c(a).b())
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (!ena.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
            ena.e(a).setVisibility(0);
            obj = ena.f(a);
_L7:
            byte0 = 8;
_L8:
            ((View) (obj)).setVisibility(byte0);
            if (ena.d(a).b() && (ena.g(a) instanceof HideableHeadersListView))
            {
                ((HideableHeadersListView)ena.g(a)).a();
            }
            if (flag && ena.c(a).b())
            {
                ena.i(a).a(a.a(0x7f0803de, new Object[] {
                    ena.h(a)
                }));
                ena.j(a).b(new int[] {
                    1
                });
            } else
            {
                ena.j(a).a(new int[] {
                    1
                });
            }
            if (!flag && ena.d(a).b())
            {
                ena.j(a).b(new int[] {
                    2
                });
            } else
            {
                ena.j(a).a(new int[] {
                    2
                });
            }
            a.P();
            ((fpe)a.k()).P_();
            ena.g(a).post(new ena._cls1._cls1(this, flag));
_L2:
            return;
_L5:
            ena.e(a).setVisibility(8);
            obj = ena.f(a);
            if (byte0 == 0) goto _L7; else goto _L6
_L6:
            byte0 = 0;
              goto _L8
        }

        public final void a(String s)
        {
            ena.b(a).b();
            Logger.c("Failed to load list of playlist %s", new Object[] {
                s
            });
        }

            
            {
                a = ena1;
                super();
            }
    }

}
