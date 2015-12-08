// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.internal.provider.SpotifyProvider;

final class ang.Object
    implements an
{

    private fdg a;

    public final da a(Bundle bundle)
    {
        bundle = fdg.a(a);
        bundle = Uri.parse((new StringBuilder()).append(SpotifyProvider.b).append("/folder-union/").append(Uri.encode(bundle)).toString());
        return new cu(a.k(), bundle, fdg.H(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            fdg.d(a).b();
            fdg.b(a, ((Cursor) (obj)).getString(0));
            a.g().putString("title", fdg.e(a));
            ((fpe)a.k()).a(a, a.k().getString(0x7f0802df, new Object[] {
                fdg.e(a)
            }));
            ((fpe)a.k()).P_();
        }
    }

    (fdg fdg1)
    {
        a = fdg1;
        super();
    }
}
