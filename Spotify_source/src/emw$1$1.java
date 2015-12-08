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
        if (emw.l(b.b) != null && !a)
        {
            emw.h(b.b).onRestoreInstanceState(emw.l(b.b));
            emw.m(b.b);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }

    // Unreferenced inner class emw$1

/* anonymous class */
    final class emw._cls1
        implements epg
    {

        final emw a;

        public final void a(Object obj)
        {
            obj = (fip)obj;
            a.o();
            ((fip) (obj)).isLoading();
            int i = ((enr[])((fip) (obj)).getItems()).length;
            if (!a.o()) goto _L2; else goto _L1
_L1:
            byte byte0;
            boolean flag1;
            if (((fip) (obj)).getUnrangedLength() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (((fip) (obj)).isLoading() && flag1) goto _L2; else goto _L3
_L3:
            if (!flag1 && emw.a(a).b())
            {
                obj = ((enr[])((fip) (obj)).getItems())[0];
                emw.a(a).a(((enr) (obj)).getCollectionUri(), ((enr) (obj)).getName(), true);
            }
            a.R();
            a.O();
            if (emw.b(a).d())
            {
                emw.b(a).b();
            }
            boolean flag;
            if (flag1 && !emw.c(a).b())
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (emw.d(a).b() || emw.e(a).a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!emw.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
            emw.f(a).setVisibility(0);
            obj = emw.g(a);
_L7:
            byte0 = 8;
_L8:
            ((View) (obj)).setVisibility(byte0);
            if (flag && (emw.h(a) instanceof HideableHeadersListView))
            {
                ((HideableHeadersListView)emw.h(a)).a();
            }
            if (flag1 && emw.c(a).b())
            {
                emw.j(a).a(a.a(0x7f0803de, new Object[] {
                    emw.i(a)
                }));
                emw.k(a).b(new int[] {
                    1
                });
            } else
            {
                emw.k(a).a(new int[] {
                    1
                });
            }
            if (!flag1 && flag)
            {
                emw.k(a).b(new int[] {
                    2
                });
            } else
            {
                emw.k(a).a(new int[] {
                    2
                });
            }
            a.P();
            a.a(emw.a(a).a());
            ((fpe)a.k()).P_();
            emw.h(a).post(new emw._cls1._cls1(this, flag1));
_L2:
            return;
_L5:
            emw.f(a).setVisibility(8);
            obj = emw.g(a);
            if (byte0 == 0) goto _L7; else goto _L6
_L6:
            byte0 = 0;
              goto _L8
        }

        public final void a(String s)
        {
            emw.b(a).b();
            Logger.c("Failed to load list of album %s", new Object[] {
                s
            });
        }

            
            {
                a = emw1;
                super();
            }
    }

}
