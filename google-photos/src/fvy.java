// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fvy
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final jgq b;

    fvy(Context context)
    {
        b = (jgq)olm.a(context, jgq);
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        long l = ((fvm) (obj)).b.getLong(((fvm) (obj)).b.getColumnIndexOrThrow("_id"));
        obj = ((fvm) (obj)).a.b;
        if (obj != null)
        {
            obj = ContentUris.withAppendedId(((Uri) (obj)), l);
            obj = b.a(((Uri) (obj)).toString());
            if (obj != null)
            {
                return new jgl(((jgn) (obj)).a.intValue(), ((jgn) (obj)).b.intValue());
            }
        }
        return null;
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return jgl;
    }

}
