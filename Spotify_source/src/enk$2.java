// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;

final class ang.Object
    implements an
{

    private enk a;

    public final da a(Bundle bundle)
    {
        bundle = dti.a(enk.o(a), enk.f(a).b());
        return new cu(a.k(), bundle, dnz.a, null, enk.l(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        enk.r(a).b(((Cursor) (obj)));
        if (duc.a(((Cursor) (obj))))
        {
            enk.w(a).d(0);
            enk.x(a).b();
            if (((Cursor) (obj)).getCount() == 0 && enk.y(a).b())
            {
                enk.z(a).a(a.a(0x7f0803de, new Object[] {
                    enk.o(a)
                }));
                enk.w(a).b(new int[] {
                    1
                });
            } else
            {
                enk.w(a).a(new int[] {
                    1
                });
            }
            if (((Cursor) (obj)).getCount() != 0 && enk.f(a).b())
            {
                enk.w(a).b(new int[] {
                    2
                });
            } else
            {
                enk.w(a).a(new int[] {
                    2
                });
            }
            ((fpe)a.k()).P_();
        }
        if (enk.f(a).b() && (enk.d(a) instanceof HideableHeadersListView))
        {
            ((HideableHeadersListView)enk.d(a)).a();
        }
        enk.s(a);
        if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (enk.t(a) == null) goto _L4; else goto _L3
_L3:
        enk.d(a).onRestoreInstanceState(enk.t(a));
        enk.u(a);
_L6:
        enk.a(a, -1);
_L2:
        if (enk.v(a).e())
        {
            enk.v(a).b();
        }
        return;
_L4:
        if (enk.j(a) > enk.d(a).getHeaderViewsCount())
        {
            enk.d(a).setSelectionFromTop(enk.j(a), enk.k(a));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    (enk enk1)
    {
        a = enk1;
        super();
    }
}
