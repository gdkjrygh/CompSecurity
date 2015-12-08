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

    private eni a;

    public final da a(Bundle bundle)
    {
        bundle = dti.b(eni.s(a), eni.b(a).b());
        return new cu(a.k(), bundle, dnx.a, null, eni.c(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (eni.i(a).b() && ((Cursor) (obj)).moveToFirst())
        {
            eni.i(a).a(((Cursor) (obj)).getString(3), ((Cursor) (obj)).getString(1), true);
        }
        eni.j(a).b(((Cursor) (obj)));
        eni.p(a).d(0);
        if (duc.a(((Cursor) (obj))))
        {
            eni.q(a).b();
            if (((Cursor) (obj)).getCount() == 0 && eni.r(a).b())
            {
                eni.t(a).a(a.a(0x7f0803de, new Object[] {
                    eni.s(a)
                }));
                eni.p(a).b(new int[] {
                    1
                });
            } else
            {
                eni.p(a).a(new int[] {
                    1
                });
            }
            if (((Cursor) (obj)).getCount() != 0 && eni.b(a).b())
            {
                eni.p(a).b(new int[] {
                    2
                });
            } else
            {
                eni.p(a).a(new int[] {
                    2
                });
            }
        }
        if (eni.b(a).b() && (eni.k(a) instanceof HideableHeadersListView))
        {
            ((HideableHeadersListView)eni.k(a)).a();
        }
        eni.l(a);
        if (eni.m(a) != null && ((Cursor) (obj)).getCount() > 0)
        {
            eni.k(a).onRestoreInstanceState(eni.m(a));
            eni.n(a);
        }
        if (eni.o(a).e())
        {
            eni.o(a).b();
        }
    }

    (eni eni1)
    {
        a = eni1;
        super();
    }
}
