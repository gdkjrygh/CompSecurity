// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fur
    implements fvl
{

    private static final Set a = Collections.singleton("_id");
    private final gbo b;

    fur(Context context)
    {
        b = (gbo)olm.a(context, gbo);
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
                return new jgj(((jfk) (obj)).a, ((jfk) (obj)).b);
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
        return jgi;
    }

}
