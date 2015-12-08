// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.Set;

final class fwc
    implements fvl
{

    private static final Set a = Collections.singleton("_id");

    fwc()
    {
    }

    public final ekf a(int i, Object obj)
    {
        obj = (fvm)obj;
        if (((fvm) (obj)).a.c == njx.b)
        {
            long l = ((fvm) (obj)).b.getLong(((fvm) (obj)).b.getColumnIndexOrThrow("_id"));
            obj = ((fvm) (obj)).a.b;
            if (obj != null)
            {
                return jdy.a(ContentUris.withAppendedId(((Uri) (obj)), l).toString());
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
        return jdy;
    }

}
