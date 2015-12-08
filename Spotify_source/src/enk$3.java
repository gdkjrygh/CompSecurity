// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;

final class ang.Object
    implements an
{

    private final String a[] = {
        "offline_state", "sync_progress"
    };
    private enk b;

    public final da a(Bundle bundle)
    {
        bundle = dti.a;
        return new cu(b.k(), bundle, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            enk.b(b, ((Cursor) (obj)).getInt(0));
            enk.c(b, ((Cursor) (obj)).getInt(1));
            enk.A(b);
            enk.e(b).a(enk.B(b), enk.C(b));
            if (enk.h(b) != null && !com.spotify.mobile.android.provider.ta.OfflineSync.a(enk.B(b)))
            {
                enk.h(b).b();
            }
        }
    }

    (enk enk1)
    {
        b = enk1;
        super();
    }
}
