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
        if (emx.k(b.b) != null && !a)
        {
            emx.g(b.b).onRestoreInstanceState(emx.k(b.b));
            emx.l(b.b);
        }
    }

    ( , boolean flag)
    {
        b = ;
        a = flag;
        super();
    }

    // Unreferenced inner class emx$1

/* anonymous class */
    final class emx._cls1
        implements epg
    {

        final emx a;

        public final void a(Object obj)
        {
            obj = (fip)obj;
            a.o();
            ((fip) (obj)).isLoading();
            int i = ((ent[])((fip) (obj)).getItems()).length;
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
            if (!flag && emx.a(a).b())
            {
                obj = ((ent[])((fip) (obj)).getItems())[0];
                emx.a(a).a(((ent) (obj)).getCollectionUri(), ((ent) (obj)).getName(), true);
            }
            a.R();
            a.O();
            if (emx.b(a).d())
            {
                emx.b(a).b();
            }
            if (flag && !emx.c(a).b())
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            if (!emx.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
            emx.e(a).setVisibility(0);
            obj = emx.f(a);
_L7:
            byte0 = 8;
_L8:
            ((View) (obj)).setVisibility(byte0);
            if (emx.d(a).b() && (emx.g(a) instanceof HideableHeadersListView))
            {
                ((HideableHeadersListView)emx.g(a)).a();
            }
            if (flag && emx.c(a).b())
            {
                emx.i(a).a(a.a(0x7f0803de, new Object[] {
                    emx.h(a)
                }));
                emx.j(a).b(new int[] {
                    1
                });
            } else
            {
                emx.j(a).a(new int[] {
                    1
                });
            }
            if (!flag && emx.d(a).b())
            {
                emx.j(a).b(new int[] {
                    2
                });
            } else
            {
                emx.j(a).a(new int[] {
                    2
                });
            }
            a.P();
            a.a(emx.a(a).a());
            ((fpe)a.k()).P_();
            emx.g(a).post(new emx._cls1._cls1(this, flag));
_L2:
            return;
_L5:
            emx.e(a).setVisibility(8);
            obj = emx.f(a);
            if (byte0 == 0) goto _L7; else goto _L6
_L6:
            byte0 = 0;
              goto _L8
        }

        public final void a(String s)
        {
            emx.b(a).b();
            Logger.c("Failed to load list of artist %s", new Object[] {
                s
            });
        }

            
            {
                a = emx1;
                super();
            }
    }

}
