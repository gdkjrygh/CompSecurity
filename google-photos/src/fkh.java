// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fkh
    implements fjw
{

    private final jgq a;

    fkh(Context context)
    {
        a = (jgq)olm.a(context, jgq);
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((fjz)obj).a;
        if (oql.c(((Uri) (obj))))
        {
            if ((obj = a.a(((Uri) (obj)).toString())) != null)
            {
                return new jgl(((jgn) (obj)).a.intValue(), ((jgn) (obj)).b.intValue());
            }
        }
        return null;
    }

    public final Set a()
    {
        return Collections.emptySet();
    }

    public final Class b()
    {
        return jgl;
    }
}
