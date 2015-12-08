// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.Set;

final class fus
    implements fvl
{

    private final Context a;

    fus(Context context)
    {
        a = context;
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        long l = ((fvm) (obj)).b.getLong(((fvm) (obj)).b.getColumnIndexOrThrow("_id"));
        obj = ((fvm) (obj)).a.b;
        if (b.c(((Uri) (obj))))
        {
            obj = null;
        } else
        {
            obj = ContentUris.withAppendedId(((Uri) (obj)), l);
        }
        if (!b.c(((Uri) (obj))))
        {
            if ((obj = oql.a(a.getContentResolver(), ((Uri) (obj)))) != null)
            {
                return new fwd(Uri.fromFile(new File(((String) (obj)))));
            }
        }
        return null;
    }

    public final Set a()
    {
        throw new UnsupportedOperationException("Unimplemented.");
    }

    public final Class b()
    {
        return fwd;
    }
}
