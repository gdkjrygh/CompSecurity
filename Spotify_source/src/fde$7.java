// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.provider.Metadata;

final class ang.Object
    implements an
{

    private fde a;

    public final da a(Bundle bundle)
    {
        if (fde.d(a))
        {
            bundle = Metadata.a(dtl.a(fde.f(a), com.spotify.mobile.android.provider.ta.PlaylistFilter.c, ""), fde.e(a));
            return new cu(a.k(), bundle, dny.a, null, null);
        } else
        {
            bundle = Metadata.a(dtu.a(com.spotify.mobile.android.provider.ta.PlaylistFilter.c, ""), fde.e(a));
            return new cu(a.k(), bundle, dny.a, null, enj.a(((giq)dmz.a(giq)).b(a.k())).a());
        }
    }

    public final void a()
    {
        fde.o(a).b(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        fde.o(a).b(((Cursor) (obj)));
        fde.n(a).a(Integer.valueOf(1), ((Cursor) (obj)));
    }

    (fde fde1)
    {
        a = fde1;
        super();
    }
}
