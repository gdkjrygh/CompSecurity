// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;

final class ang.Object
    implements an
{

    private fdf a;

    public final da a(Bundle bundle)
    {
        bundle = fdf.b(a);
        String s = fdf.o(a);
        bundle = dtl.a(bundle, com.spotify.mobile.android.provider.ta.PlaylistFilter.a, s);
        return new cu(a.k(), bundle, dny.a, null, fdf.p(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        byte byte0;
        byte byte1;
        byte1 = 8;
        byte0 = 1;
        obj = (Cursor)obj;
        if (!duc.a(((Cursor) (obj)))) goto _L2; else goto _L1
_L1:
        if (a.b != null && a.b.b() && duc.a(((Cursor) (obj))) && ((Cursor) (obj)).moveToFirst())
        {
            a.b.a(((Cursor) (obj)).getString(3), ((Cursor) (obj)).getString(1), true);
        }
        fdf.f(a).b(((Cursor) (obj)));
        fdf.g(a).b();
        Object obj1;
        int i;
        if (((Cursor) (obj)).getCount() != 0 || fdf.h(a).b())
        {
            byte0 = 0;
        }
        obj1 = fdf.i(a);
        if (byte0 != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((EmptyView) (obj1)).setVisibility(i);
        obj1 = fdf.j(a);
        if (byte0 != 0)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((ListView) (obj1)).setVisibility(byte0);
        if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L3
_L3:
        if (fdf.k(a) == -1) goto _L5; else goto _L4
_L4:
        fdf.j(a).smoothScrollToPosition(fdf.k(a));
        fdf.l(a);
_L7:
        fdf.n(a);
_L2:
        return;
_L5:
        if (fdf.m(a) != null)
        {
            fdf.j(a).onRestoreInstanceState(fdf.m(a));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    (fdf fdf1)
    {
        a = fdf1;
        super();
    }
}
