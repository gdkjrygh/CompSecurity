// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Collections;
import java.util.Set;

final class fke
    implements fjw
{

    private final Context a;

    fke(Context context)
    {
        a = context;
    }

    public final ekf a(int i, Object obj)
    {
        obj = ((fjz)obj).a;
        if (!b.c(((Uri) (obj))))
        {
            if ("file".equals(((Uri) (obj)).getScheme()))
            {
                return new fwd(((Uri) (obj)));
            }
            if (oql.b(((Uri) (obj))))
            {
                obj = oql.a(a.getContentResolver(), ((Uri) (obj)));
                if (obj != null)
                {
                    return new fwd(Uri.fromFile(new File(((String) (obj)))));
                }
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
        return fwd;
    }
}
