// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.music.internal.provider.SpotifyProvider;

final class ang.Object
    implements an
{

    private fdg a;

    public final da a(Bundle bundle)
    {
        bundle = fdg.a(a);
        String s = fdg.k(a);
        bundle = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder-union/").append(Uri.encode(bundle)).append("/tracks?filter=").append(Uri.encode(s)).toString());
        return new cu(a.k(), bundle, dnz.a, null, fdg.l(a).a());
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Object obj1 = (Cursor)obj;
        fdg.f(a).b(((Cursor) (obj1)));
        fdg.d(a).b();
        if (fdg.g(a) != null && ((Cursor) (obj1)).getCount() > 0)
        {
            fdg.h(a).onRestoreInstanceState(fdg.g(a));
            fdg.i(a);
        }
        obj = fdg.j(a);
        int i = ((Cursor) (obj1)).getCount();
        obj1 = fdg.b(a);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ShufflePlayHeaderView) (obj)).a(flag, ((com.spotify.mobile.android.ui.fragments.logic.Flags) (obj1)));
    }

    (fdg fdg1)
    {
        a = fdg1;
        super();
    }
}
