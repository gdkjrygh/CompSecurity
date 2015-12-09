// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import com.spotify.mobile.android.ui.adapter.AlbumsAdapter;

final class ang.Object
    implements an
{

    private eyz a;

    public final da a(Bundle bundle)
    {
        bundle = dth.c(eyz.t(a));
        return new cu(((fzv) (a)).p, bundle, dnw.a, "LIMIT=3", null);
    }

    public final void a()
    {
        eyz.s(a).b(null);
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        eyz.s(a).b(((Cursor) (obj)));
        eyz.g(a).d(3);
        if (eyz.r(a) != -1)
        {
            ((fzu) (a)).n.setSelection(eyz.r(a));
        }
    }

    (eyz eyz1)
    {
        a = eyz1;
        super();
    }
}
