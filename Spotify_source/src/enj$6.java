// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.view.LoadingView;

final class ang.Object
    implements an
{

    private enj a;

    public final da a(Bundle bundle)
    {
        bundle = com.spotify.mobile.android.provider.ta.PlaylistFilter.a;
        if (enj.i(a).b())
        {
            bundle = com.spotify.mobile.android.provider.ta.PlaylistFilter.b;
        }
        bundle = dtu.a(bundle, enj.o(a));
        return new cu(a.k(), bundle, dny.a, null, enj.j(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (duc.a(((Cursor) (obj))))
        {
            enj.g(a).b(((Cursor) (obj)));
            int i = ((Cursor) (obj)).getCount();
            enj.l(a).b();
            enj.a(a, i);
            enj.m(a).a(Integer.valueOf(0), ((Cursor) (obj)));
            if (enj.n(a).e())
            {
                enj.n(a).b();
            }
        }
    }

    (enj enj1)
    {
        a = enj1;
        super();
    }
}
