// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.provider.Metadata;
import java.util.Locale;

final class ang.Object
    implements an
{

    private fde a;

    public final da a(Bundle bundle)
    {
        bundle = Metadata.a(dtu.a(com.spotify.mobile.android.provider.ta.PlaylistFilter.e, ""), fde.e(a));
        String s = String.format(Locale.US, "limit=%d", new Object[] {
            Integer.valueOf(3)
        });
        return new cu(a.k(), bundle, dny.a, s, "recently_changed");
    }

    public final void a()
    {
        fde.m(a).b(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        fde.m(a).b(((Cursor) (obj)));
        fde.n(a).a(Integer.valueOf(0), ((Cursor) (obj)));
    }

    (fde fde1)
    {
        a = fde1;
        super();
    }
}
