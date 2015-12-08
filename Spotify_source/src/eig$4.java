// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver;

final class ang.Object
    implements an
{

    private final String a[] = {
        "is_followed"
    };
    private eig b;

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dth.a(eig.b(b).toString()), a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (b.o() && ((Cursor) (obj)).moveToFirst())
        {
            eig.a(b, eig.c(b).a(eig.b(b).toString()));
            if (eig.d(b) != null)
            {
                eig.a(b, eig.d(b).d);
                eig.a(b).a(eig.d(b).d, eig.d(b).c, eig.d(b).b);
            } else
            {
                eig.a(b, gcw.a(((Cursor) (obj)), 0));
                if (eig.h(b) != null)
                {
                    eig.h(b).unsubscribe();
                }
                eig.a(b, eig.j(b).a(eig.b(b).toString()).a(((dup)dmz.a(dup)).c()).a(eig.i(b)));
            }
            eig.c(b).a(eig.b(b).toString(), eig.k(b));
        }
    }

    (eig eig1)
    {
        b = eig1;
        super();
    }
}
